package ac.yedam.prod.control;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import ac.yedam.prod.InOutService;
import ac.yedam.prod.InOutVO;
import ac.yedam.prod.ProductService;
import ac.yedam.prod.ProductVO;
import ac.yedam.prod.impl.InOutServiceImpl;
import ac.yedam.prod.impl.ProductServiceImpl;


public class ProdProc {
	InOutService inOutService = InOutServiceImpl.getInstance();
	ProductService productService = ProductServiceImpl.getInstance();

	Scanner sc = new Scanner(System.in);

	// 1)상품정보 2)재고정보
	public void execute() {
		int menu;
		while (true) {
			System.out.println("메뉴선택 1)상품정보 2)재고정보 3)구매-판매정보생성");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1)
				prodInfo();
			else if (menu == 2)
				onhandInfo();
			else if (menu == 3)
				receiptIssueInfo();
			else {
				System.out.println("프로그램 종료.");
				System.exit(0);
			}
		}

	}

	// 1)구매정보생성 2)판재정보생성 3)상위메뉴
	public void receiptIssueInfo() {
		int menu;
		Map<String, Integer> map = new HashMap<>();
		while (true) {
			System.out.println("메뉴선택 1)구매정보생성 2)판매정보생성 3)상위메뉴");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				while (true) {
					System.out.println("구입할 품목을 선택하세요.");
					String prodCode = sc.nextLine();
					System.out.println("수량을 입력하세요.");
					int qty = sc.nextInt();
					sc.nextLine();
					map.put(prodCode, qty);
					
					System.out.println("추가하실래요? Y or N");
					String addStr = sc.nextLine().toUpperCase();
					if (addStr.equals("N"))
						break;
				}
				// 입고정보생성
				Set<Map.Entry<String, Integer>> set = map.entrySet();
				Iterator<Map.Entry<String, Integer>> iter = set.iterator();
				while (iter.hasNext()) {
					Map.Entry<String, Integer> entry = iter.next();
					System.out.println(entry.getKey() + " " + entry.getValue());
				}

			} else if (menu == 2) {
				while (true) {
					System.out.println("판매할 품목을 선택하세요.");
					String prodCode = sc.nextLine();
					System.out.println("수량을 입력하세요.");
					int qty = sc.nextInt();
					sc.nextLine();
					map.put(prodCode, qty);
					
					System.out.println("추가하실래요? Y or N");
					String addStr = sc.nextLine().toUpperCase();
					if (addStr.equals("N"))
						break;
				}
				// 출고정보생성

				Set<Map.Entry<String, Integer>> set = map.entrySet();
				Iterator<Map.Entry<String, Integer>> iter = set.iterator();
				while (iter.hasNext()) {
					Map.Entry<String, Integer> entry = iter.next();
					System.out.println(entry.getKey() + " " + entry.getValue());
				}

			} else if (menu == 3) {
				return;
			}
		}
	}

	// 1)상품조회 2)상품등록 3)상품변경 4)상품삭제 5)상위메뉴
	public void prodInfo() {
		List<ProductVO> list = null;
		int choice;

		while (true) {
			System.out.println("메뉴선택 1)상품조회 2)상품등록 3)상품변경 4)전체상품 5)상위메뉴 ");
			choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1) {
				System.out.println("조회할 상품 선택");
				String productCode = sc.nextLine();
				list = productService.getProductList(productCode);
				showProdInfo(list);

			} else if (choice == 2) {
				System.out.println("상품코드:");
				String productCode = sc.nextLine();
				System.out.println("상품명:");
				String productName = sc.nextLine();
				System.out.println("상품가격:");
				int productPrice = sc.nextInt();
				sc.nextLine();
				productService.insertProduct(new ProductVO(productCode, productName, productPrice));

			} else if (choice == 3) {
				System.out.println("상품코드:");
				String productCode = sc.nextLine();
				System.out.println("변경금액:");
				int productPrice = sc.nextInt();
				sc.nextLine();
				ProductVO prod = new ProductVO(productCode, "", productPrice);
				productService.updateProduct(prod);

			} else if (choice == 4) {
				list = productService.getProductList("");
				showProdInfo(list);

			} else if (choice == 5) {
				return;
			}
		}
	}

	// 1)재고조회 2)입고처리 3)출고처리 4)상위메뉴
	public void onhandInfo() {
		int choice;
		while (true) {
			System.out.println("메뉴선택 1)재고조회 2)입고 3)출고 4)전체조회 5)상위메뉴 ");
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				System.out.println("상품코드:");
				String productCode = sc.nextLine();
				List<InOutVO> list = inOutService.onhandProduct(productCode);
				showOnhand(list);

			} else if (choice == 2) {
				System.out.println("상품코드:");
				String productCode = sc.nextLine();
				System.out.println("상품수량:");
				int txnQty = sc.nextInt();
				sc.nextLine();
				inOutService.receiveProduct(new InOutVO(productCode, txnQty));

			} else if (choice == 3) {
				System.out.println("상품코드:");
				String productCode = sc.nextLine();
				System.out.println("상품수량:");
				int txnQty = sc.nextInt();
				sc.nextLine();
				inOutService.issueProduct(new InOutVO(productCode, txnQty));

			} else if (choice == 4) {
				List<InOutVO> list = inOutService.onhandProduct("");
				showOnhand(list);
//				for (InOutVO ivo : list) {
//					System.out.println(ivo);
//				}
			} else if (choice == 5) {
				return;
			}
		}
	}

	public void showProdInfo(List<ProductVO> list) {
		System.out.println("ProductCode\tProductName\tProductPrice");
		System.out.println("----------------------------------------------");
		for (ProductVO v : list) {
			System.out.printf("%s\t\t%s\t%d\n", v.getProductCode(), v.getProductName(), v.getProductPrice());
		}

	}

	public void showOnhand(List<InOutVO> list) {
		System.out.println("ProductCode\tProductName\tQty");
		System.out.println("----------------------------------");
		for (InOutVO v : list) {
			System.out.printf("%s\t\t%s\t%d\n", v.getProductCode(), v.getProductName(), v.getOnhandQty());
		}
	}
}

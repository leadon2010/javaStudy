package ac.yedam.prod.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ac.yedam.prod.InOutService;
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
			System.out.println("메뉴선택 1)상품정보 2)재고정보");
			menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1)
				prodInfo();
			else if (menu == 2)
				onhandInfo();
			else {
				System.out.println("프로그램 종료.");
				System.exit(0);
			}
		}

	}

	// 1)상품조회 2)상품등록 3)상품변경 4)상품삭제 5)상위메뉴
	public void prodInfo() {
		ProductVO vo;
		List<ProductVO> list = new ArrayList<>();
		int choice;
		while (true) {
			System.out.println("메뉴선택 1)상품조회 2)상품등록 3)상품변경 4)전체상품 5)상위메뉴 ");
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				System.out.println("조회할 상품 선택");
				String productCode = sc.nextLine();
				vo = productService.getProduct(productCode);
				System.out.println(vo);

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

			} else if (choice == 4) {
				list = productService.getProductList();
				for (ProductVO p : list) {
					System.out.println(p);
				}

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

			} else if (choice == 2) {

			} else if (choice == 3) {

			} else if (choice == 4) {

			} else if (choice == 5) {

			}
		}
	}

}

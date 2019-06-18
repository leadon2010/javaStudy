package ac.yedam.prod;

import ac.yedam.prod.impl.InOutVO;

public interface InOutService {
	// 상품입고
	public void receiveProduct(InOutVO vo);

	// 상품출고
	public void issueProduct(InOutVO vo);

	// 재고조회
	public void onhandProduct(String productCode);

	//
}

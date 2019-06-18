package ac.yedam.prod;

import java.util.List;

public interface InOutService {
	// 상품입고
	public void receiveProduct(InOutVO vo);

	// 상품출고
	public void issueProduct(InOutVO vo);

	// 재고조회
	public List<InOutVO> onhandProduct(String productCode);

	//
}

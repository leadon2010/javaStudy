package ac.yedam.prod;

import java.util.List;

public interface ProductService {
	// 상품등록
	public void insertProduct();

	// 상품변경
	public void updateProduct();

	// 상품삭제
	public void deleteProduct();

	// 한건조회
	public ProductVO getProduct();

	// 상품리스트
	public List<ProductVO> getProductList();

}

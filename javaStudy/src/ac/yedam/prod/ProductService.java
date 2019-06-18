package ac.yedam.prod;

import java.util.List;

public interface ProductService {
	// 상품등록
	public void insertProduct(ProductVO vo);

	// 상품변경
	public void updateProduct(ProductVO vo);

	// 상품삭제
	public void deleteProduct(String productCode);

	// 한건조회
	public ProductVO getProduct(String productCode);

	// 상품리스트
	public List<ProductVO> getProductList();

}

package ac.yedam.prod.impl;

import java.util.List;

import ac.yedam.prod.ProductService;
import ac.yedam.prod.ProductVO;

public class ProductServiceImpl implements ProductService {

	private static ProductServiceImpl singleton = new ProductServiceImpl();

	private ProductServiceImpl() {
	}

	public static ProductServiceImpl getInstance() {
		return singleton;
	}

	ProductDAO dao = ProductDAO.getInstance();

	@Override
	public void insertProduct(ProductVO vo) {
		dao.insertProduct(vo);
	}

	@Override
	public void updateProduct(ProductVO vo) {

	}

	@Override
	public void deleteProduct(String productCode) {

	}

	@Override
	public ProductVO getProduct(String productCode) {
		return null;
	}

	@Override
	public List<ProductVO> getProductList() {
		return null;
	}

}

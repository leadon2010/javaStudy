package ac.yedam.prod;

public class ProductVO {
	String productCode;
	String productName;
	int productPrice;

	public ProductVO() {
		super();
	}

	public ProductVO(String productCode, String productName, int productPrice) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "ProductVO [productCode=" + productCode + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}

}

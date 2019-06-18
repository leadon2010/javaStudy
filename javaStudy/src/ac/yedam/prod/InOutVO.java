package ac.yedam.prod;

public class InOutVO {
	String productCode;
	int txnQty;
	String txnDate;

	public InOutVO() {
		super();
	}

	public InOutVO(String productCode, int txnQty, String txnDate) {
		super();
		this.productCode = productCode;
		this.txnQty = txnQty;
		this.txnDate = txnDate;
	}

}

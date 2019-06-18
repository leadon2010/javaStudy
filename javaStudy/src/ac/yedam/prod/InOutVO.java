package ac.yedam.prod;

public class InOutVO {
	String productCode;
	int txnQty;
	String txnDate;
	int onhandQty;

	public InOutVO() {
		super();
	}

	public InOutVO(String productCode, int txnQty) {
		super();
		this.productCode = productCode;
		this.txnQty = txnQty;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getTxnQty() {
		return txnQty;
	}

	public void setTxnQty(int txnQty) {
		this.txnQty = txnQty;
	}

	public String getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(String txnDate) {
		this.txnDate = txnDate;
	}

	public int getOnhandQty() {
		return onhandQty;
	}

	public void setOnhandQty(int onhandQty) {
		this.onhandQty = onhandQty;
	}

	@Override
	public String toString() {
		return "InOutVO [productCode=" + productCode + ", txnQty=" + txnQty + ", txnDate=" + txnDate + ", onhandQty="
				+ onhandQty + "]";
	}

}

package ac.yedam.prod.impl;

import ac.yedam.prod.InOutService;
import ac.yedam.prod.InOutVO;

public class InOutServiceImpl implements InOutService {

	InOutDAO dao = InOutDAO.getInstance();

	@Override
	public void receiveProduct(InOutVO vo) {
		dao.receiptProduct(vo);
	}

	@Override
	public void issueProduct(InOutVO vo) {
		dao.issueProduct(vo);
	}

	@Override
	public void onhandProduct(String productCode) {
		dao.onhandProduct(productCode);
	}

}

package ac.yedam.prod.impl;

import java.util.List;

import ac.yedam.prod.InOutService;
import ac.yedam.prod.InOutVO;

public class InOutServiceImpl implements InOutService {
	private static InOutServiceImpl singleton = new InOutServiceImpl();

	private InOutServiceImpl() {
	}

	public static InOutServiceImpl getInstance() {
		return singleton;
	}

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
	public List<InOutVO> onhandProduct(String productCode) {
		return dao.onhandProduct(productCode);
	}

}

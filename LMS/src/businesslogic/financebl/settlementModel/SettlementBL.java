package businesslogic.financebl.settlementModel;

import java.util.ArrayList;

import businesslogicservice.financeblservice.GetReceivablesBillsBlSer;
import vo.documentsVO.ReceiptVO;

public class SettlementBL implements GetReceivablesBillsBlSer{

	@Override
	public ArrayList<ReceiptVO> getReceivables(String selling, String date) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ArrayList<ReceiptVO> getAllReceivables(String selling) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ArrayList<ReceiptVO> getSomeReceivables(String selling,
			String start, String end) {
		// TODO 自动生成的方法存根
		return null;
	}
}

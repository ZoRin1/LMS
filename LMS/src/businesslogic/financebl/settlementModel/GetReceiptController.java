package businesslogic.financebl.settlementModel;

import java.util.ArrayList;

import vo.documentsVO.ReceiptVO;

public class GetReceiptController {
	
	private SettlementBL settle;
	private GetCount getCount;
	
	
	public GetReceiptController() {
		super();
		// TODO 自动生成的构造函数存根
		settle = new SettlementBL();
		getCount = new GetCount();
	}

	
	public ArrayList<ReceiptVO> getReceipt(String selling, String date){
		ArrayList<ReceiptVO>  vo = settle.getReceivables(selling, date);
		return vo;
	}
	
	public ArrayList<ReceiptVO> getAllReceipt(String end) {
		ArrayList<ReceiptVO>  vo = settle.getAllReceivables(end);
		return vo;
	}
	
	public ArrayList<ReceiptVO> getSomeReceipt(
			String start, String end) {
		ArrayList<ReceiptVO>  vo = settle.getSomeReceivables(start, end);
		return vo;
	}

	public void Controller(){
		
		
	}
}

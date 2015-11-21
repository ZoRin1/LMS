package businesslogic.documentsbl;

import java.util.ArrayList;
import businesslogicservice.modelservice.financeInfo.GetPaymentSer;
import po.documentsPO.PaymentPO;


public class GetPayment implements GetPaymentSer{

	@Override
	public ArrayList<PaymentPO> getAllPay(String selling) {
		// TODO Auto-generated method stub
//		ArrayList<PaymentPO> list=new ArrayList();
//		PaymentPO po=new PaymentPO("0000005","付款单","20151225",100.0,"米尔豪斯","2184309217","工资","开除");
//		list.add(po);
		return null;
	}

	@Override
	public ArrayList<PaymentPO> getAllPay(String start, String end) {
		// TODO Auto-generated method stub
//		ArrayList<PaymentPO> list=new ArrayList();
//		PaymentPO po=new PaymentPO("0000005","付款单","20151225",100.0,"米尔豪斯","2184309217","工资","开除");
//		list.add(po);
		return null;
	}

}

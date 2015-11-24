package businesslogic.financebl.ProfitModel;

import java.util.ArrayList;

import vo.documentsVO.PaymentVO;
import vo.documentsVO.ReceiptVO;
import businesslogicservice.financeblservice.EarnOrPayBlSer;

public class CostStatisticsBL implements EarnOrPayBlSer{
	
	private GetPayBills getPayBills;
	private GetReceipt getReceipt;
	
	public CostStatisticsBL(){
		super();
		getPayBills = new GetPayBills();
		getReceipt = new GetReceipt();
	}
	//�õ�������
	public double CalculateGet(String end){
		ArrayList<ReceiptVO> get = getReceipt.getAllReceivables(end);
		double Earn = 0;
		for(int i = 0 ; i < get.size();i++){
			Earn+=get.get(i).getFund();
		}
		return Earn;
		
	}
	//�õ���֧��
	public double CalculatePay(String end){
		ArrayList<PaymentVO> pay = getPayBills.getAllPay(end);
		double Allpay =0;
		for(int i = 0 ; i <pay.size();i++){
			Allpay+=pay.get(i).getFund();
		}
		return Allpay;
	}
	//�õ��ɱ�����
	public double CalculateCost(){
		return 0;
		
	}
	//����CalculateGet
	@Override
	public double allEarn(String end) {
		// TODO �Զ����ɵķ������
		return 0;
	}
	//����CalculatePay
	@Override
	public double allPay(String end) {
		// TODO �Զ����ɵķ������
		return 0;
	}
}

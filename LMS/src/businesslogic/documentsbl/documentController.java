package businesslogic.documentsbl;

import java.util.ArrayList;

import po.documentsPO.DocumentPO;
import po.documentsPO.InBillsPO;
import po.documentsPO.PaymentPO;
import po.documentsPO.ReceiptPO;

public class documentController {
	//��������ʱ��õ��ݱ�ţ����е��ݶ�Ҫ������һ����
	public String getDocCode(String doName) {
		createDocument cr=new createDocument();
		return cr.createDocument(doName);
	}
	
	//��po�������ݿ⣨���е��ݶ�Ҫ������һ����
	public boolean createBlock(DocumentPO po){
		createBlock cr=new createBlock();
		return cr.createBlock(po);
	}
	
	//�ļ�����װ������װ�˵������˷�
	public double getCost(String departure, String arrival, String trans,double weight){
		DocumentsList list=new DocumentsList(departure,arrival,trans,weight);
		return list.getCost();
	}
	
	//�ļ����л��Ԥ������
	public int getDays(String departure, String arrival, String trans,double weight){
		DocumentsList list=new DocumentsList(departure,arrival,trans,weight);
		return list.getDays();
	}
	
	//������������������ͨ������������ݿ⣬����ֵΪ�Ƿ�ɹ���ʵ�ʲ�û�����壬���滹û�з�����ʩ�����ܾ���
	public boolean examined(String code, String doName, boolean Examined){
		Examined ex=new Examined();
		return ex.examined(code, doName, Examined);
	}
	
	//�������������ɵ����б��ܾ���
	public ArrayList<String> showList(){
		showBufferedList sh=new showBufferedList();
		return sh.showList();
	}
	
	//���ݷ��������ɵ����б�
	public ArrayList<String> showOwnList(String account){
		showBufferedList sh=new showBufferedList();
		return sh.showOwnList(account);
	}
	
	//�������ݺ͵��ݷ����л�õ�����ϸ��Ϣ
	public DocumentPO getBufferedInfo(String code, String doName){
		getBufferedInfo get=new getBufferedInfo();
		return get.getBufferedInfo(code, doName);
	}
	
	//���ʱ����ڵ���ⵥ
	public ArrayList<InBillsPO> getInBill(String account, String start,
			String end){
		GetInBills get=new GetInBills();
		return get.getInBill(account, start, end);
	}
	
	//��ý�ֹ�����ڵ���ⵥ
	public ArrayList<InBillsPO> getAllInBills(String account, String end){
		GetInBills get=new GetInBills();
		return get.getAllInBills(account, end);
	}
	
	//��ý�ֹ�����ڵĸ��
	public ArrayList<PaymentPO> getAllPay(String end){
		GetPayment get=new GetPayment();
		return get.getAllPay(end);
	}
	
	//���ʱ����ڵĸ��
	public ArrayList<PaymentPO> getAllPay(String start, String end){
		GetPayment get=new GetPayment();
		return get.getAllPay(start,end);
	}
	
	//���ĳӪҵ��ĳ����տ
	public ArrayList<ReceiptPO> getReceipts(String selling, String date){
		GetReceipt get=new GetReceipt();
		return get.getReceipts(selling, date);
	}
	
	//��ý�ֹ�����ڵ������տ
	public ArrayList<ReceiptPO> getAllReceipts(String end){
		GetReceipt get=new GetReceipt();
		return get.getAllReceipts(end);
	}
	
	//���ʱ����ڵ������տ
	public ArrayList<ReceiptPO> getAllReceipts(String start, String end){
		GetReceipt get=new GetReceipt();
		return get.getAllReceipts(start,end);
	}
	
	//���ĳ��������������Ϣ
	public ArrayList<String> getWuliuInfo(String code){
		getWuliuInfo get=new getWuliuInfo();
		return get.getWuliuInfo(code);
	}
	
	//���ⵥ���¿����Ϣ
	public void updateDrive(String InDepotCode,String city){
		UpdateSpace up=new UpdateSpace(InDepotCode,city);
		up.updateDrive();
	}
}

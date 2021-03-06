package businesslogic.documentsbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import dataservice.documentsdataservice.documentsFactory;
import dataservice.documentsdataservice.getCodeDataSer;
import dataservice.documentsdataservice.getDocumentInfoDataSer;
import businesslogicservice.modelservice.financeInfo.GetPaymentSer;
import po.documentsPO.PaymentPO;


public class GetPayment implements GetPaymentSer{
	private ArrayList<String> list;
	private ArrayList<PaymentPO> list1;
	private int size=0;
	private String str,str1,str2;
	@Override
	public ArrayList<PaymentPO> getAllPay(String end) {
		// TODO Auto-generated method stub
		list=new ArrayList<>();
		list1=new ArrayList<>();
		PaymentPO po;
		try {
			documentsFactory documentsFactory=(documentsFactory)Naming.lookup("rmi://127.0.0.1:6600/docFactory");
			getCodeDataSer getCodeDataSer=documentsFactory.createGetCodeDataSer();
			getDocumentInfoDataSer getDocumentInfoDataSer=documentsFactory.createGetDocumentInfoDataSer();
			list=getCodeDataSer.getCode("마운데", null, end);
			size=list.size();
			for(int i=0;i<size;i++){
				str=list.get(i);
				str1=str.substring(0, 10);
				str2=str.substring(11);
				po=(PaymentPO) getDocumentInfoDataSer.getDocumentInfo(str1, str2);
				list1.add(po);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list1;
	}

	@Override
	public ArrayList<PaymentPO> getAllPay(String start, String end) {
		// TODO Auto-generated method stub
		list=new ArrayList<>();
		list1=new ArrayList<>();
		PaymentPO po;
		try {
			documentsFactory documentsFactory=(documentsFactory)Naming.lookup("rmi://114.212.42.143:6600/docFactory");
			getCodeDataSer getCodeDataSer=documentsFactory.createGetCodeDataSer();
			getDocumentInfoDataSer getDocumentInfoDataSer=documentsFactory.createGetDocumentInfoDataSer();
			list=getCodeDataSer.getCode("마운데",start, end);
			size=list.size();
			for(int i=0;i<size;i++){
				str=list.get(i);
				str1=str.substring(0, 10);
				str2=str.substring(11);
				po=(PaymentPO) getDocumentInfoDataSer.getDocumentInfo(str1, str2);
				list1.add(po);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list1;
	}

}

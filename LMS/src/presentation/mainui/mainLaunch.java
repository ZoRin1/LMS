package presentation.mainui;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.sound.midi.Receiver;

import po.documentsPO.GetOrderPO;
import po.documentsPO.InBillsPO;
import po.documentsPO.LoadingPO;
import po.documentsPO.OrderPO;
import po.documentsPO.OutbillsPO;
import po.documentsPO.PaymentPO;
import po.documentsPO.ReceiptPO;
import po.financePO.AccountPO;
import dataservice.documentsdataservice.addDocummentInfoDataSer;
import dataservice.documentsdataservice.documentsFactory;
import dataservice.financedataservice.CoverDataSer;
import dataservice.financedataservice.GetAccountDataSer;
import dataservice.financedataservice.GetReceivablesBillsDataSer;
import dataservice.financedataservice.financeFactory;

public class mainLaunch {
	public static void main(String[] args){
		try {
			documentsFactory documentsFactory=(documentsFactory)Naming.lookup("rmi://127.0.0.1:6600/docFactory");
			addDocummentInfoDataSer addDocummentInfoDataSer=documentsFactory.createaddDocummentInfoDataSer();
			GetOrderPO getOrderPO=new GetOrderPO("0505151511", "�ռ���", "0505151511", "151515", "wang", "2015-5-21");
			InBillsPO inBillsPO=new InBillsPO("0505151511", "��ⵥ", "0505151511", "2015-5-31", "151516","�Ͼ���ת����",  2, 1, 2, 3);
			ArrayList<String> codeList=new ArrayList<String>();
			codeList.add("1212");
			codeList.add("1515");
			codeList.add("51515");
			double [] sizeList={15,15,15};
			LoadingPO loadingPO=new LoadingPO("2015-5-21", "0505151511", "Ӫҵ��װ����", "0505151511", "��¥Ӫҵ��", "�Ͼ���ת����", "a", "a", codeList, 15.2);
			OrderPO orderPO=new OrderPO("0505151511", "�ļ���", "51515", "2015-5-21", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", 1, 20.0, 20.0, "aaa", sizeList, 15.0, "tekuai");
			OutbillsPO outbillsPO=new OutbillsPO("0505151511", "���ⵥ", "0505151511", "2015-6-30", "1515", "������ת����", "feiji", "1515");
			PaymentPO paymentPO=new PaymentPO("0505151511", "���", "2015-5-30", "15156", 1515, "a", "5151", "a", "ad");
			ReceiptPO receiptPO=new ReceiptPO("15151516", "�տ", "2015-6-5", "151616", "1551", 1515, "asdasd", codeList);
			
		
			addDocummentInfoDataSer.addDocumentInfo(receiptPO);
			System.out.println("�����ɹ�");
//			//GetAccountDataSer accountSer = (GetAccountDataSer)Naming.lookup("rmi://127.0.0.1:6600/accountSer");
//			financeFactory finFactory = (financeFactory)Naming.lookup("rmi://127.0.0.1:6600/finFactory");
//			GetAccountDataSer accountSer = finFactory.createGetAccountDataSer();
//			ArrayList<AccountPO> po = accountSer.getAccount();
//			for(AccountPO account:po){
//				System.out.print(account.getName()+"  "+account.getSums());
//				System.out.println();
//			}
//			
//			//GetReceivablesBillsDataSer getReceipt = (GetReceivablesBillsDataSer)Naming.lookup("rmi://127.0.0.1:6600/getReceipt");
//			GetReceivablesBillsDataSer getReceipt = finFactory.createGetReceivablesBillsDataSer();
//			ArrayList<ReceiptPO> rp = getReceipt.Receivables(null, null);
//			ArrayList<String> code = new ArrayList();
//			for(int i = 0 ; i < rp.size();i++){
//				System.out.print(rp.get(i).getDate()+"  ");
//				System.out.print(rp.get(i).getFund()+"  ");
//				System.out.print(rp.get(i).getAccount()+"    ");
//				code = rp.get(i).getTCode();
//				for(int j = 0 ; j < code.size();j++){
//					if(j==code.size()-1){
//						System.out.println(code.get(j));
//					}else{
//						System.out.print(code.get(j)+"  ");
//					}
//				}
//
//			}
//			//CoverDataSer coverSer = (CoverDataSer)Naming.lookup("rmi://127.0.0.1:6600/coverSer");
//			CoverDataSer coverSer = finFactory.createCoverDataSer();
//			coverSer.coverAccount(po);
//			
////			for(AccountPO account:po){
////				System.out.print(account.getName()+"  "+account.getSums());
////				System.out.println();
////			}
		} catch (MalformedURLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
	}
}

package presentation.mainui;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.sound.midi.Receiver;

import po.accountPO.AccountInfoPO;
import po.documentsPO.GetOrderPO;
import po.documentsPO.InBillsPO;
import po.documentsPO.LoadingPO;
import po.documentsPO.OrderPO;
import po.documentsPO.OutbillsPO;
import po.documentsPO.PaymentPO;
import po.documentsPO.ReceiptPO;
import po.documentsPO.YDispatchPO;
import po.documentsPO.YReceivePO;
import po.documentsPO.ZLoadingPO;
import po.documentsPO.ZReceivePO;
import po.financePO.AccountPO;
import dataservice.accountdataservice.AccountDataSer;
import dataservice.accountdataservice.accountFactory;
import dataservice.documentsdataservice.addDocummentInfoDataSer;
import dataservice.documentsdataservice.documentsFactory;
import dataservice.financedataservice.CoverDataSer;
import dataservice.financedataservice.GetAccountDataSer;
import dataservice.financedataservice.GetReceivablesBillsDataSer;
import dataservice.financedataservice.financeFactory;

public class mainLaunch {
	public static void main(String[] args){
		try {
//			documentsFactory documentsFactory=(documentsFactory)Naming.lookup("rmi://127.0.0.1:6600/docFactory");
//			addDocummentInfoDataSer addDocummentInfoDataSer=documentsFactory.createaddDocummentInfoDataSer();
//			GetOrderPO getOrderPO=new GetOrderPO("0505151511", "�ռ���", "0505151511", "151515", "wang", "2015-5-21");
//			InBillsPO inBillsPO=new InBillsPO("0505151511", "��ⵥ", "0505151511", "2015-5-31", "151516","�Ͼ���ת����",  2, 1, 2, 3);
//			ArrayList<String> codeList=new ArrayList<String>();
//			codeList.add("1212");
//			codeList.add("1515");
//			codeList.add("51515");
//			double [] sizeList={15,15,15};
//			LoadingPO loadingPO=new LoadingPO("2015-5-21", "0505151511", "Ӫҵ��װ����", "0505151511", "��¥Ӫҵ��", "�Ͼ���ת����", "a", "a", codeList, 15.2);
//			OrderPO orderPO=new OrderPO("0505151511", "�ļ���", "51515", "2015-5-21", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", "aaa", 1, 20.0, 20.0, "aaa", sizeList, 15.0, "tekuai");
//			OutbillsPO outbillsPO=new OutbillsPO("0505151511", "���ⵥ", "0505151511", "2015-6-30", "1515", "������ת����", "feiji", "1515");
//			PaymentPO paymentPO=new PaymentPO("0505151511", "���", "2015-5-30", "15156", 1515, "a", "5151", "a", "ad");
//			ReceiptPO receiptPO=new ReceiptPO("15151516", "�տ", "2015-6-5", "151616", "1551", 1515, "asdasd", codeList);
//			YDispatchPO yDispatchPO=new YDispatchPO("2015-5-30", "151561", "�ɼ���", "151515", "451616", "asdasd");
//			YReceivePO yReceivePO=new YReceivePO("2015-6-2", "15155", "Ӫҵ�����յ�", "4515", "111515", "����Ӫҵ��", "�Ͼ���ת����", "zhengchang");
//			ZLoadingPO zLoadingPO=new ZLoadingPO("2015-6-6", "451515", "��ת����ת�˵�", "515151", "5251", "�Ͼ���ת����", "������ת����", "dfsdf", codeList, 1515);
//			ZReceivePO zReceivePO=new ZReceivePO("151515", "��ת���Ľ��յ�", "2015-6-5", "asdasdas", "asdasd", codeList, "�Ͼ���ת����", "������ת����");
//			addDocummentInfoDataSer.addDocumentInfo(zReceivePO);
//			System.out.println("�����ɹ�");
//			accountFactory accountFactory=(accountFactory)Naming.lookup("rmi://127.0.0.1:6600/accFactory");
//			AccountDataSer accountDataSer=accountFactory.createAccountDataSer();
//			System.out.println("155 21 �Ƿ���ȷ: "+accountDataSer.campare(155, "21"));
//			AccountInfoPO accountInfoPO=new AccountInfoPO("w", 155, "21", "1-�Ͼ�-��¥-Ӫҵ��-001-001", "515", "5155", "2015-6-3");
//			System.out.println("������"+accountDataSer.insert(155,accountInfoPO));
//			System.out.println("155 21 �Ƿ���ȷ: "+accountDataSer.campare(155, "21"));
//			accountInfoPO.setPassword("2");
//			System.out.println("����: "+accountDataSer.update(155, accountInfoPO));
//			System.out.println("155 21 �Ƿ���ȷ: "+accountDataSer.campare(155, "21"));
//			System.out.println("155 21 �Ƿ���ȷ: "+accountDataSer.campare(155, "2"));
//			System.out.println("ɾ��: "+accountDataSer.delete(155));
//			System.out.println("155 21 �Ƿ���ȷ: "+accountDataSer.campare(155, "2"));
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

package presentation.mainui;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.documentsPO.ReceiptPO;
import po.financePO.AccountPO;
import dataservice.financedataservice.CoverDataSer;
import dataservice.financedataservice.GetAccountDataSer;
import dataservice.financedataservice.GetReceivablesBillsDataSer;
import dataservice.financedataservice.financeFactory;

public class mainLaunch {
	public static void main(String[] args){
		try {
			//GetAccountDataSer accountSer = (GetAccountDataSer)Naming.lookup("rmi://127.0.0.1:6600/accountSer");
			financeFactory finFactory = (financeFactory)Naming.lookup("rmi://127.0.0.1:6600/finFactory");
			GetAccountDataSer accountSer = finFactory.createGetAccountDataSer();
			ArrayList<AccountPO> po = accountSer.getAccount();
			for(AccountPO account:po){
				System.out.print(account.getName()+"  "+account.getSums());
				System.out.println();
			}
			
			//GetReceivablesBillsDataSer getReceipt = (GetReceivablesBillsDataSer)Naming.lookup("rmi://127.0.0.1:6600/getReceipt");
			GetReceivablesBillsDataSer getReceipt = finFactory.createGetReceivablesBillsDataSer();
			ArrayList<ReceiptPO> rp = getReceipt.Receivables(null, null);
			ArrayList<String> code = new ArrayList();
			for(int i = 0 ; i < rp.size();i++){
				System.out.print(rp.get(i).getDate()+"  ");
				System.out.print(rp.get(i).getFund()+"  ");
				System.out.print(rp.get(i).getAccount()+"    ");
				code = rp.get(i).getTCode();
				for(int j = 0 ; j < code.size();j++){
					if(j==code.size()-1){
						System.out.println(code.get(j));
					}else{
						System.out.print(code.get(j)+"  ");
					}
				}

			}
			//CoverDataSer coverSer = (CoverDataSer)Naming.lookup("rmi://127.0.0.1:6600/coverSer");
			CoverDataSer coverSer = finFactory.createCoverDataSer();
			coverSer.coverAccount(po);
			
//			for(AccountPO account:po){
//				System.out.print(account.getName()+"  "+account.getSums());
//				System.out.println();
//			}
		} catch (MalformedURLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
	}
}

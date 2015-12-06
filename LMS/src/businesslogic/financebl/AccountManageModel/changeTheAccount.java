package businesslogic.financebl.AccountManageModel;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import dataservice.financedataservice.ChangeAccountDataSer;
import dataservice.financedataservice.financeFactory;

public class changeTheAccount {
	
	
	public void addEarn(String accountName,double earn){
		try {
			financeFactory finFactory = (financeFactory)Naming.lookup("rmi://127.0.0.1:6600/finFactory");
			ChangeAccountDataSer change = finFactory.createChangeAccountDateSer();
			change.changeEarn(accountName, earn);
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
	
	
	public void subPay(String accountName,double pay){
		try {
			financeFactory finFactory = (financeFactory)Naming.lookup("rmi://127.0.0.1:6600/finFactory");
			ChangeAccountDataSer change = finFactory.createChangeAccountDateSer();
			change.changePay(accountName, pay);
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

package businesslogic.accountbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import businesslogicservice.accountblservice.AccountBLSer;
import dataservice.accountdataservice.AccountDataSer;
import dataservice.accountdataservice.accountFactory;
import vo.accountVO.AccountNumberVO;

public class AccountBL implements AccountBLSer {
	private AccountDataSer accountDataSer;
	
	public AccountBL() {
	
	try {
		accountFactory accountFactory =(accountFactory)Naming.lookup("rmi://127.0.0.1:6600/accFactory");
		this.accountDataSer = accountFactory.createAccountDataSer();
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
	@Override
	public String login(long ID, String password) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean addAccount(long ID, AccountNumberVO vo) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean changeInfo(long ID, AccountNumberVO vo) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean deleteAccount(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String[] getAccount(long ID) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public String[] getAccountList(String name) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public AccountNumberVO getInfo(long ID) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public String[] getAccountList() {
		// TODO �Զ����ɵķ������
		String[] result = {"1000005-����","1000009-����","1000012-��ɺ"};
		return result;
	}

}

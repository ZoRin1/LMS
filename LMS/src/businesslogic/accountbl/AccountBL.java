package businesslogic.accountbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import businesslogicservice.accountblservice.AccountBLSer;
import dataservice.accountdataservice.AccountDataSer;
import dataservice.accountdataservice.accountFactory;
import po.accountPO.AccountInfoPO;
import vo.accountVO.AccountNumberVO;

public class AccountBL implements AccountBLSer {
	private AccountDataSer accountDataSer;
	
	
	public AccountBL(){
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
		
		return this.accountDataSer.campare(ID, password);
	}

	@Override
	public boolean addAccount(long ID, AccountNumberVO vo) {
		// TODO �Զ����ɵķ������
		return this.accountDataSer.insert(ID, new AccountInfoPO(vo.getName(), vo.getID(), vo.getPassword(), 
				vo.getState(), vo.getPhone(), vo.getsID(), vo.getDate()));
	}

	@Override
	public boolean changeInfo(long ID, AccountNumberVO vo) {
		// TODO �Զ����ɵķ������
		return this.accountDataSer.update(ID, new AccountInfoPO(vo.getName(), vo.getID(), vo.getPassword(), 
				vo.getState(), vo.getPhone(), vo.getsID(), vo.getDate()));
	}

	@Override
	public boolean deleteAccount(long ID) {
		// TODO �Զ����ɵķ������
		return this.accountDataSer.delete(ID);
	}

	@Override
	public String[] getAccount(long ID) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public String[] getAccountList(String name) {
		// TODO �Զ����ɵķ������
		return this.accountDataSer.find(name);
	}

	@Override
	public AccountNumberVO getInfo(long ID) {
		// TODO �Զ����ɵķ������
		AccountInfoPO po = this.accountDataSer.find(ID);
		return new AccountNumberVO(po.getName(), po.getID(), po.getPassword(), po.getState(), po.getPhone(), po.getsID(), po.getDate());
	}

	@Override
	public String[] getAccountList() {
		// TODO �Զ����ɵķ������
//		String[] result = {"1000005-����","1000009-����","1000012-��ɺ"};
		return this.accountDataSer.find();
	}

}

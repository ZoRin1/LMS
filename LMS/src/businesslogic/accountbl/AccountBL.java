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
			accountFactory accountFactory =(accountFactory)Naming.lookup("rmi://114.212.42.143:6600/accFactory");
			this.accountDataSer = accountFactory.createAccountDataSer();
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
	
	@Override
	public String login(long ID, String password) {
		
		// TODO 自动生成的方法存根
		
		return this.accountDataSer.campare(ID, password);
	}

	@Override
	public boolean addAccount(long ID, AccountNumberVO vo) {
		// TODO 自动生成的方法存根
		return this.accountDataSer.insert(ID, new AccountInfoPO(vo.getName(), vo.getID(), vo.getPassword(), 
				vo.getState(), vo.getPhone(), vo.getsID(), vo.getDate()));
	}

	@Override
	public boolean changeInfo(long ID, AccountNumberVO vo) {
		// TODO 自动生成的方法存根
		return this.accountDataSer.update(ID, new AccountInfoPO(vo.getName(), vo.getID(), vo.getPassword(), 
				vo.getState(), vo.getPhone(), vo.getsID(), vo.getDate()));
	}

	@Override
	public boolean deleteAccount(long ID) {
		// TODO 自动生成的方法存根
		return this.accountDataSer.delete(ID);
	}

	@Override
	public String[] getAccount(long ID) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String[] getAccountList(String name) {
		// TODO 自动生成的方法存根
		return this.accountDataSer.find(name);
	}

	@Override
	public AccountNumberVO getInfo(long ID) {
		// TODO 自动生成的方法存根
		AccountInfoPO po = this.accountDataSer.find(ID);
		if (po !=  null) {
			return new AccountNumberVO(po.getName(), po.getID(), po.getPassword(), po.getState(), po.getPhone(), po.getsID(), po.getDate());
		}else {
			return null;
		}
		
	}

	@Override
	public String[] getAccountList() {
		// TODO 自动生成的方法存根
//		String[] result = {"1000005-刘洋","1000009-王菲","1000012-苏珊"};
		return this.accountDataSer.find();
	}

}

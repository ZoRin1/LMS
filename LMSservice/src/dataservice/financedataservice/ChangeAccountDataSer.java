package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChangeAccountDataSer extends Remote{
	
	/**
	 * 通过银行账户和收益 增加指定账户的金额
	 */
	
	public void changeEarn(String accountName,double earn)throws RemoteException;
	
	
	/**
	 * 通过银行账户和收益 减去指定账户的金额
	 */
	
	public void changePay(String accountName,double earn)throws RemoteException;
}

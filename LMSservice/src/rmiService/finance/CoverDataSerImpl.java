package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.financePO.AccountPO;
import dataservice.financedataservice.CoverDataSer;

public class CoverDataSerImpl extends UnicastRemoteObject implements CoverDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 8859049058295725046L;

	public CoverDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void coverAccount(ArrayList<AccountPO> po)  throws RemoteException {
		// TODO 自动生成的方法存根
		System.out.println("已经传输过来了");
		ArrayList<AccountPO> pp = po;
		for(AccountPO account:pp){
			System.out.print(account.getName()+"  "+account.getSums());
			System.out.println();
		}
	}

}

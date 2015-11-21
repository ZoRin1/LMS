package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.financePO.AccountPO;
import dataservice.financedataservice.GetAccountDataSer;

public class GetAccountDataSerImpl extends UnicastRemoteObject implements GetAccountDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;

	/**
	 * 
	 */
	private static final long serialVersionUID = 4464096386614953251L;

	public  GetAccountDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public ArrayList<AccountPO> getAccount() throws RemoteException {
		// TODO 自动生成的方法存根
		System.out.println("Get Account Start");
		AccountPO p1 = new AccountPO("李洋", 250.3);
		AccountPO p2 = new AccountPO("李洋", 250.3);
		AccountPO p3 = new AccountPO("李洋", 250.3);
		AccountPO p4 = new AccountPO("李洋", 250.3);
		ArrayList<AccountPO> po = new ArrayList();
		po.add(p1);
		po.add(p2);
		po.add(p3);
		po.add(p4);
		return po;
	}

}

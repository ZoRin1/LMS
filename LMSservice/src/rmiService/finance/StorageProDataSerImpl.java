package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.financePO.ProfitPO;
import dataservice.financedataservice.StorageProDataSer;

public class StorageProDataSerImpl extends UnicastRemoteObject implements StorageProDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 406260526492263555L;

	public StorageProDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void setCostRecords(ProfitPO po)  throws RemoteException{
		// TODO 自动生成的方法存根
		
	}
	
}

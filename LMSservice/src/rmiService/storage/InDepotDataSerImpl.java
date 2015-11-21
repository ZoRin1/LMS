package rmiService.storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.storagePO.DepotPO;
import dataservice.storagedataservice.InDepotDataSer;

public class InDepotDataSerImpl extends UnicastRemoteObject implements InDepotDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -6673633418400744648L;

	public InDepotDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void inDepot(DepotPO depo)  throws RemoteException{
		// TODO 自动生成的方法存根
		
	}

}

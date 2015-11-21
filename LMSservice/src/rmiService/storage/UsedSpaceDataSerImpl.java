package rmiService.storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.storagedataservice.UsedSpaceDataSer;

public class UsedSpaceDataSerImpl extends UnicastRemoteObject implements UsedSpaceDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 3977217484673723280L;

	public UsedSpaceDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public int[] getUsedSpace()  throws RemoteException{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public int[] getAllSpace()  throws RemoteException{
		// TODO 自动生成的方法存根
		return null;
	}

}

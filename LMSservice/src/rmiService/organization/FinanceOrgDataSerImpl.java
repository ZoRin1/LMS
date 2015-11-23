package rmiService.organization;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.organizationdataservice.FinanceOrgDataSer;

public class FinanceOrgDataSerImpl extends UnicastRemoteObject implements FinanceOrgDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -2675461398567508092L;

	public FinanceOrgDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public String[] find() throws RemoteException{
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean insert(long ID) throws RemoteException{
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean delete(long ID) throws RemoteException{
		// TODO 自动生成的方法存根
		return false;
	}

}

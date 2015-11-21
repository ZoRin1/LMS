package rmiService.organization;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.orgPO.MiddleOrgPO;
import dataservice.organizationdataservice.MiddleOrgDataSer;

public class MiddleOrgDataSerImpl extends UnicastRemoteObject implements MiddleOrgDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -7743528877522797224L;

	public MiddleOrgDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public String[] getBussinessmanList(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addBussinessman(String ID, long bID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeBussinessman(String ID, long bID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] getStorgerList(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addStorger(String ID, long bID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeStorger(String ID, long bID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] getBussinessHallList(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String GetInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changeCity(String ID, String city) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addMiddleOrg(String ID, MiddleOrgPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeMiddleOrg(String ID, String codeNumber) {
		// TODO Auto-generated method stub
		return false;
	}


}

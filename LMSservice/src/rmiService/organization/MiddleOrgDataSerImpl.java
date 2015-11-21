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
	public String[] getBussinessmanList() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addBussinessman(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeBussinessman(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String[] getStorgerList() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addStorger(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeStorger(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String[] getBussinessHallList() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String GetInfo() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean changeCity(String city) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean addMiddleOrg(MiddleOrgPO po) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeMiddleOrg(String codeNumber) {
		// TODO 自动生成的方法存根
		return false;
	}

}

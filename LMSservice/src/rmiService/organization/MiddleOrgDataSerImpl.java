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
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public String[] getBussinessmanList(String ID) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean addBussinessman(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeBussinessman(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String[] getStorgerList(String ID) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean addStorger(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeStorger(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String[] getBussinessHallList(String ID) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public String GetInfo() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean changeCity(String ID, String city) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean addMiddleOrg(String ID, MiddleOrgPO po) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeMiddleOrg(String ID, String codeNumber) {
		// TODO �Զ����ɵķ������
		return false;
	}


}

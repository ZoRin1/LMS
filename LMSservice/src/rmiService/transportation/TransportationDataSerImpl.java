package rmiService.transportation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.transpotationPO.RoutePO;
import dataservice.transportationdataservice.TransportationDataSer;

public class TransportationDataSerImpl extends UnicastRemoteObject implements TransportationDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 8389026287336221175L;

	public TransportationDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public boolean updateDistance(RoutePO route) throws RemoteException{
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean updateCost(int type, double cost)throws RemoteException {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public double findCost(int type) throws RemoteException{
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public boolean insertRoute(RoutePO route) throws RemoteException{
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public double findDistance(String line) throws RemoteException{
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public String[] findCityList(String city) throws RemoteException{
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean insertCity(String city) throws RemoteException{
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeCity(String city) throws RemoteException{
		// TODO �Զ����ɵķ������
		return false;
	}

}

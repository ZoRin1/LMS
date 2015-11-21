package rmiService.organization;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.orgPO.BussinessOrgPO;
import po.orgPO.DriverPO;
import po.orgPO.VehiclePO;
import dataservice.organizationdataservice.BussinessOrgDataSer;

public class BussinessOrgDataSerImpl extends UnicastRemoteObject implements BussinessOrgDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -2065348468020344293L;

	public BussinessOrgDataSerImpl() throws RemoteException {
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
	public String[] getCourierList(String ID, long bID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addCourier(String ID, long bID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeCourier(String ID, long bID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] getVehicleList(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VehiclePO getVehicleInfo(String ID, String codeVehicle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addVehicle(String ID, VehiclePO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeVehicle(String ID, String codeVehicle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeVehicle(String ID, VehiclePO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] getDriverList(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DriverPO getDriverInfo(String ID, String codeDriver) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addDriver(String ID, DriverPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeDriver(String ID, String codeDriver) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeDriver(String ID, DriverPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addBussinessHall(String ID, BussinessOrgPO po) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeBussinessHall(String ID, String codeNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCodeNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changeCodeNumberOfMiddle(String ID, String codeNumberOfMiddle) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getInfo(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean changeCity(String ID, String city) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeCodeNumber(String ID, String codeNumber) {
		// TODO Auto-generated method stub
		return false;
	}


}

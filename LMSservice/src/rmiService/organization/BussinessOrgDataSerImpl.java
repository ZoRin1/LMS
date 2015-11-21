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
	public String[] getCourierList() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addCourier(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeCourier(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String[] getVehicleList() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public VehiclePO getVehicleInfo(String codeVehicle) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addVehicle(VehiclePO po) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeVehicle(String codeVehicle) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean changeVehicle(VehiclePO po) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String[] getDriverList() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public DriverPO getDriverInfo(String codeDriver) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addDriver(DriverPO po) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeDriver(String codeDriver) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean changeDriver(DriverPO po) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean addBussinessHall(BussinessOrgPO po) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeBussinessHall(String codeNumber) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String getCodeNumber() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean changeCodeNumberOfMiddle(String codeNumberOfMiddle) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String getInfo() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean changeCity(String city) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean changeCodeNumber(String codeNumber) {
		// TODO 自动生成的方法存根
		return false;
	}

}

package businesslogic.organizationbl;

import businesslogicservice.organizationblservice.BussinessOrgBLSer;
import vo.orgVO.BussinessOrgVO;
import vo.orgVO.DriverVO;
import vo.orgVO.VehicleVO;

public class BusinessBL implements BussinessOrgBLSer {

	@Override
	public String[] getBussinessmanList(String ID) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addBussinessman(String ID, long bID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeBussinessman(String ID, long bID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String[] getCourierList(String ID) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addCourier(String ID, long bID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeCourier(String ID, long bID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String[] getVehicleList(String ID) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public VehicleVO getVehicleInfo(String ID, String codeVehicle) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addVehicle(String ID, VehicleVO vo) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeVehicle(String ID, String codeVehicle) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean changeVehicle(String ID, VehicleVO vo) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String[] getDriverList(String ID) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public DriverVO getDriverInfo(String ID, String codeDriver) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addDriver(String ID, DriverVO vo) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeDriver(String ID, String codeDriver) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean changeDriver(String ID, DriverVO vo) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean addBussinessHall(String ID, BussinessOrgVO vo) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeBussinessHall(String ID, String codeNumber) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String getCodeNumber() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean changeCodeNumberOfMiddle(String ID, String codeNumberOfMiddle) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String getInfo() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean changeCity(String ID, String city) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean changeCodeNumber(String ID, String codeNumber) {
		// TODO 自动生成的方法存根
		return false;
	}

}

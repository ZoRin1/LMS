package businesslogic.organizationbl;

import vo.orgVO.DriverVO;
import vo.orgVO.VehicleVO;

public class BhclerkController {
	
	BusinessBL bBL = new BusinessBL();
	
	public String[] getVehicleList() {
		// TODO 自动生成的方法存根
		return bBL.getVehicleList(null);
	}


	public VehicleVO getVehicleInfo(String codeVehicle) {
		// TODO 自动生成的方法存根
		return bBL.getVehicleInfo(null, codeVehicle);
	}


	public boolean addVehicle(VehicleVO vo) {
		// TODO 自动生成的方法存根
		return bBL.addVehicle(null, vo);
	}


	public boolean removeVehicle(String codeVehicle) {
		// TODO 自动生成的方法存根
		return bBL.removeVehicle(null, codeVehicle);
	}


	public boolean changeVehicle(VehicleVO vo) {
		// TODO 自动生成的方法存根
		return bBL.changeVehicle(null, vo);
	}


	public String[] getDriverList() {
		// TODO 自动生成的方法存根
		return bBL.getDriverList(null);
	}


	public DriverVO getDriverInfo(String codeDriver) {
		// TODO 自动生成的方法存根
		return bBL.getDriverInfo(null, codeDriver);
	}


	public boolean addDriver(DriverVO vo) {
		// TODO 自动生成的方法存根
		return bBL.addDriver(null, vo);
	}


	public boolean removeDriver(String codeDriver) {
		// TODO 自动生成的方法存根
		return bBL.removeDriver(null, codeDriver);
	}


	public boolean changeDriver(DriverVO vo) {
		// TODO 自动生成的方法存根
		return bBL.changeDriver(null, vo);
	}

}

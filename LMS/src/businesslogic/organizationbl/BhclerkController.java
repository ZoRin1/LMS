package businesslogic.organizationbl;

import vo.orgVO.DriverVO;
import vo.orgVO.VehicleVO;

public class BhclerkController {
	
	BusinessBL bBL = new BusinessBL();
	
	public String[] getVehicleList(String ID) {
		// TODO �Զ����ɵķ������
		return bBL.getVehicleList(ID);
	}


	public VehicleVO getVehicleInfo(String ID, String codeVehicle) {
		// TODO �Զ����ɵķ������
		return bBL.getVehicleInfo(ID, codeVehicle);
	}


	public boolean addVehicle(String ID, VehicleVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.addVehicle(ID, vo);
	}


	public boolean removeVehicle(String ID, String codeVehicle) {
		// TODO �Զ����ɵķ������
		return bBL.removeVehicle(ID, codeVehicle);
	}


	public boolean changeVehicle(String ID, VehicleVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.changeVehicle(ID, vo);
	}


	public String[] getDriverList(String ID) {
		// TODO �Զ����ɵķ������
		return bBL.getDriverList(ID);
	}


	public DriverVO getDriverInfo(String ID, String codeDriver) {
		// TODO �Զ����ɵķ������
		return bBL.getDriverInfo(ID, codeDriver);
	}


	public boolean addDriver(String ID, DriverVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.addDriver(ID, vo);
	}


	public boolean removeDriver(String ID, String codeDriver) {
		// TODO �Զ����ɵķ������
		return bBL.removeDriver(ID, codeDriver);
	}


	public boolean changeDriver(String ID, DriverVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.changeDriver(ID, vo);
	}

}

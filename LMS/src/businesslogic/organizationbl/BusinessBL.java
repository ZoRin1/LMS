package businesslogic.organizationbl;

import businesslogicservice.organizationblservice.BussinessOrgBLSer;
import vo.orgVO.BussinessOrgVO;
import vo.orgVO.DriverVO;
import vo.orgVO.VehicleVO;

public class BusinessBL implements BussinessOrgBLSer {

	@Override
	public String[] getBussinessmanList(String ID) {
		String[] result = {"1000001-�ŷ�","1000002-����","1000003-��ΰ"};
		// TODO �Զ����ɵķ������
		return result;
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
	public String[] getCourierList(String ID) {
		String[] result = {"1000001-�ŷ�","1000002-����","1000003-��ΰ"};
		// TODO �Զ����ɵķ������
		return result;
	}

	@Override
	public boolean addCourier(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeCourier(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String[] getVehicleList(String ID) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public VehicleVO getVehicleInfo(String ID, String codeVehicle) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean addVehicle(String ID, VehicleVO vo) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeVehicle(String ID, String codeVehicle) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean changeVehicle(String ID, VehicleVO vo) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String[] getDriverList(String ID) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public DriverVO getDriverInfo(String ID, String codeDriver) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean addDriver(String ID, DriverVO vo) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeDriver(String ID, String codeDriver) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean changeDriver(String ID, DriverVO vo) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean addBussinessHall(String ID, BussinessOrgVO vo) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeBussinessHall(String ID, String codeNumber) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String getCodeNumber() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public boolean changeCodeNumberOfMiddle(String ID, String codeNumberOfMiddle) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String getInfo(String ID) {
		// TODO �Զ����ɵķ������
		String result = "��¥";
		return result;
	}

	@Override
	public boolean changeCity(String ID, String city) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean changeCodeNumber(String ID, String codeNumber) {
		// TODO �Զ����ɵķ������
		return false;
	}

}

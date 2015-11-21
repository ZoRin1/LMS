package businesslogic.organizationbl;

import businesslogicservice.organizationblservice.MiddleOrgBLSer;
import vo.orgVO.MiddleOrgVO;

public class MiddleBL implements MiddleOrgBLSer {

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
	public String[] getStorgerList(String ID) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addStorger(String ID, long bID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeStorger(String ID, long bID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String[] getBussinessHallList(String ID) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String GetInfo() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean changeCity(String ID, String city) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean addMiddleOrg(String ID, MiddleOrgVO vo) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeMiddleOrg(String ID) {
		// TODO 自动生成的方法存根
		return false;
	}

}

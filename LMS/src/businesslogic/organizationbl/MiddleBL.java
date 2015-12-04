package businesslogic.organizationbl;

import businesslogicservice.organizationblservice.MiddleOrgBLSer;
import vo.orgVO.MiddleOrgVO;

public class MiddleBL implements MiddleOrgBLSer {

	@Override
	public String[] getBussinessmanList(String ID) {
		String[] result = {"1000001-张飞","1000002-李四","1000003-王伟"};
		// TODO 自动生成的方法存根
		return result;
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
		String[] result = {"1000001-张飞","1000002-李四","1000003-王伟"};
		// TODO 自动生成的方法存根
		return result;
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
		String[] result = {"100-001-鼓楼营业厅","100-002-仙林营业厅"};
		// TODO 自动生成的方法存根
		return result;
	}

	@Override
	public String GetInfo(String ID) {
		// TODO 自动生成的方法存根
		String result = "南京";
		return result;
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
		return true;
	}

}

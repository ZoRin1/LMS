package businesslogic.organizationbl;

import vo.orgVO.MiddleOrgVO;

public class MiddleController {
	
	MiddleBL mBL = new MiddleBL();
	
	

	public String[] getBussinessmanList() {
		// TODO 自动生成的方法存根
		return mBL.getBussinessHallList(null);
	}


	public boolean addBussinessman(long ID) {
		// TODO 自动生成的方法存根
		return mBL.addBussinessman(null, ID);
	}

	
	public boolean removeBussinessman(long ID) {
		// TODO 自动生成的方法存根
		return mBL.removeBussinessman(null, ID);
	}

	
	public String[] getStorgerList() {
		// TODO 自动生成的方法存根
		return mBL.getStorgerList(null);
	}

	
	public boolean addStorger(long ID) {
		// TODO 自动生成的方法存根
		return mBL.addStorger(null, ID);
	}


	public boolean removeStorger(long ID) {
		// TODO 自动生成的方法存根
		return mBL.removeStorger(null, ID);
	}

	
	public String[] getBussinessHallList() {
		// TODO 自动生成的方法存根
		return mBL.getBussinessHallList(null);
	}


	public String GetInfo() {
		// TODO 自动生成的方法存根
		return mBL.GetInfo();
	}


	public boolean changeCity(String city) {
		// TODO 自动生成的方法存根
		return mBL.changeCity(null, city);
	}


	public boolean addMiddleOrg(MiddleOrgVO vo) {
		// TODO 自动生成的方法存根
		return mBL.addMiddleOrg(null, vo);
	}


	public boolean removeMiddleOrg(String codeNumber) {
		// TODO 自动生成的方法存根
		return mBL.removeMiddleOrg(codeNumber);
	}


}

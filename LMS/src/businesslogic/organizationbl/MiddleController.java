package businesslogic.organizationbl;

import vo.orgVO.MiddleOrgVO;

public class MiddleController {
	
	MiddleBL mBL = new MiddleBL();
	
	

	public String[] getBussinessmanList(String ID) {
		// TODO �Զ����ɵķ������
		return mBL.getBussinessmanList(ID);
	}


	public boolean addBussinessman(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return mBL.addBussinessman(ID, bID);
	}

	
	public boolean removeBussinessman(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return mBL.removeBussinessman(ID, bID);
	}

	
	public String[] getStorgerList(String ID) {
		// TODO �Զ����ɵķ������
		return mBL.getStorgerList(ID);
	}

	
	public boolean addStorger(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return mBL.addStorger(ID, bID);
	}


	public boolean removeStorger(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return mBL.removeStorger(ID, bID);
	}

	
	public String[] getBussinessHallList(String ID) {
		// TODO �Զ����ɵķ������
		return mBL.getBussinessHallList(ID);
	}


	public String GetInfo(String ID) {
		// TODO �Զ����ɵķ������
		return mBL.GetInfo(ID);
	}


	public boolean changeCity(String ID, String city) {
		// TODO �Զ����ɵķ������
		return mBL.changeCity(ID, city);
	}


	public boolean addMiddleOrg(String ID, MiddleOrgVO vo) {
		// TODO �Զ����ɵķ������
		return mBL.addMiddleOrg(ID, vo);
	}


	public boolean removeMiddleOrg(String codeNumber) {
		// TODO �Զ����ɵķ������
		return mBL.removeMiddleOrg(codeNumber);
	}


}

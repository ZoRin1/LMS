package businesslogic.organizationbl;

import businesslogicservice.storageblservice.usedSpaceBlSer;
import vo.orgVO.BussinessOrgVO;

public class BusinessController {
	
	BusinessBL bBL = new BusinessBL();
	
	public String[] getBussinessmanList(String ID) {
		// TODO �Զ����ɵķ������
		return bBL.getBussinessmanList(ID);
	}


	public boolean addBussinessman(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return bBL.addBussinessman(ID, bID);
	}


	public boolean removeBussinessman(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return bBL.removeBussinessman(ID, bID);
	}


	public String[] getCourierList(String ID) {
		// TODO �Զ����ɵķ������
		return bBL.getCourierList(ID);
	}


	public boolean addCourier(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return bBL.addCourier(ID, bID);
	}


	public boolean removeCourier(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return bBL.removeCourier(ID, bID);
	}
	
	public boolean addBussinessHall(String ID, BussinessOrgVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.addBussinessHall(ID, vo);
	}


	public boolean removeBussinessHall(String ID, String codeNumber) {
		// TODO �Զ����ɵķ������
		return bBL.removeBussinessHall(ID, codeNumber);
	}


	public String getCodeNumber() {
		// TODO �Զ����ɵķ������
		return bBL.getCodeNumber();
	}


	public boolean changeCodeNumberOfMiddle(String ID, String codeNumberOfMiddle) {
		// TODO �Զ����ɵķ������
		return bBL.changeCodeNumberOfMiddle(ID, codeNumberOfMiddle);
	}


	public String getInfo(String ID) {
		// TODO �Զ����ɵķ������
		return bBL.getInfo(ID);
	}


	public boolean changeCity(String ID, String city) {
		// TODO �Զ����ɵķ������
		return bBL.changeCity(ID, city);
	}


	public boolean changeCodeNumber(String ID, String codeNumber) {
		// TODO �Զ����ɵķ������
		return bBL.changeCodeNumber(ID, codeNumber);
	}


}

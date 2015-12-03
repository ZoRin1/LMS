package businesslogic.organizationbl;

import vo.orgVO.BussinessOrgVO;

public class BusinessController {
	
	BusinessBL bBL = new BusinessBL();
	
	public String[] getBussinessmanList() {
		// TODO 自动生成的方法存根
		return bBL.getBussinessmanList(null);
	}


	public boolean addBussinessman(long ID) {
		// TODO 自动生成的方法存根
		return bBL.addBussinessman(null, ID);
	}


	public boolean removeBussinessman(long ID) {
		// TODO 自动生成的方法存根
		return bBL.removeBussinessman(null, ID);
	}


	public String[] getCourierList() {
		// TODO 自动生成的方法存根
		return bBL.getCourierList(null);
	}


	public boolean addCourier(long ID) {
		// TODO 自动生成的方法存根
		return addCourier(ID);
	}


	public boolean removeCourier(long ID) {
		// TODO 自动生成的方法存根
		return bBL.removeCourier(null, ID);
	}
	
	public boolean addBussinessHall(BussinessOrgVO vo) {
		// TODO 自动生成的方法存根
		return bBL.addBussinessHall(null, vo);
	}


	public boolean removeBussinessHall(String codeNumber) {
		// TODO 自动生成的方法存根
		return bBL.removeBussinessHall(null, codeNumber);
	}


	public String getCodeNumber() {
		// TODO 自动生成的方法存根
		return bBL.getCodeNumber();
	}


	public boolean changeCodeNumberOfMiddle(String codeNumberOfMiddle) {
		// TODO 自动生成的方法存根
		return bBL.changeCodeNumberOfMiddle(null, codeNumberOfMiddle);
	}


	public String getInfo(String ID) {
		// TODO 自动生成的方法存根
		return bBL.getInfo(ID);
	}


	public boolean changeCity(String city) {
		// TODO 自动生成的方法存根
		return bBL.changeCity(null, city);
	}


	public boolean changeCodeNumber(String codeNumber) {
		// TODO 自动生成的方法存根
		return bBL.changeCodeNumber(null, codeNumber);
	}


}

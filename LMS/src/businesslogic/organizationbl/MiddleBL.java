package businesslogic.organizationbl;

import businesslogicservice.organizationblservice.MiddleOrgBLSer;
import vo.orgVO.MiddleOrgVO;

public class MiddleBL implements MiddleOrgBLSer {

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
	public String[] getStorgerList(String ID) {
		String[] result = {"1000001-�ŷ�","1000002-����","1000003-��ΰ"};
		// TODO �Զ����ɵķ������
		return result;
	}

	@Override
	public boolean addStorger(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeStorger(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public String[] getBussinessHallList(String ID) {
		String[] result = {"100-001-��¥Ӫҵ��","100-002-����Ӫҵ��"};
		// TODO �Զ����ɵķ������
		return result;
	}

	@Override
	public String GetInfo(String ID) {
		// TODO �Զ����ɵķ������
		String result = "�Ͼ�";
		return result;
	}

	@Override
	public boolean changeCity(String ID, String city) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean addMiddleOrg(String ID, MiddleOrgVO vo) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeMiddleOrg(String ID) {
		// TODO �Զ����ɵķ������
		return true;
	}

}

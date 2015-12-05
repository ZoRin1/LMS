package businesslogic.organizationbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import businesslogicservice.organizationblservice.MiddleOrgBLSer;
import dataservice.organizationdataservice.MiddleOrgDataSer;
import dataservice.organizationdataservice.organizationFactory;
import po.orgPO.MiddleOrgPO;
import vo.orgVO.MiddleOrgVO;

public class MiddleBL implements MiddleOrgBLSer {
	
	private MiddleOrgDataSer middleOrgDataSer;
	
	public MiddleBL() {
		// TODO Auto-generated constructor stub
		
		try {
			organizationFactory organizationFactory = (organizationFactory)Naming.lookup("rmi://127.0.0.1:6600/orgFactory");
			this.middleOrgDataSer = organizationFactory.createMiddleOrgDataSer();
		} catch (MalformedURLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	@Override
	public String[] getBussinessmanList(String ID) {
		String[] result = {"1000001-�ŷ�","1000002-����","1000003-��ΰ"};
		// TODO �Զ����ɵķ������
		return this.middleOrgDataSer.getBussinessmanList(ID);
	}

	@Override
	public boolean addBussinessman(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return this.middleOrgDataSer.addBussinessman(ID, bID);
	}

	@Override
	public boolean removeBussinessman(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return this.middleOrgDataSer.removeBussinessman(ID, bID);
	}

	@Override
	public String[] getStorgerList(String ID) {
//		String[] result = {"1000001-�ŷ�","1000002-����","1000003-��ΰ"};
		// TODO �Զ����ɵķ������
		return this.middleOrgDataSer.getStorgerList(ID);
	}

	@Override
	public boolean addStorger(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return this.middleOrgDataSer.addStorger(ID, bID);
	}

	@Override
	public boolean removeStorger(String ID, long bID) {
		// TODO �Զ����ɵķ������
		return this.middleOrgDataSer.removeStorger(ID, bID);
	}

	@Override
	public String[] getBussinessHallList(String ID) {
//		String[] result = {"100-001-��¥Ӫҵ��","100-002-����Ӫҵ��"};
		// TODO �Զ����ɵķ������
		return this.middleOrgDataSer.getBussinessHallList(ID);
	}

	@Override
	public String GetInfo(String ID) {
		// TODO �Զ����ɵķ������
//		String result = "�Ͼ�";
		return this.middleOrgDataSer.GetInfo(ID);
	}

	@Override
	public boolean changeCity(String ID, String city) {
		// TODO �Զ����ɵķ������
		return this.middleOrgDataSer.changeCity(ID, city);
	}

	@Override
	public boolean addMiddleOrg(String ID, MiddleOrgVO vo) {
		// TODO �Զ����ɵķ������
		return this.middleOrgDataSer.addMiddleOrg(ID, new MiddleOrgPO(vo.getCity(), vo.getCodeNumber(), null, null, null));
	}

	@Override
	public boolean removeMiddleOrg(String ID) {
		// TODO �Զ����ɵķ������
		return this.middleOrgDataSer.removeMiddleOrg(ID);
	}

}

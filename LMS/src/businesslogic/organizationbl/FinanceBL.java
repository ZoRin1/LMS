package businesslogic.organizationbl;

import businesslogicservice.organizationblservice.FinanceOrgBLSer;

public class FinanceBL implements FinanceOrgBLSer {

	@Override
	public String[] getFinancersList() {
		String[] result = {"1000001-�ŷ�","1000002-����","1000003-��ΰ"};
		// TODO �Զ����ɵķ������
		return result;
	}

	@Override
	public boolean addFinancer(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeFinancer(long ID) {
		// TODO �Զ����ɵķ������
		return false;
	}

}

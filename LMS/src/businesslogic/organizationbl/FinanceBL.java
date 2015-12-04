package businesslogic.organizationbl;

import businesslogicservice.organizationblservice.FinanceOrgBLSer;

public class FinanceBL implements FinanceOrgBLSer {

	@Override
	public String[] getFinancersList() {
		String[] result = {"1000001-张飞","1000002-李四","1000003-王伟"};
		// TODO 自动生成的方法存根
		return result;
	}

	@Override
	public boolean addFinancer(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeFinancer(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

}

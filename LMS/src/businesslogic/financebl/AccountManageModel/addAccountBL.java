package businesslogic.financebl.AccountManageModel;

import vo.financeVO.AccountVO;
import businesslogicservice.financeblservice.AddAccountBlSer;

public class addAccountBL implements AddAccountBlSer{

	AccountVO vo;

	@Override
	public AccountVO addAccount(String name, double money) {
		// TODO �Զ����ɵķ������
		vo = new AccountVO(name,money);
		return vo;
	}

}

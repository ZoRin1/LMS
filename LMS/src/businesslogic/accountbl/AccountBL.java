package businesslogic.accountbl;

import businesslogicservice.accountblservice.AccountBLSer;
import vo.accountVO.AccountNumberVO;

public class AccountBL implements AccountBLSer {

	@Override
	public String login(long ID, String password) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public boolean addAccount(long ID, AccountNumberVO vo) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean changeInfo(long ID, AccountNumberVO vo) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean deleteAccount(long ID) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public String[] getAccount(long ID) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String[] getAccountList(String name) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public AccountNumberVO getInfo(long ID) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String[] getAccountList() {
		// TODO 自动生成的方法存根
		return null;
	}

}

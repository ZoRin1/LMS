package businesslogic.financebl.AccountManageModel;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.financePO.AccountPO;
import dataservice.financedataservice.GetAccountDataSer;
import dataservice.financedataservice.financeFactory;
import vo.financeVO.AccountVO;
import businesslogicservice.financeblservice.GetAccountBlSer;

public class CheckAccountBL implements GetAccountBlSer{

	@Override
	public ArrayList<AccountVO> getAccount() {
		// TODO 自动生成的方法存根
		
		//555555
		return null;
	}

}

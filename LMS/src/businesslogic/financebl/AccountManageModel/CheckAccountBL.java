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
		// TODO �Զ����ɵķ������
		ArrayList<AccountVO> vo = new ArrayList<AccountVO>();
		ArrayList<AccountPO> po;
		AccountVO v1;
		AccountPO p1;
		try {
			financeFactory finFactory = (financeFactory)Naming.lookup("rmi://127.0.0.1:6600/finFactory");
			GetAccountDataSer getAccount = finFactory.createGetAccountDataSer();
			po = getAccount.getAccount();
			for(int i = 0 ; i <po.size();i++){
				p1 = po.get(i);
				v1 = new AccountVO(p1.getName(),p1.getSums());
				vo.add(v1);
			}
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
		return vo;
	}

}

package businesslogic.financebl.AccountManageModel;

import java.util.ArrayList;

import po.financePO.AccountPO;
import businesslogic.state.ResultMessage;
import vo.financeVO.AccountVO;

public class AccountManageBL {
	
	private ArrayList<AccountVO> accountInf;
	private CheckAccountBL checkAccount;
	private addAccountBL addAccount;
	private CoverAccountBL coverAccount;
	
	public ArrayList<AccountVO> getAccountInf() {
		return accountInf;
	}

	public AccountManageBL(){
		super();
		checkAccount = new CheckAccountBL();
		addAccount = new addAccountBL();
	}
	
    //�˻���Ϣ
	public void CheckManage(){
		accountInf = checkAccount.getAccount();
	}
	
	//�������˻�
	public void AddManage(String name,double money){
		AccountVO vo = addAccount.addAccount(name, money);
		accountInf.add(vo);
	}
	//��ɾ���û�
	public void DeleteManage(int index){
		accountInf.remove(index);
	}
	//���ʼ���˻�
	public void IntalizaManage(String name,double money,int index){
		accountInf.remove(index);
		AccountVO vo = addAccount.addAccount(name, money);
		accountInf.set(index, vo);
	}
	
	//�����˻���Ϣ
	public boolean UpdateAccount(ArrayList<AccountVO> vo){
		ArrayList<AccountPO> po = new ArrayList<AccountPO>();
		AccountPO p1;
		AccountVO v1;
		for(int i = 0 ; i <vo.size();i++){
			v1 = vo.get(i);
			p1 = new AccountPO(v1.getName(),v1.getSums());
			po.add(p1);
		}
		coverAccount = new CoverAccountBL(po);
		return coverAccount.CoverAccount();
	}
	
}

package vo.financeVO;

import java.util.ArrayList;

import po.orgPO.BussinessOrgPO;
import po.orgPO.VehiclePO;
import po.accountPO.*;
import po.documentsPO.InBillsPO;
import po.financePO.AccountPO;

/**
 * 用于显示账本信息
 * @author YangGuan
 *
 */
public class BooksVO {
	
	private ArrayList<BussinessOrgPO>  ArrOrg; // 机构
	private ArrayList<AccountInfoPO>  person; //人员
	private ArrayList<VehiclePO>  Vehicle; // 车辆
	private ArrayList<AccountPO> Account; //账户
	private ArrayList<InBillsPO> InBills; // 入库单（不知道是不是库存）
	
	
	public BooksVO(ArrayList<BussinessOrgPO> arrOrg, ArrayList<AccountInfoPO> person,
			ArrayList<VehiclePO> vehicle, ArrayList<AccountPO> account,
			ArrayList<InBillsPO> inBills) {
		super();
		ArrOrg = arrOrg;
		this.person = person;
		Vehicle = vehicle;
		Account = account;
		InBills = inBills;
	}


	public ArrayList<BussinessOrgPO> getArrOrg() {
		return ArrOrg;
	}


	public void setArrOrg(ArrayList<BussinessOrgPO> arrOrg) {
		ArrOrg = arrOrg;
	}


	public ArrayList<AccountInfoPO> getPerson() {
		return person;
	}


	public void setPerson(ArrayList<AccountInfoPO> person) {
		this.person = person;
	}


	public ArrayList<VehiclePO> getVehicle() {
		return Vehicle;
	}


	public void setVehicle(ArrayList<VehiclePO> vehicle) {
		Vehicle = vehicle;
	}


	public ArrayList<AccountPO> getAccount() {
		return Account;
	}


	public void setAccount(ArrayList<AccountPO> account) {
		Account = account;
	}


	public ArrayList<InBillsPO> getInBills() {
		return InBills;
	}


	public void setInBills(ArrayList<InBillsPO> inBills) {
		InBills = inBills;
	}
	
	
	
	
}

package vo.orgVO;

import java.util.ArrayList;

import vo.accountVO.AccountNumberVO;


/**
 * 用来表示中转中心
 * 
 * @author YangHua'an
 *
 */
public class MiddleOrgVO {

	private String city;//机构所在城市
	private String codeNumber;//机构编号，3位，如000
	private ArrayList<AccountNumberVO> assisant;//中转中心营业员账号列表
	private ArrayList<AccountNumberVO> storger;//仓库管理员账号列表
	private ArrayList<BussinessOrgVO> bussinessHall;//下辖营业厅列表
	//private ArrayList<VehicleVO> vehicle;//车辆信息列表
	//private ArrayList<DriverVO> driver;//司机信息列表

	

	

	public MiddleOrgVO(String city, String codeNumber, ArrayList<AccountNumberVO> assisant,
			ArrayList<AccountNumberVO> storger, ArrayList<BussinessOrgVO> bussinessHall) {
		super();
		this.city = city;
		this.codeNumber = codeNumber;
		this.assisant = assisant;
		this.storger = storger;
		this.bussinessHall = bussinessHall;
		
		for(AccountNumberVO vo:assisant){
			vo.setState(3+"-"+city+"-中转中心"+"-"+codeNumber);
		}
		
		for(AccountNumberVO vo:storger){
			vo.setState(4+"-"+city+"-中转中心"+"-"+codeNumber);
		}
	}

	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}

	public String getCodeNumber() {
		return codeNumber;
	}

	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}

	public ArrayList<AccountNumberVO> getAssisant() {
		return assisant;
	}

	public void setAssisant(ArrayList<AccountNumberVO> assisant) {
		this.assisant = assisant;
	}

	public ArrayList<AccountNumberVO> getStorger() {
		return storger;
	}

	public void setStorger(ArrayList<AccountNumberVO> storger) {
		this.storger = storger;
	}

	public ArrayList<BussinessOrgVO> getBussinessHall() {
		return bussinessHall;
	}

	public void setBussinessHall(ArrayList<BussinessOrgVO> bussinessHall) {
		this.bussinessHall = bussinessHall;
	}

	public void addAssisant(AccountNumberVO vo){
		this.assisant.add(vo);	
		vo.setState(3+"-"+city+"-中转中心"+"-"+codeNumber);
	}
	
	public void removeAssisant( AccountNumberVO vo){
	   this.assisant.remove(vo);
	   vo.setState("0");
	}
	
	public void addStorger(AccountNumberVO vo){
		this.assisant.add(vo);	
		vo.setState(4+"-"+city+"-中转中心"+"-"+codeNumber);
	}
	
	public void removeStorger( AccountNumberVO vo){
	    this.storger.remove(vo);
	    vo.setState("0");

	}
	
	public void addBussinessOrg(BussinessOrgVO vo){
		this.bussinessHall.add(vo);	
	}
	
	public void removeBussinessOrg(BussinessOrgVO vo){
		this.bussinessHall.remove(vo);	
	}

}

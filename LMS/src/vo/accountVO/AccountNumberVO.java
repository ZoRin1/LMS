package vo.accountVO;

import java.util.Calendar;

/**
 * 用来显示账号信息
 * 
 * @author YangHua'an
 *
 */
public class AccountNumberVO {

	private String name;//账号姓名
	private long ID;//账号ID
	private String password;//账号密码
	private String state;
	/**
	 * int-(所属中转中心城市-）所在城市-所属机构名称-中转中心编号（-营业厅编号）
	 * null代表空闲
	 * 1代表快递员
	 * 2代表营业厅业务员
	 * 3代表中转中心业务员
	 * 4代表中转中心仓库管理员
	 * 5代表财务人员
	 * 6代表总经理
	 * 7代表系统管理员
	 * 例如：1-南京-鼓楼-营业厅-001-001  表示南京鼓楼营业厅的快递员
	 *      3-南京-中转中心-001  表示南京中转中心的业务员
	 *      0 表示空闲
	 */
	private String phone;//电话号码
	private String sID;//身份证号码
	private Calendar date;//注册时间
	
	
	public AccountNumberVO(String name, long iD, String password, String state, String phone, String sID, Calendar date) {
		super();
		this.name = name;
		ID = iD;
		this.password = password;
		this.state = state;
		this.phone = phone;
		this.sID = sID;
		this.date = date;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getsID() {
		return sID;
	}

	public void setsID(String sID) {
		this.sID = sID;
	}
	
}

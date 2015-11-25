package po.financePO;



/**
 * ���ڴ洢�򷵻��˱���Ϣ
 * @author YangGuan
 *
 */
import java.io.Serializable;
import java.util.ArrayList;

import po.accountPO.AccountInfoPO;
import po.documentsPO.InBillsPO;
import po.orgPO.BussinessOrgPO;
import po.orgPO.VehiclePO;


public class BooksPO  implements Serializable {
	
	private String  bussinessHallCode; // ����
	private String  middleCode;
	private String  financeCode;
	private String  IDCode; //��Ա
	private String  VehicleCode; // ����
	private String AccountName; //�˻�
	
	public BooksPO(String bussinessHallCode, String middleCode,
			String financeCode, String iDCode, String vehicleCode,
			String accountName) {
		super();
		this.bussinessHallCode = bussinessHallCode;
		this.middleCode = middleCode;
		this.financeCode = financeCode;
		this.IDCode = iDCode;
		this.VehicleCode = vehicleCode;
		this.AccountName = accountName;
	}

	public String getBussinessHallCode() {
		return bussinessHallCode;
	}

	public void setBussinessHallCode(String bussinessHallCode) {
		this.bussinessHallCode = bussinessHallCode;
	}

	public String getMiddleCode() {
		return middleCode;
	}

	public void setMiddleCode(String middleCode) {
		this.middleCode = middleCode;
	}

	public String getFinanceCode() {
		return financeCode;
	}

	public void setFinanceCode(String financeCode) {
		this.financeCode = financeCode;
	}

	public String getIDCode() {
		return IDCode;
	}

	public void setIDCode(String iDCode) {
		IDCode = iDCode;
	}

	public String getVehicleCode() {
		return VehicleCode;
	}

	public void setVehicleCode(String vehicleCode) {
		VehicleCode = vehicleCode;
	}

	public String getAccountName() {
		return AccountName;
	}

	public void setAccountName(String accountName) {
		AccountName = accountName;
	}

	



	
	
}

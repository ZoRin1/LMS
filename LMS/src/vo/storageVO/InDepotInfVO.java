package vo.storageVO;



/**
 * 用于显示入库快递编号、入库日期、目的地和存储位置
 * 用于库存盘点
 * @author YangGuan
 *
 */
public class InDepotInfVO {
	
	
	private String InDepotNum; //入库快递编号
	private String InDepotDate; //入库日期
	private String Destination; // 目的地
	private String AreaNum; //区号
	private String RowNum; //排号
	private String ShelvesNum;  //架号
	private String SositionNum; //位号
	
	
	public InDepotInfVO(String inDepotNum, String inDepotDate,
			String destination, String areaNum, String rowNum,
			String shelvesNum, String sositionNum) {
		super();
		InDepotNum = inDepotNum;
		InDepotDate = inDepotDate;
		Destination = destination;
		AreaNum = areaNum;
		RowNum = rowNum;
		ShelvesNum = shelvesNum;
		SositionNum = sositionNum;
	}


	public String getInDepotNum() {
		return InDepotNum;
	}


	public void setInDepotNum(String inDepotNum) {
		InDepotNum = inDepotNum;
	}


	public String getInDepotDate() {
		return InDepotDate;
	}


	public void setInDepotDate(String inDepotDate) {
		InDepotDate = inDepotDate;
	}


	public String getDestination() {
		return Destination;
	}


	public void setDestination(String destination) {
		Destination = destination;
	}


	public String getAreaNum() {
		return AreaNum;
	}


	public void setAreaNum(String areaNum) {
		AreaNum = areaNum;
	}


	public String getRowNum() {
		return RowNum;
	}


	public void setRowNum(String rowNum) {
		RowNum = rowNum;
	}


	public String getShelvesNum() {
		return ShelvesNum;
	}


	public void setShelvesNum(String shelvesNum) {
		ShelvesNum = shelvesNum;
	}


	public String getSositionNum() {
		return SositionNum;
	}


	public void setSositionNum(String sositionNum) {
		SositionNum = sositionNum;
	}
	
	
	
}

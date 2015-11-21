package vo.storageVO;



/**
 * 用于显示入库快递编号、金额信息和存储位置
 * 用于库存查询
 * @author YangGuan
 *
 */
public class SimpleInDepotInfVO {
	
	
	private String InDepotNum; //入库快递编号
	private double Sums; //金额信息
	private String AreaNum; //区号
	private String RowNum; //排号
	private String ShelvesNum;  //架号
	private String SositionNum; //位号
	public SimpleInDepotInfVO(String inDepotNum, double sums, String areaNum,
			String rowNum, String shelvesNum, String sositionNum) {
		super();
		InDepotNum = inDepotNum;
		Sums = sums;
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
	public double getSums() {
		return Sums;
	}
	public void setSums(double sums) {
		Sums = sums;
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

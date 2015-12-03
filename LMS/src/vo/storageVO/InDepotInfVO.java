package vo.storageVO;



/**
 * ������ʾ����ݱ�š�������ڡ�Ŀ�ĵغʹ洢λ��
 * ���ڿ���̵�
 * @author YangGuan
 *
 */
public class InDepotInfVO {
	
	
	private String InDepotNum; //����ݱ��
	private String InDepotDate; //�������
	private String Destination; // Ŀ�ĵ�
	private int AreaNum; //����
	private int RowNum; //�ź�
	private int ShelvesNum;  //�ܺ�
	private int SositionNum; //λ��
	
	
	public InDepotInfVO(String inDepotNum, String inDepotDate,
			String destination, int areaNum, int rowNum,
			int shelvesNum, int sositionNum) {
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


	public int getAreaNum() {
		return AreaNum;
	}


	public void setAreaNum(int areaNum) {
		AreaNum = areaNum;
	}


	public int getRowNum() {
		return RowNum;
	}


	public void setRowNum(int rowNum) {
		RowNum = rowNum;
	}


	public int getShelvesNum() {
		return ShelvesNum;
	}


	public void setShelvesNum(int shelvesNum) {
		ShelvesNum = shelvesNum;
	}


	public int getSositionNum() {
		return SositionNum;
	}


	public void setSositionNum(int sositionNum) {
		SositionNum = sositionNum;
	}
	
	
	
}

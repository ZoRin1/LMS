package vo.storageVO;



/**
 * ������ʾ����ݱ�š������Ϣ�ʹ洢λ��
 * ���ڿ���ѯ
 * @author YangGuan
 *
 */
public class SimpleInDepotInfVO {
	
	
	private String InDepotNum; //����ݱ��
	private int AreaNum; //����
	private int RowNum; //�ź�
	private int ShelvesNum;  //�ܺ�
	private int SositionNum; //λ��
	public SimpleInDepotInfVO(String inDepotNum, int areaNum,
			int rowNum, int shelvesNum, int sositionNum) {
		super();
		InDepotNum = inDepotNum;
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

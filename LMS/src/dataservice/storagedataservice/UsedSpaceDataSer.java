package dataservice.storagedataservice;

public interface UsedSpaceDataSer {
	/**
	 * �õ������������ÿռ��С
	 * ����������������
	 * @author YangGuan
	 *
	 */
	public int[] getUsedSpace(String city);
	
	/**
	 * �õ����������ܿռ��С
	 * ����������������
	 * @author YangGuan
	 *
	 */
	public int[] getAllSpace(String city);
	
	/**
	 * �õ������������ռ��С
	 * ����������������
	 * @author YangGuan
	 *
	 */
	public int getJiDongSpace(String city);
}

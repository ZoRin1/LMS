package dataservice.storagedataservice;

public interface UsedSpaceDataSer {
	/**
	 * 得到库存各分区已用空间大小
	 * 进入分区调整界面后
	 * @author YangGuan
	 *
	 */
	public int[] getUsedSpace();
	
	/**
	 * 得到库存各分区总空间大小
	 * 进入分区调整界面后
	 * @author YangGuan
	 *
	 */
	public int[] getAllSpace();
}

package businesslogicservice.storageblservice;

public interface usedSpaceBlSer {
	
	/**
	 * 提供分区调整中需要的各库区已用空间大小。
	 * @author YangGuan
	 *
	 */
	public int[] usedSpaceInf();
	
	
	/**
	 * 提供分区调整中需要的各库区总空间大小。
	 * @author YangGuan
	 *
	 */
	public int[] allSpaceInf();
	
}

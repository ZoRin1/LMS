package dataservice.storagedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UsedSpaceDataSer extends Remote{
	/**
	 * 得到库存各分区已用空间大小
	 * 进入分区调整界面后
	 * @author YangGuan
	 *
	 */
	public int[] getUsedSpace() throws RemoteException;
	
	/**
	 * 得到库存各分区总空间大小
	 * 进入分区调整界面后
	 * @author YangGuan
	 *
	 */
	public int[] getAllSpace() throws RemoteException;
}

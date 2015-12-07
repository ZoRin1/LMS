package dataservice.storagedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UsedSpaceDataSer extends Remote{
	/**
	 * �õ������������ÿռ��С
	 * ����������������
	 * @author YangGuan
	 *
	 */
	public int[] getUsedSpace(String city) throws RemoteException;
	
	/**
	 * �õ����������ܿռ��С
	 * ����������������
	 * @author YangGuan
	 *
	 */
	public int[] getAllSpace(String city) throws RemoteException;
	
	
	/**
	 * �õ������������ռ��С
	 * ����������������
	 * @author YangGuan
	 *
	 */
	public int getJiDongSpace(String city)throws RemoteException;
}

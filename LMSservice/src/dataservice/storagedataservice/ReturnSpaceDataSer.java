package dataservice.storagedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReturnSpaceDataSer extends Remote{
	
	/**
	 * ϵͳ�������뽫�������ռ仹ԭ
	 * ��ʼ������ɹ�
	 * @author YangGuan
	 *
	 */
	public void reSpace(String city) throws RemoteException;
}

package dataservice.documentsdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface NotApproved extends Remote{
	/**
	 *����������δͨ��ʱ�޸Ļ�������������״̬Ϊtrue
	 * @author XiongKaiQi
	 *
	 */
	public boolean NotApproved(String code,String doName)throws RemoteException;
}

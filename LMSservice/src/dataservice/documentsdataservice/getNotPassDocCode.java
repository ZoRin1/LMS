package dataservice.documentsdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
	
	public interface getNotPassDocCode extends Remote{
		/**
		 * ͨ���������˺Ż��������δͨ�����ݵı���͵�����
		 * @author XiongKaiQi
		 *
		 */
		public ArrayList<String> getNotPassDocCode(String account)throws RemoteException;
}

package dataservice.documentsdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface getBufferedCodeDataSer extends Remote{
	/**
	 * 
	 * ϵͳ�Ի������������е��ݵı��뼰������(��ţ�����)
	 * @author XiongKaiQi
	 *
	 */
	public ArrayList<String> getCode()throws RemoteException;//xiugai
}

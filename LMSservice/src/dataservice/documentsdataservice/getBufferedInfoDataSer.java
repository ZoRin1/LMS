package dataservice.documentsdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.documentsPO.DocumentPO;

public interface getBufferedInfoDataSer extends Remote {
	/**
	 * ϵͳ����һ��������PO����
	 * ������ʾ���ݵ�������Ϣ
	 * @author XiongKaiQi
	 *
	 */
	public DocumentPO getBufferedInfo(String code,String doName)throws RemoteException;//xiugai
}

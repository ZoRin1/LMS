package dataservice.documentsdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.documentsPO.DocumentPO;

public interface getDocumentInfoDataSer extends Remote{
	/**
	 * ϵͳ����һ������PO����
	 * ������ʾ�����Ӧ���ݶ�����ϸ��Ϣ
	 * @author XiongKaiQi
	 *
	 */
	public DocumentPO getDocumentInfo(String code,String doName)throws RemoteException;//xiugai
}

package dataservice.documentsdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.documentsPO.DocumentPO;

public interface addDocummentInfoDataSer extends Remote{
	/**
	 * 
	 * ϵͳ�������ĵ�����Ϣ
	 * @author XiongKaiQi
	 *
	 */
	public boolean addDocumentInfo(DocumentPO po)throws RemoteException;
}

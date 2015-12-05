package dataservice.documentsdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.documentsPO.DocumentPO;
import po.documentsPO.InBillsPO;

public interface getDocumentInfoDataSer extends Remote{
	/**
	 * ϵͳ����һ������PO����
	 * ������ʾ�����Ӧ���ݶ�����ϸ��Ϣ
	 * @author XiongKaiQi
	 *
	 */
	public DocumentPO getDocumentInfo(String code,String doName)throws RemoteException;//xiugai
	/**
	 * ϵͳ����һ������PO����
	 * ������ʾ����ݱ�Ŷ�Ӧ��ⵥ������ϸ��Ϣ
	 * @author XiongKaiQi
	 *
	 */
	public InBillsPO getInDepotInfo(String doName,String InDepotNum)throws RemoteException;
}

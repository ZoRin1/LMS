package dataservice.organizationdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FinanceOrgDataSer extends Remote{
	
	/**
	 * ���Ҳ����ز�����Ա�б�
	 * @return ������ԱID+name�б�
	 */
	public String[] find()throws RemoteException;
	
	/**
	 * ����һ��������Ա
	 * @param ID ���ӵĲ�����Ա�ı��
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean insert(long ID)throws RemoteException;
	
	/**
	 * ɾ��һ��������Ա
	 * @param ID Ҫɾ���Ĳ�����Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean delete(long ID)throws RemoteException;
	
}

package dataservice.documentsdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface deleteDataSer extends Remote{
	
	/**
	 * codeΪ���ݱ��,doNameΪ������
	 * ϵͳɾ���������ж�Ӧ����
	 * ����booleanֵ�Ƿ�ɾ���ɹ�
	 * @author XiongKaiQi
	 *
	 */
	public boolean delete(String code,String doName)throws RemoteException;//xiugai
}

package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ChangeAccountDataSer extends Remote{
	
	/**
	 * ͨ�������˻������� ����ָ���˻��Ľ��
	 */
	
	public void changeEarn(String accountName,double earn)throws RemoteException;
	
	
	/**
	 * ͨ�������˻������� ��ȥָ���˻��Ľ��
	 */
	
	public void changePay(String accountName,double earn)throws RemoteException;
}

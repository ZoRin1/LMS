package dataservice.documentsdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GetDocCodeDataSer extends Remote{
	//�½�����ʱ�����µĵ��ݱ��

	public String getDocCode(String doName)throws RemoteException;
}
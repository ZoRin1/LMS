package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.financePO.*;

public interface AddBooksDataSer extends Remote{
	
	/**
	 * ϵͳ��ӵ�һ�־û������˱���
	 * @author YangGuan
	 * @param name TODO
	 *
	 */
	public void addBooks(String name) throws RemoteException;
}

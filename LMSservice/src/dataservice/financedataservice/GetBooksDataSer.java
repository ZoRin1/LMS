package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.financePO.*;

public interface GetBooksDataSer extends Remote{
	
	/**
	 * ϵͳ�����������ݷ��ص�һ�־û������˱���
	 * �����ڳ�����
	 * @author YangGuan
	 *
	 */
	public ArrayList<BooksPO> Books() throws RemoteException;
}

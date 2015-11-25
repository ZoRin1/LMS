package dataservice.financedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.financePO.*;

public interface GetBooksDataSer extends Remote{
	
	/**
	 * 系统根据输入的年份返回单一持久化对象（账本）
	 * 用于期初建账
	 * @author YangGuan
	 *
	 */
	public BooksPO Books(String date) throws RemoteException;
}

package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.documentsdataservice.getNotPassDocCode;

public class getNotPassDocCodeImpl extends UnicastRemoteObject implements getNotPassDocCode{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 5802629699384695078L;

	public getNotPassDocCodeImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public ArrayList<String> getNotPassDocCode(String account) {
		// TODO 自动生成的方法存根
		return null;
	}

}

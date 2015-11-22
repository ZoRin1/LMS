package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.documentsdataservice.getWuliuInfoDataSer;

public class getWuliuInfoDataSerImpl extends UnicastRemoteObject implements getWuliuInfoDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 4615262875279176437L;
	
	protected getWuliuInfoDataSerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<String> getWuliuInfo(String code) {
		// TODO Auto-generated method stub
		return null;
	}

}

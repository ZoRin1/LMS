package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.documentsPO.DocumentPO;
import dataservice.documentsdataservice.GetDocCodeDataSer;


public class GetDocCodeDataSerImpl extends UnicastRemoteObject implements GetDocCodeDataSer {
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 4615262875279176437L;
	
	protected GetDocCodeDataSerImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDocCode(String doName) {
		// TODO Auto-generated method stub
		return null;
	}

}

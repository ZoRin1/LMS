package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.documentsPO.DocumentPO;
import dataservice.documentsdataservice.getDocumentInfoDataSer;

public class getDocumentInfoDataSerImpl extends UnicastRemoteObject implements getDocumentInfoDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -3394892968255679797L;

	public  getDocumentInfoDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public DocumentPO getDocumentInfo(String code, String doName) {
		// TODO 自动生成的方法存根
		return null;
	}



}

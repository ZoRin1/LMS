package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import dataservice.documentsdataservice.getCodeDataSer;

public class getCodeDataSerImpl extends UnicastRemoteObject implements getCodeDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 7578979922627164999L;

	public getCodeDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public ArrayList<String> getCode(String doName, String startTime,
			String endTime) {
		// TODO 自动生成的方法存根
		switch (doName) {
		case "出库单":
			sql="";
		case "付款单":
		case "寄件单":
		case "派件单":
			break;
		case "入库单":
			break;
		case "收件单":
			break;
		case "收款单":
			break;
		case "营业厅接收单":
			break;
		case "营业厅装车单":
			break;
		case "中转中心接收单":
			break;
		case "中转中心转运单":
			break;
		}
		return null;
	}

}

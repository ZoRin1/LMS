package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import po.documentsPO.DocumentPO;
import dataservice.documentsdataservice.getBufferedInfoDataSer;

public class getBufferedInfoDataSerImpl extends UnicastRemoteObject implements getBufferedInfoDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 9064602574450436617L;

	public getBufferedInfoDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public DocumentPO getBufferedInfo(String code, String doName) {
		// TODO 自动生成的方法存根
		sql="select * from b"+doName+" where code="+code;
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			switch (doName) {
			case "出库单":
				break;
			case "付款单":
				break;
			case "寄件单":
				break;
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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}



}

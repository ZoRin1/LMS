package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import po.documentsPO.DocumentPO;
import po.documentsPO.OutbillsPO;
import po.documentsPO.PaymentPO;
import dataservice.documentsdataservice.addDocummentInfoDataSer;

public class addDocummentInfoDataSerImpl extends UnicastRemoteObject implements addDocummentInfoDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 4615262875279176437L;

	public addDocummentInfoDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public boolean addDocumentInfo(DocumentPO po) {
		// TODO 自动生成的方法存根
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			
			switch (po.getDoName()) {
			case "出库单":
				OutbillsPO outbillsPO=(OutbillsPO)po;
				sql="insert into b出库单 (code,doName,packCode,date,account,arrival,Mode,transCode,examined) values ("+outbillsPO.getCode()+","+outbillsPO.getDoName()+","+outbillsPO.getPackCode()+","+outbillsPO.getDate()+","+outbillsPO.getAccount()+","+outbillsPO.getArrival()+","+outbillsPO.getMode()+","+outbillsPO.getTransCode()+",0)";
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.executeUpdate();
				preparedStatement.close();
				connection.close();
				return true;
			case "付款单":
				PaymentPO paymentPO=(PaymentPO)po;
				
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
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}

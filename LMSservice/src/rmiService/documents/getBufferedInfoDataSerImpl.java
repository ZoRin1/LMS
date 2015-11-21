package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import po.documentsPO.DocumentPO;
import po.documentsPO.OrderPO;
import po.documentsPO.OutbillsPO;
import po.documentsPO.PaymentPO;
import state.ModeofTrans;
import state.OrderState;
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
				if (resultSet.getString(7).equals("PLANE")) {
					return new OutbillsPO(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6),resultSet.getString(7), resultSet.getString(8));
				}
				else if (resultSet.getString(7).equals("TRAIN")) {
					return new OutbillsPO(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6),resultSet.getString(7), resultSet.getString(8));
				}
				else{
					return new OutbillsPO(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6),resultSet.getString(7), resultSet.getString(8));
				}
			case "付款单":
				return new PaymentPO(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getDouble(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8),resultSet.getString(9));
			case "寄件单":
				String arrayList=new String();
				double sizeList[]=new double[3];
				String s2[]=resultSet.getString(19).split(",");
				for (int i = 0; i < sizeList.length; i++) {
					sizeList[i]=Double.parseDouble(s2[i]);
				}
				if (resultSet.getString(21).equals("QUICK")) {
					return new OrderPO(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8), resultSet.getString(9), resultSet.getString(10), resultSet.getString(11), resultSet.getString(12), resultSet.getString(13), resultSet.getString(14), resultSet.getInt(15), resultSet.getDouble(16), resultSet.getDouble(17), arrayList, sizeList, resultSet.getDouble(20),resultSet.getString(21));
				}
				else if (resultSet.getString(21).equals("SIMPLE")) {
					return new OrderPO(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8), resultSet.getString(9), resultSet.getString(10), resultSet.getString(11), resultSet.getString(12), resultSet.getString(13), resultSet.getString(14), resultSet.getInt(15), resultSet.getDouble(16), resultSet.getDouble(17), arrayList, sizeList, resultSet.getDouble(20), resultSet.getString(21));
				}
				else {
					return new OrderPO(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getString(8), resultSet.getString(9), resultSet.getString(10), resultSet.getString(11), resultSet.getString(12), resultSet.getString(13), resultSet.getString(14), resultSet.getInt(15), resultSet.getDouble(16), resultSet.getDouble(17), arrayList, sizeList, resultSet.getDouble(20), resultSet.getString(21));
				}
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

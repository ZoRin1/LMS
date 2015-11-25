package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import po.financePO.BooksPO;
import dataservice.financedataservice.AddBooksDataSer;

public class AddBooksDataSerImpl extends UnicastRemoteObject implements AddBooksDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -5937811362981589837L;

	public AddBooksDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void addBooks(BooksPO po) throws RemoteException {
		// TODO 自动生成的方法存根
        String  bussinessHallCode; // 机构
        String  middleCode;
        String  financeCode;
        String  IDCode; //人员
        String  VehicleCode; // 车辆
        String  AccountName;//账户
        String  date;//日期
        bussinessHallCode = po.getBussinessHallCode();
        middleCode = po.getMiddleCode();
        financeCode = po.getFinanceCode();
        VehicleCode = po.getVehicleCode();
        IDCode = po.getIDCode();
        AccountName = po.getAccountName();
        date = po.getDate();
	    sql = "INSERT into 账本(bussinessHallCode,middleCode,financeCode,IDCode,VehicleCode,AccountName) values("+bussinessHallCode+","+middleCode+","+financeCode+","+IDCode+","+VehicleCode+","+AccountName+","+date+")";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}

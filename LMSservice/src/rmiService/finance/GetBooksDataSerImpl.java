package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import po.financePO.BooksPO;
import dataservice.financedataservice.GetBooksDataSer;

public class GetBooksDataSerImpl extends UnicastRemoteObject implements GetBooksDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -1237461001825577424L;

	public GetBooksDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public BooksPO Books(String date)  throws RemoteException{
		// TODO 自动生成的方法存根
		sql="SELECT *  from 帐本 where year="+date;
		BooksPO po = null;
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			po = new BooksPO(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7));
			connection.close();
			//有待改进
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return po;
	}
	
}

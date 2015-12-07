package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dataservice.financedataservice.ChangeAccountDataSer;

public class ChangeAccountDataSerImpl extends UnicastRemoteObject implements ChangeAccountDataSer{
	
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;

	/**
	 * 
	 */
	private static final long serialVersionUID = -7023399732468707278L;

	protected ChangeAccountDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void changeEarn(String accountName, double earn) throws RemoteException{
		// TODO �Զ����ɵķ������
		double addEarn=0;
//		sql="UPDATE �˻���"+" set AreaNum=5"+" where AreaNum=4 and SositionNum<="+shipping;
		sql="SELECT * from �˻��� where Name='"+accountName+"'";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				String temp = resultSet.getString(2);
				addEarn = Double.parseDouble(temp)+earn;
			}
			
			sql = "UPDATE �˻���"+" set sums='"+addEarn+"' where name='"+accountName+"'";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

	@Override
	public void changePay(String accountName, double earn) throws RemoteException{
		// TODO �Զ����ɵķ������
		double subPay=0;
		sql="SELECT * from �˻��� where Name='"+accountName+"'";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				String temp = resultSet.getString(2);
				subPay = Double.parseDouble(temp)-earn;
			}
			
			sql = "UPDATE �˻���"+" set sums="+subPay+" where name='"+accountName+"'";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}

package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public ArrayList<String> getCode(String doName, String startTime,
			String endTime) throws RemoteException{
		// TODO �Զ����ɵķ������
		//�˴�������տ�����
		ArrayList<String> arrayList=new ArrayList<String>();
		if (startTime.equals(null)) {
			switch (doName) {
			case "�տ":
				sql="select code,doName from �տ where InDepotDate < '"+endTime+"'";
				break;
			case "���":
				sql="select code,doName from ��� where InDepotDate < '"+endTime+"'";
				break;
			}		
		}
		else {
			switch (doName) {
			case "�տ":
				sql="select code,doName from �տ where InDepotDate between '"+startTime+"' and '"+endTime+"'";
				break;
			case "���":
				sql="select code,doName from ��� where InDepotDate between '"+startTime+"' and '"+endTime+"'";
				break;
			}		
		}		
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(1)+","+resultSet.getString(2));
			}
			connection.close();
			return arrayList;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<String> getStoCode(String account, String doName,
			String startTime, String endTime) {
		// TODO Auto-generated method stub
		//�˴��������ⵥ
		ArrayList<String> arrayList=new ArrayList<String>();
		if (startTime.equals(null)) {
			sql="select code,doName from ��ⵥ where InDepotDate < '"+endTime+"' and account='"+account+"'";
		}
		else {
			sql="select code,doName from ��ⵥ where InDepotDate between '"+startTime+"' and '"+endTime+"' and account='"+account+"'";
		}		
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				arrayList.add(resultSet.getString(1)+","+resultSet.getString(2));
			}
			connection.close();
			return arrayList;
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

package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
			String endTime) {
		// TODO �Զ����ɵķ������
		//�˴�������տ�����
		return null;
	}

	@Override
	public ArrayList<String> getStoCode(String account, String doName,
			String startTime, String endTime) {
		// TODO Auto-generated method stub
		//�˴��������ⵥ
//		sql="select code,date from ��ⵥ";
//		Class.forName(DRIVER);
//		Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
//		PreparedStatement preparedStatement=connection.prepareStatement(sql);
//		ResultSet resultSet=preparedStatement.executeQuery();
		return null;
	}

}

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
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public DocumentPO getBufferedInfo(String code, String doName) {
		// TODO �Զ����ɵķ������
		sql="select * from b"+doName+" where code="+code;
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			switch (doName) {
			case "���ⵥ":
				break;
			case "���":
				break;
			case "�ļ���":
				break;
			case "�ɼ���":
				break;
			case "��ⵥ":
				break;
			case "�ռ���":
				break;
			case "�տ":
				break;
			case "Ӫҵ�����յ�":
				break;
			case "Ӫҵ��װ����":
				break;
			case "��ת���Ľ��յ�":
				break;
			case "��ת����ת�˵�":
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

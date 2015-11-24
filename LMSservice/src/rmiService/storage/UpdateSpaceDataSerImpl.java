package rmiService.storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dataservice.storagedataservice.UpdateSpaceDataSer;

public class UpdateSpaceDataSerImpl extends UnicastRemoteObject implements UpdateSpaceDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 3234821361500843438L;

	public UpdateSpaceDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void updateDrive(int shipping, int trains, int motor,String city)  throws RemoteException{
		// TODO �Զ����ɵķ������
		
		String sql = "UPDATE"+city+"��ת���Ĳֿ�"+"set AreaNum=5"+"where AreaNum=4 and SositionNum<="+shipping;
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			sql = "UPDATE"+city+"��ת���Ĳֿ�"+"set AreaNum=6"+"where AreaNum=4 and SositionNum>"+shipping+"and SositionNum<="+(shipping+trains);
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			sql = "UPDATE"+city+"��ת���Ĳֿ�"+"set AreaNum=7"+"where AreaNum=4 and SositionNum>"+(shipping+trains)+"and SositionNum<="+(shipping+trains+motor);
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			preparedStatement.close();
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

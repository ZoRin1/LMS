package rmiService.storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dataservice.storagedataservice.UsedSpaceDataSer;

public class UsedSpaceDataSerImpl extends UnicastRemoteObject implements UsedSpaceDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 3977217484673723280L;

	public UsedSpaceDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public int[] getUsedSpace(String city)  throws RemoteException{
		// TODO �Զ����ɵķ������
		int space[] = new int[3];
		sql="SELECT AreaNum,RowNum,ShelvesNum,SositionNum from"+city+"��ת���Ĳֿ�"+"where isFull=0 and AreaNum=1";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.last();
			space[0] = resultSet.getRow();
			sql="SELECT AreaNum,RowNum,ShelvesNum,SositionNum from"+city+"��ת���Ĳֿ�"+"where isFull=0 and AreaNum=2";
			preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			resultSet.last();
			space[1] = resultSet.getRow();
			sql="SELECT AreaNum,RowNum,ShelvesNum,SositionNum from"+city+"��ת���Ĳֿ�"+"where isFull=0 and AreaNum=3";
			preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			resultSet.last();
			space[2] = resultSet.getRow();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return space;
	}

	@Override
	public int[] getAllSpace(String city)  throws RemoteException{
		// TODO �Զ����ɵķ������
		int space[] = new int[3];
		sql="SELECT AreaNum,RowNum,ShelvesNum,SositionNum from"+city+"��ת���Ĳֿ�"+" where AreaNum=1";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.last();
			space[0] = resultSet.getRow();
			sql="SELECT AreaNum,RowNum,ShelvesNum,SositionNum from"+city+"��ת���Ĳֿ�"+" where AreaNum=2";
			preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			resultSet.last();
			space[1] = resultSet.getRow();
			sql="SELECT AreaNum,RowNum,ShelvesNum,SositionNum from"+city+"��ת���Ĳֿ�"+" where AreaNum=3";
			preparedStatement=connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			resultSet.last();
			space[2] = resultSet.getRow();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return space;
	}

}

package rmiService.organization;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dataservice.organizationdataservice.FinanceOrgDataSer;

public class FinanceOrgDataSerImpl extends UnicastRemoteObject implements FinanceOrgDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -2675461398567508092L;

	public FinanceOrgDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public String[] find() throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="select financer from ������Ϣ";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			return resultSet.getString(1).split(",");
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
	public boolean insert(long ID) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="select financer,codeNumber,city from ������Ϣ";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			sql="update ������Ϣ set financer = '"+resultSet.getString(1)+Long.toString(ID)+",'";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			sql="update �ʺű� set state ='5-"+resultSet.getString(3)+"-����-"+resultSet.getString(2)+"' where ID='"+ID+"'";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			connection.close();
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(long ID) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="select financer from ������Ϣ";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			String financerString[]=resultSet.getString(1).split(",");
			ArrayList<String>financerList=new ArrayList<String>();
			for (int i = 0; i < financerString.length; i++) {
				if (!financerString[i].equals(Long.toString(ID))) {
					financerList.add(financerString[i]);
				}
			}
			String financer="";
			for (int i = 0; i < financerList.size(); i++) {
				financer=financer+financerList.get(i)+",";
			}
			sql="update ������Ϣ set financer= '"+financer+"'";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			sql="update �ʺű� set state ='0' where ID='"+ID+"'";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			connection.close();
			return true;
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

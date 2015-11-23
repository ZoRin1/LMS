package rmiService.account;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;

import po.accountPO.AccountInfoPO;
import dataservice.accountdataservice.AccountDataSer;

public class AccountDataSerImpl extends UnicastRemoteObject implements AccountDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -5539066964489916937L;

	public AccountDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}
	@Override
	public String campare(long ID, String password) throws RemoteException {
		// TODO �Զ����ɵķ������
		sql="SELECT state  from �ʺű� where ID='"+ID+"' and password='"+password+"'";//ȷ���ʺŵ���Ϣ
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			if (resultSet.next()) {
				String string=resultSet.getString(4);
				connection.close();
				return string;
			}
			else {
				connection.close();
				return null;
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

	@Override
	public boolean insert(long ID, AccountInfoPO po) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="insert into �ʺű�(ID,password,name,state,phone,sID,date) values ('"+po.getID()+"','"+po.getPassword()+"','"+po.getName()+"','"+po.getState()+"','"+po.getPhone()+"','"+po.getsID()+"','"+po.getDate()+"')";//ȷ���ʺŵ���Ϣ		
			try {
				Class.forName(DRIVER);
				Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedStatement=connection.prepareStatement(sql);	
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
	public boolean update(long ID, AccountInfoPO po) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="update �ʺű� set password='"+po.getPassword()+"',name='"+po.getName()+"',state='"+po.getState()+"',phone='"+po.getPhone()+"',sID='"+po.getsID()+"',date='"+po.getDate()+"' where ID='"+ID+"'";//ȷ���ʺŵ���Ϣ

		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
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
		sql="delete from �ʺű� where ID='"+ID+"'";//ȷ���ʺŵ���Ϣ
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
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
	public AccountInfoPO find(long ID) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="SELECT * from �ʺű� where ID='"+ID+"'";//ȷ���ʺŵ���Ϣ
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			if (resultSet.next()) {
				AccountInfoPO accountInfoPO=new AccountInfoPO(resultSet.getString(3), Long.parseLong(resultSet.getString(1)), resultSet.getString(2),resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7));
				connection.close();
				return  accountInfoPO;
			}
			else {
				connection.close();
				return null;
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

	@Override
	public String[] find(String name) throws RemoteException{
		// TODO �Զ����ɵķ������
		//����ʵ��
		return null;
	}

	@Override
	public String[] find() throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="SELECT ID,name,state from �ʺű� ";//ȷ���ʺŵ���Ϣ
		ArrayList<String> arrayList=new ArrayList<String>();
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				String string=resultSet.getString(3);
				String s[]=new String[5];
				s=string.split("-");
				if (s[0].equals("0")) {
					String mString=resultSet.getString(1)+"-"+resultSet.getString(2);
					arrayList.add(mString);
				}
			}
			if (arrayList.size()!=0) {
				String[] x=new String[arrayList.size()];
				for (int i = 0; i < x.length; i++) {
					x[i]=arrayList.get(i);
				}
				connection.close();
				return x;
			}
			else {
				connection.close();
				return null;
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

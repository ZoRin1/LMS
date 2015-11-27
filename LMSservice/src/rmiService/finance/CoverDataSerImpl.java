package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import po.financePO.AccountPO;
import dataservice.financedataservice.CoverDataSer;

public class CoverDataSerImpl extends UnicastRemoteObject implements CoverDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 8859049058295725046L;

	public CoverDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void coverAccount(ArrayList<AccountPO> po)  throws RemoteException {
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement;
			String  sql="delete from �˻���";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();		
			// TODO �Զ����ɵķ������
			//ÿ��ֻ����һ��������Ա���� �˻�����  ����ж������Ժ��Ż�
			for(int i = 0 ; i < po.size();i++){
				AccountPO p = po.get(i);
				String name = p.getName();
				double sums = p.getSums();
					sql = "INSERT into �˻���(name,sums) values('"+name+"','"+sums+"')";	
					preparedStatement=connection.prepareStatement(sql);
					preparedStatement.executeUpdate();				
			}
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println("�Ѿ����������");
		ArrayList<AccountPO> pp = po;
		for(AccountPO account:pp){
			System.out.print(account.getName()+"  "+account.getSums());
			System.out.println();
		}
	}

}

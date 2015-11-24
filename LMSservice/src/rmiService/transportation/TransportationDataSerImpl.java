package rmiService.transportation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import po.transpotationPO.RoutePO;
import dataservice.transportationdataservice.TransportationDataSer;

public class TransportationDataSerImpl extends UnicastRemoteObject implements TransportationDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 8389026287336221175L;

	public TransportationDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public boolean updateDistance(RoutePO route) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="update ��· set distance='"+route.getDistance()+"' where line ='"+route.getLine()+"'";
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
	public boolean updateCost(int type, double cost)throws RemoteException {
		// TODO �Զ����ɵķ������
		sql="update �ɱ����� set cost='"+cost+"' where type ='"+type+"'";
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
	public double findCost(int type) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="select cost from �ɱ����� where type ='"+type+"'";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			double cost=resultSet.getDouble(1);
			connection.close();
			return cost;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public boolean insertRoute(RoutePO route) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="insert into ��· (line,distance) values('"+route.getLine()+"','"+route.getDistance()+"')";
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
	public double findDistance(String line) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="select distance from ��· where line ='"+line+"'";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			double distance=resultSet.getDouble(1);
			connection.close();
			return distance;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public String[] findCityList(String city) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="select city from ���� where city <>'"+city+"'";
		ArrayList<String>cityList=new ArrayList<String>();
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while (resultSet.next()) {
				cityList.add(resultSet.getString(1));
			}
			connection.close();
			String [] citys=new String[cityList.size()];
			for (int i = 0; i < citys.length; i++) {
				citys[i]=cityList.get(i);
			}
			return citys;
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
	public boolean insertCity(String city) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="insert into ���� (city) values('"+city+"')";
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
	public boolean removeCity(String city) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="delete from ���� where city='"+city+"'";
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
	/*
	 * ��ù��ʲ���
	 * @param employee Ա������
	 * 1������Ա
	 * 2����Ӫҵ��ҵ��Ա
	 * 3������ת����ҵ��Ա
	 * 4������ת���Ĳֿ����Ա
	 * 5���������Ա
	 * 6�����ܾ���
	 * 7����ϵͳ����Ա
	 
	 *@return double[] ��ӦԱ�����������ʲ�����ֵ������  �ֱ��� ����  �ƴ�  ���
	 *
	 */
	public double[] getSalary(int employee) throws RemoteException{
		return null;
		
	}
	
	/*
	 * �޸Ĺ��ʲ���
	 * @param employee Ա������
	 * 1������Ա
	 * 2����Ӫҵ��ҵ��Ա
	 * 3������ת����ҵ��Ա
	 * 4������ת���Ĳֿ����Ա
	 * 5���������Ա
	 * 6�����ܾ���
	 * 7����ϵͳ����Ա
	 * @param salary Ա�����������ʲ�����ֵ������  �ֱ��� ����  �ƴ�  ���
	 * @return boolean �޸Ĳ����Ƿ�ɹ�
	 * 
	 */
	
	public boolean changeSalary(int employee,double [] salary) throws RemoteException{
		return false;
		
	}

}

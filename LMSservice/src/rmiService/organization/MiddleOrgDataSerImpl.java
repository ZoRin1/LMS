package rmiService.organization;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import po.orgPO.MiddleOrgPO;
import dataservice.organizationdataservice.MiddleOrgDataSer;

public class MiddleOrgDataSerImpl extends UnicastRemoteObject implements MiddleOrgDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -7743528877522797224L;

	public MiddleOrgDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public String[] getBussinessmanList(String ID) throws RemoteException{
		// TODO �Զ����ɵķ������
		ArrayList<String> assisantList=new ArrayList<String>();
		sql="select assisant from ��ת������Ϣ where codeNumber ='"+ID+"'";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			String assisantString[]=resultSet.getString(1).split(",");
			for (int i = 0; i < assisantString.length; i++) {
				sql="select name from �ʺű� where ID ='"+assisantString[i]+"'";
				preparedStatement=connection.prepareStatement(sql);
				resultSet=preparedStatement.executeQuery();
				resultSet.next();
				assisantList.add(assisantString[i]+"-"+resultSet.getString(1));
			}
			String assisantarray[]=new String[assisantList.size()];
			for (int i = 0; i < assisantarray.length; i++) {
				assisantarray[i]=assisantList.get(i);
			}
			connection.close();
			return assisantarray;
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
	public boolean addBussinessman(String ID, long bID) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="select city,assisant from ��ת������Ϣ where  codeNumber ='"+ID+"'";
			try {
				Class.forName(DRIVER);
				Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				ResultSet resultSet=preparedStatement.executeQuery();
				resultSet.next();
				sql="update ��ת������Ϣ set assisant='"+resultSet.getString(2)+Long.toString(bID)+",' where codeNumber ='"+ID+"'";
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.executeUpdate();
				sql="update �ʺű� set state = '3-"+resultSet.getString(1)+"-��ת����-"+ID+"' where ID ='"+bID+"'";
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
	public boolean removeBussinessman(String ID, long bID) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="select assisant from ��ת������Ϣ where codeNumber ='"+ID+"'";
			try {
				Class.forName(DRIVER);
				Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				ResultSet resultSet=preparedStatement.executeQuery();
				resultSet.next();
				String assisantString[]=resultSet.getString(1).split(",");
				ArrayList<String>assisantList=new ArrayList<String>();
				for (int i = 0; i < assisantString.length; i++) {
					if (!assisantString[i].equals(Long.toString(bID))) {
						assisantList.add(assisantString[i]);
					}
				}
				String assisant="";
				for (int i = 0; i < assisantList.size(); i++) {
					assisant=assisant+assisantList.get(i)+",";
				}
				sql="update ��ת������Ϣ set assisant='"+assisant+",' where codeNumber ='"+ID+"'";
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.executeUpdate();
				sql="update �ʺű� set state ='0' where ID='"+bID+"'";
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
	public String[] getStorgerList(String ID) throws RemoteException{
		// TODO �Զ����ɵķ������
		ArrayList<String> storgerList=new ArrayList<String>();
		sql="select storger from ��ת������Ϣ where codeNumber ='"+ID+"'";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			String storgerString[]=resultSet.getString(1).split(",");
			for (int i = 0; i < storgerString.length; i++) {
				sql="select name from �ʺű� where ID ='"+storgerString[i]+"'";
				preparedStatement=connection.prepareStatement(sql);
				resultSet=preparedStatement.executeQuery();
				resultSet.next();
				storgerList.add(storgerString[i]+"-"+resultSet.getString(1));
			}
			String storgerarray[]=new String[storgerList.size()];
			for (int i = 0; i < storgerarray.length; i++) {
				storgerarray[i]=storgerList.get(i);
			}
			connection.close();
			return storgerarray;
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
	public boolean addStorger(String ID, long bID) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="select city,storger from ��ת������Ϣ where  codeNumber ='"+ID+"'";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			sql="update ��ת������Ϣ set storger='"+resultSet.getString(2)+Long.toString(bID)+",' where codeNumber ='"+ID+"'";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			sql="update �ʺű� set state = '4-"+resultSet.getString(1)+"-��ת����-"+ID+"' where ID ='"+bID+"'";
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
	public boolean removeStorger(String ID, long bID) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="select storger from ��ת������Ϣ where codeNumber ='"+ID+"'";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			String storgerString[]=resultSet.getString(1).split(",");
			ArrayList<String>storgerList=new ArrayList<String>();
			for (int i = 0; i < storgerString.length; i++) {
				if (!storgerString[i].equals(Long.toString(bID))) {
					storgerList.add(storgerString[i]);
				}
			}
			String storger="";
			for (int i = 0; i < storgerList.size(); i++) {
				storger=storger+storgerList.get(i)+",";
			}
			sql="update ��ת������Ϣ set storger='"+storger+",' where codeNumber ='"+ID+"'";
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			sql="update �ʺű� set state ='0' where ID='"+bID+"'";
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
	public String[] getBussinessHallList(String ID) throws RemoteException{
		// TODO �Զ����ɵķ������
		ArrayList<String> bussinessHallList=new ArrayList<String>();
		sql="select bussinessHall from ��ת������Ϣ where codeNumber ='"+ID+"'";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			String bussinessHallString[]=resultSet.getString(1).split(",");
			for (int i = 0; i < bussinessHallString.length; i++) {
				sql="select city from Ӫҵ����Ϣ where codeNumber ='"+bussinessHallString[i]+"'";
				preparedStatement=connection.prepareStatement(sql);
				resultSet=preparedStatement.executeQuery();
				resultSet.next();
				bussinessHallList.add(resultSet.getString(1)+"-"+bussinessHallString[i]);
			}
			String bussinessHallarray[]=new String[bussinessHallList.size()];
			for (int i = 0; i < bussinessHallarray.length; i++) {
				bussinessHallarray[i]=bussinessHallList.get(i);
			}
			connection.close();
			return bussinessHallarray;
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
	public String GetInfo(String ID) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="select city from ��ת������Ϣ where codeNumber='"+ID+"'";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			String cityString= resultSet.getString(1);
			connection.close();
			return cityString;
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
	public boolean changeCity(String ID, String city) throws RemoteException{
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean addMiddleOrg(String ID, MiddleOrgPO po) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="insert into ��ת������Ϣ (city,codeNumber) values ('"+po.getCity()+"','"+po.getCodeNumber()+"')";
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
	public boolean removeMiddleOrg(String ID) throws RemoteException{
		// TODO �Զ����ɵķ������
		try{
		sql="select bussinessHall,assisant,storger from ��ת������Ϣ where codeNumber='"+ID+"'";
		Class.forName(DRIVER);
		Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		ResultSet resultSet=preparedStatement.executeQuery();
		resultSet.next();
		String bussinessHallList[]=resultSet.getString(1).split(",");
		String assisantList[]=resultSet.getString(2).split(",");
		String storgerList[]=resultSet.getString(3).split(",");
		BussinessOrgDataSerImpl bussinessOrgDataSerImpl=new BussinessOrgDataSerImpl();
		for (int i = 0; i < bussinessHallList.length; i++) {
			bussinessOrgDataSerImpl.removeBussinessHall(ID+"-"+bussinessHallList[i], bussinessHallList[i]);
		}
		for (int i = 0; i < assisantList.length; i++) {
			removeBussinessman(ID, Long.parseLong(assisantList[i]));
		}
		for (int i = 0; i < storgerList.length; i++) {
			removeStorger(ID, Long.parseLong(storgerList[i]));
		}
		sql="delete from ��ת������Ϣ where codeNumber ='"+ID+"'";
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

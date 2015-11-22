package rmiService.storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import po.storagePO.DepotPO;
import dataservice.storagedataservice.GetDepotDataSer;

public class GetDepotDataSerImpl extends UnicastRemoteObject implements GetDepotDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -9159493132460553460L;

	public GetDepotDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public DepotPO getDepot(String city)  throws RemoteException{
		// TODO 自动生成的方法存根
		DepotPO po=null;
		sql="SELECT AreaNum,RowNum,ShelvesNum,SositionNum from"+city+"中转中心仓库"+"where isFull=0";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				po = new DepotPO(resultSet.getInt(1),resultSet.getInt(2),resultSet.getInt(3),resultSet.getInt(4));	
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return po;
	}
}

package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import po.financePO.AccountPO;
import po.financePO.ProfitPO;
import dataservice.financedataservice.ProfitListDataSer;

public class ProfitListDataSerImpl extends UnicastRemoteObject implements ProfitListDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 2210372149181793909L;

	public ProfitListDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public ArrayList<ProfitPO> ProList(String date)  throws RemoteException{
		// TODO �Զ����ɵķ������
		
		sql="SELECT * from �����¼��";
		ArrayList<ProfitPO> proPO = new ArrayList<ProfitPO>();
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				ProfitPO pro = new ProfitPO(resultSet.getDouble(1), resultSet.getDouble(2), resultSet.getString(3));
				proPO.add(pro);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return proPO;
	}

}

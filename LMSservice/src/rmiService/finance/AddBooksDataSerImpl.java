package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import po.financePO.BooksPO;
import dataservice.financedataservice.AddBooksDataSer;

public class AddBooksDataSerImpl extends UnicastRemoteObject implements AddBooksDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -5937811362981589837L;

	public AddBooksDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void addBooks(BooksPO po) throws RemoteException {
		// TODO �Զ����ɵķ������
        String  bussinessHallCode; // ����
        String  middleCode;
        String  financeCode;
        String  IDCode; //��Ա
        String  VehicleCode; // ����
        String  AccountName;//�˻�
        String  date;//����
        bussinessHallCode = po.getBussinessHallCode();
        middleCode = po.getMiddleCode();
        financeCode = po.getFinanceCode();
        VehicleCode = po.getVehicleCode();
        IDCode = po.getIDCode();
        AccountName = po.getAccountName();
        date = po.getDate();
	    sql = "INSERT into �˱�(bussinessHallCode,middleCode,financeCode,IDCode,VehicleCode,AccountName) values("+bussinessHallCode+","+middleCode+","+financeCode+","+IDCode+","+VehicleCode+","+AccountName+","+date+")";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
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

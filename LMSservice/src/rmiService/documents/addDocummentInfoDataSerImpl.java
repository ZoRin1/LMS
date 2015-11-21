package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import po.documentsPO.DocumentPO;
import po.documentsPO.OutbillsPO;
import po.documentsPO.PaymentPO;
import dataservice.documentsdataservice.addDocummentInfoDataSer;

public class addDocummentInfoDataSerImpl extends UnicastRemoteObject implements addDocummentInfoDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 4615262875279176437L;

	public addDocummentInfoDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public boolean addDocumentInfo(DocumentPO po) {
		// TODO �Զ����ɵķ������
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			
			switch (po.getDoName()) {
			case "���ⵥ":
				OutbillsPO outbillsPO=(OutbillsPO)po;
				sql="insert into b���ⵥ (code,doName,packCode,date,account,arrival,Mode,transCode,examined) values ("+outbillsPO.getCode()+","+outbillsPO.getDoName()+","+outbillsPO.getPackCode()+","+outbillsPO.getDate()+","+outbillsPO.getAccount()+","+outbillsPO.getArrival()+","+outbillsPO.getMode()+","+outbillsPO.getTransCode()+",0)";
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.executeUpdate();
				preparedStatement.close();
				connection.close();
				return true;
			case "���":
				PaymentPO paymentPO=(PaymentPO)po;
				
			case "�ļ���":
			case "�ɼ���":
				break;
			case "��ⵥ":
				break;
			case "�ռ���":
				break;
			case "�տ":
				break;
			case "Ӫҵ�����յ�":
				break;
			case "Ӫҵ��װ����":
				break;
			case "��ת���Ľ��յ�":
				break;
			case "��ת����ת�˵�":
				break;
			}
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

package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import po.documentsPO.DocumentPO;
import po.documentsPO.OrderPO;
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
			PreparedStatement preparedStatement;
			switch (po.getDoName()) {
			case "���ⵥ":
				OutbillsPO outbillsPO=(OutbillsPO)po;
				sql="insert into b���ⵥ (code,doName,packCode,date,account,arrival,Mode,transCode,examined) values ("+outbillsPO.getCode()+","+outbillsPO.getDoName()+","+outbillsPO.getPackCode()+","+outbillsPO.getDate()+","+outbillsPO.getAccount()+","+outbillsPO.getArrival()+","+outbillsPO.getMode()+","+outbillsPO.getTransCode()+",0)";
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.executeUpdate();
				preparedStatement.close();
				connection.close();
				return true;
			case "���":
				PaymentPO paymentPO=(PaymentPO)po;
				sql="insert into b���(code,doName,date,account,fund,name,accoun2,type,remark,examined) values ("+paymentPO.getCode()+","+paymentPO.getDoName()+","+paymentPO.getDate()+","+paymentPO.getAccount()+","+paymentPO.getFund()+","+paymentPO.getName2()+","+paymentPO.getAccount2()+","+paymentPO.getType()+","+paymentPO.getRemark()+",0)";
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.executeUpdate();
				preparedStatement.close();
				connection.close();
				return true;
			case "�ļ���":
				OrderPO orderPO=(OrderPO)po;
				String codeString=orderPO.getCode();
				String doNameString=orderPO.getDoName();
				String accountString=orderPO.getAccount();
				String dateString=orderPO.getDate();
				String senderNameString=orderPO.getSenderName();
				String senderAddressString=orderPO.getSenderAddress();
				String senderOrgString=orderPO.getSenderOrg();
				String sPhoneNumberString=orderPO.getSPhoneNumber();
				String sMobileNumberString=orderPO.getSMobileNumber();
				String receiverNameString=orderPO.getReceiverName();
				String receiverAddressString=orderPO.getReceiverAddress();
				String receiverOrgString=orderPO.getReceiverOrg();
				String rPhoneNumberString=orderPO.getRPhoneNumber();
				String rMobileNumberString=orderPO.getRMobileNumber();
				int number=orderPO.getNumber();
				double weight=orderPO.getWeight();
				double shape=orderPO.getShape();
				
				sql="insert into b�ļ���(code,doName,account,date,SenderName,SenderAddress,SenderOrg,SPhoneNumber,SMobileNumber,ReceiverName,ReceiverAddress,ReceiverOrg,RPhoneNumber,RMobileNumber,number,weight,shape,cargoNamerList,sizeList,sumCost,state,examined)";
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

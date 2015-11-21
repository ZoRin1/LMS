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
		// TODO 自动生成的构造函数存根
	}

	@Override
	public boolean addDocumentInfo(DocumentPO po) {
		// TODO 自动生成的方法存根
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement;
			switch (po.getDoName()) {
			case "出库单":
				OutbillsPO outbillsPO=(OutbillsPO)po;
				sql="insert into b出库单 (code,doName,packCode,date,account,arrival,Mode,transCode,examined) values ("+outbillsPO.getCode()+","+outbillsPO.getDoName()+","+outbillsPO.getPackCode()+","+outbillsPO.getDate()+","+outbillsPO.getAccount()+","+outbillsPO.getArrival()+","+outbillsPO.getMode()+","+outbillsPO.getTransCode()+",0)";
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.executeUpdate();
				preparedStatement.close();
				connection.close();
				return true;
			case "付款单":
				PaymentPO paymentPO=(PaymentPO)po;
				sql="insert into b付款单(code,doName,date,account,fund,name,accoun2,type,remark,examined) values ("+paymentPO.getCode()+","+paymentPO.getDoName()+","+paymentPO.getDate()+","+paymentPO.getAccount()+","+paymentPO.getFund()+","+paymentPO.getName2()+","+paymentPO.getAccount2()+","+paymentPO.getType()+","+paymentPO.getRemark()+",0)";
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.executeUpdate();
				preparedStatement.close();
				connection.close();
				return true;
			case "寄件单":
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
				
				sql="insert into b寄件单(code,doName,account,date,SenderName,SenderAddress,SenderOrg,SPhoneNumber,SMobileNumber,ReceiverName,ReceiverAddress,ReceiverOrg,RPhoneNumber,RMobileNumber,number,weight,shape,cargoNamerList,sizeList,sumCost,state,examined)";
			case "派件单":
				break;
			case "入库单":
				break;
			case "收件单":
				break;
			case "收款单":
				break;
			case "营业厅接收单":
				break;
			case "营业厅装车单":
				break;
			case "中转中心接收单":
				break;
			case "中转中心转运单":
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

package rmiService.finance;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import po.documentsPO.ReceiptPO;
import dataservice.financedataservice.GetReceivablesBillsDataSer;

public class GetReceivablesBillsDataSerImpl extends UnicastRemoteObject implements GetReceivablesBillsDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -3837846709835354119L;
	
	ArrayList<ReceiptPO> receiptList = new ArrayList();
	ArrayList<String> code = new ArrayList();
	String c1 = "02156401",c2="02156402",c3="02156403",c4="02156404";

	public GetReceivablesBillsDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public ArrayList<ReceiptPO> Receivables(String selling, String date)  throws RemoteException{
		// TODO �Զ����ɵķ������
		
		return null;
	}

	@Override
	public ArrayList<ReceiptPO> getReceivables(String selling, String date)  throws RemoteException{
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public ArrayList<ReceiptPO> getAllReceivables(String selling, String start,
			String end)  throws RemoteException{
		// TODO �Զ����ɵķ������
		return null;
	}
	
}

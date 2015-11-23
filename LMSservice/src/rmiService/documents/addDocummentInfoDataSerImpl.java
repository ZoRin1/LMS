package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import po.documentsPO.DocumentPO;
import po.documentsPO.GetOrderPO;
import po.documentsPO.InBillsPO;
import po.documentsPO.LoadingPO;
import po.documentsPO.OrderPO;
import po.documentsPO.OutbillsPO;
import po.documentsPO.PaymentPO;
import po.documentsPO.ReceiptPO;
import po.documentsPO.YDispatchPO;
import po.documentsPO.YReceivePO;
import po.documentsPO.ZLoadingPO;
import po.documentsPO.ZReceivePO;
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
	public boolean addDocumentInfo(DocumentPO po)throws RemoteException {
		// TODO �Զ����ɵķ������
		switch (po.getDoName()) {
		case "���ⵥ":
			OutbillsPO outbillsPO=(OutbillsPO)po;
			sql="insert into b���ⵥ(code,doName,packCode,date,account,arrival,Mode,transCode,examined) values ("+outbillsPO.getCode()+","+outbillsPO.getDoName()+","+outbillsPO.getPackCode()+","+outbillsPO.getDate()+","+outbillsPO.getAccount()+","+outbillsPO.getArrival()+","+outbillsPO.getMode()+","+outbillsPO.getTransCode()+",0)";
			break;
		case "���":
			PaymentPO paymentPO=(PaymentPO)po;
			sql="insert into b���(code,doName,date,account,fund,name,account2,type,remark,examined) values ("+paymentPO.getCode()+","+paymentPO.getDoName()+","+paymentPO.getDate()+","+paymentPO.getAccount()+","+paymentPO.getFund()+","+paymentPO.getName2()+","+paymentPO.getAccount2()+","+paymentPO.getType()+","+paymentPO.getRemark()+",0)";
			break;
		case "�ļ���":
			OrderPO orderPO=(OrderPO)po;
			double sizeList[]=orderPO.getSizeList();
			String string="";
			for (int i = 0; i < sizeList.length; i++) {
				string=string+Double.toString(sizeList[i])+",";
			}
			sql="insert into b�ļ���(code,doName,account,date,SenderName,SenderAddress,SenderOrg,SPhoneNumber,SMobileNumber,ReceiverName,ReceiverAddress,ReceiverOrg,RPhoneNumber,RMobileNumber,number,weight,shape,cargoNameList,sizeList,sumCost,state,examined) values ("+orderPO.getCode()+","+orderPO.getDoName()+","+orderPO.getAccount()+","+orderPO.getDate()+","+orderPO.getSenderName()+","+orderPO.getSenderAddress()+","+orderPO.getSenderOrg()+","+orderPO.getSPhoneNumber()+","+orderPO.getSMobileNumber()+","+orderPO.getReceiverName()+","+orderPO.getReceiverAddress()+","+orderPO.getReceiverOrg()+","+orderPO.getRPhoneNumber()+","+orderPO.getRMobileNumber()+","+orderPO.getNumber()+","+orderPO.getWeight()+","+orderPO.getShape()+","+orderPO.getCargoNameList()+","+string+","+orderPO.getSumCost()+","+orderPO.getState()+",0)";
			break;
		case "�ɼ���":
			YDispatchPO yDispatchPO=(YDispatchPO)po;
			sql="insert into b�ɼ���(code,code2,doName,account,date,name,examined) values ("+yDispatchPO.getCode()+","+yDispatchPO.getCode2()+","+yDispatchPO.getDoName()+","+yDispatchPO.getAccount()+","+yDispatchPO.getDate()+","+yDispatchPO.getName2()+",0)";
			break;
		case "��ⵥ":
			InBillsPO inBillsPO=(InBillsPO)po;
			sql="insert into b��ⵥ(code,doName,InDepotNum,InDepotDate,account,Destination,AreaNum,RowNum,ShelvesNum,SositionNum,examined) values ("+inBillsPO.getCode()+","+inBillsPO.getDoName()+","+inBillsPO.getInDepotNum()+","+inBillsPO.getInDepotDate()+","+inBillsPO.getAccount()+","+inBillsPO.getDestination()+","+inBillsPO.getAreaNum()+","+inBillsPO.getRowNum()+","+inBillsPO.getShelvesNum()+","+inBillsPO.getSositionNum()+",0)";
			break;
		case "�ռ���":
			GetOrderPO getOrderPO=(GetOrderPO)po;
			sql="insert into b�ռ���(code,code2,doName,account,ReceiverName,date,examined) values ("+getOrderPO.getCode()+","+getOrderPO.getCode1()+","+getOrderPO.getDoName()+","+getOrderPO.getAccount()+","+getOrderPO.getReceiverName()+","+getOrderPO.getDate()+",0)";
			break;
		case "�տ":
			ReceiptPO receiptPO=(ReceiptPO)po;
			ArrayList<String>tcodeArrayList=receiptPO.getTCode();
			String tcode="";
			for (int i = 0; i < tcodeArrayList.size(); i++) {
				tcode=tcode+tcodeArrayList.get(i)+",";
			}
			sql="insert into b�տ(code,doName,date,account,OrgCode,name,fund,Tcode,examined) values ("+receiptPO.getCode()+","+receiptPO.getDoName()+","+receiptPO.getDate()+","+receiptPO.getAccount()+","+receiptPO.getOrgCode()+","+receiptPO.getName2()+","+receiptPO.getFund()+","+tcode+",0)";
			break;
		case "Ӫҵ�����յ�":
			YReceivePO yReceivePO=(YReceivePO)po;
			sql="insert into bӪҵ�����յ�(code,code2,doName,account,date,departure,arrival,state,examined) values ("+yReceivePO.getCode()+","+yReceivePO.getCode1()+","+yReceivePO.getDoName()+","+yReceivePO.getAccount()+","+yReceivePO.getDate()+","+yReceivePO.getDeparture()+","+yReceivePO.getArrival()+","+yReceivePO.getState()+",0)";
			break;
		case "Ӫҵ��װ����":
			LoadingPO loadingPO=(LoadingPO)po;
			ArrayList<String> codelist=loadingPO.getCodeList();
			String code="";
			for (int i = 0; i < codelist.size(); i++) {
				code=code+codelist.get(i)+",";
			}
			sql="insert into bӪҵ��װ����(code,doName,account,date,departure,arrival,supervisor,supercargo,codeList,charge,examined) values ("+loadingPO.getCode()+","+loadingPO.getDoName()+","+loadingPO.getAccount()+","+loadingPO.getDate()+","+loadingPO.getDeparture()+","+loadingPO.getArrival()+","+loadingPO.getSupervisor()+","+loadingPO.getSupercargo()+","+code+","+loadingPO.getCharge()+",0)";
			break;
		case "��ת���Ľ��յ�":
			ZReceivePO zReceivePO=(ZReceivePO)po;
			ArrayList<String> list=zReceivePO.getCodeList();
			String l="";
			for (int i = 0; i < list.size(); i++) {
				l=l+list.get(i)+",";
			}
			sql="insert into b��ת���Ľ��յ�(code,doName,date,account,zCode,codeList,departure,arrival,examined) values ("+zReceivePO.getCode()+","+zReceivePO.getDoName()+","+zReceivePO.getDate()+","+zReceivePO.getAccount()+","+zReceivePO.getzCode()+","+l+","+zReceivePO.getDeparture()+","+zReceivePO.getArrival()+",0)";
			break;
		case "��ת����ת�˵�":
			ZLoadingPO zLoadingPO=(ZLoadingPO)po;
			ArrayList<String>coList=zLoadingPO.getCodeList();
			String co="";
			for (int i = 0; i < coList.size(); i++) {
				co=co+coList.get(i)+",";
			}
			sql="insert into b��ת����ת�˵�(code,doName,date,account,transcode,departure,arrival,name,codeList,carriage,examined) values ("+zLoadingPO.getCode()+","+zLoadingPO.getDoName()+","+zLoadingPO.getDate()+","+zLoadingPO.getAccount()+","+zLoadingPO.getTranscode()+","+zLoadingPO.getDeparture()+","+zLoadingPO.getArrival()+","+zLoadingPO.getName2()+","+co+","+zLoadingPO.getCarriage()+",0)";
			break;
		}
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

}

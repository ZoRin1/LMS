package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

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
		// TODO 自动生成的构造函数存根
	}

	@Override
	public boolean addDocumentInfo(DocumentPO po) {
		// TODO 自动生成的方法存根
		switch (po.getDoName()) {
		case "出库单":
			OutbillsPO outbillsPO=(OutbillsPO)po;
			sql="insert into b出库单(code,doName,packCode,date,account,arrival,Mode,transCode,examined) values ("+outbillsPO.getCode()+","+outbillsPO.getDoName()+","+outbillsPO.getPackCode()+","+outbillsPO.getDate()+","+outbillsPO.getAccount()+","+outbillsPO.getArrival()+","+outbillsPO.getMode()+","+outbillsPO.getTransCode()+",0)";
			break;
		case "付款单":
			PaymentPO paymentPO=(PaymentPO)po;
			sql="insert into b付款单(code,doName,date,account,fund,name,account2,type,remark,examined) values ("+paymentPO.getCode()+","+paymentPO.getDoName()+","+paymentPO.getDate()+","+paymentPO.getAccount()+","+paymentPO.getFund()+","+paymentPO.getName2()+","+paymentPO.getAccount2()+","+paymentPO.getType()+","+paymentPO.getRemark()+",0)";
			break;
		case "寄件单":
			OrderPO orderPO=(OrderPO)po;
			double sizeList[]=orderPO.getSizeList();
			String string="";
			for (int i = 0; i < sizeList.length; i++) {
				string=string+Double.toString(sizeList[i]);
			}
			sql="insert into b寄件单(code,doName,account,date,SenderName,SenderAddress,SenderOrg,SPhoneNumber,SMobileNumber,ReceiverName,ReceiverAddress,ReceiverOrg,RPhoneNumber,RMobileNumber,number,weight,shape,cargoNameList,sizeList,sumCost,state,examined) values ("+orderPO.getCode()+","+orderPO.getDoName()+","+orderPO.getAccount()+","+orderPO.getDate()+","+orderPO.getSenderName()+","+orderPO.getSenderAddress()+","+orderPO.getSenderOrg()+","+orderPO.getSPhoneNumber()+","+orderPO.getSMobileNumber()+","+orderPO.getReceiverName()+","+orderPO.getReceiverAddress()+","+orderPO.getReceiverOrg()+","+orderPO.getRPhoneNumber()+","+orderPO.getRMobileNumber()+","+orderPO.getNumber()+","+orderPO.getWeight()+","+orderPO.getShape()+","+orderPO.getCargoNameList()+","+string+","+orderPO.getSumCost()+","+orderPO.getState()+",0)";
			break;
		case "派件单":
			YDispatchPO yDispatchPO=(YDispatchPO)po;
		case "入库单":
			InBillsPO inBillsPO=(InBillsPO)po;
		case "收件单":
			GetOrderPO getOrderPO=(GetOrderPO)po;
		case "收款单":
			ReceiptPO receiptPO=(ReceiptPO)po;
		case "营业厅接收单":
			YReceivePO yReceivePO=(YReceivePO)po;
		case "营业厅装车单":
			LoadingPO loadingPO=(LoadingPO)po;
		case "中转中心接收单":
			ZReceivePO zReceivePO=(ZReceivePO)po;
		case "中转中心转运单":
			ZLoadingPO zLoadingPO=(ZLoadingPO)po;
		}
		return false;
	}

}

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
		case "付款单":
			PaymentPO paymentPO=(PaymentPO)po;
		case "寄件单":
			OrderPO orderPO=(OrderPO)po;
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

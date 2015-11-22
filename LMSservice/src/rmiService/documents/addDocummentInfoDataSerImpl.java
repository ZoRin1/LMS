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
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public boolean addDocumentInfo(DocumentPO po) {
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
				string=string+Double.toString(sizeList[i]);
			}
			sql="insert into b�ļ���(code,doName,account,date,SenderName,SenderAddress,SenderOrg,SPhoneNumber,SMobileNumber,ReceiverName,ReceiverAddress,ReceiverOrg,RPhoneNumber,RMobileNumber,number,weight,shape,cargoNameList,sizeList,sumCost,state,examined) values ("+orderPO.getCode()+","+orderPO.getDoName()+","+orderPO.getAccount()+","+orderPO.getDate()+","+orderPO.getSenderName()+","+orderPO.getSenderAddress()+","+orderPO.getSenderOrg()+","+orderPO.getSPhoneNumber()+","+orderPO.getSMobileNumber()+","+orderPO.getReceiverName()+","+orderPO.getReceiverAddress()+","+orderPO.getReceiverOrg()+","+orderPO.getRPhoneNumber()+","+orderPO.getRMobileNumber()+","+orderPO.getNumber()+","+orderPO.getWeight()+","+orderPO.getShape()+","+orderPO.getCargoNameList()+","+string+","+orderPO.getSumCost()+","+orderPO.getState()+",0)";
			break;
		case "�ɼ���":
			YDispatchPO yDispatchPO=(YDispatchPO)po;
		case "��ⵥ":
			InBillsPO inBillsPO=(InBillsPO)po;
		case "�ռ���":
			GetOrderPO getOrderPO=(GetOrderPO)po;
		case "�տ":
			ReceiptPO receiptPO=(ReceiptPO)po;
		case "Ӫҵ�����յ�":
			YReceivePO yReceivePO=(YReceivePO)po;
		case "Ӫҵ��װ����":
			LoadingPO loadingPO=(LoadingPO)po;
		case "��ת���Ľ��յ�":
			ZReceivePO zReceivePO=(ZReceivePO)po;
		case "��ת����ת�˵�":
			ZLoadingPO zLoadingPO=(ZLoadingPO)po;
		}
		return false;
	}

}

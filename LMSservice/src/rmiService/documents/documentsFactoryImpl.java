package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.documentsdataservice.GetDocCodeDataSer;
import dataservice.documentsdataservice.NotApproved;
import dataservice.documentsdataservice.addDocummentInfoDataSer;
import dataservice.documentsdataservice.deleteDataSer;
import dataservice.documentsdataservice.documentsFactory;
import dataservice.documentsdataservice.getBufferedCodeDataSer;
import dataservice.documentsdataservice.getBufferedInfoDataSer;
import dataservice.documentsdataservice.getCodeDataSer;
import dataservice.documentsdataservice.getDocumentInfoDataSer;
import dataservice.documentsdataservice.getNotPassDocCode;
import dataservice.documentsdataservice.getWuliuInfoDataSer;

public class documentsFactoryImpl extends UnicastRemoteObject implements documentsFactory{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2425119006902233918L;

	public documentsFactoryImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public addDocummentInfoDataSer createaddDocummentInfoDataSer()
			throws RemoteException {
		// TODO �Զ����ɵķ������
		return new addDocummentInfoDataSerImpl();
	}

	@Override
	public deleteDataSer createDeleteDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return new deleteDataSerImpl();
	}

	@Override
	public getBufferedCodeDataSer createGetBudderedCodeDataSer()
			throws RemoteException {
		// TODO �Զ����ɵķ������
		return new getBufferedCodeDataSerImpl();
	}

	@Override
	public getBufferedInfoDataSer createGetBufferedInfoDataSer()
			throws RemoteException {
		// TODO �Զ����ɵķ������
		return new getBufferedInfoDataSerImpl();
	}

	@Override
	public getCodeDataSer createGetCodeDataSer() throws RemoteException {
		// TODO �Զ����ɵķ������
		return new getCodeDataSerImpl();
	}

	@Override
	public getDocumentInfoDataSer createGetDocumentInfoDataSer()
			throws RemoteException {
		// TODO �Զ����ɵķ������
		return new getDocumentInfoDataSerImpl();
	}

	@Override
	public getNotPassDocCode createGetNotPassDocCode() throws RemoteException {
		// TODO �Զ����ɵķ������
		return new getNotPassDocCodeImpl();
	}

	@Override
	public NotApproved createNotApproved() throws RemoteException {
		// TODO �Զ����ɵķ������
		return new NotApprovedImpl();
	}

	@Override
	public GetDocCodeDataSer createGetDocCodeDataSer() throws RemoteException {
		// TODO Auto-generated method stub
		return new GetDocCodeDataSerImpl();
	}

	@Override
	public getWuliuInfoDataSer createGetWuliuDataSerInfo()
			throws RemoteException {
		// TODO Auto-generated method stub
		return new getWuliuInfoDataSerImpl();
	}



}

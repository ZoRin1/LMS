package dataservice.documentsdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface documentsFactory extends Remote{
	
	public addDocummentInfoDataSer createaddDocummentInfoDataSer() throws RemoteException;
	
	public deleteDataSer createDeleteDataSer() throws RemoteException;
	
	public getBufferedCodeDataSer createGetBudderedCodeDataSer() throws RemoteException;
	
	public getBufferedInfoDataSer createGetBufferedInfoDataSer() throws RemoteException;
	
	public getCodeDataSer createGetCodeDataSer() throws RemoteException;
	
	public getDocumentInfoDataSer createGetDocumentInfoDataSer() throws RemoteException;
}

package dataservice.storagedataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.storagePO.DepotPO;

public interface InDepotDataSer extends Remote{
	
	
	public void inDepot(DepotPO depo) throws RemoteException;
	
	
}

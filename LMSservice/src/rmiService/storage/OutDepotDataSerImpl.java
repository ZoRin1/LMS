package rmiService.storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import po.storagePO.DepotPO;
import dataservice.storagedataservice.InDepotDataSer;
import dataservice.storagedataservice.OutDepotDataSer;

public class OutDepotDataSerImpl extends UnicastRemoteObject implements OutDepotDataSer{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7266703194896409949L;

	protected OutDepotDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void outDepot(DepotPO depo, String city) throws RemoteException {
		// TODO �Զ����ɵķ������
		
	}

}

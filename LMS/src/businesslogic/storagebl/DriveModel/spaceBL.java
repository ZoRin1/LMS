package businesslogic.storagebl.DriveModel;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import dataservice.storagedataservice.UsedSpaceDataSer;
import dataservice.storagedataservice.storageFactory;
import businesslogicservice.storageblservice.usedSpaceBlSer;

public class spaceBL implements usedSpaceBlSer{

	private storageFactory stoFactory;
	private UsedSpaceDataSer used;
	
	public spaceBL(){
		try {
			stoFactory = (storageFactory)Naming.lookup("rmi://127.0.0.1:6600/stoFactory");
			used = stoFactory.createUsedSpaceDataSer();
		} catch (MalformedURLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
	@Override
	public int[] usedSpaceInf(String city) {
		// TODO Auto-generated method stub
		int[] usedSpace = used.getUsedSpace(city);
		return usedSpace;
	}

	@Override
	public int[] allSpaceInf(String city) {
		// TODO Auto-generated method stub
		int[] allSpace = used.getAllSpace(city);
		return allSpace;
	}
	
	

}

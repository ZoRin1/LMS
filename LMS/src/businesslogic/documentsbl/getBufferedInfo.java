package businesslogic.documentsbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


import po.documentsPO.DocumentPO;
import dataservice.documentsdataservice.documentsFactory;
import dataservice.documentsdataservice.getBufferedInfoDataSer;
import businesslogicservice.documentsblservice.getBufferedInfoBlSer;

public class getBufferedInfo implements getBufferedInfoBlSer{

	@Override
	public DocumentPO getBufferedInfo(String code, String doName) {
		// TODO Auto-generated method stub
		DocumentPO po=new DocumentPO();
		try {
		documentsFactory documentsFactory=(documentsFactory)Naming.lookup("rmi://127.0.0.1:6600/docFactory");
		getBufferedInfoDataSer getBufferedInfoDataSer=documentsFactory.createGetBufferedInfoDataSer();
		po=getBufferedInfoDataSer.getBufferedInfo(code, doName);
		return po;
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (NotBoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	}
	

}

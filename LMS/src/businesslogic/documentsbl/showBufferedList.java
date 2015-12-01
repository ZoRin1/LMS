package businesslogic.documentsbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import dataservice.documentsdataservice.documentsFactory;
import dataservice.documentsdataservice.getBufferedCodeDataSer;
import businesslogicservice.documentsblservice.showBufferedListBlSer;

public class showBufferedList implements showBufferedListBlSer{

	@Override
	public ArrayList<String> showList() {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList();
		try {
		documentsFactory documentsFactory=(documentsFactory)Naming.lookup("rmi://114.212.42.143:6600/docFactory");
		getBufferedCodeDataSer getBufferedCodeDataSer=documentsFactory.createGetBudderedCodeDataSer();
		list=getBufferedCodeDataSer.getCode();
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
		return list;
	}

}

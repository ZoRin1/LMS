package businesslogic.documentsbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import dataservice.documentsdataservice.documentsFactory;
import dataservice.documentsdataservice.getWuliuInfoDataSer;
import businesslogicservice.documentsblservice.getWuliuInfoBlSer;

public class getWuliuInfo implements getWuliuInfoBlSer{
	//如果不存在条形码号对应订单，则返回null，然后于展示层提示输入不完整
	@Override
	public ArrayList<String> getWuliuInfo(String code) {
		// TODO Auto-generated method stub	
		try {
			documentsFactory documentsFactory=(documentsFactory)Naming.lookup("rmi://127.0.0.1:6600/docFactory");
			getWuliuInfoDataSer getWuliuInfoDataSer=documentsFactory.createGetWuliuInfoDataSer();
			ArrayList<String> list=getWuliuInfoDataSer.getWuliuInfo(code);
			return list;
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

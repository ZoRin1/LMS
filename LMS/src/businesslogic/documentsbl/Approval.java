package businesslogic.documentsbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import dataservice.documentsdataservice.GetDocCodeDataSer;
import dataservice.documentsdataservice.NotApproved;
import dataservice.documentsdataservice.deleteDataSer;
import dataservice.documentsdataservice.documentsFactory;
import businesslogicservice.documentsblservice.ApprovalBlSer;

public class Approval implements ApprovalBlSer{
	//used to keep the statue of document approved
	@Override
	public boolean approval(boolean approved,String code,String doName) {
		// TODO Auto-generated method stub
		boolean a=false;
//		try {
//			documentsFactory documentsFactory=(documentsFactory)Naming.lookup("rmi://114.212.42.143:6600/docFactory");
//			deleteDataSer deleteDataSer=documentsFactory.createDeleteDataSer();
//			NotApproved NotApproved=documentsFactory.createNotApproved();
//			if(approved==true){
//				a=deleteDataSer.delete(code, doName);
//			}
//			else{
//				a=NotApproved.NotApproved(code, doName);
//			}
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NotBoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return a;
	}
	
}

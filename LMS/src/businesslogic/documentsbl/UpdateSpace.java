package businesslogic.documentsbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import po.documentsPO.InBillsPO;
import dataservice.documentsdataservice.documentsFactory;
import dataservice.documentsdataservice.getDocumentInfoDataSer;
import vo.storageVO.DepotVO;
import businesslogic.storagebl.OutDepot.OutDepotBL;
import businesslogicservice.modelservice.storageInfo.UpdateSpaceSer;

public class UpdateSpace implements UpdateSpaceSer{
	//�˴����ͳ��ⵥ�й�
	private OutDepotBL out;
	private int qu;
	private int pai;
	private int jia;
	private int wei;
	private InBillsPO po;
	public UpdateSpace(String InDepotCode) {
		super();
		try {
			documentsFactory documentsFactory=(documentsFactory)Naming.lookup("rmi://114.212.42.143:6600/docFactory");
			getDocumentInfoDataSer getDocumentInfoDataSer=documentsFactory.createGetDocumentInfoDataSer();
			po=getDocumentInfoDataSer.getInDepotInfo("��ⵥ", InDepotCode);
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
		this.qu = po.getAreaNum();
		this.pai = po.getRowNum();
		this.jia = po.getShelvesNum();
		this.wei = po.getSositionNum();
	}

	@Override
	public void updateDrive() {
		// TODO Auto-generated method stub
		DepotVO vo = new DepotVO(qu, pai, jia, wei);
		out = new OutDepotBL();
		out.outDepot(vo);
	}
}

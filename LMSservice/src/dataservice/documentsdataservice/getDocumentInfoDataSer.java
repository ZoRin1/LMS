package dataservice.documentsdataservice;

import po.documentsPO.DocumentPO;

public interface getDocumentInfoDataSer {
	/**
	 * 系统返回一个完整PO对象
	 * 用于显示编码对应单据对象详细信息
	 * @author XiongKaiQi
	 *
	 */
	public DocumentPO getDocumentInfo(String code,String doName);//xiugai
	
	//documentsFactory docFactory = (documentsFactory)Naming.lookup("rmi://127.0.0.1:6600/docFactory");
	//getDocumentInfo get = docFactory.createGetDocumentInfo();
	//DocumentPO po = get.getDocumentInfo(String code,String doName);
}

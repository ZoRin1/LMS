package dataservice.documentsdataservice;

import po.documentsPO.DocumentPO;

public interface getDocumentInfoDataSer {
	/**
	 * ϵͳ����һ������PO����
	 * ������ʾ�����Ӧ���ݶ�����ϸ��Ϣ
	 * @author XiongKaiQi
	 *
	 */
	public DocumentPO getDocumentInfo(String code,String doName);//xiugai
	
	//documentsFactory docFactory = (documentsFactory)Naming.lookup("rmi://127.0.0.1:6600/docFactory");
	//getDocumentInfo get = docFactory.createGetDocumentInfo();
	//DocumentPO po = get.getDocumentInfo(String code,String doName);
}

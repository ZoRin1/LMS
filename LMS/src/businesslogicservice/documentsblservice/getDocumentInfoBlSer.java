package businesslogicservice.documentsblservice;

import po.documentsPO.DocumentPO;

public interface getDocumentInfoBlSer {
	/**
	 * ϵͳ����һ��������VO����
	 * ������ʾ���ݵ�������Ϣ
	 * @author XiongKaiQi
	 *
	 */
	public DocumentPO getDocumentInfo(String code,String doName);
}

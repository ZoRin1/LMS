package dataservice.documentsdataservice;

import po.documentsPO.DocumentPO;
import po.documentsPO.InBillsPO;

public interface getDocumentInfoDataSer {
	/**
	 * ϵͳ����һ������PO����
	 * ������ʾ�����Ӧ���ݶ�����ϸ��Ϣ
	 * @author XiongKaiQi
	 *
	 */
	public DocumentPO getDocumentInfo(String code,String doName);//xiugai
	/**
	 * ϵͳ����һ������PO����
	 * ������ʾ����ݱ�Ŷ�Ӧ��ⵥ������ϸ��Ϣ
	 * @author XiongKaiQi
	 *
	 */
	public InBillsPO getInDepotInfo(String doName,String InDepotNum);
}

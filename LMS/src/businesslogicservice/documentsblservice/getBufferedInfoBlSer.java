package businesslogicservice.documentsblservice;

import po.documentsPO.DocumentPO;


public interface getBufferedInfoBlSer {
	/**vo����Ķ�����
	 * ϵͳ����һ��������PO����
	 * ������ʾ���ݵ�������Ϣ
	 * @author XiongKaiQi
	 *
	 */

	public DocumentPO getBufferedInfo(String code, String doName);
}

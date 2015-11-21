package businesslogicservice.documentsblservice;

import vo.documentsVO.DocumentVO;

public interface createDocumentBlSer {
	/**
	 * 系统返回一个初始化好的VO对象
	 * 用于添加一个单据对象
	 * @author XiongKaiQi
	 *
	 */
	public DocumentVO createDocument(String doName);
}

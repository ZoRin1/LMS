package businesslogicservice.documentsblservice;

import vo.documentsVO.DocumentVO;

public interface createBlockBlSer {
	/**
	 * 展示层传入单据信息
	 * 系统返回一boolean
	 * 显示是否保存成功
	 * @author XiongKaiQi
	 *
	 */
	public boolean createBlock(DocumentVO vo);
}

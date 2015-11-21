package businesslogicservice.documentsblservice;

public interface ApprovalBlSer {
	/**
	 * 展示层传递单据通过情况
	 * 系统返回审批通过情况保存是否成功
	 * @author XiongKaiQi
	 *
	 */
	public boolean approval(boolean approved);
}

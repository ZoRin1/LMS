package businesslogicservice.documentsblservice;

public interface CheckDocumentBlSer {
	/**
	 * 输入营业厅机构编号
	 * 系统返回一个Boolean
	 * 用于显示营业厅是否存在
	 * @author XiongKaiQi
	 *
	 */
	public boolean checkHall(String codeNumber);
	/**
	 * 输入中转中心机构编号
	 * 系统返回一个boolean
	 * 用于显示中转中心是否存在
	 * @author XiongKaiQi
	 *
	 */
	public boolean checkCenter(String codeNumber);
	/**
	 * 输入到达地所在城市
	 * 系统返回一个boolean
	 * 用于显示到达地是否存在
	 * @author XiongKaiQi
	 *
	 */
	public boolean checkPlace(String city);
}

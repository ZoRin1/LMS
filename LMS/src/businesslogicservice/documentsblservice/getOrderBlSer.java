package businesslogicservice.documentsblservice;

import java.util.ArrayList;

public interface getOrderBlSer {
	/**
	 * 展示层获得输入开始，结束时间
	 * 系统返回所有订单条形码号和收款金额
	 * 收款金额转为字符串存于ArrayList
	 * @author XiongKaiQi
	 *
	 */
	public ArrayList<String>getOrder(String startTime,String endTime);
}

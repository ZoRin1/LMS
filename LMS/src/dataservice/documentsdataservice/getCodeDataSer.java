package dataservice.documentsdataservice;

import java.util.ArrayList;

public interface getCodeDataSer {
	/**
	 * 
	 * 系统返回一段时间内所有响应类型的单据的编码
	 * @author XiongKaiQi
	 *
	 */
	public ArrayList<String> getCode(String doName,String startTime,String endTime);
}

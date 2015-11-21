package dataservice.documentsdataservice;

import java.util.ArrayList;
//xiugai
public interface getCodeDataSer {
	/**
	 * 
	 * 系统返回一段时间内所有响应类型的单据的编码
	 * 当startTime为null时，则只考虑截止时间
	 * 当后两者均为null时，返回所有单据编号
	 * @author XiongKaiQi
	 *
	 */
	public ArrayList<String> getCode(String doName,String startTime,String endTime);
	/**
	 * 
	 * 系统返回一段时间内所有响应类型的单据的编码
	 * 当startTime为null时，则只考虑截止时间
	 * 当后两者均为null时，返回所有单据编号
	 * selling是营业厅编号
	 * @author XiongKaiQi
	 *
	 */
	public ArrayList<String> getSellingCode(String selling,String doName,String startTime,String endTime);
}

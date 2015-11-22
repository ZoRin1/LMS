package dataservice.documentsdataservice;

import java.util.ArrayList;
	
	public interface getNotPassDocCode {
		/**
		 * 通过创建人账号获得其所有未通过单据的编码和单据名
		 * @author XiongKaiQi
		 *
		 */
		public ArrayList<String> getNotPassDocCode(String account);
}

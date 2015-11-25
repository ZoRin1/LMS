package dataservice.financedataservice;

import po.financePO.*;

public interface GetBooksDataSer {
	
	/**
	 * 系统根据输入的年份返回单一持久化对象（账本）
	 * 用于期初建账
	 * @author YangGuan
	 *
	 */
	public BooksPO Books(String date);
}

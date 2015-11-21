package businesslogicservice.financeblservice;

import vo.financeVO.*;

public interface GetBooksBlSer {
	
	/**
	 * 系统根据输入年份返回该年份的账本
	 * 用于期初建账
	 * @author YangGuan
	 *
	 */
	public BooksVO getBooks(String year);
}

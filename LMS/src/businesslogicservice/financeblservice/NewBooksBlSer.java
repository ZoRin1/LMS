package businesslogicservice.financeblservice;

import vo.financeVO.*;

public interface NewBooksBlSer {
	
	
	/**
	 * 系统新建账本并从输入的账本中继承上一年信息并返回新账本
	 * 用于期初建账
	 * @author YangGuan
	 *
	 */
	public BooksVO newBooks(BooksVO vo);
}

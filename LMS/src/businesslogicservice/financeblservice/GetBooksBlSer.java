package businesslogicservice.financeblservice;

import java.util.ArrayList;

import po.financePO.BooksPO;
import vo.financeVO.*;

public interface GetBooksBlSer {
	
	/**
	 * ϵͳ����������ݷ��ظ���ݵ��˱�
	 * �����ڳ�����
	 * @author YangGuan
	 *
	 */
	public ArrayList<BooksPO> getBooks();
}

package businesslogic.financebl.BooksModel;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;

import po.financePO.BooksPO;
import dataservice.financedataservice.GetBooksDataSer;
import dataservice.financedataservice.financeFactory;
import vo.financeVO.BooksVO;
import businesslogicservice.financeblservice.GetBooksBlSer;

public class GetBooksBL implements GetBooksBlSer{
	
	private BooksVO vo;
	private ArrayList<BooksPO> booksPoList;

	@Override
	public ArrayList<BooksPO> getBooks() {
		// TODO �Զ����ɵķ������
		try {
			financeFactory finFactory = (financeFactory)Naming.lookup("rmi://127.0.0.1:6600/finFactory");
			GetBooksDataSer getBooks = finFactory.createGetBooksDataSer();
			booksPoList = getBooks.Books();
		} catch (MalformedURLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		return booksPoList;
	}
}

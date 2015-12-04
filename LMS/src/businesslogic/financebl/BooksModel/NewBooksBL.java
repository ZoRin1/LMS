package businesslogic.financebl.BooksModel;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import dataservice.financedataservice.AddBooksDataSer;
import dataservice.financedataservice.financeFactory;
import businesslogicservice.financeblservice.NewBooksBlSer;

public class NewBooksBL implements NewBooksBlSer{
	@Override
	public void newBooks(String name) {
		// TODO �Զ����ɵķ������
		try {
			financeFactory finFactory  = (financeFactory)Naming.lookup("rmi://127.0.0.1:6600/finFactory");
			AddBooksDataSer addBooks = finFactory.createAddBooksDataSer();
			addBooks.addBooks(name);
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
	}

}

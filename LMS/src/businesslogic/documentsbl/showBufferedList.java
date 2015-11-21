package businesslogic.documentsbl;

import java.util.ArrayList;

import businesslogicservice.documentsblservice.showBufferedListBlSer;

public class showBufferedList implements showBufferedListBlSer{

	@Override
	public ArrayList<String> showList() {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList();
		list.add("8912000收款单");
		list.add("8912084付款单");
		return list;
	}

}

package businesslogic.documentsbl;

import java.util.ArrayList;

import businesslogicservice.documentsblservice.showDocumentListBlSer;

public class showDocumentList implements showDocumentListBlSer {

	@Override
	public ArrayList<String> showList(String doName, String startTime,
			String endTime) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList();
		list.add("0000001�տ");
		return list;
	}

}

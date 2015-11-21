package businesslogic.documentsbl;

import java.util.ArrayList;

import businesslogicservice.documentsblservice.getOrderBlSer;

public class getOrder implements getOrderBlSer{

	@Override
	public ArrayList<String> getOrder(String startTime, String endTime) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList();
		list.add("0000000");
		list.add("0000001");
		return list;
	}

}

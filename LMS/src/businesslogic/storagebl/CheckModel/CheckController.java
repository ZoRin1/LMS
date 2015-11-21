package businesslogic.storagebl.CheckModel;

import java.util.ArrayList;

import vo.storageVO.InDepotInfVO;
import vo.storageVO.SimpleInDepotInfVO;

public class CheckController {
	
	private CheckBL check;
	
	
	
	public CheckController() {
		super();
		check = new CheckBL();
	}


	public ArrayList<SimpleInDepotInfVO>conCheck(int start,int end) {
		return null;
	}
	
	
	public ArrayList<InDepotInfVO> conInventory() {
		return null;
	}
}

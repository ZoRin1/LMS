package businesslogicservice.modelservice.storageInfo;
import java.util.ArrayList;

import po.documentsPO.InBillsPO;

public interface GetInBillsSer {
	public ArrayList<InBillsPO> getInBill(int start , int end);
	
	public ArrayList<InBillsPO> getBill(String division);
}

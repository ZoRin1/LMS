package businesslogicservice.modelservice.storageInfo;
import java.util.ArrayList;

import po.documentsPO.InBillsPO;

public interface GetInBillsSer {
	//startTime����Ϊnull��time��ʽΪ��-��-�� ʱ:��:��
	public ArrayList<InBillsPO> getInBill(String account,String start ,String end);
	//ֻ�н�ֹ����
	public ArrayList<InBillsPO> getAllInBills(String account,String end);
}

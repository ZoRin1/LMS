package businesslogicservice.storageblservice;

import java.util.ArrayList;

import po.documentsPO.OutbillsPO;
import vo.storageVO.*;

public interface check_inventoryBlSer {
	
	/**
	 * ϵͳ��������Ŀ�ʼʱ��ͽ���ʱ�䷵�ظ�ʱ��μ���ⵥ������
	 * @author YangGuan
	 * @param account TODO
	 *
	 */
	public ArrayList<SimpleInDepotInfVO>  check(String account,String start, String end);
	
	
	
	/**
	 *ϵͳ�������ɵĽ�ֹ�㷵�ذ���������ⵥ�ļ���
	 * @author YangGuan
	 * @param account TODO
	 * @param start TODO
	 * @param end TODO
	 *
	 */
	public ArrayList<InDepotInfVO> inventory(String account, String start, String end);

}

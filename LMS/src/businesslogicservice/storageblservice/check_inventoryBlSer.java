package businesslogicservice.storageblservice;

import java.util.ArrayList;

import vo.storageVO.*;

public interface check_inventoryBlSer {
	
	/**
	 * 系统根据输入的开始时间和结束时间返回该时间段库存记录的数组
	 * @author YangGuan
	 * @param account TODO
	 *
	 */
	public ArrayList<SimpleInDepotInfVO>  check(String account,String start, String end);
	
	
	
	/**
	 *系统根据生成的截止点返回包含各区快递信息的集合
	 * @author YangGuan
	 * @param account TODO
	 * @param start TODO
	 * @param end TODO
	 *
	 */
	public ArrayList<InDepotInfVO> inventory(String account, String start, String end);
}

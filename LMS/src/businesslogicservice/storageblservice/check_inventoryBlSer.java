package businesslogicservice.storageblservice;

import java.util.ArrayList;

import vo.storageVO.*;

public interface check_inventoryBlSer {
	
	/**
	 * 系统根据输入的开始时间和结束时间返回该时间段库存记录的数组
	 * @author YangGuan
	 *
	 */
	public ArrayList<SimpleInDepotInfVO>  check(int start,int end);
	
	
	
	/**
	 *系统根据生成的截止点返回包含各区快递信息的集合
	 * @author YangGuan
	 *
	 */
	public ArrayList<InDepotInfVO> inventory();
}

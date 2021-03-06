package dataservice.organizationdataservice;

public interface FinanceOrgDataSer {
	
	/**
	 * 查找并返回财务人员列表
	 * @return 财务人员ID+name列表
	 */
	public String[] find();
	
	/**
	 * 增加一个财务人员
	 * @param ID 增加的财务人员的编号
	 * @return 操作是否成功的信息
	 */
	public boolean insert(long ID);
	
	/**
	 * 删除一个财务人员
	 * @param ID 要删除的财务人员的账号
	 * @return 操作是否成功的信息
	 */
	public boolean delete(long ID);
	
}

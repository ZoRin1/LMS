package businesslogicservice.financeblservice;

public interface EarnOrPayBlSer {
	
	/**
	 * 系统根据输入的营业厅数组计算并返回总收入
	 * @author YangGuan
	 *
	 */
	public  double allEarn(String [] selling);
	
	
	/**
	 * 系统根据输入的营业厅数组计算并返回总支出
	 * @author YangGuan
	 *
	 */
	public double allPay(String [] selling);
	
}

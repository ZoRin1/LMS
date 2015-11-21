package businesslogic.financebl.ProfitModel;

import businesslogicservice.financeblservice.EarnOrPayBlSer;

public class CostStatisticsBL implements EarnOrPayBlSer{
	//得到总收入
	public double CalculateGet(String selling){
		return 0;
		
	}
	//得到总支出
	public double CalculatePay(String selling){
		return 0;
	}
	//得到成本收益
	public double CalculateCost(){
		return 0;
		
	}
	//调用CalculateGet
	@Override
	public double allEarn(String[] selling) {
		// TODO 自动生成的方法存根
		return 0;
	}
	//调用CalculatePay
	@Override
	public double allPay(String[] selling) {
		// TODO 自动生成的方法存根
		return 0;
	}
}

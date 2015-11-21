package businesslogic.financebl.ProfitModel;

import vo.financeVO.ProfitVO;

public class ProfitController {
	
	private CostStatisticsBL cost;
	
	//返回ProfitVO逻辑类
	private ProfitBL profit;
	
	
	public ProfitController(CostStatisticsBL cost, ProfitBL profit) {
		super();
		this.cost = cost;
		this.profit = profit;
	}

	//不太需要
//	public double earn(String [] selling){
//		return 0;
//	}
	
	//不太需要
//	public double pay(String [] selling){
//		return 0;
//	}
	
	public ProfitVO returnPro(String[] selling){
//		double earn = cost.allEarn(null);
//		double pay = cost.allPay(null);
//		ProfitVO pro = new ProfitVO(earn,pay,null);
		//时间的逻辑还没写！！！！！！！！！1
		return null;
	}
}

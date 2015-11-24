package businesslogic.financebl.ProfitModel;

import java.text.SimpleDateFormat;
import java.util.Date;

import vo.financeVO.ProfitVO;

public class ProfitController {
	
	private CostStatisticsBL cost;
	
	//����ProfitVO�߼���
	private ProfitBL profit;
	
	
	public ProfitController() {
		super();
		cost = new CostStatisticsBL();
		profit = new ProfitBL();
	}

	//��̫��Ҫ
//	public double earn(String [] selling){
//		return 0;
//	}
	
	//��̫��Ҫ
//	public double pay(String [] selling){
//		return 0;
//	}
	
	public ProfitVO returnPro(String end){
		double earn = cost.CalculateGet(end);
		double pay = cost.CalculatePay(end);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������ڸ�ʽ
		String date = df.format(new Date());
		ProfitVO pro = new ProfitVO(earn,pay,date);
		return pro;
	}
}

package businesslogic.transportationbl;

import businesslogicservice.transportationblservice.TransportationBLSer;
import presentation.icclerkui.icclerkui;
import vo.transportationVO.RouteVO;

public class TransportationBL implements TransportationBLSer {

	@Override
	public boolean changeDistance(RouteVO route) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean changeCost(int type, double cost) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public double getCost(int type) {
		// TODO 自动生成的方法存根
		if (type == 1){
			return 0.5;
		}else if (type == 2) {
			return 0.9;	
		}else {
			return 1.0;
		}
	}

	@Override
	public boolean addRoute(RouteVO route) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public double getDistance(String line) {
		// TODO 自动生成的方法存根
		return 0;
	}

	@Override
	public String[] getCityList(String city) {
		// TODO 自动生成的方法存根
		String[] result = {"南京","上海","北京","广东"};
		return result;
	}

	@Override
	public boolean addCity(String city) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public boolean removeCity(String city) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public double[] getSalary(int employee) {
		// TODO Auto-generated method stub
		double[] result = {2000.0,1.0,15.0};
		
		return result;
	}

	@Override
	public boolean changeSalary(int employee, double[] salary) {
		// TODO Auto-generated method stub
		return false;
	}

}

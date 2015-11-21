package businesslogic.transportationbl;

import businesslogicservice.transportationblservice.TransportationBLSer;
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
		return 0;
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
		return null;
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

}

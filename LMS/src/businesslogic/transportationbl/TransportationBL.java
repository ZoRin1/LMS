package businesslogic.transportationbl;

import businesslogicservice.transportationblservice.TransportationBLSer;
import presentation.icclerkui.icclerkui;
import vo.transportationVO.RouteVO;

public class TransportationBL implements TransportationBLSer {

	@Override
	public boolean changeDistance(RouteVO route) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean changeCost(int type, double cost) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public double getCost(int type) {
		// TODO �Զ����ɵķ������
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
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public double getDistance(String line) {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public String[] getCityList(String city) {
		// TODO �Զ����ɵķ������
		String[] result = {"�Ͼ�","�Ϻ�","����","�㶫"};
		return result;
	}

	@Override
	public boolean addCity(String city) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public boolean removeCity(String city) {
		// TODO �Զ����ɵķ������
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

package businesslogic.transportationbl;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import businesslogicservice.transportationblservice.TransportationBLSer;
import dataservice.organizationdataservice.organizationFactory;
import dataservice.transportationdataservice.TransportationDataSer;
import dataservice.transportationdataservice.TransportationFactory;
import po.transpotationPO.RoutePO;
import presentation.icclerkui.icclerkui;
import vo.transportationVO.RouteVO;

public class TransportationBL implements TransportationBLSer {
	
	private TransportationDataSer transportationDataSer;


	public TransportationBL() {
		// TODO Auto-generated constructor stub
		try {
			TransportationFactory transportationFactory = (TransportationFactory)Naming.lookup("rmi://114.212.42.143:6600/traFactory");
			this.transportationDataSer = transportationFactory.createTransportationDataSer();
		} catch (MalformedURLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	@Override
	public boolean changeDistance(RouteVO route) {
		// TODO �Զ����ɵķ������
		return this.transportationDataSer.updateDistance(new RoutePO(route.getLine(), route.getDistance()));
	}

	@Override
	public boolean changeCost(int type, double cost) {
		// TODO �Զ����ɵķ������
		return this.transportationDataSer.updateCost(type, cost);
	}

	@Override
	public double getCost(int type) {
		// TODO �Զ����ɵķ������
//		if (type == 1){
//			return 0.5;
//		}else if (type == 2) {
//			return 0.9;	
//		}else {
//			return 1.0;
//		}
		return this.transportationDataSer.findCost(type);
	}

	@Override
	public boolean addRoute(RouteVO route) {
		// TODO �Զ����ɵķ������
		return this.transportationDataSer.insertRoute(new RoutePO(route.getLine(), route.getDistance()));
	}

	@Override
	public double getDistance(String line) {
		// TODO �Զ����ɵķ������
		return this.transportationDataSer.findDistance(line);
	}

	@Override
	public String[] getCityList(String city) {
		// TODO �Զ����ɵķ������
//		String[] result = {"�Ͼ�","�Ϻ�","����","�㶫"};
		return this.transportationDataSer.findCityList(null);
	}

	@Override
	public boolean addCity(String city) {
		// TODO �Զ����ɵķ������
		return this.transportationDataSer.insertCity(city);
	}

	@Override
	public boolean removeCity(String city) {
		// TODO �Զ����ɵķ������
		return this.transportationDataSer.removeCity(city);
	}

	@Override
	public double[] getSalary(int employee) {
		// TODO Auto-generated method stub
		double[] result = {2000.0,1.0,15.0};
		
		return this.transportationDataSer.getSalary(employee);
	}

	@Override
	public boolean changeSalary(int employee, double[] salary) {
		// TODO Auto-generated method stub
		return this.transportationDataSer.changeSalary(employee, salary);
	}

}

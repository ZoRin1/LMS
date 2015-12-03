package businesslogic.documentsbl;

import businesslogic.transportationbl.TransportationController;

public class DocumentsLineItem{
	double distance=0;
	double cost=0;
	double weight=0;
	//此处所需line是起始城市名-到达城市名
	public DocumentsLineItem(String line, int type, double weight) {
		super();
		TransportationController co=new TransportationController();
		distance=co.getDistance(line);
		cost=co.getCost(type);
		this.weight=weight;
	}
	public double getTotal(){
		return distance*cost*weight;
	}
}

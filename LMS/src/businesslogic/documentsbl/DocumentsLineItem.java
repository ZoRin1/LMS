package businesslogic.documentsbl;

public class DocumentsLineItem{
	double distance=0;
	double cost=0;
	double weight=0;
	public DocumentsLineItem(String line, int type, double weight) {
		super();
//		distance=mock.getDistance(line);
//		cost=mock.getCost(type);
//		this.weight = weight;
	}
	public double getTotal(){
		return distance*cost*weight;
	}
}

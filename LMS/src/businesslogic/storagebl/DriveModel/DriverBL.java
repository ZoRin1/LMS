package businesslogic.storagebl.DriveModel;

import businesslogic.state.ResultMessage;
import businesslogicservice.storageblservice.DriveBlSer;

public class DriverBL implements DriveBlSer{

	private spaceBL allSpace;
	
	public DriverBL(){
		super();
		allSpace = new spaceBL();
	}
	@Override
	public ResultMessage drive(int shipping, int trains, int motor) {
		// TODO 自动生成的方法存根
		return null;
	}
	
}

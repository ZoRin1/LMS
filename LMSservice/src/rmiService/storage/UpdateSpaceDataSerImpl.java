package rmiService.storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dataservice.storagedataservice.UpdateSpaceDataSer;

public class UpdateSpaceDataSerImpl extends UnicastRemoteObject implements UpdateSpaceDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 3234821361500843438L;

	public UpdateSpaceDataSerImpl() throws RemoteException {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void updateDrive(int shipping, int trains, int motor,String city)  throws RemoteException{
		// TODO 自动生成的方法存根
		
		//String sql = "UPDATE"+city+"中转中心仓库"+"set AreaNum="+qu+","+"RowNum="+pai+","+"ShelvesNum="+jia+","+"SositionNum="+wei+"where isFull=1";
		
		
		
	}

}

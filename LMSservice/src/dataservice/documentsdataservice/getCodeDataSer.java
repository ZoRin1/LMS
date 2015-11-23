package dataservice.documentsdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface getCodeDataSer extends Remote{
	/**
	 * 
	 * 系统返回一段时间内所有响应类型的单据的编码和单据名
	 * starttime可以为空，此时返回endtime之前所有单据
	 * @author XiongKaiQi
	 *
	 */
	public ArrayList<String> getCode(String doName,String startTime,String endTime)throws RemoteException;
	/**
	 * 
	 * 系统返回一段时间内所有账号对应响应类型的单据的编码和单据名
	 * starttime可以为空，此时返回endtime之前所有单据
	 * @author XiongKaiQi
	 *
	 */
	public ArrayList<String> getStoCode(String account,String doName,String startTime,String endTime)throws RemoteException;
}

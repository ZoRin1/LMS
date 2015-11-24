package dataservice.organizationdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.orgPO.BussinessOrgPO;
import po.orgPO.DriverPO;
import po.orgPO.VehiclePO;


public interface BussinessOrgDataSer extends Remote{

	/**
	 * ���ҵ��Ա�б�
	 * @param ID ������ת����-Ӫҵ�����
	 * @return ҵ��Ա��ID+name�б�
	 */
	public String[] getBussinessmanList(String ID)throws RemoteException;
	
	/**
	 * ����һ��ҵ��Ա
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID �����ӵ�ҵ��Ա�˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addBussinessman(String ID, long bID)throws RemoteException;
	
	/**
	 * ɾ��һ��ҵ��Ա
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID Ҫɾ����ҵ��Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeBussinessman(String ID, long bID)throws RemoteException;

	/**
	 * ��ÿ��Ա�б�
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID Ӫҵ�����
	 * @return �ֿ����Ա��ID+name�б�
	 */
	public String[] getCourierList(String ID, long bID)throws RemoteException;
	/**
	 * ����һ�����Ա
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID �����ӵ�ҵ��Ա�˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addCourier(String ID, long bID)throws RemoteException;
	
	/**
	 * ɾ��һ�����Ա
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID Ҫɾ���Ŀ��Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeCourier(String ID, long bID)throws RemoteException; 
	
	/**
	 * ��ó����б�
	 * @param ID ������ת����-Ӫҵ�����
	 * @return ���������б� ���б��+Ӫҵ�����+���
	 * 
	 */
	public String[] getVehicleList(String ID)throws RemoteException;
	
	/**
	 * ��ó�����ϸ��Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeVehicle �������� ���б��+Ӫҵ�����+���
	 * @return ������Ϣ
	 */
	public VehiclePO getVehicleInfo(String ID, String codeVehicle)throws RemoteException;
	
	/**
	 * ����һ��������Ϣ
	 * @param ID ��������ת����-Ӫҵ�����
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 * 
	 * @return 
	 */
	public boolean addVehicle(String ID, VehiclePO po)throws RemoteException;
	
	/**
	 * ɾ��һ��������Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeVehicle �������� ���б��+Ӫҵ�����+���
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeVehicle(String ID, String codeVehicle)throws RemoteException;
	
	/**
	 * �޸�һ��������Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeVehicle(String ID, VehiclePO po)throws RemoteException;
		
	/**
	 * ���˾���б�
	 * @param ID ������ת����-Ӫҵ�����
	 * @return ˾���б� ���б��+Ӫҵ�����+���
	 * 
	 */
	public String[] getDriverList(String ID)throws RemoteException;
	
	/**
	 * ���˾����ϸ��Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeDriver �������� ���б��+Ӫҵ�����+���
	 * @return ˾����Ϣ
	 */
	public DriverPO getDriverInfo(String ID, String codeDriver)throws RemoteException;
	
	/**
	 * ����һ��˾����Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 *
	 */
	public boolean addDriver(String ID, DriverPO po)throws RemoteException;
	
	/**
	 * ɾ��һ��˾����Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeDriver ������� ���б��+Ӫҵ�����+���
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeDriver(String ID, String codeDriver)throws RemoteException;
	
	/**
	 * �޸�һ��˾����Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeDriver(String ID, DriverPO po)throws RemoteException;
	
	/**
	 * ����һ��Ӫҵ��
	 * @param ID ������ת����-Ӫҵ�����
	 * @param po ����Ӫҵ����ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addBussinessHall(String ID, BussinessOrgPO po)throws RemoteException;
	
	/**
	 * ɾ��Ӫҵ��
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeNumber Ӫҵ����� 3λ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeBussinessHall(String ID, String codeNumber)throws RemoteException;
	
	/**��ʵ��
	 */
	public String getCodeNumber()throws RemoteException;
	
	/**
	 * ��ʵ��
	 */
	public boolean changeCodeNumberOfMiddle(String ID, String codeNumberOfMiddle)throws RemoteException;
	
	/**
	 * ��ʵ��
	 */
	public String getInfo(String ID)throws RemoteException;
	
	/**
	 * ��ʵ��
	 */
	 public boolean changeCity(String ID, String city)throws RemoteException;
	 
	 /**
	  * ��ʵ��
	  */
	 public boolean changeCodeNumber(String ID, String codeNumber)throws RemoteException;
	
}

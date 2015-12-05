package dataservice.organizationdataservice;

import java.rmi.RemoteException;

import po.orgPO.BussinessOrgPO;
import po.orgPO.DriverPO;
import po.orgPO.VehiclePO;


public interface BussinessOrgDataSer {

	/**
	 * ���ҵ��Ա�б�
	 * @param ID ������ת����-Ӫҵ�����
	 * @return ҵ��Ա��ID+name�б�
	 */
	public String[] getBussinessmanList(String ID);
	
	/**
	 * ����һ��ҵ��Ա
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID �����ӵ�ҵ��Ա�˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addBussinessman(String ID, long bID);
	
	/**
	 * ɾ��һ��ҵ��Ա
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID Ҫɾ����ҵ��Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeBussinessman(String ID, long bID);

	/**
	 * ��ÿ��Ա�б�
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID Ӫҵ�����
	 * @return �ֿ����Ա��ID+name�б�
	 */
	public String[] getCourierList(String ID, long bID);
	/**
	 * ����һ�����Ա
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID �����ӵ�ҵ��Ա�˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addCourier(String ID, long bID);
	
	/**
	 * ɾ��һ�����Ա
	 * @param ID ������ת����-Ӫҵ�����
	 * @param bID Ҫɾ���Ŀ��Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeCourier(String ID, long bID); 
	
	/**
	 * ��ó����б�
	 * @param ID ������ת����-Ӫҵ�����
	 * @return ���������б� ���б��+Ӫҵ�����+���
	 * 
	 */
	public String[] getVehicleList(String ID);
	
	/**
	 * ��ó�����ϸ��Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeVehicle �������� ���б��+Ӫҵ�����+���
	 * @return ������Ϣ
	 */
	public VehiclePO getVehicleInfo(String ID, String codeVehicle);
	
	/**
	 * ����һ��������Ϣ
	 * @param ID ��������ת����-Ӫҵ�����
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 * 
	 * @return 
	 */
	public boolean addVehicle(String ID, VehiclePO po);
	
	/**
	 * ɾ��һ��������Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeVehicle �������� ���б��+Ӫҵ�����+���
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeVehicle(String ID, String codeVehicle);
	
	/**
	 * �޸�һ��������Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeVehicle(String ID, VehiclePO po);
		
	/**
	 * ���˾���б�
	 * @param ID ������ת����-Ӫҵ�����
	 * @return ˾���б� ���б��+Ӫҵ�����+���
	 * 
	 */
	public String[] getDriverList(String ID);
	
	/**
	 * ���˾����ϸ��Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeDriver �������� ���б��+Ӫҵ�����+���
	 * @return ˾����Ϣ
	 */
	public DriverPO getDriverInfo(String ID, String codeDriver);
	
	/**
	 * ����һ��˾����Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 *
	 */
	public boolean addDriver(String ID, DriverPO po);
	
	/**
	 * ɾ��һ��˾����Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeDriver ������� ���б��+Ӫҵ�����+���
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeDriver(String ID, String codeDriver);
	
	/**
	 * �޸�һ��˾����Ϣ
	 * @param ID ������ת����-Ӫҵ�����
	 * @param po ������ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeDriver(String ID, DriverPO po);
	
	/**
	 * ����һ��Ӫҵ��
	 * @param ID ������ת����-Ӫҵ�����
	 * @param po ����Ӫҵ����ϸ��Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addBussinessHall(String ID, BussinessOrgPO po);
	
	/**
	 * ɾ��Ӫҵ��
	 * @param ID ������ת����-Ӫҵ�����
	 * @param codeNumber Ӫҵ����� 3λ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeBussinessHall(String ID, String codeNumber);
	
	/**��ʵ��
	 */
	public String getCodeNumber()throws RemoteException;
	
	/**
	 * ��ʵ��
	 */
	public boolean changeCodeNumberOfMiddle(String ID, String codeNumberOfMiddle);
	
	/**
	 * ���ػ������ڵ���
	 * @return city
	 */
	public String getInfo(String ID);
	
	/**
	 * ��ʵ��
	 */
	 public boolean changeCity(String ID, String city);
	 
	 /**
	  * ��ʵ��
	  */
	 public boolean changeCodeNumber(String ID, String codeNumber);
	
}

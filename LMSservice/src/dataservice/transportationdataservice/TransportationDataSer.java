package dataservice.transportationdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.transpotationPO.RoutePO;



public interface TransportationDataSer extends Remote{

	/**
	 * �޸Ķ�Ӧ��·�ľ��볣��
	 * @param RoutePO �޸ĺ��·��
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean updateDistance(RoutePO route)throws RemoteException;
	
	/**
	 * ���³ɱ�����
	 * @param type �ɱ��������� 1����· 2������· 3�������
	 * @param int �޸ĺ�ĳɱ�����
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean updateCost(int type, double cost)throws RemoteException;
	
	/**
	 * ��óɱ�����
	 * @param type �ɱ��������� 1����· 2������· 3�������
	 * 
	 * @return int �ɱ�����
	 * 
	 */
	public double findCost(int type)throws RemoteException;
	
	/**
	 * ����һ��·��
	 * @param RoutePO �����ӵ�·��
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean insertRoute(RoutePO route)throws RemoteException;
	
	/**
	 * ��ö�Ӧ��·�ľ��볣��
	 * @param line ��ѯ����·
	 * @return int,���볣��
	 * 
	 */
	public double findDistance(String line)throws RemoteException;
	
	/**
	 * ��ó�ѡ��ĳ���֮��ĳ����б�
	 * @param String city ѡ��ĳ���
	 * @return String[] �����б�
	 */
	public String[] findCityList(String city)throws RemoteException;
	
	
	/**
	 * �����г����б�����һ������
	 * @param city �����ӵĳ���
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 */
	public boolean insertCity(String city)throws RemoteException;
	
	/**
	 * �����г����б�ɾ��һ������
	 * @param city ��ɾ���ĳ���
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeCity(String city)throws RemoteException;
	
}

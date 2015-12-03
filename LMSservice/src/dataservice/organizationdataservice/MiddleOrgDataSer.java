package dataservice.organizationdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import po.orgPO.MiddleOrgPO;


public interface MiddleOrgDataSer extends Remote{
	/**
	 * ���ҵ��Ա�б�
	 * @param ID ��ת���ı��
	 * @return ҵ��Ա��ID+name�б�
	 */
	public String[] getBussinessmanList(String ID)throws RemoteException;
	
	/**
	 * ����һ��ҵ��Ա
	 * @param ID ��ת���ı��
	 * @param bID �����ӵ�ҵ��Ա�˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addBussinessman(String ID, long bID)throws RemoteException;
	
	/**
	 * ɾ��һ��ҵ��Ա
	 * @param ID ��ת���ı��
	 * @param bID Ҫɾ����ҵ��Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeBussinessman(String ID, long bID)throws RemoteException;

	/**
	 * ��òֿ����Ա�б�
	 * @param ID ��ת���ı��
	 * @return �ֿ����Ա��ID+name�б�
	 */
	public String[] getStorgerList(String ID)throws RemoteException;
	/**
	 * ����һ���ֿ����Ա
	 * @param ID ��ת���ı��
	 * @param bID �����ӵ�ҵ��Ա�˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addStorger(String ID, long bID)throws RemoteException;
	
	/**
	 * ɾ��һ���ֿ����Ա
	 * @param ID ��ת���ı��
	 * @param bID Ҫɾ���Ĳֿ����Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeStorger(String ID, long bID)throws RemoteException; 
	
	/**
	 * �����ϽӪҵ���б�
	 * 
	 * ע�⣺��ת����û������Ӫҵ�����ܣ���Ҫͨ���½�Ӫҵ��ʱѡ��������ת����ʵ�֣����BussinessOrgDataSer.addBussinessHall(BussinessOrgVO vo)
	 * ��ת����Ҳû��ɾ��Ӫҵ�����ܣ���Ҫͨ��ɾ��Ӫҵ��ʱʵ�֣����BussinessOrgDataSer.removeBussinessHall(BussinessOrgVO vo)
	 * @param ID ��ת���ı��
	 * @return city+codeNumber�б�
	 */
	public String[] getBussinessHallList(String ID)throws RemoteException;
	
	
	/**
	 * ������ת�������ڳ���
	 * @param ID ��ת���ı��
	 * @return city
	 */
	
	public String GetInfo(String ID)throws RemoteException;
	
	/**
	 * �޸���ת�������ڳ���    
	 * �޸ĺ�Ҫ��ɾ��ԭ�г�����������ڵĳ���
	 * @param ID ��ת���ı��
	 * @param city ���޸ĵĳ���
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean changeCity(String ID, String city)throws RemoteException;
	
	/**
	 * ����һ����ת����
	 * @param ID TODO
	 * @param vo ����������ת���Ļ�����Ϣ
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addMiddleOrg(String ID, MiddleOrgPO po)throws RemoteException;
	
	/**
	 * ɾ��һ����ת����
	 * 
	 * ע��û�������޸Ļ�����Ϣ�ķ����ɣ������ĳ��кͱ�Ų����޸ģ��޸Ļ���ͨ������ҵ��Ա���ֿ����Ա����Ͻ��������
	 * @param ID ɾ����ת���ı��
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeMiddleOrg(String ID)throws RemoteException;
	

}

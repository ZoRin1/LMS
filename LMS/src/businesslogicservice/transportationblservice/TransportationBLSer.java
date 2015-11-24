package businesslogicservice.transportationblservice;

import java.rmi.RemoteException;

import vo.transportationVO.RouteVO;


public interface TransportationBLSer {
	
	/**
	 * �޸Ķ�Ӧ��·�ľ��볣��
	 * @param RouteVO �޸ĺ��·��
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean changeDistance(RouteVO route);
	
	/**
	 * �޸ĳɱ�����
	 * @param type �ɱ��������� 1����· 2������· 3�������
	 * @param int �޸ĺ�ĳɱ�����
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean changeCost(int type, double cost);
	
	/**
	 * ��óɱ�����
	 * @param type �ɱ��������� 1����· 2������· 3�������
	 * 
	 * @return int �ɱ�����
	 * 
	 */
	public double getCost(int type);
	
	/**
	 * ����һ��·��
	 * @param RouteVO �����ӵ�·��
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 * 
	 */
	public boolean addRoute(RouteVO route);
	
	/**
	 * ��ö�Ӧ��·�ľ��볣��
	 * @param line ��ѯ����·
	 * @return int,���볣��
	 * 
	 */
	public double getDistance(String line);
	
	/**
	 * ��ó�ѡ��ĳ���֮��ĳ����б�
	 * @param String city ѡ��ĳ���
	 * @return String[] �����б�
	 */
	public String[] getCityList(String city);
	
	
	/**
	 * �����г����б�����һ������
	 * @param city �����ӵĳ���
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 */
	public boolean addCity(String city);
	
	/**
	 * �����г����б�ɾ��һ������
	 * @param city ��ɾ���ĳ���
	 * @return boolean �����Ƿ�ɹ�����Ϣ
	 */
	public boolean removeCity(String city);
	
	/*
	 * ��ù��ʲ���
	 * @param employee Ա������
	 * 1������Ա
	 * 2����Ӫҵ��ҵ��Ա
	 * 3������ת����ҵ��Ա
	 * 4������ת���Ĳֿ����Ա
	 * 5���������Ա
	 * 6�����ܾ���
	 * 7����ϵͳ����Ա
	 
	 *@return double[] ��ӦԱ�����������ʲ�����ֵ������  �ֱ��� ����  �ƴ�  ���
	 *
	 */
	public double[] getSalary(int employee);
	
	/*
	 * �޸Ĺ��ʲ���
	 * @param employee Ա������
	 * 1������Ա
	 * 2����Ӫҵ��ҵ��Ա
	 * 3������ת����ҵ��Ա
	 * 4������ת���Ĳֿ����Ա
	 * 5���������Ա
	 * 6�����ܾ���
	 * 7����ϵͳ����Ա
	 * @param salary Ա�����������ʲ�����ֵ������  �ֱ��� ����  �ƴ�  ���
	 * @return boolean �޸Ĳ����Ƿ�ɹ�
	 * 
	 */
	
	public boolean changeSalary(int employee,double [] salary);
	
}

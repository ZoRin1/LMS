package dataservice.documentsdataservice;

import java.util.ArrayList;

public interface getCodeDataSer {
	/**
	 * 
	 * ϵͳ����һ��ʱ����������Ӧ���͵ĵ��ݵı���͵�����
	 * starttime����Ϊ�գ���ʱ����endtime֮ǰ���е���
	 * @author XiongKaiQi
	 *
	 */
	public ArrayList<String> getCode(String doName,String startTime,String endTime);
	/**
	 * 
	 * ϵͳ����һ��ʱ���������˺Ŷ�Ӧ��Ӧ���͵ĵ��ݵı���͵�����
	 * starttime����Ϊ�գ���ʱ����endtime֮ǰ���е���
	 * @author XiongKaiQi
	 *
	 */
	public ArrayList<String> getStoCode(String account,String doName,String startTime,String endTime);
	/**
	 * 
	 * ϵͳ����һ��ʱ����Ӫҵ�������տ�ı���͵�����
	 * startTime��endTime�ֱ�Ϊһ���ڵĿ�ʼʱ��ͽ���ʱ��
	 * sellingָ����Ӫҵ�������֣����֣�
	 * �����Ҫ����ΪӪҵ����ֹһ��ҵ��Ա����ӵ�
	 * @author XiongKaiQi
	 *
	 */
	public ArrayList<String> getPayCode(String selling,String doName,String startTime,String endTime);
}

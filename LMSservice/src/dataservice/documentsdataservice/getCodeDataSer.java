package dataservice.documentsdataservice;

import java.util.ArrayList;
//xiugai
public interface getCodeDataSer {
	/**
	 * 
	 * ϵͳ����һ��ʱ����������Ӧ���͵ĵ��ݵı���
	 * ��startTimeΪnullʱ����ֻ���ǽ�ֹʱ��
	 * �������߾�Ϊnullʱ���������е��ݱ��
	 * @author XiongKaiQi
	 *
	 */
	public ArrayList<String> getCode(String doName,String startTime,String endTime);
	/**
	 * 
	 * ϵͳ����һ��ʱ����������Ӧ���͵ĵ��ݵı���
	 * ��startTimeΪnullʱ����ֻ���ǽ�ֹʱ��
	 * �������߾�Ϊnullʱ���������е��ݱ��
	 * selling��Ӫҵ�����
	 * @author XiongKaiQi
	 *
	 */
	public ArrayList<String> getSellingCode(String selling,String doName,String startTime,String endTime);
}

package dataservice.financedataservice;

public interface ChangeAccountDataSer {
	
	/**
	 * ͨ�������˻������� ����ָ���˻��Ľ��
	 */
	
	public void changeEarn(String accountName,double earn);
	
	
	/**
	 * ͨ�������˻������� ��ȥָ���˻��Ľ��
	 */
	
	public void changePay(String accountName,double earn);
}

package rmiService.storage;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import po.storagePO.DepotPO;
import dataservice.storagedataservice.InDepotDataSer;
import dataservice.storagedataservice.OutDepotDataSer;

public class OutDepotDataSerImpl extends UnicastRemoteObject implements OutDepotDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = -7266703194896409949L;

	protected OutDepotDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void outDepot(DepotPO depo, String city) throws RemoteException {
		// TODO �Զ����ɵķ������
		int qu =depo.getQu();
		int pai = depo.getPai();
		int jia = depo.getJia();
		int wei = depo.getWei();
		String sql = "UPDATE"+city+"��ת���Ĳֿ�"+"set isFull=0"+"where AreaNum="+qu+"and RowNum="+pai+"and ShelvesNum="+jia+"and SositionNum="+wei;
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			preparedStatement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}

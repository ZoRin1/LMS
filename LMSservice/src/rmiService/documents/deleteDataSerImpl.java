package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dataservice.documentsdataservice.deleteDataSer;

public class deleteDataSerImpl extends UnicastRemoteObject implements deleteDataSer{
	private static String URL="jdbc:mysql://127.0.0.1:3306/lmssql";
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String USER="root";
	private static  String PASSWORD="123456";
	private String sql;
	/**
	 * 
	 */
	private static final long serialVersionUID = 6945635844601249905L;

	public deleteDataSerImpl() throws RemoteException {
		super();
		// TODO �Զ����ɵĹ��캯�����
	}


	@Override
	public boolean delete(String code, String doName) {
		// TODO �Զ����ɵķ������
		sql="select * from b"+doName+" where code="+code;
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			switch (doName) {
			case "���ⵥ":
				sql="insert into ���ⵥ(code,doName,packCode,date,account,arrival,Mode,transCode) values ("+resultSet.getString(1)+","+resultSet.getString(2)+","+resultSet.getString(3)+","+resultSet.getString(4)+","+resultSet.getString(5)+","+resultSet.getString(6)+","+resultSet.getString(7)+","+resultSet.getString(8)+")";
				break;
			case "���":
				sql="insert into ���(code,doName,date,account,fund,name,account2,type,remark) values ("+resultSet.getString(1)+","+resultSet.getString(2)+","+resultSet.getString(3)+","+resultSet.getString(4)+","+resultSet.getString(5)+","+resultSet.getString(6)+","+resultSet.getString(7)+","+resultSet.getString(8)+","+resultSet.getString(9)+")";
				break;
			case "�ļ���":
				sql="insert into �ļ���(code,doName,account,date,SenderName,SenderAddress,SenderOrg,SPhoneNumber,SMobileNumber,ReceiverName,ReceiverAddress,ReceiverOrg,RPhoneNumber,RMobileNumber,number,weight,shape,cargoNameList,sizeList,sumCost,state) values ("+resultSet.getString(1)+","+resultSet.getString(2)+","+resultSet.getString(3)+","+resultSet.getString(4)+","+resultSet.getString(5)+","+resultSet.getString(6)+","+resultSet.getString(7)+","+resultSet.getString(8)+","+resultSet.getString(9)+","+resultSet.getString(10)+","+resultSet.getString(11)+","+resultSet.getString(12)+","+resultSet.getString(13)+","+resultSet.getString(14)+","+resultSet.getInt(15)+","+resultSet.getDouble(16)+","+resultSet.getDouble(17)+","+resultSet.getString(18)+","+resultSet.getString(19)+","+resultSet.getDouble(20)+","+resultSet.getString(21)+")";
			break;
			case "�ɼ���":
				sql="insert into �ɼ���(code,code2,doName,account,date,name) values ("+resultSet.getString(1)+","+resultSet.getString(2)+","+resultSet.getString(3)+","+resultSet.getString(4)+","+resultSet.getString(5)+","+resultSet.getString(6)+")";
				break;
			case "��ⵥ":
				sql="insert into ��ⵥ(code,doName,InDepotNum,InDepotDate,account,Destination,AreaNum,RowNum,ShelvesNum,SositionNum) values ("+resultSet.getString(1)+","+resultSet.getString(2)+","+resultSet.getString(3)+","+resultSet.getString(4)+","+resultSet.getString(5)+","+resultSet.getString(6)+","+resultSet.getInt(7)+","+resultSet.getInt(8)+","+resultSet.getInt(9)+","+resultSet.getInt(10)+")";
				break;
			case "�ռ���":
				sql="insert into �ռ���(code,code2,doName,account,ReceiverName,date) values ("+resultSet.getString(1)+","+resultSet.getString(2)+","+resultSet.getString(3)+","+resultSet.getString(4)+","+resultSet.getString(5)+","+resultSet.getString(6)+")";
				break;
			case "�տ":
				sql="insert into �տ(code,doName,date,account,OrgCode,name,fund,Tcode) values ("+resultSet.getString(1)+","+resultSet.getString(2)+","+resultSet.getString(3)+","+resultSet.getString(4)+","+resultSet.getString(5)+","+resultSet.getString(6)+","+resultSet.getDouble(7)+","+resultSet.getString(8)+")";
				break;
			case "Ӫҵ�����յ�":
				sql="insert into Ӫҵ�����յ�(code,code2,doName,account,date,departure,arrival,state) values ("+resultSet.getString(1)+","+resultSet.getString(2)+","+resultSet.getString(3)+","+resultSet.getString(4)+","+resultSet.getString(5)+","+resultSet.getString(6)+","+resultSet.getString(7)+","+resultSet.getString(8)+")";
				break;
			case "Ӫҵ��װ����":
				sql="insert into Ӫҵ��װ����(code,doName,account,date,departure,arrival,supervisor,supercargo,codeList,charge) values ("+resultSet.getString(1)+","+resultSet.getString(2)+","+resultSet.getString(3)+","+resultSet.getString(4)+","+resultSet.getString(5)+","+resultSet.getString(6)+","+resultSet.getString(7)+","+resultSet.getString(8)+","+resultSet.getString(9)+","+resultSet.getDouble(10)+")";
				break;
			case "��ת���Ľ��յ�":
				sql="insert into ��ת���Ľ��յ�(code,doName,date,account,zCode,departure,arrival) values ("+resultSet.getString(1)+","+resultSet.getString(2)+","+resultSet.getString(3)+","+resultSet.getString(4)+","+resultSet.getString(5)+","+resultSet.getString(6)+","+resultSet.getString(7)+")";
				break;
			case "��ת����ת�˵�":
				sql="insert into ��ת����ת�˵�(code,doName,date,account,transcode,departure,arrival,name,codeList,carriage) values ("+resultSet.getString(1)+","+resultSet.getString(2)+","+resultSet.getString(3)+","+resultSet.getString(4)+","+resultSet.getString(5)+","+resultSet.getString(6)+","+resultSet.getString(7)+","+resultSet.getString(8)+","+resultSet.getString(9)+","+resultSet.getDouble(10)+")";
				break;
			}
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			sql="delete from b"+doName+" where code="+code;
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			connection.close();
			return true;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}

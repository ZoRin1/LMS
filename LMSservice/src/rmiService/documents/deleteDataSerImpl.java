package rmiService.documents;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	public boolean delete(String code, String doName) throws RemoteException{
		// TODO �Զ����ɵķ������
		sql="select * from b"+doName+" where code='"+code+"'";
		try {
			Class.forName(DRIVER);
			Connection connection=DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			switch (doName) {
			case "���":
				sql="insert into ���(code,doName,date,account,fund,name,account2,type,remark) values ('"+resultSet.getString(1)+"','"+resultSet.getString(2)+"','"+resultSet.getString(3)+"','"+resultSet.getString(4)+"','"+resultSet.getString(5)+"','"+resultSet.getString(6)+"','"+resultSet.getString(7)+"','"+resultSet.getString(8)+"','"+resultSet.getString(9)+"')";
				break;
			case "�ļ���":
				sql="insert into �ļ���(code,doName,account,date,SenderName,SenderAddress,SenderOrg,SPhoneNumber,SMobileNumber,ReceiverName,ReceiverAddress,ReceiverOrg,RPhoneNumber,RMobileNumber,number,weight,shape,cargoNameList,sizeList,sumCost,state) values ('"+resultSet.getString(1)+"','"+resultSet.getString(2)+"','"+resultSet.getString(3)+"','"+resultSet.getString(4)+"','"+resultSet.getString(5)+"','"+resultSet.getString(6)+"','"+resultSet.getString(7)+"','"+resultSet.getString(8)+"','"+resultSet.getString(9)+"','"+resultSet.getString(10)+"','"+resultSet.getString(11)+"','"+resultSet.getString(12)+"','"+resultSet.getString(13)+"','"+resultSet.getString(14)+"','"+resultSet.getInt(15)+"','"+resultSet.getDouble(16)+"','"+resultSet.getDouble(17)+"','"+resultSet.getString(18)+"','"+resultSet.getString(19)+"','"+resultSet.getDouble(20)+"','"+resultSet.getString(21)+"')";
			break;
			case "�ɼ���":
				sql="insert into �ɼ���(code,code2,doName,account,date,name) values ('"+resultSet.getString(1)+"','"+resultSet.getString(2)+"','"+resultSet.getString(3)+"','"+resultSet.getString(4)+"','"+resultSet.getString(5)+"','"+resultSet.getString(6)+"')";
				break;
			case "�ռ���":
				sql="insert into �ռ���(code,code2,doName,account,ReceiverName,date) values ('"+resultSet.getString(1)+"','"+resultSet.getString(2)+"','"+resultSet.getString(3)+"','"+resultSet.getString(4)+"','"+resultSet.getString(5)+"','"+resultSet.getString(6)+"')";
				break;
			case "�տ":
				sql="insert into �տ(code,doName,date,account,OrgCode,name,fund,Tcode) values ('"+resultSet.getString(1)+"','"+resultSet.getString(2)+"','"+resultSet.getString(3)+"','"+resultSet.getString(4)+"','"+resultSet.getString(5)+"','"+resultSet.getString(6)+"','"+resultSet.getDouble(7)+"','"+resultSet.getString(8)+"')";
				break;
			case "Ӫҵ�����յ�":
				sql="insert into Ӫҵ�����յ�(code,code2,doName,account,date,departure,arrival,state) values ('"+resultSet.getString(1)+"','"+resultSet.getString(2)+"','"+resultSet.getString(3)+"','"+resultSet.getString(4)+"','"+resultSet.getString(5)+"','"+resultSet.getString(6)+"','"+resultSet.getString(7)+"','"+resultSet.getString(8)+"')";
				break;
			case "Ӫҵ��װ����":
				sql="insert into Ӫҵ��װ����(code,doName,account,date,departure,arrival,supervisor,supercargo,codeList,charge) values ('"+resultSet.getString(1)+"','"+resultSet.getString(2)+"','"+resultSet.getString(3)+"','"+resultSet.getString(4)+"','"+resultSet.getString(5)+"','"+resultSet.getString(6)+"','"+resultSet.getString(7)+"','"+resultSet.getString(8)+"','"+resultSet.getString(9)+"','"+resultSet.getDouble(10)+"')";
				break;
			case "��ת���Ľ��յ�":
			sql="insert into ��ת���Ľ��յ�(code,doName,date,account,zCode,codeList,departure,arrival) values ('"+resultSet.getString(1)+"','"+resultSet.getString(2)+"','"+resultSet.getString(3)+"','"+resultSet.getString(4)+"','"+resultSet.getString(5)+"','"+resultSet.getString(6)+"','"+resultSet.getString(7)+"','"+resultSet.getString(8)+"')";
			break;
			case "��ת����ת�˵�":
				sql="insert into ��ת����ת�˵�(code,doName,date,account,transcode,departure,arrival,name,codeList,carriage) values ('"+resultSet.getString(1)+"','"+resultSet.getString(2)+"','"+resultSet.getString(3)+"','"+resultSet.getString(4)+"','"+resultSet.getString(5)+"','"+resultSet.getString(6)+"','"+resultSet.getString(7)+"','"+resultSet.getString(8)+"','"+resultSet.getString(9)+"','"+resultSet.getDouble(10)+"')";
				break;
			}
			resultSet.close();
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			ResultSet resultSet2;
			String dateString;
			String stateString;
			String s[];
			switch (doName) {
			case "�ļ���":
				sql="select account,date from b�ļ��� where code='"+code+"'";
				preparedStatement=connection.prepareStatement(sql);
				resultSet2=preparedStatement.executeQuery();
				resultSet2.next();
				dateString=resultSet2.getString(2);
				sql="select state from �ʺű� where ID='"+resultSet2.getString(1)+"'";
				preparedStatement=connection.prepareStatement(sql);
				resultSet2=preparedStatement.executeQuery();
				resultSet2.next();
				stateString=resultSet2.getString(1);
				s=stateString.split("-");
				String wuliu1=dateString+" ���Ŀ���ѵ���"+s[2]+"Ӫҵ��";
				sql="insert into ������Ϣ (code,wuliu1) values ('"+code+"','"+wuliu1+"')";
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.executeUpdate();
				break;
			case "�ռ���":
				sql="select code2,date,ReceiverName from b�ռ��� where code='"+code+"'";
				preparedStatement=connection.prepareStatement(sql);
				resultSet2=preparedStatement.executeQuery();
				resultSet2.next();		
				String wuliu9=resultSet2.getString(2)+" ���Ŀ����ǩ�� ǩ����:"+resultSet2.getString(3);
				sql="update ������Ϣ set wuliu9='"+wuliu9+"' where code='"+resultSet2.getString(1)+"'";
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.executeUpdate();
				break;
			case "Ӫҵ�����յ�":
				sql="select code2,date,arrival from b�ռ��� where code='"+code+"'";
				preparedStatement=connection.prepareStatement(sql);
				resultSet2=preparedStatement.executeQuery();
				resultSet2.next();
				String wuliu7=resultSet2.getString(2)+" ���Ŀ���ѵ���"+resultSet2.getString(3);
				sql="update ������Ϣ set wuliu7='"+wuliu7+"'  where code='"+resultSet2.getString(1)+"'";
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.executeUpdate();
				break;
			
			case "�ɼ���":
				sql="select code2,date from b�ɼ��� where code='"+code+"'";
				preparedStatement=connection.prepareStatement(sql);
				resultSet2=preparedStatement.executeQuery();
				resultSet2.next();
				String wuliu8=resultSet2.getString(2)+" ���Ŀ�������ɼ�";
				sql="update ������Ϣ set wuliu8='"+wuliu8+"' where code ='"+resultSet2.getString(1)+"'";
				preparedStatement=connection.prepareStatement(sql);
				preparedStatement.executeUpdate();
				break;
			case "Ӫҵ��װ����":
				sql="select date,codeList,departure from bӪҵ��װ���� where code='"+code+"'";
				preparedStatement=connection.prepareStatement(sql);
				resultSet2=preparedStatement.executeQuery();
				resultSet2.next();	
				s=resultSet2.getString(2).split(",");
				String wuliu2=resultSet2.getString(1)+" ���Ŀ�����뿪"+resultSet2.getString(3);
				for (int i = 0; i < s.length; i++) {
					sql="update ������Ϣ set wuliu2='"+wuliu2+"' where code ='"+s[i]+"'";
					preparedStatement=connection.prepareStatement(sql);
					preparedStatement.executeUpdate();
				}
				break;
			case "��ת���Ľ��յ�":
				sql="select date,codeList,arrival from b��ת���Ľ��յ� where code='"+code+"'";
				preparedStatement=connection.prepareStatement(sql);
				resultSet2=preparedStatement.executeQuery();
				resultSet2.next();	
				s=resultSet2.getString(2).split(",");
				String wuliu35=resultSet2.getString(1)+" ���Ŀ���ѵ���"+resultSet2.getString(3);
				for (int i = 0; i < s.length; i++) {
					sql="select wuliu3 from bӪҵ��װ���� where code='"+s[i]+"'";
					preparedStatement=connection.prepareStatement(sql);
					resultSet2=preparedStatement.executeQuery();
					resultSet2.next();
					if (!resultSet2.getString(1).equals(null)) {
						sql="update ������Ϣ set wuliu5='"+wuliu35+"' where code ='"+s[i]+"'";
					}
					else {
						sql="update ������Ϣ set wuliu3='"+wuliu35+"' where code ='"+s[i]+"'";
					}
					preparedStatement=connection.prepareStatement(sql);
					preparedStatement.executeUpdate();
				}
				break;
			case "��ת����ת�˵�":
				sql="select date,codeList,departure from bӪҵ��װ���� where code='"+code+"'";
				preparedStatement=connection.prepareStatement(sql);
				resultSet2=preparedStatement.executeQuery();
				resultSet2.next();	
				s=resultSet2.getString(2).split(",");
				String wuliu46=resultSet2.getString(1)+" ���Ŀ�����뿪"+resultSet2.getString(3);
				for (int i = 0; i < s.length; i++) {
					sql="select wuliu4 from bӪҵ��װ���� where code='"+s[i]+"'";
					preparedStatement=connection.prepareStatement(sql);
					resultSet2=preparedStatement.executeQuery();
					resultSet2.next();
					if (!resultSet2.getString(1).equals(null)) {
						sql="update ������Ϣ set wuliu6='"+wuliu46+"' where code ='"+s[i]+"'";
					}
					else {
						sql="update ������Ϣ set wuliu4='"+wuliu46+"' where code ='"+s[i]+"'";
					}
					preparedStatement=connection.prepareStatement(sql);
					preparedStatement.executeUpdate();
				}
				break;
			}
			sql="delete from b"+doName+" where code='"+code+"'";
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

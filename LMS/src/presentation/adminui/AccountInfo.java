package presentation.adminui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import vo.accountVO.AccountNumberVO;

public class AccountInfo extends JPanel {
	private JLabel daBiaoTi,zhangHao,zangHaoI,miMa,miMaI,xinMing,xinMingI,dianHua,dianHuaI,shenFenZhengHao,shenFenZhengHaoI,zhuCeRiQi,zhuCeRiQiI;
	private JButton shange,delete,back;
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	private ImageIcon yesIcon=new ImageIcon("picture/确定.png");
	
	public AccountInfo(adminui aui,adminJpanel ajpl,AccountNumberVO accountNumberVO){
		init(accountNumberVO);
		aui.setTitle("账号详细信息");
		ajpl.add(this);
	}

	
	
	private void init(AccountNumberVO accountNumberVO){
		
		Font fontB=new Font("幼圆",Font.BOLD,30);
		Font font=new Font("幼圆",Font.BOLD,25);
		
		daBiaoTi = new JLabel("账号详细信息");
		daBiaoTi.setForeground(Color.WHITE);
		daBiaoTi.setFont(fontB);
		daBiaoTi.setBounds(180, 50, 500, 50);
		this.add(daBiaoTi);
		
		
		zhangHao = new JLabel("账号：");
		zhangHao.setForeground(Color.WHITE);
		zhangHao.setFont(font);
		zhangHao.setBounds(100, 150, 80, 40);
		this.add(zhangHao);
		
		zangHaoI = new JLabel(Long.toString(accountNumberVO.getID()));
		zangHaoI.setForeground(Color.WHITE);
		zangHaoI.setFont(font);
		zangHaoI.setBounds(180, 150, 150, 40);
		this.add(zangHaoI);
		
		
		miMa = new JLabel("密码：");
		miMa.setForeground(Color.WHITE);
		miMa.setFont(font);
		miMa.setBounds(340, 150, 80, 40);
		this.add(miMa);
		
		miMaI = new JLabel(accountNumberVO.getPassword());
		miMaI.setForeground(Color.WHITE);
		miMaI.setFont(font);
		miMaI.setBounds(430, 150, 120, 40);
		this.add(miMaI);
		
		
		xinMing = new JLabel("姓名：");
		xinMing.setForeground(Color.WHITE);
		xinMing.setFont(font);
		xinMing.setBounds(100, 230, 80, 40);
		this.add(xinMing);
		
		xinMingI = new JLabel(accountNumberVO.getName());
		xinMingI.setForeground(Color.WHITE);
		xinMingI.setFont(font);
		xinMingI.setBounds(180, 230, 200, 40);
		this.add(xinMingI);
		
			
		dianHua = new JLabel("电话：");
		dianHua.setFont(font);
		dianHua.setForeground(Color.WHITE);
		dianHua.setBounds(340, 230, 80, 40);
		this.add(dianHua);
		
		dianHuaI = new JLabel(accountNumberVO.getPhone());
		dianHuaI.setForeground(Color.WHITE);
		dianHuaI.setFont(font);
		dianHuaI.setBounds(430, 230, 180, 40);
		this.add(dianHuaI);
		
		
		shenFenZhengHao = new JLabel("身份证号码：");
		shenFenZhengHao.setForeground(Color.WHITE);
		shenFenZhengHao.setFont(font);
		shenFenZhengHao.setBounds(100, 310, 180, 40);
		this.add(shenFenZhengHao);
		
		shenFenZhengHaoI = new JLabel(accountNumberVO.getsID());
		shenFenZhengHaoI.setForeground(Color.WHITE);
		shenFenZhengHaoI.setFont(font);
		shenFenZhengHaoI.setBounds(260, 310, 300, 40);
		this.add(shenFenZhengHaoI);
		
		zhuCeRiQi = new JLabel("注册日期：");
		zhuCeRiQi.setForeground(Color.WHITE);
		zhuCeRiQi.setFont(font);
		zhuCeRiQi.setBounds(100, 390, 160, 40);
		this.add(zhuCeRiQi);
		
		zhuCeRiQiI = new JLabel(accountNumberVO.getDate());
		zhuCeRiQiI.setForeground(Color.WHITE);
		zhuCeRiQiI.setFont(font);
		zhuCeRiQiI.setBounds(240, 390, 180, 40);
		this.add(zhuCeRiQiI);
		
		this.setBounds(260, 60, 730,650);	
	 	this.setLayout(null);
	 	this.setOpaque(false);	
	}
	
	public void paintComponent(Graphics g)  
	{  
			super.paintComponent(g);    
			g.drawImage(frameIcon.getImage(),-7,-12,null);
	 }

}

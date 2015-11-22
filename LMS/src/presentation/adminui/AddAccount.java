package presentation.adminui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddAccount extends JPanel {
	private JLabel daBiaoTi;
	private JLabel zhangHao;
	private JLabel zhangHaoNo;
	private JLabel miMa;
	private JTextField miMaF;
	private JLabel miMaTishi;
	private JLabel xinMing;
	private JTextField xinMingF;
	private JLabel xinMingTiShi;
	private JLabel dianHua;
	private JTextField dianHuaF;
	private JLabel dianHuaTiShi;
	private JLabel shenFenZhengHaoMa;
	private JTextField shenFenZhengHaoMaF;
	private JLabel shenFenZhengHaoMaTiShi;
	
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	private ImageIcon yesIcon=new ImageIcon("picture/确定.png");
	
	public AddAccount(adminui aui,adminJpanel apl){
		init();
		aui.setTitle("新建账户号");
		apl.add(this);
		registListener(aui, apl, this);
	}
	
	
	
	private void init(){
		
		Font fontB=new Font("幼圆",Font.BOLD,30);
		Font font=new Font("幼圆",Font.BOLD,20);
		
		
		daBiaoTi = new JLabel("请输入正确的信息并确定");
		daBiaoTi.setForeground(Color.WHITE);
		daBiaoTi.setFont(fontB);
		daBiaoTi.setBounds(180, 50, 500, 50);
		this.add(daBiaoTi);
		
		
		zhangHao = new JLabel("账号：");
		zhangHao.setForeground(Color.WHITE);
		zhangHao.setFont(font);
		zhangHao.setBounds(100, 150, 64, 40);
		this.add(zhangHao);
		
		zhangHaoNo = new JLabel("由系统唯一给出");
		zhangHaoNo.setForeground(Color.WHITE);
		zhangHaoNo.setFont(font);
		zhangHaoNo.setBounds(180, 150, 150, 40);
		this.add(zhangHaoNo);
		
		
		miMa = new JLabel("密码：");
		miMa.setForeground(Color.WHITE);
		miMa.setFont(font);
		miMa.setBounds(100, 220, 64, 40);
		this.add(miMa);
		
		miMaF = new JTextField();
		miMaF.setFont(font);
		miMaF.setBounds(180, 220, 150, 40);
		this.add(miMaF);
		
		miMaTishi = new JLabel("(6个字母)");
		miMaTishi.setForeground(Color.WHITE);
		miMaTishi.setFont(font);
		miMaTishi.setBounds(340, 220, 100, 40);
		this.add(miMaTishi);
		
		
		xinMing = new JLabel("姓名：");
		xinMing.setForeground(Color.WHITE);
		xinMing.setFont(font);
		xinMing.setBounds(100, 300, 64, 40);
		this.add(xinMing);
		
		xinMingF = new JTextField();
		xinMingF.setFont(font);
		xinMingF.setBounds(180, 300, 120, 40);
		this.add(xinMingF);
		
		xinMingTiShi = new JLabel("(2--4个汉字)");
		xinMingTiShi.setForeground(Color.WHITE);
		xinMingTiShi.setFont(font);
		xinMingTiShi.setBounds(310, 300, 160, 40);
		this.add(xinMingTiShi);
		
			
		dianHua = new JLabel("电话：");
		dianHua.setFont(font);
		dianHua.setForeground(Color.WHITE);
		dianHua.setBounds(100, 380, 64, 40);
		this.add(dianHua);
		
		dianHuaF = new JTextField();
		dianHuaF.setFont(font);
		dianHuaF.setBounds(180, 380, 150, 40);
		this.add(dianHuaF);
		
		dianHuaTiShi = new JLabel("(11个数字)");
		dianHuaTiShi.setForeground(Color.WHITE);
		dianHuaTiShi.setFont(font);
		dianHuaTiShi.setBounds(340, 380, 150, 40);
		this.add(dianHuaTiShi);
		
		
		shenFenZhengHaoMa = new JLabel("身份证号码：");
		shenFenZhengHaoMa.setForeground(Color.WHITE);
		shenFenZhengHaoMa.setFont(font);
		shenFenZhengHaoMa.setBounds(100, 460, 150, 40);
		this.add(shenFenZhengHaoMa);
		
		shenFenZhengHaoMaF = new JTextField();
		shenFenZhengHaoMaF.setFont(font);
		shenFenZhengHaoMaF.setBounds(240, 460, 220, 40);
		this.add(shenFenZhengHaoMaF);
		
		shenFenZhengHaoMaTiShi = new JLabel("(18位数字)");
		shenFenZhengHaoMaTiShi.setForeground(Color.WHITE);
		shenFenZhengHaoMaTiShi.setFont(font);
		shenFenZhengHaoMaTiShi.setBounds(470, 460, 150, 40);
		this.add(shenFenZhengHaoMaTiShi);
		
		
		returnButton=new JButton(returnIcon);		
		returnButton.setBounds(450, 530,48,48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);
		
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(350, 530,48,48);
		yesButton.setContentAreaFilled(false);
	 	this.setBounds(260, 30, 730,650);	 	
	 	this.add(yesButton);
	 	
	 	
	 	this.setLayout(null);
	 	this.setOpaque(false);		
	}

	private void registListener(final adminui aui,final adminJpanel apl,final AddAccount aat){
		
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				aui.setTitle("管理员主界面");
				apl.remove(aat);
				apl.add(aui.operationJpanel);
				aui.searchButton.setEnabled(true);
				aui.addaccountButton.setEnabled(true);
				aui.accountField.setEditable(true);
				aui.outjButton.setEnabled(true);
				apl.repaint();
			}
		});
		
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(true){
					aat.miMaTishi.setForeground(Color.RED);
					aat.xinMingTiShi.setForeground(Color.RED);
					aat.dianHuaTiShi.setForeground(Color.RED);
					aat.shenFenZhengHaoMaTiShi.setForeground(Color.RED);
					
				}
				
			}
		});
	}
	public void paintComponent(Graphics g)  
	{  
			super.paintComponent(g);    
			g.drawImage(frameIcon.getImage(),-7,-12,null);
	 }
	
}

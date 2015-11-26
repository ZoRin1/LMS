package presentation.bhclerkui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import businesslogic.documentsbl.createDocument;
import vo.documentsVO.LoadingVO;


public class LoadingJpanel extends JPanel{
	private JLabel code;
	private JLabel code1;
	private JLabel doName;
//	private JLabel OrgCode;
//	private JLabel orgcode;
	private JLabel departure;
	private JTextField depart;
	private JLabel arrival;
	private JTextField arrive;
	private JLabel jianzhuang;
	private JTextField jianzhuangyuan;
	private JLabel yayun;
	private JTextField yayunyuan;
	private JLabel carcode;
	private JTextField Carcode;
	private JLabel TCode;
	private JTextArea tcode;
	//此处节省时间先不用列表显示
	private JLabel charge;
	private JTextField chargearea;
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	private ImageIcon yesIcon=new ImageIcon("picture/确定.png");
	public LoadingJpanel(bhclerkui ui,bhclerkJpanel bhclerkJpanel) {
		init();
		ui.setTitle("营业厅业务员-装车单创建");
		bhclerkJpanel.add(this);
		registListener(ui,bhclerkJpanel,this);
	}
	public void init(){
		Font font=new Font("幼圆",Font.BOLD,24);
		code=new JLabel("单据编号：");
		code.setForeground(Color.white);
		code.setFont(font);
		code.setBounds(30,30,125,27);
		this.add(code);
		
		code1=new JLabel();
		code1.setText(new createDocument().createDocument("装车单"));
		code1.setForeground(Color.white);
		code1.setFont(font);
		code1.setBounds(155,30,131,27);
		this.add(code1);
		
		doName=new JLabel("单据名：装车单");
		doName.setForeground(Color.white);
		doName.setFont(font);
		doName.setBounds(360,30,175,27);
		this.add(doName);
		
		departure=new JLabel("出发地：");
		departure.setForeground(Color.white);
		departure.setFont(font);
		departure.setBounds(30,97,100,27);
		this.add(departure);
		
		depart=new JTextField();
		depart.setBounds(130,97,125,27);
		depart.setFont(font);
		this.add(depart);
		
		arrival=new JLabel("到达地：");
		arrival.setForeground(Color.white);
		arrival.setFont(font);
		arrival.setBounds(360,97,100,27);
		this.add(arrival);
		
		arrive=new JTextField();
		arrive.setBounds(460,97,125,27);
		arrive.setFont(font);
		this.add(arrive);
		
		jianzhuang=new JLabel("监装员：");
		jianzhuang.setForeground(Color.white);
		jianzhuang.setFont(font);
		jianzhuang.setBounds(30,164,100,27);
		this.add(jianzhuang);
		
		jianzhuangyuan=new JTextField();
		jianzhuangyuan.setBounds(130,164,125,27);
		jianzhuangyuan.setFont(font);
		this.add(jianzhuangyuan);
		
		yayun=new JLabel("押运员：");
		yayun.setForeground(Color.white);
		yayun.setFont(font);
		yayun.setBounds(360,164,100,27);
		this.add(yayun);
		
		yayunyuan=new JTextField();
		yayunyuan.setBounds(460,164,125,27);
		yayunyuan.setFont(font);
		this.add(yayunyuan);
		
		carcode=new JLabel("车辆编号：");
		carcode.setForeground(Color.white);
		carcode.setFont(font);
		carcode.setBounds(30,231,125,27);
		this.add(carcode);
		
		Carcode=new JTextField();
		Carcode.setBounds(155,231,132,27);
		Carcode.setFont(font);
		this.add(Carcode);
		
		TCode=new JLabel("所有订单条形码号：");
		TCode.setForeground(Color.white);
		TCode.setFont(font);
		TCode.setBounds(30,298,225,27);
		this.add(TCode);
		
		tcode=new JTextArea();
		tcode.setBounds(255,298,143,108);
		tcode.setLineWrap(true);
		tcode.setFont(font);
		this.add(tcode);
		
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662,575,48,48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);
		
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(602, 575,48,48);
		yesButton.setContentAreaFilled(false);
		this.add(yesButton);
		
		this.setBounds(260, 60, 730,650);
		this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final bhclerkui ui,final bhclerkJpanel panel,final LoadingJpanel panel2){

		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ui.setTitle("营业厅业务员——装车单创建 1");
				panel.remove(panel2);
				panel.add(ui.operationJpanel);
				ui.carinformationbButton.setEnabled(true);
				ui.cashdocumentbButton.setEnabled(true);
				ui.documentreplyButton.setEnabled(true);
				ui.driverinformationbButton.setEnabled(true);
				ui.loaddocumentbButton.setEnabled(true);
				ui.acceptdocumentbButton.setEnabled(true);
				panel.repaint();
			}
		});
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	public void paintComponent(Graphics g)  
	{  
			super.paintComponent(g);    
			g.drawImage(frameIcon.getImage(),-7,-12,null);
	 }
}

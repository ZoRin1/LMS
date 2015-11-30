package presentation.icclerkui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import businesslogic.documentsbl.createDocument;

public class ZloadingJpanel extends JPanel{
	private JLabel code;
	private JLabel code1;
	private JLabel doName;
	private JLabel date;
	private JLabel date1;
	private JLabel departure;
	private JTextField depart;
	private JLabel arrival;
	private JTextField arrive;
	private JLabel transcode;
	private JTextField Transcode;
	private JLabel jianzhuangyuan;
	private JTextField name;
	private JLabel TCode;
	private JTextArea tcode;
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	private ImageIcon yesIcon=new ImageIcon("picture/确定.png");
	public ZloadingJpanel(icclerkui ui,icclerkJpanel panel,String state) {
		init(state);
		ui.setTitle("中转中心业务员-中转接收单创建");
		panel.add(this);
		registListener(ui,panel,this);
	}
	public void init(String state){
		Font font=new Font("幼圆",Font.BOLD,24);
		code=new JLabel("单据编号：");
		code.setForeground(Color.white);
		code.setFont(font);
		code.setBounds(30,30,125,27);
		this.add(code);
		
		code1=new JLabel();
		code1.setText(new createDocument().createDocument("营业厅装车单"));
		code1.setForeground(Color.white);
		code1.setFont(font);
		code1.setBounds(155,30,131,27);
		this.add(code1);
		
		doName=new JLabel("单据名：中转中心装运单");
		doName.setForeground(Color.white);
		doName.setFont(font);
		doName.setBounds(360,30,275,27);
		this.add(doName);

		date=new JLabel("收款日期:");
		date.setForeground(Color.white);
		date.setFont(font);
		date.setBounds(30,97,125,27);
		this.add(date);
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String riqi = dateFormat.format( now );
		date1=new JLabel(riqi);
		date1.setForeground(Color.white);
		date1.setFont(font);
		date1.setBounds(155,97,250,27);
		this.add(date1);
		
		departure=new JLabel("出发地：");
		departure.setForeground(Color.white);
		departure.setFont(font);
		departure.setBounds(30,164,100,27);
		this.add(departure);
		
		depart=new JTextField();
		depart.setBounds(130,164,125,27);
		depart.setFont(font);
		this.add(depart);
		
		arrival=new JLabel("到达地：");
		arrival.setForeground(Color.white);
		arrival.setFont(font);
		arrival.setBounds(360,164,100,27);
		this.add(arrival);
		
		arrive=new JTextField();
		arrive.setBounds(460,164,125,27);
		arrive.setFont(font);
		this.add(arrive);
		
		transcode=new JLabel();
		if(state.equals("特快专递"))
			transcode.setText("航班号：");
		else
			transcode.setText("车次号：");
		transcode.setForeground(Color.white);
		transcode.setFont(font);
		transcode.setBounds(30,231,100,27);
		this.add(transcode);
		
		Transcode=new JTextField();
		Transcode.setBounds(130,231,125,27);
		Transcode.setFont(font);
		this.add(Transcode);
		
		jianzhuangyuan=new JLabel("监装员：");
		jianzhuangyuan.setForeground(Color.white);
		jianzhuangyuan.setFont(font);
		jianzhuangyuan.setBounds(30,298,100,27);
		this.add(jianzhuangyuan);
		
		name=new JTextField();
		name.setBounds(130,298,125,27);
		name.setFont(font);
		this.add(name);
		
		TCode=new JLabel("所有订单条形码号：");
		TCode.setForeground(Color.white);
		TCode.setFont(font);
		TCode.setBounds(30,365,225,27);
		this.add(TCode);
		
		tcode=new JTextArea();
		tcode.setBounds(255,365,143,108);
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
	public void registListener(final icclerkui ui,final icclerkJpanel panel,final ZloadingJpanel panel2){
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ui.setTitle("中转中心业务员——中转接收单创建 ");
				panel.remove(panel2);
				panel.add(ui.operationJpanel);
				ui.b1.setEnabled(true);
				ui.b2.setEnabled(true);
				ui.b3.setEnabled(true);
				ui.b4.setEnabled(true);
				ui.b5.setEnabled(true);
				ui.b6.setEnabled(true);
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

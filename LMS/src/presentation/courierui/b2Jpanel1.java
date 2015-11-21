package presentation.courierui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class b2Jpanel1 extends JPanel{
	private JLabel dingdantiaoxingmahaoJLabel;
	private JTextField dingdantiaoxingmahaoField;
	private JButton serchButton;
	private JLabel dingdantiaoxingmaJLabel;
	private JLabel dingdantiaoxingmanumJLabel;
	private ImageIcon serchIcon=new ImageIcon("picture/搜索.png");
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	private ImageIcon yesIcon=new ImageIcon("picture/确定.png");
	public b2Jpanel1(courierui courierui,courierJpanel courierJpanel) {
		// TODO Auto-generated constructor stub
		init();
		courierui.setTitle("快递员——收件单创建 1");
	 	courierJpanel.add(this);
		registListener(courierui,courierJpanel,this);
	}
	private void init(){
		Font font=new Font("幼圆", Font.BOLD, 20);
		dingdantiaoxingmahaoJLabel=new JLabel("订单条形码号:");
		dingdantiaoxingmahaoJLabel.setForeground(Color.white);
		dingdantiaoxingmahaoJLabel.setFont(font);
		dingdantiaoxingmahaoJLabel.setBounds(100, 150, 150, 30);
		dingdantiaoxingmahaoField=new JTextField();
		dingdantiaoxingmahaoField.setFont(font);
		dingdantiaoxingmahaoField.setBounds(280, 150, 300, 30);
		dingdantiaoxingmaJLabel=new JLabel("订单条形码号:");
		dingdantiaoxingmaJLabel.setForeground(Color.white);
		dingdantiaoxingmaJLabel.setFont(font);
		dingdantiaoxingmaJLabel.setBounds(100, 350, 150, 30);
		dingdantiaoxingmanumJLabel=new JLabel();
		dingdantiaoxingmanumJLabel.setForeground(Color.white);
		dingdantiaoxingmanumJLabel.setFont(font);
		dingdantiaoxingmanumJLabel.setBounds(280, 350, 150, 30);
		serchButton=new JButton(serchIcon);
		serchButton.setContentAreaFilled(false);
		serchButton.setBounds(530, 230, 48, 48);
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(602, 575,48,48);
		yesButton.setContentAreaFilled(false);
		this.add(dingdantiaoxingmaJLabel);
		this.add(dingdantiaoxingmahaoField);
		this.add(dingdantiaoxingmahaoJLabel);
		this.add(dingdantiaoxingmanumJLabel);
		this.add(serchButton);
	 	this.setBounds(260, 30, 730,650);
	 	this.add(yesButton);
	 	this.add(returnButton);
	 	this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final courierui courierui,final courierJpanel courierJpanel,final b2Jpanel1 b2Jpanel1){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				courierui.setTitle("快递员界面");
				courierJpanel.remove(b2Jpanel1);
				courierJpanel.add(courierui.operationJpanel);
				courierui.orderfinishButton.setEnabled(true);
				courierui.orderfoundButton.setEnabled(true);
				courierui.documentreplyButton.setEnabled(true);
				courierJpanel.repaint();
			}
		});
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				courierui.setTitle("快递员——收件单创建 2");
				courierJpanel.remove(b2Jpanel1);
				new b2Jpanel2(courierui, courierJpanel, b2Jpanel1);
				courierJpanel.repaint();
			}
		});
	}
	public void paintComponent(Graphics g)  
{  
		super.paintComponent(g);    
		g.drawImage(frameIcon.getImage(),-7,-12,null);
 }
}
class b2Jpanel2 extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JLabel dingdantiaoxingmahaoJLabel;
	private JLabel dingdantiaoxingmahaonumJLabel;
	private JLabel shoujiandanbianhaoJLabel;
	private JLabel shoujiandanbianhaonumJLabel;
	private JLabel shoujianrenJLabel;
	private JTextField shoujianrenField;
	private JLabel shoujianriqiJLabel;
	private JLabel riqiJLabel;
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	private ImageIcon yesIcon=new ImageIcon("picture/确定.png");
	public b2Jpanel2(courierui courierui,courierJpanel courierJpanel,b2Jpanel1 b2Jpanel1) {
		// TODO Auto-generated constructor stub
		init();
	 	courierJpanel.add(this);
		registListener(courierui,courierJpanel,b2Jpanel1,this);
	}
	private void init(){
		Font font=new Font("幼圆", Font.BOLD, 20);
		dingdantiaoxingmahaoJLabel=new JLabel("订单条形码号:");
		dingdantiaoxingmahaoJLabel.setForeground(Color.white);
		dingdantiaoxingmahaoJLabel.setFont(font);
		dingdantiaoxingmahaoJLabel.setBounds(100,100, 150, 30);
		dingdantiaoxingmahaonumJLabel=new JLabel();
		dingdantiaoxingmahaonumJLabel.setForeground(Color.white);
		dingdantiaoxingmahaonumJLabel.setFont(font);
		dingdantiaoxingmahaonumJLabel.setBounds(280,100, 250, 30);
		shoujiandanbianhaoJLabel=new JLabel("收件单编号:");
		shoujiandanbianhaoJLabel.setForeground(Color.white);
		shoujiandanbianhaoJLabel.setFont(font);
		shoujiandanbianhaoJLabel.setBounds(100, 200, 150, 30);
		shoujiandanbianhaonumJLabel=new JLabel();
		shoujiandanbianhaonumJLabel.setForeground(Color.white);
		shoujiandanbianhaonumJLabel.setFont(font);
		shoujiandanbianhaonumJLabel.setBounds(280, 200, 250, 30);
		shoujianrenJLabel=new JLabel("收件人:");
		shoujianrenJLabel.setForeground(Color.white);
		shoujianrenJLabel.setFont(font);
		shoujianrenJLabel.setBounds(100, 300, 100, 30);
		shoujianrenField=new JTextField();
		shoujianrenField.setFont(font);
		shoujianrenField.setBounds(280, 300, 150, 30);
		shoujianriqiJLabel=new JLabel("收件日期:");
		shoujianriqiJLabel.setForeground(Color.white);
		shoujianriqiJLabel.setFont(font);
		shoujianriqiJLabel.setBounds(100, 400, 100, 30);
		riqiJLabel=new JLabel();
		riqiJLabel.setForeground(Color.white);
		riqiJLabel.setFont(font);
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		String riqi = dateFormat.format( now );
		riqiJLabel.setText(riqi);
		riqiJLabel.setBounds(280, 400, 150, 30);
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(602, 575,48,48);
		yesButton.setContentAreaFilled(false);
	 	this.setBounds(260, 30, 730,650);
	 	this.add(dingdantiaoxingmahaoJLabel);
	 	this.add(dingdantiaoxingmahaonumJLabel);
	 	this.add(shoujiandanbianhaoJLabel);
	 	this.add(shoujiandanbianhaonumJLabel);
	 	this.add(shoujianrenField);
	 	this.add(shoujianrenJLabel);
	 	this.add(shoujianriqiJLabel);
	 	this.add(riqiJLabel);
	 	this.add(yesButton);
	 	this.add(returnButton);
	 	this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final courierui courierui,final courierJpanel courierJpanel,final b2Jpanel1 b2Jpanel1,final b2Jpanel2 b2Jpanel2){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				courierui.setTitle("快递员——收件单创建 1");
				courierJpanel.remove(b2Jpanel2);
				courierJpanel.add(b2Jpanel1);
				courierJpanel.repaint();
			}
		});
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new orderfinishDialog(courierui, "收件单创建完成", true);
				courierui.setTitle("快递员界面");
				courierJpanel.remove(b2Jpanel2);
				courierJpanel.add(courierui.operationJpanel);
				courierui.orderfinishButton.setEnabled(true);
				courierui.orderfoundButton.setEnabled(true);
				courierui.documentreplyButton.setEnabled(true);
				courierJpanel.repaint();
			}
		});
	}
	public void paintComponent(Graphics g)  
{  
		super.paintComponent(g);    
		g.drawImage(frameIcon.getImage(),-7,-12,null);
 }
}
class orderfinishDialog extends JDialog{
	private dialogJpanel jPanel;
	private JLabel jLabel;
	private JButton jButton;
	public orderfinishDialog(JFrame frame,String title,boolean modal) {
		super(frame,title,modal);
		init();
		registerListener();
		this.setVisible(true);
	}
	private void init(){
		ImageIcon yesIcon=new ImageIcon("picture/登录.png");
		jLabel=new JLabel("收件单创建完成",jLabel.CENTER);
		jLabel.setForeground(Color.white);
		jLabel.setFont(new Font("幼圆",Font.BOLD,27));
		jPanel=new dialogJpanel();
		jButton=new JButton(yesIcon);
		jButton.setContentAreaFilled(false);
		jPanel.setLayout(null);
		jButton.setBounds(218,160, 64, 64);
		jLabel.setBounds(0, 0, 500, 200);
		jPanel.add(jLabel);
		jPanel.add(jButton);
		this.add(jPanel);
		this.setSize(500, 300);
		Toolkit kitToolkit =Toolkit.getDefaultToolkit();
		Dimension screenSize=kitToolkit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int dialogWidth=this.getWidth();
		int dialogHeight=this.getHeight();
		this.setLocation((screenWidth-dialogWidth)/2, (screenHeight-dialogHeight)/2);
		this.setResizable(false);
	}
	private void registerListener(){
		jButton.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				orderfinishDialog.this.dispose();
			}
		});
	}
}
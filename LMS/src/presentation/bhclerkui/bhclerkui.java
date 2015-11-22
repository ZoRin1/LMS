package presentation.bhclerkui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import presentation.mainui.mainui;

public class bhclerkui extends JFrame{
	private String[] args;
	private JButton outjButton;
	private JButton loaddocumentbButton;
	private JButton cashdocumentbButton;
	private JButton acceptdocumentbButton;
	private JButton carinformationbButton;
	private JButton driverinformationbButton;
	private JButton documentreplyButton;
	private bhclerkOperationJpanel operationJpanel;
	private bhclerkJpanel bhclerkJpanel;
	public bhclerkui(String s,String[] args) {
		super(s);
		this.args=args;
		init();
		registListener(this);
	}
	private void init(){
		ImageIcon outIcon=new ImageIcon("picture/退出登录.png");
		ImageIcon driverinformationIcon=new ImageIcon("picture/司机信息管理.png");
		ImageIcon carinformationIcon=new ImageIcon("picture/车辆信息管理.png");
		ImageIcon acceptdocumentIcon=new ImageIcon("picture/接收与派件.png");
		ImageIcon cashdocumentIcon=new ImageIcon("picture/收款单创建.png");
		ImageIcon loaddocumentIcon=new ImageIcon("picture/装车单创建.png");
		ImageIcon documentreplyIcon=new ImageIcon("picture/单据反馈.png");
		outjButton=new JButton(outIcon);
		outjButton.setBounds(30, 620, 48,48);
		outjButton.setContentAreaFilled(false);
		loaddocumentbButton=new JButton(loaddocumentIcon);
		loaddocumentbButton.setContentAreaFilled(false);
		cashdocumentbButton=new JButton(cashdocumentIcon);
		cashdocumentbButton.setContentAreaFilled(false);
		acceptdocumentbButton=new JButton(acceptdocumentIcon);
		acceptdocumentbButton.setContentAreaFilled(false);
		carinformationbButton=new JButton(carinformationIcon);
		carinformationbButton.setContentAreaFilled(false);
		driverinformationbButton=new JButton(driverinformationIcon);
		driverinformationbButton.setContentAreaFilled(false);
		documentreplyButton=new JButton(documentreplyIcon);
		documentreplyButton.setContentAreaFilled(false);
		bhclerkJpanel=new bhclerkJpanel();
		operationJpanel=new bhclerkOperationJpanel(bhclerkJpanel);


		loaddocumentbButton.setBounds(30, 50,200, 50);
		cashdocumentbButton.setBounds(30,150,200, 50);
		acceptdocumentbButton.setBounds(30, 250, 200, 50);
		carinformationbButton.setBounds(30, 350, 200, 50);
		driverinformationbButton.setBounds(30, 450, 200, 50);
		documentreplyButton.setBounds(30,550 ,200, 50);
		bhclerkJpanel.add(outjButton);
		bhclerkJpanel.add(documentreplyButton);
		bhclerkJpanel.add(loaddocumentbButton);
		bhclerkJpanel.add(cashdocumentbButton);
		bhclerkJpanel.add(acceptdocumentbButton);
		bhclerkJpanel.add(carinformationbButton);
		bhclerkJpanel.add(driverinformationbButton);
		
		bhclerkJpanel.setLayout(null);
		
		this.add(bhclerkJpanel);
		this.setSize( 1024, 730);
		//居中
		Toolkit kitToolkit =Toolkit.getDefaultToolkit();
		Dimension screenSize=kitToolkit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int windowWidth=this.getWidth();
		int windowHeight=this.getHeight();
		this.setLocation((screenWidth-windowWidth)/2, (screenHeight-windowHeight)/2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//不允许窗口改变大小
		this.setResizable(false);
		this.setVisible(true);
	}
	private void registListener(final bhclerkui bhclerkui){
		outjButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
				new mainui().main(args);
				bhclerkui.dispose();
			}
		});
		documentreplyButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new documentreplyui("营业厅业务员——单据反馈", bhclerkui);
				bhclerkui.setVisible(false);
			}
		});
		loaddocumentbButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bhclerkJpanel.remove(operationJpanel);
				bhclerkui.carinformationbButton.setEnabled(false);
				bhclerkui.cashdocumentbButton.setEnabled(false);
				bhclerkui.documentreplyButton.setEnabled(false);
				bhclerkui.driverinformationbButton.setEnabled(false);
				bhclerkui.loaddocumentbButton.setEnabled(false);
				new LoadingJpanel(bhclerkui,bhclerkJpanel);
				
			}
		});
		acceptdocumentbButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bhclerkJpanel.remove(operationJpanel);
				bhclerkui.carinformationbButton.setEnabled(false);
				bhclerkui.cashdocumentbButton.setEnabled(false);
				bhclerkui.documentreplyButton.setEnabled(false);
				bhclerkui.driverinformationbButton.setEnabled(false);
				bhclerkui.loaddocumentbButton.setEnabled(false);
			}
		});
		cashdocumentbButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bhclerkJpanel.remove(operationJpanel);
				bhclerkui.carinformationbButton.setEnabled(false);
				bhclerkui.cashdocumentbButton.setEnabled(false);
				bhclerkui.documentreplyButton.setEnabled(false);
				bhclerkui.driverinformationbButton.setEnabled(false);
				bhclerkui.loaddocumentbButton.setEnabled(false);
			}
		});
		carinformationbButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bhclerkJpanel.remove(operationJpanel);
				bhclerkui.carinformationbButton.setEnabled(false);
				bhclerkui.cashdocumentbButton.setEnabled(false);
				bhclerkui.documentreplyButton.setEnabled(false);
				bhclerkui.driverinformationbButton.setEnabled(false);
				bhclerkui.loaddocumentbButton.setEnabled(false);
			}
		});
		driverinformationbButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bhclerkJpanel.remove(operationJpanel);
				bhclerkui.carinformationbButton.setEnabled(false);
				bhclerkui.cashdocumentbButton.setEnabled(false);
				bhclerkui.documentreplyButton.setEnabled(false);
				bhclerkui.driverinformationbButton.setEnabled(false);
				bhclerkui.loaddocumentbButton.setEnabled(false);
			}
		});
}
}
class bhclerkJpanel extends JPanel{
	private ImageIcon backgroundIcon=new ImageIcon("picture/背景.png");
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(backgroundIcon.getImage(),0,0,null);
     }
   }
class bhclerkOperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	public bhclerkOperationJpanel(bhclerkJpanel bhclerkJpanel) {
		// TODO Auto-generated constructor stub
		init();
		bhclerkJpanel.add(this);
	}
	private void init(){
		this.setBounds(260, 30, 730,650);
		this.setOpaque(false);
	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}

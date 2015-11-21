package presentation.financialstaffui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.CORBA.PRIVATE_MEMBER;

import presentation.mainui.mainui;

public class financialstaffui extends JFrame{
	private String[] args;
	private JButton outjButton;
	private financialstaffJpanel financialstaffJpanel;
	private financialstaffOperationJpanel operationJpanel;
	private JButton b1,b2,b3,b4,b5;
	public financialstaffui(String s,String [] args) {
		// TODO Auto-generated constructor stub
		super(s);
		this.args=args;
		init();
		registListener(this);
	}
	private void init(){
		financialstaffJpanel=new financialstaffJpanel();
		operationJpanel=new financialstaffOperationJpanel(financialstaffJpanel);
		
		ImageIcon b1imaIcon=new ImageIcon("picture/统计报表.png");
		ImageIcon b2imaIcon=new ImageIcon("picture/账户管理.png");
		ImageIcon b3imaIcon=new ImageIcon("picture/成本管理.png");
		ImageIcon b4imaIcon=new ImageIcon("picture/结算管理.png");
		ImageIcon b5imaIcon=new ImageIcon("picture/期初建账.png");

		b1=new JButton(b1imaIcon); 
		b2=new JButton(b2imaIcon);
		b3=new JButton(b3imaIcon);
		b4=new JButton(b4imaIcon);
		b5=new JButton(b5imaIcon);

		b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);
		b3.setContentAreaFilled(false);
		b4.setContentAreaFilled(false);
		b5.setContentAreaFilled(false);
		
		b1.setBounds(30, 100,200, 50);
		b2.setBounds(30, 200,200, 50);
		b3.setBounds(30, 300,200, 50);
		b4.setBounds(30, 400,200, 50);
		b5.setBounds(30, 500,200, 50);
		
		ImageIcon outIcon=new ImageIcon("picture/退出登录.png");
		outjButton=new JButton(outIcon);
		outjButton.setBounds(30, 620,  48,48);
		outjButton.setContentAreaFilled(false);
		 financialstaffJpanel.add(outjButton);
		financialstaffJpanel.add(b1);
		financialstaffJpanel.add(b2);
		financialstaffJpanel.add(b3);
		financialstaffJpanel.add(b4);
		financialstaffJpanel.add(b5);

		financialstaffJpanel.setLayout(null);
	
		this.add(financialstaffJpanel);
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
	private void registListener(final financialstaffui financialstaffui){
		outjButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
	
				new mainui().main(args);
				financialstaffui.dispose();
			}
		});
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new b1financialstaffui("财务人员——统计报表", financialstaffui);
				financialstaffui.setVisible(false);
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new b2financialstaffui("财务人员——账户管理", financialstaffui);
				financialstaffui.setVisible(false);
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new b3financialstaffui("财务人员——成本管理", financialstaffui);
				financialstaffui.setVisible(false);
			}
		});
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new b5financialstaffui("财务人员——期初建账", financialstaffui);
				financialstaffui.setVisible(false);
			}
		});
	}
}
class financialstaffJpanel extends JPanel{
	private ImageIcon backgroundIcon=new ImageIcon("picture/背景.png");
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(backgroundIcon.getImage(),0,0,null);
     }
   }
class financialstaffOperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	public financialstaffOperationJpanel(financialstaffJpanel financialstaffJpanel) {
		// TODO Auto-generated constructor stub
		init();
		financialstaffJpanel.add(this);
	}
	private void init(){
		this.setOpaque(false);
		this.setBounds(260, 30,730,650);
	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}
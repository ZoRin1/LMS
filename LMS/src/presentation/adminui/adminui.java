package presentation.adminui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.InitialContext;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import presentation.mainui.mainui;
import presentation.senderui.senderui;

public class adminui extends JFrame{
			private String[] args;
			private JTextField accountField;
			private JButton searchButton;
			private JLabel accountJLabel;
			private JButton addaccountButton;
			private adminJpanel adminJpanel;
			private adminOperationJpanel operationJpanel;
			private JButton outjButton;
			public adminui(String s,String[] args) {
				// TODO Auto-generated constructor stub
				super(s);
				this.args=args;
				init();
				registListener(this);
			}
			private void init() {
				// TODO Auto-generated method stub
				ImageIcon outIcon=new ImageIcon("picture/退出登录.png");
				ImageIcon searchIcon=new ImageIcon("picture/搜索.png");
				ImageIcon addaccountIcon=new ImageIcon("picture/新增帐号.png");
				accountField=new JTextField();
				accountField.setOpaque(false);
				accountField.setFont(new Font("幼圆",Font.BOLD,24));
				accountField.setForeground(Color.white);
				accountJLabel=new JLabel("帐号");
				searchButton=new JButton(searchIcon);
				addaccountButton=new JButton(addaccountIcon);
				addaccountButton.setBounds(30, 430, 200, 48);
				addaccountButton.setContentAreaFilled(false);
				outjButton=new JButton(outIcon);
				adminJpanel=new adminJpanel();
				operationJpanel=new adminOperationJpanel(adminJpanel);
				accountJLabel.setBounds(30, 150, 80, 30);
				accountField.setBounds(30, 200, 200, 30);
				searchButton.setBounds(180, 250, 48, 48);
				searchButton.setContentAreaFilled(false);

				outjButton.setBounds(30, 620, 48,48);
				outjButton.setContentAreaFilled(false);
				accountJLabel.setFont(new Font("幼圆",Font.BOLD, 30));
				accountJLabel.setForeground(Color.white);
				
				adminJpanel.add(outjButton);
				adminJpanel.add(accountJLabel);
				adminJpanel.add(addaccountButton);
				adminJpanel.add(accountField);
				adminJpanel.add(searchButton);
				
				adminJpanel.setLayout(null);
				this.add(adminJpanel);
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
			private void registListener(final adminui adminui){
				outjButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
					new mainui().main(args);
					adminui.dispose();
					}
				});
			}
}
class adminJpanel extends JPanel{
	private ImageIcon backgroundIcon=new ImageIcon("picture/背景.png");
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(backgroundIcon.getImage(),0,0,null);
     }
   }
class adminOperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	public adminOperationJpanel(adminJpanel adminJpanel) {
		// TODO Auto-generated constructor stub
		init();
		adminJpanel.add(this);
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

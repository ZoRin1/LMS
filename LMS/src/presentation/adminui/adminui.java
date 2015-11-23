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

import businesslogic.financebl.AccountManageModel.addAccountBL;
import presentation.mainui.mainui;
import presentation.senderui.senderui;

public class adminui extends JFrame{
			private String[] args;
			JTextField accountField;
			JButton searchButton;
			private JLabel accountJLabel;
			JButton addaccountButton;
			private adminJpanel adminJpanel;
			adminOperationJpanel operationJpanel;
			JButton outjButton;
			public adminui(String s,String[] args) {
				// TODO Auto-generated constructor stub
				super(s);
				this.args=args;
				init();
				registListener(this,adminJpanel);
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
				accountJLabel=new JLabel("请输入帐号");
				searchButton=new JButton(searchIcon);
				addaccountButton=new JButton(addaccountIcon);
				addaccountButton.setBounds(30, 430, 200, 48);
				addaccountButton.setContentAreaFilled(false);
				outjButton=new JButton(outIcon);
				adminJpanel=new adminJpanel();
				operationJpanel=new adminOperationJpanel(adminJpanel);
				accountJLabel.setBounds(30, 150, 200, 30);
				accountField.setBounds(30, 200, 200, 30);
				searchButton.setBounds(180, 250, 48, 48);
				searchButton.setContentAreaFilled(false);

				outjButton.setBounds(30, 620, 48,48);
				outjButton.setContentAreaFilled(false);
				accountJLabel.setFont(new Font("幼圆",Font.BOLD, 20));
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
			private void registListener(final adminui aui,final adminJpanel apl){
				outjButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
					new mainui().main(args);
					aui.dispose();
					}
				});
				
				addaccountButton.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						apl.remove(aui.operationJpanel);
						aui.searchButton.setEnabled(false);
						aui.addaccountButton.setEnabled(false);
						aui.accountField.setEditable(false);

						new AddAccount(aui, apl);
						aui.repaint();
					}
				}
					
				);
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
	private JLabel welcome1;
	private JLabel welcome2;
	public adminOperationJpanel(adminJpanel adminJpanel) {
		// TODO Auto-generated constructor stub
		init();
		adminJpanel.add(this);
	}
	private void init(){
		
		this.setLayout(null);

		Font font=new Font("幼圆",Font.BOLD,60);
		
		welcome1 = new JLabel("欢迎使用");
		welcome1.setFont(font);
		welcome1.setForeground(Color.WHITE);
		welcome1.setBounds(220, 200, 300, 100);
		this.add(welcome1);
		
		welcome2 = new JLabel("NJU物流管理系统");
		welcome2.setFont(font);
		welcome2.setForeground(Color.WHITE);
		welcome2.setBounds(110, 300, 700, 100);
		this.add(welcome2);
		this.setBounds(260, 30, 730,650);
		this.setOpaque(false);
	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}

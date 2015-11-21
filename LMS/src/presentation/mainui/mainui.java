package presentation.mainui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import presentation.adminui.adminui;
import presentation.bhclerkui.bhclerkui;
import presentation.courierui.courierui;
import presentation.financialstaffui.financialstaffui;
import presentation.icclerkui.icclerkui;
import presentation.icwarehousemanui.icwarehousemanui;
import presentation.senderui.senderui;
import presentation.topmanagerui.topmanagerui;

public class mainui  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new mainFrame("物流管理系统",args);
	}
}
class mainFrame extends JFrame{
	private JTextField codeJTextField; 
	private JTextField accountnumberJTextField;
	private JPasswordField passwordField;
	private JButton checkButton;
	private JButton loginButton;
	private JButton aboutButton;
	private JLabel numberIconJLabel;
	private JLabel numberJLabel,passwordJLabel,codeJLabel;
	private mainJpanel mainJPanel;
	private JLabel titleJLabel;
		public mainFrame(String s,String []args) {
			// TODO Auto-generated constructor stub
			super(s);
			init();
			//此方法为预览各个界面，之后删除
			preview(this,args);
			registerLister(this,args);
		}
		private void init() {
			ImageIcon titleIcon=new ImageIcon("picture/项目名.png");
			ImageIcon numberIcon=new ImageIcon("picture/帐号.png");
			ImageIcon logicIcon=new ImageIcon("picture/登录.png");
			ImageIcon checkIcon=new ImageIcon("picture/查询.png");
			ImageIcon aboutIcon=new ImageIcon("picture/关于.png");
			
			titleJLabel=new JLabel(titleIcon);
			titleJLabel.setBounds(0, 20, 1024, 150);
			numberIconJLabel=new JLabel(numberIcon);
			codeJTextField=new JTextField();
			codeJTextField.setOpaque(false);
			codeJTextField.setForeground(Color.white);
			codeJTextField.setFont(new Font("幼圆",Font.BOLD,24));
			accountnumberJTextField=new JTextField();
			accountnumberJTextField.setOpaque(false);
			accountnumberJTextField.setForeground(Color.white);
			accountnumberJTextField.setFont(new Font("幼圆",Font.BOLD,24));
			passwordField=new JPasswordField();
			passwordField.setOpaque(false);
			passwordField.setFont(new Font("幼圆",Font.BOLD,24));
			passwordField.setForeground(Color.white);
			passwordField.setEchoChar('*');
			checkButton=new JButton(checkIcon);
			loginButton=new JButton(logicIcon);
			aboutButton=new JButton(aboutIcon);
			aboutButton.setContentAreaFilled(false);
			loginButton.setContentAreaFilled(false);
			numberJLabel=new JLabel("帐号");
			passwordJLabel=new JLabel("密码");
			codeJLabel=new JLabel("物流查询");
			codeJLabel.setForeground(Color.white);
			codeJLabel.setFont(new Font("幼圆",Font.BOLD, 30));
			mainJPanel=new mainJpanel();
			numberJLabel.setFont(new Font("幼圆",Font.BOLD, 30));
			numberJLabel.setForeground(Color.white);
			passwordJLabel.setFont(new Font("幼圆",Font.BOLD, 30));
			passwordJLabel.setForeground(Color.white);

			checkButton.setContentAreaFilled(false);
			mainJPanel.setLayout(null);
			codeJTextField.setBounds(400, 240, 250, 30);
			codeJLabel.setBounds(250,240, 150, 30);
			accountnumberJTextField.setBounds(400, 350, 250, 30);
			passwordField.setBounds(400,400,250,30);
			checkButton.setBounds(710,220,64,64);
			loginButton.setBounds(590,460 , 64, 64);
			aboutButton.setBounds(840, 610, 150, 50);
			numberJLabel.setBounds(300, 350, 100, 30);
			numberIconJLabel.setBounds(220, 340,52, 52);
			passwordJLabel.setBounds(300, 400,100, 30);
			checkButton.setForeground(Color.RED);
			mainJPanel.add(numberIconJLabel);
			mainJPanel.add(codeJLabel);
			mainJPanel.add(codeJTextField);
			mainJPanel.add(accountnumberJTextField);
			mainJPanel.add(passwordField);
			mainJPanel.add(checkButton);
			mainJPanel.add(loginButton);
			mainJPanel.add(aboutButton);
			mainJPanel.add(numberJLabel);
			mainJPanel.add(passwordJLabel);
			mainJPanel.add(titleJLabel);
			this.setContentPane(mainJPanel);
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
		private void registerLister(final mainFrame mf,final String[] args) {
			loginButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			checkButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new senderui("物流信息查询",args);
					mf.dispose();
					
				}
			});
			aboutButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new aboutDialog(mf, "关于我们", true);
				}
			});
		}
		//此方法为预览各个界面，之后删除
		private void preview(final mainFrame mf,final String[] args){
			JLabel privewJLabel=new JLabel("预览界面");
			 JButton b1,b2,b3,b4,b5,b6,b7;
			b1=new JButton("admin");
			b2=new JButton("bhclerk");
			b3=new JButton("courier");
			b4=new JButton("financialstaff");
			b5=new JButton("icclerk");
			b6=new JButton("icwarehouseman");
			b7=new JButton("topmanager");
			mainJPanel.add(privewJLabel);
			mainJPanel.add(b1);
			mainJPanel.add(b2);
			mainJPanel.add(b3);
			mainJPanel.add(b4);
			mainJPanel.add(b5);
			mainJPanel.add(b6);
			mainJPanel.add(b7);
			privewJLabel.setBounds(420, 520, 200, 50);
			privewJLabel.setForeground(Color.white);
			privewJLabel.setFont(new Font("幼圆",Font.BOLD,36));
			b1.setBounds(150,600 , 80, 30);
			b2.setBounds(250,600 , 80, 30);
			b3.setBounds(350,600 , 80, 30);
			b4.setBounds(450,600 , 80, 30);
			b5.setBounds(550,600 , 80, 30);
			b6.setBounds(650,600 , 80, 30);
			b7.setBounds(750,600 , 80, 30);
b1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					new adminui("管理员界面",args);
					mf.dispose();
				}
			});
b2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					new bhclerkui("营业厅业务员界面",args);
					mf.dispose();
				}
			});
b3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		new courierui("快递员界面",args);
		mf.dispose();
	}
});
b4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		new financialstaffui("财务人员界面",args);
		mf.dispose();
	}
});
b5.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		new icclerkui("中转中心业务员界面",args);
		mf.dispose();
	}
});
b6.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		new icwarehousemanui("中转中心仓库管理员界面",args);
		mf.dispose();
	}
});
b7.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		new topmanagerui("总经理界面",args);
		mf.dispose();
	}
});
		}
}
class mainJpanel extends JPanel{
	private ImageIcon backgroundIcon=new ImageIcon("picture/背景.png");
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(backgroundIcon.getImage(),0,0,null);
      
     }
   }
class aboutDialog extends JDialog{
	private dialogJpanel jPanel;
	private JButton jButton;
	private JLabel jLabel;
	public aboutDialog(JFrame frame,String title,boolean modal) {
		super(frame,title,modal);
		init();
		registerListener();
		this.setVisible(true);
	}
	private void init(){
		ImageIcon yesIcon=new ImageIcon("picture/登录.png");
		jLabel=new JLabel("", JLabel.CENTER);
		jLabel.setText("<html>By:              <br> 杨关，杨华安，熊凯奇，王泽霖</html>"); 
		jLabel.setForeground(Color.white);
		jLabel.setFont(new Font("幼圆",Font.BOLD,27));
		jPanel=new dialogJpanel();
		jButton=new JButton(yesIcon);
		jButton.setContentAreaFilled(false);
		jPanel.setLayout(null);
		jButton.setBounds(218, 160, 64, 64);
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
				aboutDialog.this.dispose();
			}
		});
	}
}
class dialogJpanel extends JPanel{
	private ImageIcon dialogIcon=new ImageIcon("picture/背景.png");
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(dialogIcon.getImage(),0,0,null);
      
     }
   }
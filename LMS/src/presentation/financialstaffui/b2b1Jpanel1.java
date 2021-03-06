package presentation.financialstaffui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import businesslogic.financebl.AccountManageModel.AccountManageBL;
import vo.financeVO.AccountVO;

public class b2b1Jpanel1 extends JPanel{
	
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton,updateButton;
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	private JLabel j1;
	private b2b1Jpanel1JTable b2b1Jpanel1JTable;
	private ArrayList<AccountVO> accountInf;
	private JButton b2,b3,b4,b5;
	private b2financialstaffui b2financialstaffui;
	
	public b2b1Jpanel1(b2financialstaffui b2financialstaffui,financialstaffJpanel financialstaffJpanel,ArrayList<AccountVO> accountInf,
			JButton b2,JButton b3,JButton b4,JButton b5) {
		// TODO Auto-generated constructor stub
		this.b2financialstaffui = b2financialstaffui;
		this.accountInf = accountInf;
		this.b2 = b2;
		this.b3 = b3;
		this.b4 = b4;
		this.b5 = b5;
		init();
		financialstaffJpanel.add(this);
		registListener(b2financialstaffui,financialstaffJpanel,this);
	}
	private void init(){
		Font font=new Font("幼圆",Font.BOLD,20);
		ImageIcon i1 = new ImageIcon("picture/财务图片/账户管理.png");
		
		j1 = new JLabel(i1);
		j1.setBounds(0, 0, 722, 574);
		
		b2b1Jpanel1JTable = new b2b1Jpanel1JTable(b2financialstaffui,this,accountInf,b2,b3,b4,b5);

		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		
		updateButton = new JButton();//这里要加上48,48 的确定图片
		updateButton.setBounds(600, 575, 48, 48);    //要加上更新账户的监听
		updateButton.setContentAreaFilled(false);

		
	 	this.setBounds(260, 60, 730,650);

	 	j1.add(b2b1Jpanel1JTable.getScrollPane());
	 	this.add(j1);
	 	this.add(returnButton);
	 	this.add(updateButton);
	 	this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final b2financialstaffui b2financialstaffui,final financialstaffJpanel financialstaffJpanel,final b2b1Jpanel1 b2b1Jpanel1){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				financialstaffJpanel.remove(b2b1Jpanel1);
				financialstaffJpanel.add(b2financialstaffui.operationJpanel);
				financialstaffJpanel.remove(b2financialstaffui.b2);
				financialstaffJpanel.remove(b2financialstaffui.b3);
				financialstaffJpanel.remove(b2financialstaffui.b4);
				financialstaffJpanel.remove(b2financialstaffui.b5);
				financialstaffJpanel.add(b2financialstaffui.b1);
				financialstaffJpanel.repaint();
			}
		});
		updateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				new finishDialog(b2financialstaffui, "更新完成", true);
				AccountManageBL accountManageBL=new AccountManageBL();
				accountManageBL.UpdateAccount(accountInf);
				
			}
		});
	}
	public void paintComponent(Graphics g)  
{  
		super.paintComponent(g);    
		g.drawImage(frameIcon.getImage(),-7,-12,null);
 }
	class finishDialog extends JDialog{
		private dialogJpanel jPanel;
		private JLabel jLabel;
		private JButton jButton;
		public finishDialog(JFrame frame,String title,boolean modal) {
			super(frame,title,modal);
			init();
			registerListener();
			this.setVisible(true);
		}
		private void init(){
			ImageIcon yesIcon=new ImageIcon("picture/登录.png");
			jLabel=new JLabel("更新账户信息完成",jLabel.CENTER);
			jLabel.setForeground(Color.white);
			jLabel.setFont(new Font("幼圆",Font.BOLD,27));
			jPanel=new dialogJpanel();
			jButton=new JButton(yesIcon);
			jButton.setContentAreaFilled(false);
			jPanel.setLayout(null);
			jButton.setBounds(218,190, 64, 64);
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
					finishDialog.this.dispose();
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
}


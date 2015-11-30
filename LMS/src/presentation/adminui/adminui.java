package presentation.adminui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.naming.InitialContext;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import businesslogic.accountbl.AccountInfoController;
import businesslogic.financebl.AccountManageModel.addAccountBL;
import presentation.mainui.mainui;
import presentation.senderui.senderui;
import vo.accountVO.AccountNumberVO;

public class adminui extends JFrame{
			private String[] args;
			JTextField accountField;
			JButton searchButton;
			private JLabel accountJLabel;
			JButton addaccountButton;
			private adminJpanel adminJpanel;
			adminOperationJpanel operationJpanel;
			JButton outjButton;
			private JButton tuichuButton;
			private JButton zuixiaohuaButton;

			public adminui(String s,String[] args) {
				// TODO Auto-generated constructor stub
				super(s);
				this.args=args;
				init();
				registListener(this,adminJpanel);
			}
			private void init() {
				// TODO Auto-generated method stub
				ImageIcon outIcon=new ImageIcon("picture/�˳���¼.png");
				ImageIcon searchIcon=new ImageIcon("picture/����.png");
				ImageIcon addaccountIcon=new ImageIcon("picture/�����ʺ�.png");
				ImageIcon tuichuIcon=new ImageIcon("picture/�˳�.png");
				ImageIcon zuixiaohuaIcon=new ImageIcon("picture/��С��.png");
				zuixiaohuaButton=new JButton(zuixiaohuaIcon);
				zuixiaohuaButton.setBounds(904, 0, 50, 50);
				zuixiaohuaButton.setContentAreaFilled(false);
				zuixiaohuaButton.setBorderPainted(false);
				tuichuButton=new JButton(tuichuIcon);
				tuichuButton.setBounds(974, 0, 50, 50);
				tuichuButton.setContentAreaFilled(false);
				tuichuButton.setBorderPainted(false);
				accountField=new JTextField();
				accountField.setOpaque(false);
				accountField.setFont(new Font("��Բ",Font.BOLD,24));
				accountField.setForeground(Color.white);
				accountJLabel=new JLabel("�������ʺ�");
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

				outjButton.setBounds(30, 650, 48,48);
				outjButton.setContentAreaFilled(false);
				accountJLabel.setFont(new Font("��Բ",Font.BOLD, 20));
				accountJLabel.setForeground(Color.white);
				
				adminJpanel.add(outjButton);
				adminJpanel.add(accountJLabel);
				adminJpanel.add(addaccountButton);
				adminJpanel.add(accountField);
				adminJpanel.add(searchButton);
				adminJpanel.add(tuichuButton);
				adminJpanel.add(zuixiaohuaButton);
								
				adminJpanel.setLayout(null);
				this.add(adminJpanel);
				this.setSize( 1024, 730);
				//����
				Toolkit kitToolkit =Toolkit.getDefaultToolkit();
				Dimension screenSize=kitToolkit.getScreenSize();
				int screenWidth=screenSize.width;
				int screenHeight=screenSize.height;
				int windowWidth=this.getWidth();
				int windowHeight=this.getHeight();
				this.setLocation((screenWidth-windowWidth)/2, (screenHeight-windowHeight)/2);
				//�������ڸı��С
				
				
				
				this.setUndecorated(true);
				this.setResizable(false);
				this.setVisible(true);
			}
			private void registListener(final adminui aui,final adminJpanel apl){
				zuixiaohuaButton.addMouseListener(new MouseAdapter() {
					ImageIcon zuixiaohuaIcon=new ImageIcon("picture/��С��.png");
					ImageIcon zuixiaohuaIcon2=new ImageIcon("picture/��С��2.png");
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						zuixiaohuaButton.setIcon(zuixiaohuaIcon);
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						zuixiaohuaButton.setIcon(zuixiaohuaIcon2);
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						aui.setExtendedState(JFrame.ICONIFIED);
					}
				});
				tuichuButton.addMouseListener(new MouseAdapter() {
					ImageIcon tuichuIcon=new ImageIcon("picture/�˳�.png");
					ImageIcon tuichuIcon2=new ImageIcon("picture/�˳�2.png");
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						System.exit(0);	
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						tuichuButton.setIcon(tuichuIcon);
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						tuichuButton.setIcon(tuichuIcon2);
					}
				});
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
		
		
		searchButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//��ʱ���ã�����ʹ��ʱ����
//				String Id = accountField.getText();
//				long ID = Long.parseLong(Id);
//				AccountInfoController accountInfoController = new AccountInfoController();
//				String[] result = accountInfoController.getAccount(ID);
				String[]temp = {"1002356-���"};
				apl.remove(aui.operationJpanel);
				aui.searchButton.setEnabled(false);
				aui.addaccountButton.setEnabled(false);
				aui.accountField.setText("");
				aui.accountField.setEditable(false);
				new SearchAccount(aui, apl, temp);
				aui.repaint();
			}
		});
			}
}
class adminJpanel extends JPanel{
	private ImageIcon backgroundIcon=new ImageIcon("picture/����.png");
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(backgroundIcon.getImage(),0,0,null);
     }
   }
class adminOperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JLabel welcome1;
	private JLabel welcome2;
	
	public adminOperationJpanel(adminJpanel adminJpanel) {
		// TODO Auto-generated constructor stub
		init();
		adminJpanel.add(this);
		
	}
	private void init(){
		
		this.setLayout(null);

		Font font=new Font("��Բ",Font.BOLD,60);
		
		welcome1 = new JLabel("��ӭʹ��");
		welcome1.setFont(font);
		welcome1.setForeground(Color.WHITE);
		welcome1.setBounds(220, 200, 300, 100);
		this.add(welcome1);
		
		welcome2 = new JLabel("NJU��������ϵͳ");
		welcome2.setFont(font);
		welcome2.setForeground(Color.WHITE);
		welcome2.setBounds(110, 300, 700, 100);
		this.add(welcome2);
		this.setBounds(260, 60, 730,650);
		this.setOpaque(false);
		
		
		
	}

	
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}

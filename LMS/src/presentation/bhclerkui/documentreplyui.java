package presentation.bhclerkui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class documentreplyui extends JFrame{
	private bhclerkJpanel bhclerkJpanel;
	private bhclerkdocumentreplyOperationJpanel operationJpanel;
//	private JButton b1,b2,b3,b4;
	private JButton tuichuButton;
	private JButton zuixiaohuaButton;
	private String account;
	public documentreplyui(String s,bhclerkui bhclerkui,String account) {
		// TODO Auto-generated constructor stub
		super(s);
		this.account=account;
		init(bhclerkui);
		registListener(this);
	}
	private void registListener(final documentreplyui documentreplyui) {
		// TODO Auto-generated method stub
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
			documentreplyui.setExtendedState(JFrame.ICONIFIED);
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
}
private void init(bhclerkui bhclerkui){
	bhclerkJpanel=new bhclerkJpanel();
	operationJpanel=new bhclerkdocumentreplyOperationJpanel(bhclerkJpanel,bhclerkui,this,account);
//	ImageIcon b1Icon=new ImageIcon("picture/װ��������.png");
//	ImageIcon b2Icon=new ImageIcon("picture/�տ����.png");
//	ImageIcon b3Icon=new ImageIcon("picture/���յ�����.png");
//	ImageIcon b4Icon=new ImageIcon("picture/�ɼ�������.png");
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
//	b1=new JButton(b1Icon);
//	b2=new JButton(b2Icon);
//	b3=new JButton(b3Icon);
//	b4=new JButton(b4Icon);
//	b1.setBounds(30, 180,200, 50);
//	b2.setBounds(30, 280,200, 50);
//	b3.setBounds(30, 380, 200, 50);
//	b4.setBounds(30, 480,200,50);
//	b1.setContentAreaFilled(false);
//	b2.setContentAreaFilled(false);
//	b3.setContentAreaFilled(false);
//	b4.setContentAreaFilled(false);

//	bhclerkJpanel.add(b1);
//	bhclerkJpanel.add(b2);
//	bhclerkJpanel.add(b3);
//	bhclerkJpanel.add(b4);
	bhclerkJpanel.add(tuichuButton);
	bhclerkJpanel.add(zuixiaohuaButton);
	bhclerkJpanel.setLayout(null);

	this.add(bhclerkJpanel);
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
	this.setResizable(false);
	this.setUndecorated(true);
	this.setVisible(true);
}
	
}

class bhclerkdocumentreplyOperationJpanel extends JPanel{
	private JButton returnButton;
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private JLabel j1;
	private documentReplyJTable jtable;
	private String account;
	public bhclerkdocumentreplyOperationJpanel(bhclerkJpanel bhclerkJpanel,bhclerkui bhclerkui,documentreplyui documentreplyui,String account) {
		// TODO Auto-generated constructor stub
		this.account=account;
		init();
		registListener(bhclerkJpanel,bhclerkui, documentreplyui);
		bhclerkJpanel.add(this);
	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
	private void init(){
		Font font=new Font("��Բ",Font.BOLD,20);
		ImageIcon i1 = new ImageIcon("picture/����ͼƬ/���ݷ������.png");
		j1 = new JLabel(i1);
		j1.setBounds(0, 0, 720, 566);
		jtable=new documentReplyJTable(this,account);
		
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		
		this.setBounds(260, 60, 730,650);
		this.add(j1);
		this.add(returnButton);
		this.setLayout(null);
		this.setOpaque(false);
	}
	private void registListener(final bhclerkJpanel bhclerkJpanel,final bhclerkui bhclerkui,final documentreplyui documentreplyui){
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bhclerkui.setVisible(true);
				documentreplyui.dispose();				
			}
		});
	}
}

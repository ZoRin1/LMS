package presentation.icwarehousemanui;

import java.awt.Color;
import java.awt.Component;
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

import presentation.mainui.mainui;

public class icwarehousemanui extends JFrame{
	private JLabel warnJLabel;
	private String[] args;
	private JButton outjButton;
	private icwarehousemanJpanel icwarehousemanJpanel;
	public icwarehousemanJpanel getIcwarehousemanJpanel() {
		return icwarehousemanJpanel;
	}
	private icwarehousemanOperationJpanel operationJpanel;
	public icwarehousemanOperationJpanel getOperationJpanel() {
		return operationJpanel;
	}
	private JButton b1,b2,b3,b4,b5,b6;
	private JButton tuichuButton;
	private JButton zuixiaohuaButton;
	private checkDepotDialog check;
	//������2015/11/26����ӵĽ���
	private JLabel checkDepot;
	public icwarehousemanui(String s,String [] args) {
		// TODO Auto-generated constructor stub
		super(s);
		this.args=args;
		init();
		registListener(this);
	}
	private void init(){
		ImageIcon b1Icon=new ImageIcon("picture/����.png");
		ImageIcon b2Icon=new ImageIcon("picture/���.png");
		ImageIcon b3Icon=new ImageIcon("picture/����ѯ.png");
		ImageIcon b4Icon=new ImageIcon("picture/����̵�.png");
		ImageIcon b5Icon=new ImageIcon("picture/����������.png");
		ImageIcon b6Icon=new ImageIcon("picture/����ʼ��.png");
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
		icwarehousemanJpanel=new icwarehousemanJpanel();
		operationJpanel=new icwarehousemanOperationJpanel(icwarehousemanJpanel);
		warnJLabel=new JLabel();
		warnJLabel.setOpaque(true);
		//��汨����������ӷ����ı�
		warnJLabel.setBackground(Color.GREEN);
		b1=new JButton(b1Icon);
		b2=new JButton(b2Icon);
		b3=new JButton(b3Icon);
		b4=new JButton(b4Icon);
		b5=new JButton(b5Icon);
		b6=new JButton(b6Icon);
		b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);
		b3.setContentAreaFilled(false);
		b4.setContentAreaFilled(false);
		b5.setContentAreaFilled(false);
		b6.setContentAreaFilled(false);

		b1.setBounds(30,120,200, 50);
		b2.setBounds(30,210,200, 50);
		b3.setBounds(30, 300,200, 50);
		b4.setBounds(30, 390,200, 50);
		b5.setBounds(30,480 , 200, 50);
		b6.setBounds(30, 570, 200, 50);

		warnJLabel.setBounds(30,60, 30, 30);
		ImageIcon outIcon=new ImageIcon("picture/�˳���¼.png");
		outjButton=new JButton(outIcon);
		outjButton.setBounds(30, 650,  48,48);
		outjButton.setContentAreaFilled(false);
		 icwarehousemanJpanel.add(warnJLabel);
		 icwarehousemanJpanel.add(outjButton);
		icwarehousemanJpanel.add(b1);
		icwarehousemanJpanel.add(b2);
		icwarehousemanJpanel.add(b3);
		icwarehousemanJpanel.add(b4);
		icwarehousemanJpanel.add(b5);
		icwarehousemanJpanel.add(b6);
		icwarehousemanJpanel.add(tuichuButton);
		icwarehousemanJpanel.add(zuixiaohuaButton);
		icwarehousemanJpanel.setLayout(null);

		this.add(icwarehousemanJpanel);
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
	private void registListener(final icwarehousemanui icwarehousemanui){
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
				icwarehousemanui.setExtendedState(JFrame.ICONIFIED);
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
				icwarehousemanui.dispose();
			}
		});
	b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new b1icwarehousemanui("��ת���Ĳֿ����Ա��������", icwarehousemanui);
				icwarehousemanui.setVisible(false);
			}
		});
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new b2icwarehousemanui("��ת���Ĳֿ����Ա�������", icwarehousemanui);
			icwarehousemanui.setVisible(false);
		}
	});
	b3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO �Զ����ɵķ���
			check = new checkDepotDialog(icwarehousemanui);
		}
	});
	}
}
class icwarehousemanJpanel extends JPanel{
	private ImageIcon backgroundIcon=new ImageIcon("picture/����.png");
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(backgroundIcon.getImage(),0,0,null);
     }
   }
class icwarehousemanOperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	public icwarehousemanOperationJpanel(icwarehousemanJpanel icwarehousemanJpanel) {
		// TODO Auto-generated constructor stub
		init();
		icwarehousemanJpanel.add(this);
	}
	private void init(){
		this.setOpaque(false);
		this.setBounds(260, 60, 730,650);

	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}
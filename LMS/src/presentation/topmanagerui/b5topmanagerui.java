package presentation.topmanagerui;

import java.awt.Color;
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
import javax.swing.JPanel;

public class b5topmanagerui extends JFrame{
	private topmanagerJpanel topmanagerJpanel;
	private topmanagerb5OperationJpanel operationJpanel;
	private JButton b1,b2;
	private JButton tuichuButton;
	private JButton zuixiaohuaButton;
	public b5topmanagerui(String s,topmanagerui tmui) {
		// TODO Auto-generated constructor stub
		super(s);
		init(tmui);
		registListener(this);
	}
	private void registListener(final b5topmanagerui b5topmanagerui) {
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
				b5topmanagerui.setExtendedState(JFrame.ICONIFIED);
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
	private void init(topmanagerui topmanagerui){
		topmanagerJpanel=new topmanagerJpanel();
		operationJpanel=new topmanagerb5OperationJpanel(topmanagerJpanel,topmanagerui,this);
		ImageIcon b1Icon=new ImageIcon("picture/���볣��.png");
		ImageIcon b2Icon=new ImageIcon("picture/�ɱ�����.png");
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
		b1=new JButton(b1Icon);
		b2=new JButton(b2Icon);
		b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);
		b1.setBounds(30, 230,200, 50);
		b2.setBounds(30, 430,200, 50);
		topmanagerJpanel.add(b1);
		topmanagerJpanel.add(b2);
		topmanagerJpanel.add(tuichuButton);
		topmanagerJpanel.add(zuixiaohuaButton);
		topmanagerJpanel.setLayout(null);
		this.add(topmanagerJpanel);
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
class topmanagerb5OperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	public topmanagerb5OperationJpanel(topmanagerJpanel topmanagerJpanel,topmanagerui topmanagerui,b5topmanagerui b5topmanagerui) {
		// TODO Auto-generated constructor stub
		init();
		topmanagerJpanel.add(this);
		registListener(topmanagerui, b5topmanagerui);
	}
	private void init(){
		ImageIcon returnIcon=new ImageIcon("picture/����.png");
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575, 48,48);
		returnButton.setContentAreaFilled(false);
		this.setBounds(260, 60,730,650);
		this.setOpaque(false);
		this.setLayout(null);
		this.add(returnButton);
	}
	private void registListener(final topmanagerui tmui,final b5topmanagerui b5tmui){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tmui.setVisible(true);
				b5tmui.dispose();
				
			}
		});
	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}


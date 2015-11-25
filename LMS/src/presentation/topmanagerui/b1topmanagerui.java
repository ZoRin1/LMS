package presentation.topmanagerui;

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
import javax.swing.JLabel;
import javax.swing.JPanel;

import presentation.financialstaffui.financialstaffui;

public class b1topmanagerui extends JFrame{
	topmanagerJpanel topmanagerJpanel;
	topmanagerb1OperationJpanel operationJpanel;
	JButton b1,b2,b3,b4,b5,b6;

	public b1topmanagerui(String s,topmanagerui tui) {
		// TODO Auto-generated constructor stub
		super(s);
		init(tui);	
		registListener(tui,topmanagerJpanel,this);
	}
	private void init(topmanagerui topmanagerui){
		topmanagerJpanel=new topmanagerJpanel();
		operationJpanel=new topmanagerb1OperationJpanel(topmanagerJpanel,topmanagerui,this);
		ImageIcon b1Icon=new ImageIcon("picture/���Ա.png");
		ImageIcon b2Icon=new ImageIcon("picture/Ӫҵ��ҵ��Ա.png");
		ImageIcon b3Icon=new ImageIcon("picture/��ת����ҵ��Ա.png");
		ImageIcon b4Icon=new ImageIcon("picture/��ת���Ĳֿ����Ա.png");
		ImageIcon b5Icon=new ImageIcon("picture/������Ա.png");
		ImageIcon b6Icon=new ImageIcon("picture/����Ա.png");
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

		b1.setBounds(30, 80,200, 50);
		b2.setBounds(30,180,200, 50);
		b3.setBounds(30,280,200, 50);
		b4.setBounds(30,380,200, 50);
		b5.setBounds(30,480,200, 50);
		b6.setBounds(30,580,200, 50);
		topmanagerJpanel.add(b1);
		topmanagerJpanel.add(b2);
		topmanagerJpanel.add(b3);
		topmanagerJpanel.add(b4);
		topmanagerJpanel.add(b5);
		topmanagerJpanel.add(b6);

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
	
	private void registListener(final topmanagerui tui,final topmanagerJpanel tjpl,final b1topmanagerui b1ui){
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(b1ui.operationJpanel);
				b1ui.setTitle("���ÿ��Ա���ʲ���");
				b1ui.b1.setEnabled(false);
				b1ui.b2.setEnabled(false);
				b1ui.b3.setEnabled(false);
				b1ui.b4.setEnabled(false);
				b1ui.b5.setEnabled(false);
				b1ui.b6.setEnabled(false);
				
				new Salary(tui,tjpl,b1ui);
				b1ui.repaint();
				
				
			}
		});
		

		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(b1ui.operationJpanel);
				b1ui.setTitle("����Ӫҵ��ҵ��Ա���ʲ���");
				b1ui.b1.setEnabled(false);
				b1ui.b2.setEnabled(false);
				b1ui.b3.setEnabled(false);
				b1ui.b4.setEnabled(false);
				b1ui.b5.setEnabled(false);
				b1ui.b6.setEnabled(false);
				
				new Salary(tui,tjpl,b1ui);
				b1ui.repaint();
				
				
			}
		});


		
		b3.addActionListener(new ActionListener() {	    
			@Override	
			public void actionPerformed(ActionEvent e) {
		
				// TODO Auto-generated method stub
		
				tjpl.remove(b1ui.operationJpanel);
				b1ui.setTitle("������ת����ҵ��Ա���ʲ���");
				b1ui.b1.setEnabled(false);
				b1ui.b2.setEnabled(false);
				b1ui.b3.setEnabled(false);
				b1ui.b4.setEnabled(false);		
				b1ui.b5.setEnabled(false);		
				b1ui.b6.setEnabled(false);		
		
				new Salary(tui,tjpl,b1ui);
				b1ui.repaint();
			}
		});



		b4.addActionListener(new ActionListener() {
	
	
			@Override	
			public void actionPerformed(ActionEvent e) {		
				// TODO Auto-generated method stub		
				tjpl.remove(b1ui.operationJpanel);
				b1ui.setTitle("������ת���Ĳֿ����Ա���ʲ���");
				b1ui.b1.setEnabled(false);		
				b1ui.b2.setEnabled(false);						
				b1ui.b3.setEnabled(false);	
				b1ui.b4.setEnabled(false);		
				b1ui.b5.setEnabled(false);		
				b1ui.b6.setEnabled(false);				
		
				new Salary(tui,tjpl,b1ui);	
				b1ui.repaint();
			}
		});

		b5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(b1ui.operationJpanel);
				b1ui.setTitle("���ò�����Ա���ʲ���");
				b1ui.b1.setEnabled(false);
				b1ui.b2.setEnabled(false);
				b1ui.b3.setEnabled(false);
				b1ui.b4.setEnabled(false);
				b1ui.b5.setEnabled(false);	
				b1ui.b6.setEnabled(false);

				new Salary(tui,tjpl,b1ui);
				b1ui.repaint();
			}
		});

		b6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(b1ui.operationJpanel);
				b1ui.setTitle("����ϵͳ����Ա���ʲ���");
				b1ui.b6.setEnabled(false);
				b1ui.b2.setEnabled(false);
				b1ui.b3.setEnabled(false);
				b1ui.b4.setEnabled(false);
				b1ui.b5.setEnabled(false);
				b1ui.b1.setEnabled(false);

				new Salary(tui,tjpl,b1ui);
				b1ui.dispose();	
			}
		});

	}

}
class topmanagerb1OperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	public topmanagerb1OperationJpanel(topmanagerJpanel topmanagerJpanel,topmanagerui topmanagerui,b1topmanagerui b1topmanagerui) {
		// TODO Auto-generated constructor stub
		init();
		topmanagerJpanel.add(this);
		registListener(topmanagerui, b1topmanagerui);
	}
	private void init(){
		this.setLayout(null);

		Font font=new Font("��Բ",Font.BOLD,50);
		
		JLabel welcome = new JLabel("��ѡ��Ա������");
		welcome.setFont(font);
		welcome.setForeground(Color.WHITE);
		welcome.setBounds(200, 200, 400, 100);
		this.add(welcome);
		
		this.setBounds(260, 60, 730,650);
		this.setOpaque(false);
		ImageIcon returnIcon=new ImageIcon("picture/����.png");
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575, 48,48);
		returnButton.setContentAreaFilled(false);
		this.setOpaque(false);
		this.setLayout(null);
		this.add(returnButton);
	}
	private void registListener(final topmanagerui tmui,final b1topmanagerui b1tmui){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tmui.setVisible(true);
				b1tmui.dispose();
				
			}
		});
	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}
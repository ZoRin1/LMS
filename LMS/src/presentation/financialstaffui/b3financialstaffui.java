package presentation.financialstaffui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class b3financialstaffui extends JFrame{
	private financialstaffJpanel financialstaffJpanel;
	financialstaffb3OperationJpanel operationJpanel;
	JButton b1;
	JButton b2;
	public b3financialstaffui(String s,financialstaffui fsui) {
		// TODO Auto-generated constructor stub
		super(s);
		init(fsui);
		registListener(this,financialstaffJpanel);
	}
	private void registListener(
			final b3financialstaffui b3financialstaffui,
			final financialstaffJpanel financialstaffJpanel) {
		// TODO Auto-generated method stub
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new b3b1Jpanel1(b3financialstaffui, financialstaffJpanel);
				financialstaffJpanel.remove(operationJpanel);
				b1.setEnabled(false);
				b2.setEnabled(false);
				financialstaffJpanel.repaint();
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new b3b2Jpanel1(b3financialstaffui, financialstaffJpanel);
				financialstaffJpanel.remove(operationJpanel);
				b1.setEnabled(false);
				b2.setEnabled(false);
				financialstaffJpanel.repaint();
			}
		});
	}
	private void init(financialstaffui fsui){
		financialstaffJpanel=new financialstaffJpanel();
		operationJpanel=new financialstaffb3OperationJpanel(financialstaffJpanel,fsui,this);
		ImageIcon b1Icon=new ImageIcon("picture/�½����.png");
		ImageIcon b2Icon=new ImageIcon("picture/���ݷ���.png");
		ImageIcon returnIcon=new ImageIcon("picture/����.png");

		b1=new JButton(b1Icon);
		b2=new JButton(b2Icon);
		b1.setBounds(30, 230,200, 50);
		b2.setBounds(30, 430,200, 50);
		b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);
		financialstaffJpanel.add(b1);
		financialstaffJpanel.add(b2);
		financialstaffJpanel.setLayout(null);

		this.add(financialstaffJpanel);
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
class financialstaffb3OperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	public financialstaffb3OperationJpanel(financialstaffJpanel financialstaffJpanel,financialstaffui fsui,b3financialstaffui b3fsui) {
		// TODO Auto-generated constructor stub
		init();
		financialstaffJpanel.add(this);
		registListener(fsui, b3fsui);
	}
	private void init(){
		ImageIcon returnIcon=new ImageIcon("picture/����.png");
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575, 48,48);
		returnButton.setContentAreaFilled(false);	
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(260, 60,730,650);
		this.add(returnButton);
	}
	private void registListener(final financialstaffui fsui,final b3financialstaffui b3fsui){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fsui.setVisible(true);
				b3fsui.dispose();
		
			}
		});
	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
	
}
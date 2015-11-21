package presentation.courierui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class documentreplyui extends JFrame{

	private courierJpanel courierJpanel;
	 courierdocumentreplyOperationJpanel operationJpanel;
	 JButton b1,b2;
	public documentreplyui(String s,courierui courierui) {
		// TODO Auto-generated constructor stub
		super(s);
		init(courierui);
		registListener(this,courierJpanel);
	}
	private void init(courierui courierui){
		courierJpanel=new courierJpanel();
		operationJpanel=new courierdocumentreplyOperationJpanel(courierJpanel,courierui,this);


		ImageIcon b1Icon=new ImageIcon("picture/寄件单反馈.png");
		ImageIcon b2Icon=new ImageIcon("picture/收件单反馈.png");
		b1=new JButton(b1Icon);
		b2=new JButton(b2Icon);
		b1.setBounds(30, 200,200, 50);
		b2.setBounds(30, 400,200, 50);
		b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);

		courierJpanel.add(b1);
		courierJpanel.add(b2);


		courierJpanel.setLayout(null);

		this.add(courierJpanel);
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
	private void registListener(final documentreplyui documentreplyui,final courierJpanel courierJpanel) {
		// TODO Auto-generated method stub
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				courierJpanel.remove(documentreplyui.operationJpanel);
				documentreplyui.b1.setEnabled(false);
				documentreplyui.b2.setEnabled(false);
				new documentb1Jpanel1(documentreplyui,courierJpanel);
				courierJpanel.repaint();
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				courierJpanel.remove(documentreplyui.operationJpanel);
				documentreplyui.b1.setEnabled(false);
				documentreplyui.b2.setEnabled(false);
				new documentb2Jpanel1(documentreplyui,courierJpanel);
				courierJpanel.repaint();
			}
		});
	}
	
}
class courierdocumentreplyOperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	public courierdocumentreplyOperationJpanel(courierJpanel courierJpanel,courierui courierui,documentreplyui documentreplyui) {
		// TODO Auto-generated constructor stub
		init();
	 	courierJpanel.add(this);
		registListener(courierui, documentreplyui);
	}
	private void init(){
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
	 	this.setBounds(260, 30, 730,650);
	 	this.add(returnButton);
	 	this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final courierui courierui,final documentreplyui documentreplyui){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				courierui.setVisible(true);
				documentreplyui.dispose();
				
			}
		});
	}
	public void paintComponent(Graphics g)  
{  
		super.paintComponent(g);    
		g.drawImage(frameIcon.getImage(),-7,-12,null);
 }
}


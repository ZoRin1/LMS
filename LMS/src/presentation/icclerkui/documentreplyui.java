package presentation.icclerkui;

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

	private icclerkJpanel icclerkJpanel;
	private icclerkdocumentreplyOperationJpanel operationJpanel;
	private JButton b1,b2,b3;
	public documentreplyui(String s,icclerkui icclerkui) {
		// TODO Auto-generated constructor stub
		super(s);
		init(icclerkui);
	}
	private void init(icclerkui icclerkui){
		icclerkJpanel=new icclerkJpanel();
		operationJpanel=new icclerkdocumentreplyOperationJpanel(icclerkJpanel,icclerkui,this);
		ImageIcon b1Icon=new ImageIcon("picture/接收单反馈.png");
		ImageIcon b2Icon=new ImageIcon("picture/装车单反馈.png");
		ImageIcon b3Icon=new ImageIcon("picture/装运单反馈.png");
		b1=new JButton(b1Icon);
		b2=new JButton(b2Icon);
		b3=new JButton(b3Icon);
		b1.setBounds(30, 180,200, 50);
		b2.setBounds(30, 280,200, 50);
		b3.setBounds(30, 380, 200, 50);
		b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);
		b3.setContentAreaFilled(false);
		icclerkJpanel.add(b1);
		icclerkJpanel.add(b2);
		icclerkJpanel.add(b3);
		icclerkJpanel.setLayout(null);
		this.add(icclerkJpanel);
		this.setSize( 1024, 730);
		//居中
		Toolkit kitToolkit =Toolkit.getDefaultToolkit();
		Dimension screenSize=kitToolkit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int windowWidth=this.getWidth();
		int windowHeight=this.getHeight();
		this.setLocation((screenWidth-windowWidth)/2, (screenHeight-windowHeight)/2);
		//不允许窗口改变大小
		this.setResizable(false);
		this.setUndecorated(true);
		this.setVisible(true);
	}

	}
class icclerkdocumentreplyOperationJpanel extends JPanel{
	private JButton returnButton;
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	public icclerkdocumentreplyOperationJpanel(icclerkJpanel icclerkJpanel,icclerkui icclerkui,documentreplyui documentreplyui) {
		// TODO Auto-generated constructor stub
		init();
		icclerkJpanel.add(this);
		registListener(icclerkui, documentreplyui);
	}
	private void init(){
		ImageIcon returnIcon=new ImageIcon("picture/返回.png");
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);
		this.setBounds(260, 60, 730,650);
		this.setOpaque(false);
		this.setLayout(null);
	}
	private void registListener(final icclerkui icclerkui,final documentreplyui documentreplyui){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				icclerkui.setVisible(true);
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

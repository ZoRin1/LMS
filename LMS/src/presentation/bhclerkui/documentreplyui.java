package presentation.bhclerkui;

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
private bhclerkJpanel bhclerkJpanel;
private bhclerkdocumentreplyOperationJpanel operationJpanel;
private JButton b1,b2,b3,b4;
public documentreplyui(String s,bhclerkui bhclerkui) {
	// TODO Auto-generated constructor stub
	super(s);
	init(bhclerkui);
}
private void init(bhclerkui bhclerkui){
	bhclerkJpanel=new bhclerkJpanel();
	operationJpanel=new bhclerkdocumentreplyOperationJpanel(bhclerkJpanel,bhclerkui,this);
	ImageIcon b1Icon=new ImageIcon("picture/装车单反馈.png");
	ImageIcon b2Icon=new ImageIcon("picture/收款单反馈.png");
	ImageIcon b3Icon=new ImageIcon("picture/接收单反馈.png");
	ImageIcon b4Icon=new ImageIcon("picture/派件单反馈.png");
	b1=new JButton(b1Icon);
	b2=new JButton(b2Icon);
	b3=new JButton(b3Icon);
	b4=new JButton(b4Icon);
	b1.setBounds(30, 150,200, 50);
	b2.setBounds(30, 250,200, 50);
	b3.setBounds(30, 350, 200, 50);
	b4.setBounds(30, 450,200,50);
	b1.setContentAreaFilled(false);
	b2.setContentAreaFilled(false);
	b3.setContentAreaFilled(false);
	b4.setContentAreaFilled(false);

	bhclerkJpanel.add(b1);
	bhclerkJpanel.add(b2);
	bhclerkJpanel.add(b3);
	bhclerkJpanel.add(b4);

	bhclerkJpanel.setLayout(null);

	this.add(bhclerkJpanel);
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
}

class bhclerkdocumentreplyOperationJpanel extends JPanel{
	private JButton returnButton;
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	public bhclerkdocumentreplyOperationJpanel(bhclerkJpanel bhclerkJpanel,bhclerkui bhclerkui,documentreplyui documentreplyui) {
		// TODO Auto-generated constructor stub
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
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		this.setBounds(260, 30, 730,650);
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

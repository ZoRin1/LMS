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
import javax.swing.JPanel;


public class b4topmanagerui extends JFrame{
		private topmanagerJpanel topmanagerJpanel;
		private topmanagerb4OperationJpanel operationJpanel;
		private JButton b1,b2;
		public b4topmanagerui(String s,topmanagerui tmui) {
			// TODO Auto-generated constructor stub
			super(s);
			init(tmui);
		}
		private void init(topmanagerui topmanagerui){
			topmanagerJpanel=new topmanagerJpanel();
			operationJpanel=new topmanagerb4OperationJpanel(topmanagerJpanel,topmanagerui,this);
			ImageIcon b1Icon=new ImageIcon("picture/经营情况.png");
			ImageIcon b2Icon=new ImageIcon("picture/成本收益.png");
			b1=new JButton(b1Icon);
			b2=new JButton(b2Icon);
			b1.setContentAreaFilled(false);
			b2.setContentAreaFilled(false);
			b1.setBounds(30, 200,200, 50);
			b2.setBounds(30, 400,200, 50);
			topmanagerJpanel.add(b1);
			topmanagerJpanel.add(b2);
			topmanagerJpanel.setLayout(null);
			this.add(topmanagerJpanel);
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
class topmanagerb4OperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	public topmanagerb4OperationJpanel(topmanagerJpanel topmanagerJpanel,topmanagerui topmanagerui,b4topmanagerui b4topmanagerui) {
		// TODO Auto-generated constructor stub
		init();
		topmanagerJpanel.add(this);
		registListener(topmanagerui, b4topmanagerui);
	}
	private void init(){
		ImageIcon returnIcon=new ImageIcon("picture/返回.png");
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575, 48,48);
		returnButton.setContentAreaFilled(false);
		this.setBounds(260, 30,730,650);
		this.setOpaque(false);
		this.setLayout(null);
		this.add(returnButton);
	}
	private void registListener(final topmanagerui tmui,final b4topmanagerui b4tmui){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tmui.setVisible(true);
				b4tmui.dispose();
				
			}
		});
	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}

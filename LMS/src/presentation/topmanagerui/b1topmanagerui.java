package presentation.topmanagerui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class b1topmanagerui extends JFrame{
	private topmanagerJpanel topmanagerJpanel;
	private topmanagerb1OperationJpanel operationJpanel;
	private JButton b1,b2,b3,b4,b5,b6;

	public b1topmanagerui(String s,topmanagerui tmui) {
		// TODO Auto-generated constructor stub
		super(s);
		init(tmui);
	}
	private void init(topmanagerui topmanagerui){
		topmanagerJpanel=new topmanagerJpanel();
		operationJpanel=new topmanagerb1OperationJpanel(topmanagerJpanel,topmanagerui,this);
		ImageIcon b1Icon=new ImageIcon("picture/快递员.png");
		ImageIcon b2Icon=new ImageIcon("picture/营业厅业务员.png");
		ImageIcon b3Icon=new ImageIcon("picture/中转中心业务员.png");
		ImageIcon b4Icon=new ImageIcon("picture/中转中心仓库管理员.png");
		ImageIcon b5Icon=new ImageIcon("picture/财务人员.png");
		ImageIcon b6Icon=new ImageIcon("picture/管理员.png");
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

		b1.setBounds(30, 50,200, 50);
		b2.setBounds(30,150,200, 50);
		b3.setBounds(30,250,200, 50);
		b4.setBounds(30,350,200, 50);
		b5.setBounds(30,450,200, 50);
		b6.setBounds(30,550,200, 50);
		topmanagerJpanel.add(b1);
		topmanagerJpanel.add(b2);
		topmanagerJpanel.add(b3);
		topmanagerJpanel.add(b4);
		topmanagerJpanel.add(b5);
		topmanagerJpanel.add(b6);

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
class topmanagerb1OperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	public topmanagerb1OperationJpanel(topmanagerJpanel topmanagerJpanel,topmanagerui topmanagerui,b1topmanagerui b1topmanagerui) {
		// TODO Auto-generated constructor stub
		init();
		topmanagerJpanel.add(this);
		registListener(topmanagerui, b1topmanagerui);
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
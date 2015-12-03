package presentation.icwarehousemanui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class b1Jpanel1 extends JPanel{
	
	
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton,b1;
	private JLabel j1;
	private JTextField t1;
	private JButton yesButton;
	
	public b1Jpanel1(b1icwarehousemanui ui,icwarehousemanJpanel icwarehousemanJpanel) {
		// TODO Auto-generated constructor stub
		init();
		icwarehousemanJpanel.add(this);
		registListener(ui,icwarehousemanJpanel,this);
	}
	
	private void init(){
		Font font=new Font("幼圆", Font.BOLD, 20);
		ImageIcon returnIcon=new ImageIcon("picture/返回.png");
		ImageIcon i1 = new ImageIcon("picture/搜索.png");
		ImageIcon yesIcon=new ImageIcon("picture/确定.png");
		
		returnButton=new JButton(returnIcon);
		j1 = new JLabel("订单条形码号:");
		j1.setForeground(Color.white);
		j1.setFont(font);
		j1.setBounds(100, 150, 150, 30);
		
		b1 = new JButton(i1);
		b1.setContentAreaFilled(false);
		b1.setBounds(530, 230, 48, 48);
		
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(602, 575,48,48);
		yesButton.setContentAreaFilled(false);
		
		t1 = new JTextField();
		t1.setForeground(Color.black);
		t1.setFont(new Font("幼圆",Font.BOLD,24));
		t1.setBounds(280, 150, 300, 30);
		t1.addKeyListener(new KeyAdapter() {
			
			public void keyTyped(KeyEvent e) {
				int keyChar = e.getKeyChar();
				if(keyChar>=KeyEvent.VK_0&&keyChar<=KeyEvent.VK_9){
					
				}else{
					e.consume();
				}
			}
		});
		
		this.add(j1);
		this.add(t1);
		this.add(b1);
	 	this.add(yesButton);
		
		
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);
		this.setOpaque(false);
		this.setBounds(260, 60, 730,650);
		this.setLayout(null);
	}
	
	private void registListener(final b1icwarehousemanui ui,final icwarehousemanJpanel icwarehousemanJpanel,final b1Jpanel1 b1Jpanel1){
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				icwarehousemanJpanel.remove(b1Jpanel1);
				icwarehousemanJpanel.add(ui.getOperationJpanel());
				ui.getB1().setEnabled(true);
				ui.getB2().setEnabled(true);
				icwarehousemanJpanel.repaint();
			}
		});
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				icwarehousemanJpanel.remove(b1Jpanel1);
				new b1Jpanel2(ui, icwarehousemanJpanel);
				icwarehousemanJpanel.repaint();	
			}
		});
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				System.out.println("啦啦啦");
			}
		});
	}
	
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}

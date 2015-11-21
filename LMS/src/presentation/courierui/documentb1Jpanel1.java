package presentation.courierui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class documentb1Jpanel1 extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	public documentb1Jpanel1(documentreplyui documentreplyui,courierJpanel courierJpanel) {
		// TODO Auto-generated constructor stub
		init();
		documentreplyui.setTitle("快递员——单据反馈——寄件单反馈 1");
	 	courierJpanel.add(this);
		registListener(documentreplyui,courierJpanel,this);
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
	private void registListener(final documentreplyui documentreplyui,final courierJpanel courierJpanel,final documentb1Jpanel1 documentb1Jpanel1){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				documentreplyui.setTitle("快递员——单据反馈");
				courierJpanel.remove(documentb1Jpanel1);
				courierJpanel.add(documentreplyui.operationJpanel);
				documentreplyui.b1.setEnabled(true);
				documentreplyui.b2.setEnabled(true);			
				courierJpanel.repaint();
			}
		});
		
	}
	public void paintComponent(Graphics g)  
{  
		super.paintComponent(g);    
		g.drawImage(frameIcon.getImage(),-7,-12,null);
 }
}
class documentb1Jpanel2 extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	public documentb1Jpanel2(documentreplyui documentreplyui,courierJpanel courierJpanel,documentb1Jpanel1 documentb1Jpanel1) {
		// TODO Auto-generated constructor stub
		init();
		documentreplyui.setTitle("快递员——单据反馈——寄件单反馈 2");
	 	courierJpanel.add(this);
		registListener(documentreplyui,courierJpanel,documentb1Jpanel1,this);
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
	private void registListener(final documentreplyui documentreplyui,final courierJpanel courierJpanel,final documentb1Jpanel1 documentb1Jpanel1,final documentb1Jpanel2 documentb1Jpanel2){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				documentreplyui.setTitle("快递员——单据反馈——寄件单反馈 1");
				courierJpanel.remove(documentb1Jpanel2);
				courierJpanel.add(documentb1Jpanel1);	
				courierJpanel.repaint();
			}
		});
		
	}
	public void paintComponent(Graphics g)  
{  
		super.paintComponent(g);    
		g.drawImage(frameIcon.getImage(),-7,-12,null);
 }
}

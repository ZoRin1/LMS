package presentation.icwarehousemanui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class checkDepotDialog {
	JDialog checkDepot;
	JButton b1,b2;
	JTextField startTime,endTime;
	JLabel start,end;
	JPanel panel;
	ImageIcon checkIcon,b1Icon,b2Icon;
	
	public checkDepotDialog(JFrame ui){
	    checkIcon = new ImageIcon("picture/库存查询框.png");
	    b1Icon = new ImageIcon("picture/确定.png");
	    b2Icon = new ImageIcon("picture/取消.png");
		checkDepot = new JDialog(ui,"时间段输入",true);
		b1 = new JButton(b1Icon);
		b2 = new JButton(b2Icon);
		start = new JLabel();
		start.setText("起始时间:");
		start.setForeground(Color.black);
		start.setFont(new Font("幼圆",Font.BOLD,20));
		end = new JLabel();
		end.setText("终止时间:");
		end.setForeground(Color.black);
		end.setFont(new Font("幼圆",Font.BOLD,20));
		startTime = new JTextField();
		endTime = new JTextField();
		startTime.setForeground(Color.black);
		endTime.setForeground(Color.black);
		startTime.setFont(new Font("幼圆",Font.BOLD,20));
		endTime.setFont(new Font("幼圆",Font.BOLD,20));
		startTime.setBounds(150, 60, 200, 24);
		endTime.setBounds(150, 130, 200, 24);
		checkDepot.setBounds(830, 400, 450, 249);
		//checkDepot.setLocationRelativeTo(null);
		
		panel = new tempJpanel();
		panel.setLayout(null);
		panel.add(b1);
		panel.add(b2);
		panel.add(start);
		panel.add(end);
		panel.add(startTime);
		panel.add(endTime);
		b1.setBounds(250, 180, 72, 24);
		b2.setBounds(350, 180, 72, 24);
		start.setBounds(40, 50, 180, 40);
		end.setBounds(40, 120, 180, 40);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				checkDepot.setVisible(false);
			}
		});
		checkDepot.add(panel);
		checkDepot.setUndecorated(true);
		checkDepot.setVisible(true);
	}
	
	
	
	private class tempJpanel extends JPanel{
		public tempJpanel(){
			
		}
		
		public void paintComponent(Graphics g){
		    super.paintComponent(g);  
			g.drawImage(checkIcon.getImage(),0,0,null);
		}
	}
}

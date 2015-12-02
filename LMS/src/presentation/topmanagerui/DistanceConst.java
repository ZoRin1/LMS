package presentation.topmanagerui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import businesslogic.transportationbl.TransportationController;

public class DistanceConst extends JPanel {
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JLabel daBiaoTi,qiDian,zhongDian,juLi;
	private JTextField juLiF;
	
	private JButton yesButton,returnButton;
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	private ImageIcon yesIcon=new ImageIcon("picture/确定.png");
	
	public DistanceConst(b5topmanagerui b5ui,topmanagerJpanel tjpl){
		init();
		tjpl.add(this);
	}
	private void init(){
		
		Font big = new Font("幼圆", Font.BOLD, 35);
		Font small = new Font("幼圆", Font.BOLD, 30);
		TransportationController transportationController = new TransportationController();
		
		daBiaoTi = new JLabel("请选择路线并设定距离");
		daBiaoTi.setFont(big);
		daBiaoTi.setForeground(Color.WHITE);
		daBiaoTi.setBounds(90, 100, 400, 100);
		this.add(daBiaoTi);
		
		qiDian = new JLabel("起点城市:");
		qiDian.setFont(small);
		qiDian.setForeground(Color.WHITE);
		qiDian.setBounds(150, 200, 160, 60);
		this.add(qiDian);
		
		String[] qiDianC = transportationController.getCityList(null);
		JComboBox qiDianCity = new JComboBox(qiDianC);
		qiDianCity.setFont(small);
		qiDianCity.setForeground(Color.BLACK);
		qiDianCity.setBounds(320, 200, 200, 60);
		this.add(qiDianCity);
		
		zhongDian = new JLabel("终点城市:");
		zhongDian.setFont(small);
		zhongDian.setForeground(Color.WHITE);
		zhongDian.setBounds(150, 280, 160, 60);
		this.add(zhongDian);
		
		String[] zhongDianC = transportationController.getCityList(null);
		JComboBox zhongDianCity = new JComboBox(zhongDianC);
		zhongDianCity.setFont(small);
		zhongDianCity.setForeground(Color.BLACK);
		zhongDianCity.setBounds(320, 280, 200, 60);
		this.add(zhongDianCity);
		
		juLi = new JLabel("距离：");
		juLi.setFont(small);
		juLi.setForeground(Color.WHITE);
		
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(300, 480,48,48);
		yesButton.setContentAreaFilled(false);	 	 	
	 	this.add(yesButton);
		
		returnButton=new JButton(returnIcon);		
		returnButton.setBounds(400, 480,48,48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);
		
		this.setBounds(260, 60, 730,650);	 
		this.setOpaque(false);
		this.setLayout(null);
	}
	
	
	
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }

}

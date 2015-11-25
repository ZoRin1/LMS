package presentation.topmanagerui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.InitialContext;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Salary extends JPanel {
	private JLabel tiShi,anYue,yuanMeiYue,jiCi,yuanMeiCi,tiCheng,baiFenHao;
	private JTextField anYueF,jiCiF,tiChengF;
	
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	
	public Salary(topmanagerui tui,topmanagerJpanel tjpl,b1topmanagerui b1ui) {
		init();
		tjpl.add(this);
		registListener(tjpl, b1ui, this);
		
		
	}
	
	private void init() {
	
		
		
		Font big = new Font("��Բ", Font.BOLD, 40);
		Font small = new Font("��Բ", Font.BOLD, 32);
		
		tiShi = new JLabel("��ѡ���ʲ��Բ�������ֵ");
		tiShi.setForeground(Color.WHITE);
		tiShi.setFont(big);
		tiShi.setBounds(50, 112, 550, 45);
		this.add(tiShi);
		
		anYue = new JLabel("*���£�");
		anYue.setForeground(Color.WHITE);
		anYue.setFont(small);
		anYue.setBounds(170, 240, 120, 43);
		this.add(anYue);
		
		anYueF = new JTextField();
		anYueF.setFont(small);
		anYueF.setBounds(280, 240, 150, 43);
		this.add(anYueF);
		
		yuanMeiYue = new JLabel("Ԫ/��");
		yuanMeiYue.setForeground(Color.WHITE);
		yuanMeiYue.setFont(small);
		yuanMeiYue.setBounds(450, 240, 93, 43);
		this.add(yuanMeiYue);
		
		jiCi = new JLabel("*�ƴΣ�");
		jiCi.setForeground(Color.WHITE);
		jiCi.setFont(small);
		jiCi.setBounds(170, 310, 120, 43);
		this.add(jiCi);
		
		jiCiF = new JTextField();
		jiCiF.setFont(small);
		jiCiF.setBounds(280, 310, 150, 43);
		this.add(jiCiF);
		
		yuanMeiCi = new JLabel("Ԫ/��");
		yuanMeiCi.setForeground(Color.WHITE);
		yuanMeiCi.setFont(small);
		yuanMeiCi.setBounds(450, 310, 93, 43);
		this.add(yuanMeiCi);
		
		tiCheng = new JLabel("*��ɣ�");
		tiCheng.setForeground(Color.WHITE);
		tiCheng.setFont(small);
		tiCheng.setBounds(170, 380, 120, 43);
		this.add(tiCheng);
		
		tiChengF = new JTextField();
		tiChengF.setFont(small);
		tiChengF.setBounds(280, 380, 150, 43);
		this.add(tiChengF);
		
		baiFenHao = new JLabel("%");
		baiFenHao.setForeground(Color.WHITE);
		baiFenHao.setFont(small);
		baiFenHao.setBounds(450, 380, 93, 43);
		this.add(baiFenHao);
		
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(300, 480,48,48);
		yesButton.setContentAreaFilled(false);	 	 	
	 	this.add(yesButton);
		
		returnButton=new JButton(returnIcon);		
		returnButton.setBounds(400, 480,48,48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);
		
		
		
		this.setBounds(260, 60, 730,650);	 	
		
	 	this.setLayout(null);
		this.setOpaque(false);	
	 
	 	
		
	}

	
	private void registListener(final topmanagerJpanel tjpl,final b1topmanagerui b1ui,final Salary salary) {
		
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b1ui.setTitle("�ܾ���--���ʹ���");
				tjpl.remove(salary);
				tjpl.add(b1ui.operationJpanel);
				b1ui.b1.setEnabled(true);
				b1ui.b2.setEnabled(true);
				b1ui.b3.setEnabled(true);
				b1ui.b4.setEnabled(true);
				b1ui.b5.setEnabled(true);
				b1ui.b6.setEnabled(true);
				
				tjpl.repaint();
				
			}
		});
		
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b1ui.setTitle("�ܾ���--���ʹ���");
				tjpl.remove(salary);
				tjpl.add(b1ui.operationJpanel);
				
				JOptionPane.showMessageDialog(b1ui, "�޸ĳɹ�Ŷ��");
				b1ui.b1.setEnabled(true);
				b1ui.b2.setEnabled(true);
				b1ui.b3.setEnabled(true);
				b1ui.b4.setEnabled(true);
				b1ui.b5.setEnabled(true);
				b1ui.b6.setEnabled(true);
				tjpl.repaint();
			}
		});
	}
	public void paintComponent(Graphics g)  
	{  
			super.paintComponent(g);    
			g.drawImage(frameIcon.getImage(),-7,-12,null);
	 }

}

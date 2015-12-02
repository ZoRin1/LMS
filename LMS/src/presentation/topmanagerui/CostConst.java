package presentation.topmanagerui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import businesslogic.transportationbl.TransportationController;
import presentation.adminui.NumberFieldListener;

public class CostConst extends JPanel {
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JLabel daBiaoTi,qiChe,huoChe,feiJi,qiCheDanwei,huoCheDanWei,feiJiDanWei;
	private JTextField qiCheF,huoCheF,feiJiF;
	private JButton yesButton,returnButton;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	
	public CostConst(b5topmanagerui b5ui,topmanagerJpanel tjpl){
		init();
		tjpl.add(this);
		registListener(b5ui, tjpl, this);
	}
	
	private void init() {
		TransportationController transportationController = new TransportationController();
		
		Font big = new Font("��Բ", Font.BOLD, 35);
		Font small = new Font("��Բ", Font.BOLD, 25);
		
		daBiaoTi = new JLabel("�������µĳɱ�����");
		daBiaoTi.setForeground(Color.WHITE);
		daBiaoTi.setFont(big);
		daBiaoTi.setBounds(50, 112, 550, 45);
		this.add(daBiaoTi);
		
		qiChe = new JLabel("*������");
		qiChe.setForeground(Color.WHITE);
		qiChe.setFont(small);
		qiChe.setBounds(130, 240, 120, 43);
		this.add(qiChe);
		
		qiCheF = new JTextField(String.valueOf(transportationController.getCost(1)));
		qiCheF.setFont(small);
		qiCheF.setBounds(240, 240, 150, 43);
		qiCheF.addKeyListener(new NumberFieldListener());
		this.add(qiCheF);
		
		qiCheDanwei = new JLabel("Ԫ/(ǧ��*100����)");
		qiCheDanwei.setForeground(Color.WHITE);
		qiCheDanwei.setFont(small);
		qiCheDanwei.setBounds(410, 240, 230, 43);
		this.add(qiCheDanwei);
		
		huoChe = new JLabel("*�𳵣�");
		huoChe.setForeground(Color.WHITE);
		huoChe.setFont(small);
		huoChe.setBounds(130, 310, 120, 43);
		this.add(huoChe);
		
		huoCheF = new JTextField(String.valueOf(transportationController.getCost(2)));
		huoCheF.setFont(small);
		huoCheF.setBounds(240, 310, 150, 43);
		huoCheF.addKeyListener(new NumberFieldListener());
		this.add(huoCheF);
		
		huoCheDanWei = new JLabel("Ԫ/(ǧ��*100����)");
		huoCheDanWei.setForeground(Color.WHITE);
		huoCheDanWei.setFont(small);
		huoCheDanWei.setBounds(410, 310, 230, 43);
		this.add(huoCheDanWei);
		
		feiJi = new JLabel("*�ɻ���");
		feiJi.setForeground(Color.WHITE);
		feiJi.setFont(small);
		feiJi.setBounds(130, 380, 120, 43);
		this.add(feiJi);
		
		feiJiF = new JTextField(String.valueOf(transportationController.getCost(3)));
		feiJiF.setFont(small);
		feiJiF.setBounds(240, 380, 150, 43);
		feiJiF.addKeyListener(new NumberFieldListener());
		this.add(feiJiF);
		
		feiJiDanWei = new JLabel("Ԫ/(ǧ��*100����)");
		feiJiDanWei.setForeground(Color.WHITE);
		feiJiDanWei.setFont(small);
		feiJiDanWei.setBounds(410, 380, 230, 43);
		this.add(feiJiDanWei);
		
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
		
	private void registListener(final b5topmanagerui b5ui,final topmanagerJpanel tjpl,final CostConst costConst) {
		
		returnButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(costConst);
				tjpl.add(b5ui.operationJpanel);
				b5ui.b1.setEnabled(true);
				b5ui.b2.setEnabled(true);

				tjpl.repaint();

			}
		});

		yesButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(costConst);
				tjpl.add(b5ui.operationJpanel);
				
				//��ʱ���ã�����ʹ��ʱ����

//				TransportationController transportationController = new TransportationController();
//				transportationController.changeCost(1, Double.parseDouble(qiCheF.getText()));
//				transportationController.changeCost(2, Double.parseDouble(huoCheF.getText()));
//				transportationController.changeCost(3, Double.parseDouble(feiJiF.getText()));
			
				JOptionPane.showMessageDialog(b5ui, "�޸ĳɹ���");
				b5ui.b1.setEnabled(true);
				b5ui.b2.setEnabled(true);

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

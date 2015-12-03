package presentation.topmanagerui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

import businesslogic.transportationbl.TransportationController;
import presentation.adminui.NumberFieldListener;
import vo.transportationVO.RouteVO;

public class b5DistanceConst extends JPanel {
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JLabel daBiaoTi,qiDian,zhongDian,juLi;
	private JTextField juLiF;
	private JComboBox qiDianCity,zhongDianCity;
	
	private JButton yesButton,returnButton;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	
	public b5DistanceConst(b5topmanagerui b5ui,topmanagerJpanel tjpl){
		init();
		tjpl.add(this);
		registListener(b5ui, tjpl, this);
	}
	private void init(){
		
		Font big = new Font("��Բ", Font.BOLD, 35);
		Font small = new Font("��Բ", Font.BOLD, 30);
		TransportationController transportationController = new TransportationController();
		
		daBiaoTi = new JLabel("��ѡ��·�߲��趨����");
		daBiaoTi.setFont(big);
		daBiaoTi.setForeground(Color.WHITE);
		daBiaoTi.setBounds(90, 100, 400, 100);
		this.add(daBiaoTi);
		
		qiDian = new JLabel("������:");
		qiDian.setFont(small);
		qiDian.setForeground(Color.WHITE);
		qiDian.setBounds(150, 200, 160, 60);
		this.add(qiDian);
		
		String[] qiDianC = transportationController.getCityList(null);
	    qiDianCity = new JComboBox(qiDianC);
		qiDianCity.setFont(small);
		qiDianCity.setForeground(Color.BLACK);
		qiDianCity.setBounds(320, 200, 200, 50);
		this.add(qiDianCity);
		
		zhongDian = new JLabel("�յ����:");
		zhongDian.setFont(small);
		zhongDian.setForeground(Color.WHITE);
		zhongDian.setBounds(150, 280, 160, 60);
		this.add(zhongDian);
		
		String[] zhongDianC = transportationController.getCityList(null);
		zhongDianCity = new JComboBox(zhongDianC);
		zhongDianCity.setFont(small);
		zhongDianCity.setForeground(Color.BLACK);
		zhongDianCity.setBounds(320, 280, 200, 50);
		this.add(zhongDianCity);
		
		juLi = new JLabel("���룺");
		juLi.setFont(small);
		juLi.setForeground(Color.WHITE);
		juLi.setBounds(150, 350, 150, 50);
		this.add(juLi);
		
		juLiF = new JTextField("0.0");
		juLiF.setFont(small);
		juLiF.setForeground(Color.BLACK);
		juLiF.setBounds(320, 350, 200, 50);
		juLiF.addKeyListener(new NumberFieldListener());
		this.add(juLiF);
		
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
	
	private void registListener(final b5topmanagerui b5ui,final topmanagerJpanel tjpl,final b5DistanceConst distanceConst) {
		returnButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(distanceConst);
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
				tjpl.remove(distanceConst);
				tjpl.add(b5ui.operationJpanel);
				
				//��ʱ���ã�����ʹ��ʱ����
				TransportationController transportationController = new TransportationController();
				boolean b1 = qiDianCity.getSelectedItem().equals(zhongDianCity.getSelectedItem());
				boolean b2 = false;
				if (!b1) {
					RouteVO route = new RouteVO(qiDianCity.getSelectedItem() + "-" + zhongDianCity.getSelectedItem(), Double.parseDouble(juLiF.getText()));
					b2 = transportationController.changeDistance(route);
					
				}
				if (!b1 && b2) {
					JOptionPane.showMessageDialog(b5ui, "�޸ĳɹ���");
					b5ui.b1.setEnabled(true);
					b5ui.b2.setEnabled(true);

					tjpl.repaint();
				}else {
					JOptionPane.showMessageDialog(null, "�����к��յ���в�����ͬ");
					tjpl.remove(b5ui.operationJpanel);
					tjpl.add(distanceConst);
					tjpl.repaint();
				}

				
			}
		});
	}
	
	
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }

}

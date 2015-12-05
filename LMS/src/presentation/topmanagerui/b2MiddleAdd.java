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

import businesslogic.organizationbl.MiddleController;
import businesslogic.transportationbl.TransportationController;
import presentation.financialstaffui.financialstaffui;
import vo.orgVO.BussinessOrgVO;
import vo.orgVO.MiddleOrgVO;

public class b2MiddleAdd extends JPanel {
	
	private JLabel diQu;
	private JTextField diQuF;
	private JButton yesButton,returnButton;
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");	
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	
	public b2MiddleAdd(b2topmanagerui b2ui,topmanagerJpanel tjpl,String org){
		init();
		tjpl.add(this);
		registLIstener(b2ui, tjpl, this, org);
	}

	private void init() {
    	Font font = new Font("��Բ", Font.BOLD, 30);
    	
    	diQu = new JLabel("���ڳ���:");
    	diQu.setFont(font);
    	diQu.setForeground(Color.WHITE);
    	diQu.setBounds(100, 250, 180, 60);
    	this.add(diQu);
    	
    	diQuF = new JTextField();
    	diQuF.setFont(font);
    	diQuF.setForeground(Color.BLACK);
    	diQuF.setBounds(290, 250, 200, 60);
    	this.add(diQuF);
    	
    	
    	//��ʱ���ټ�ͼƬ
		returnButton = new JButton(returnIcon);
		returnButton.setBounds(500, 530, 48, 48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);

		yesButton = new JButton(yesIcon);
		yesButton.setBounds(350, 530, 48, 48);
		yesButton.setContentAreaFilled(false);
		this.add(yesButton);

		this.setBounds(260, 60, 730, 650);
		this.setLayout(null);
		this.setOpaque(false);
		
	}
	
	private void registLIstener(final b2topmanagerui b2ui,final topmanagerJpanel tjpl,final b2MiddleAdd b2MiddleAdd,final String org) {
		
		final TransportationController transportationController = new TransportationController();
		final MiddleController middleController = new MiddleController();
		
		returnButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(b2MiddleAdd);
				new b2SearchOrg(b2ui, tjpl, org);
				tjpl.repaint();
				
			}
		});
		
		yesButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String di = diQuF.getText();
				if (di.equals("")) {
					JOptionPane.showMessageDialog(null, "���������ڵ���");
				}
				
				if (!di.equals("")) {
					String bianHao = "";
					String mCity = diQuF.getText();
					if (transportationController.getCityList(null) != null) {
						String[] citys = transportationController.getCityList(null);
						int n = citys.length;
						boolean b = true;
						for(int i = 0; i < n; i ++){
							if (mCity.equals(citys[i])) {
								b = false;
							}
						}
						if (b) {
							if (n < 9) {
								bianHao = "00" + String.valueOf(n + 1);
							}else if (n < 99) {
								bianHao = "0" + String.valueOf(n + 1);
							}else {
								bianHao = String.valueOf(n + 1);
							}
							MiddleOrgVO vo = new MiddleOrgVO(mCity, bianHao, null, null, null);
							middleController.addMiddleOrg(bianHao, vo);
							JOptionPane.showMessageDialog(tjpl, "�����ɹ�,�������Ϊ" + bianHao);
							tjpl.remove(b2MiddleAdd);
							new b2SearchOrg(b2ui, tjpl, org);
							tjpl.repaint();
						}else {
							JOptionPane.showMessageDialog(null, "�ó����Ѵ��ڣ�����������");
						}
						
					}
			
					
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

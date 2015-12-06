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

import businesslogic.organizationbl.BusinessController;
import businesslogic.organizationbl.MiddleController;
import vo.orgVO.BussinessOrgVO;

public class b2BusinessAdd extends JPanel {
	
	private JLabel diQu,zhongZhuan;
	private JTextField diQuF,zhongZhuanF;
	private JButton yesButton,returnButton;
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");	
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	
	public b2BusinessAdd(b2topmanagerui b2ui,topmanagerJpanel tjpl,String org){
		init();
		tjpl.add(this);
		registListener(b2ui, tjpl, this, org);
	}
    private void init() {
    	Font font = new Font("��Բ", Font.BOLD, 30);
    	
    	diQu = new JLabel("���ڵ���:");
    	diQu.setFont(font);
    	diQu.setForeground(Color.WHITE);
    	diQu.setBounds(100, 150, 180, 60);
    	this.add(diQu);
    	
    	diQuF = new JTextField();
    	diQuF.setFont(font);
    	diQuF.setForeground(Color.BLACK);
    	diQuF.setBounds(290, 150, 200, 60);
    	this.add(diQuF);
    	
    	zhongZhuan = new JLabel("������ת���ı��:");
    	zhongZhuan.setFont(font);
    	zhongZhuan.setForeground(Color.WHITE);
    	zhongZhuan.setBounds(100, 250, 280, 60);
    	this.add(zhongZhuan);
    	
    	zhongZhuanF = new JTextField();
    	zhongZhuanF.setFont(font);
    	zhongZhuanF.setForeground(Color.BLACK);
    	zhongZhuanF.setBounds(390, 250, 200, 60);
    	this.add(zhongZhuanF);
    	
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
    
    private void registListener(final b2topmanagerui b2ui,final topmanagerJpanel tjpl,final b2BusinessAdd b2BusinessAdd,final String org) {
		
    	final MiddleController middleController = new MiddleController();
    	final BusinessController businessController = new BusinessController();
    	
    	returnButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(b2BusinessAdd);
				new b2SearchOrg(b2ui, tjpl, org);
				tjpl.repaint();
				
			}
		});

		yesButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String di = diQuF.getText();
				String zhong = zhongZhuanF.getText();
				if (zhong.equals("")) {
					JOptionPane.showMessageDialog(null, "������������ת���ı��");
				}
				if (di.equals("")) {
					JOptionPane.showMessageDialog(null, "���������ڵ���");
				}
				
				if ((!zhong.equals("")) && (!di.equals(""))) {
					String bianHao = "";
					if (middleController.getBussinessHallList(zhong) != null) {
						int n = middleController.getBussinessHallList(zhong).length;
						if (n < 9) {
							bianHao = "00" + String.valueOf(n + 1);
						}else if (n < 99) {
							bianHao = "0" + String.valueOf(n + 1);
						}else {
							bianHao = String.valueOf(n + 1);
						}
					}else {
						bianHao = "001";
					}
					String mCity = middleController.GetInfo(zhong);
					BussinessOrgVO vo = new BussinessOrgVO(mCity, di, bianHao, zhong, null, null, null, null);
					businessController.addBussinessHall(bianHao, vo);
					JOptionPane.showMessageDialog(tjpl, "�޸ĳɹ�,�������Ϊ" + bianHao);
					tjpl.remove(b2BusinessAdd);
					new b2SearchOrg(b2ui, tjpl, org);
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

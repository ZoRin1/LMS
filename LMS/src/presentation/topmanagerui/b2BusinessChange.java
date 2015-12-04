package presentation.topmanagerui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import businesslogic.accountbl.AccountInfoController;
import businesslogic.organizationbl.BusinessController;

public class b2BusinessChange extends JPanel {
	private JLabel suoShu,suoShuC,suoZai,bianHao,bianHaoC,kuaiDiYuan,yeWuYuan;
	private JTextField suoZaiF;
	private JComboBox kuaiDiYuanb,yeWuYuanb,kongXianK,kongXianY;
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	
	public b2BusinessChange(b2topmanagerui b2ui,topmanagerJpanel tjpl,String ID){
		init(ID);
		tjpl.add(this);
		registListener(b2ui, tjpl, this, ID);
	}
	
	private void init(String ID) {
		BusinessController businessController = new BusinessController();
		String[] temp = ID.split("-");
		Font bFont = new Font("��Բ", Font.BOLD, 30);
		Font sFont = new Font("��Բ", Font.BOLD, 20);
		
		suoShu = new JLabel("������ת���ı��:");
		suoShu.setFont(bFont);
		suoShu.setForeground(Color.WHITE);
		suoShu.setBounds(100, 70, 300, 50);
		this.add(suoShu);
		
		suoShuC = new JLabel(temp[0]);
		suoShuC.setFont(bFont);
		suoShuC.setForeground(Color.WHITE);
		suoShuC.setBounds(400, 70, 200, 50);
		this.add(suoShuC);
		
		suoZai = new JLabel("���ڵ���:");
		suoZai.setFont(bFont);
		suoZai.setForeground(Color.WHITE);
		suoZai.setBounds(100, 130, 180, 50);
		this.add(suoZai);
		
		suoZaiF = new JTextField(businessController.getInfo(ID));
		suoZaiF.setFont(bFont);
		suoZaiF.setForeground(Color.BLACK);
		suoZaiF.setBounds(290, 130, 150, 50);
		this.add(suoZaiF);
		
		bianHao = new JLabel("�������:");
		bianHao.setFont(bFont);
		bianHao.setForeground(Color.WHITE);
		bianHao.setBounds(100, 190, 200, 50);
		this.add(bianHao);
		
		bianHaoC = new JLabel(temp[1]);
		bianHaoC.setFont(bFont);
		bianHaoC.setForeground(Color.WHITE);
		bianHaoC.setBounds(290, 190, 180, 50);
		this.add(bianHaoC);
		
		kuaiDiYuan = new JLabel("���Ա�б�:");
		kuaiDiYuan.setFont(sFont);
		kuaiDiYuan.setForeground(Color.WHITE);
		kuaiDiYuan.setBounds(120, 260, 180, 40);
		this.add(kuaiDiYuan);
		
		yeWuYuan = new JLabel("ҵ��Ա�б�:");
		yeWuYuan.setFont(sFont);
		yeWuYuan.setForeground(Color.WHITE);
		yeWuYuan.setBounds(330, 260, 180, 40);
		this.add(yeWuYuan);
		
		String addCurier = "���ӿ��Ա";
		kuaiDiYuanb = new JComboBox(businessController.getCourierList(ID));
		kuaiDiYuanb.setFont(sFont);
		kuaiDiYuanb.setForeground(Color.BLACK);
		kuaiDiYuanb.setBounds(120, 310, 180, 40);
		kuaiDiYuanb.addItem(addCurier);
		kuaiDiYuanb.setSelectedIndex(-1);
		this.add(kuaiDiYuanb);
		
		String addAssisant = "����ҵ��Ա";
		yeWuYuanb = new JComboBox(businessController.getBussinessmanList(ID));
		yeWuYuanb.setFont(sFont);
		yeWuYuanb.setForeground(Color.BLACK);
		yeWuYuanb.setBounds(330, 310, 180, 40);
		yeWuYuanb.addItem(addAssisant);
		yeWuYuanb.setSelectedIndex(-1);
		this.add(yeWuYuanb);
		
		AccountInfoController accountInfoController = new AccountInfoController();
		kongXianK = new JComboBox(accountInfoController.getAccountList());
		kongXianK.setFont(sFont);
		kongXianK.setForeground(Color.BLACK);
		kongXianK.setBounds(120, 360, 180, 40);
		kongXianK.setVisible(false);
		kongXianK.setSelectedIndex(-1);
		this.add(kongXianK);
		
		kongXianY = new JComboBox(accountInfoController.getAccountList());
		kongXianY.setFont(sFont);
		kongXianY.setForeground(Color.BLACK);
		kongXianY.setBounds(330, 360, 180, 40);
		kongXianY.setVisible(false);
		kongXianY.setSelectedIndex(-1);
		this.add(kongXianY);
		
		
		//��ʱ���ټ�ͼƬ
		returnButton=new JButton(returnIcon);		
		returnButton.setBounds(450, 530,48,48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);
		
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(350, 530,48,48);
		yesButton.setContentAreaFilled(false);	 	 	
	 	this.add(yesButton);

		this.setBounds(260, 60, 730, 650);
		this.setLayout(null);
		this.setOpaque(false);
	}
	
	private void registListener(final b2topmanagerui b2ui,final topmanagerJpanel tjpl,final b2BusinessChange b2BusinessChange,final String ID) {
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(b2BusinessChange);
				new b2BusinessInfo(b2ui, tjpl, ID);
				tjpl.repaint();
			}
		});
		
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(tjpl, "�޸ĳɹ�");
				tjpl.remove(b2BusinessChange);
				new b2BusinessInfo(b2ui, tjpl, ID);
				tjpl.repaint();
			}
		});
		
		
		kuaiDiYuanb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				BusinessController businessController = new BusinessController();
				int state = e.getStateChange();
				if(state==ItemEvent.SELECTED){
					if (!kuaiDiYuanb.getSelectedItem().equals("���ӿ��Ա")) {
						Object[] options = { "ȷ��", "ȡ��" };
						int result = JOptionPane.showOptionDialog(null, "ɾ�����Ա", "ɾ���ÿ��Ա", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
						if (result == 0) {
							String temd = (String)kuaiDiYuanb.getSelectedItem();
							String[] Temp = temd.split("-");
							businessController.removeCourier(ID, Long.parseLong(Temp[0]));
							tjpl.remove(b2BusinessChange);
							new b2BusinessChange(b2ui, tjpl, ID);
							tjpl.repaint();														
						
						}
					}else {
						kongXianK.setVisible(true);
					}
					
				}
				
			}
		});
		
		kongXianK.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				BusinessController businessController = new BusinessController();
				int state = e.getStateChange();
				if(state==ItemEvent.SELECTED){
					String temp = (String) kongXianK.getSelectedItem();
					String[] arr = temp.split("-");
					businessController.addCourier(ID, Long.parseLong(arr[0]));
					tjpl.remove(b2BusinessChange);
					new b2BusinessChange(b2ui, tjpl, ID);
					tjpl.repaint();
					
				}
			}
		});
		
		yeWuYuanb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				BusinessController businessController = new BusinessController();
				int state = e.getStateChange();
				if(state==ItemEvent.SELECTED){
					if (!yeWuYuanb.getSelectedItem().equals("����ҵ��Ա")) {
						Object[] options = { "ȷ��", "ȡ��" };
						int result = JOptionPane.showOptionDialog(null, "ɾ��ҵ��Ա", "ɾ����ҵ��Ա", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
						if (result == 0) {
							String temd = (String)yeWuYuanb.getSelectedItem();
							String[] Temp = temd.split("-");
							businessController.removeBussinessman(ID, Long.parseLong(Temp[0]));
							yeWuYuanb = new JComboBox(businessController.getBussinessmanList(ID));
							tjpl.remove(b2BusinessChange);
							new b2BusinessChange(b2ui, tjpl, ID);
							tjpl.repaint();														
						
						}
					}else {
						kongXianY.setVisible(true);
					}
					
				}
				
			}
		});
		
		kongXianY.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				BusinessController businessController = new BusinessController();
				int state = e.getStateChange();
				if(state==ItemEvent.SELECTED){
					String temp = (String) kongXianY.getSelectedItem();
					String[] arr = temp.split("-");
					businessController.addBussinessman(ID, Long.parseLong(arr[0]));
					tjpl.remove(b2BusinessChange);
					new b2BusinessChange(b2ui, tjpl, ID);
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

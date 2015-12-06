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
import businesslogic.organizationbl.MiddleController;

public class b2MiddleChange extends JPanel {
	
private JLabel city,bianHao,bianHaoI,yeWuYuan,changKuGuanLiYuan;
	
	private JComboBox yeWuYuanB,changKuGuanLiYuanB,kongXianY,kongXianC;
	private JTextField cityI;
	private JButton yesButton,returnButton;
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	
	public b2MiddleChange(b2topmanagerui b2ui,topmanagerJpanel tjpl,String ID){
		init(ID);
		tjpl.add(this);
		registListener(b2ui, tjpl, this, ID);
	}
	
	private void init(String ID) {
		MiddleController middleController = new MiddleController();
		AccountInfoController accountInfoController = new AccountInfoController();
		String[] temp = ID.split("-");
		Font bFont = new Font("��Բ", Font.BOLD, 30);
		Font sFont = new Font("��Բ", Font.BOLD, 20);
		
		city = new JLabel("���ڳ���:");
		city.setFont(bFont);
		city.setForeground(Color.WHITE);
		city.setBounds(100, 80, 200, 50);
		this.add(city);
		
		cityI = new JTextField(middleController.GetInfo(ID));
		cityI.setFont(bFont);
		cityI.setForeground(Color.BLACK);
		cityI.setBounds(300, 80, 200, 50);
		this.add(cityI);
		
		bianHao = new JLabel("��ת���ı��:");
		bianHao.setFont(bFont);
		bianHao.setForeground(Color.WHITE);
		bianHao.setBounds(100, 160, 240, 50);
		this.add(bianHao);
		
		bianHaoI = new JLabel(ID);
		bianHaoI.setFont(bFont);
		bianHaoI.setForeground(Color.WHITE);
		bianHaoI.setBounds(350, 160, 160, 50);
		this.add(bianHaoI);
		
		yeWuYuan = new JLabel("ҵ��Ա�б�");
		yeWuYuan.setFont(sFont);
		yeWuYuan.setForeground(Color.WHITE);
		yeWuYuan.setBounds(100, 220, 180, 40);
		this.add(yeWuYuan);
		
		changKuGuanLiYuan = new JLabel("�ֿ����Ա�б�:");
		changKuGuanLiYuan.setFont(sFont);
		changKuGuanLiYuan.setForeground(Color.WHITE);
		changKuGuanLiYuan.setBounds(310, 220, 180, 40);
		this.add(changKuGuanLiYuan);
		
		
		if (middleController.getBussinessmanList(ID) != null) {
			String y = "����ҵ��Ա";
			yeWuYuanB = new JComboBox(middleController.getBussinessmanList(ID));
			yeWuYuanB.addItem(y);
		}else{
			String[] a = {"����ҵ��Ա"};
			yeWuYuanB = new JComboBox(a);
		}		
		yeWuYuanB.setFont(sFont);
		yeWuYuanB.setForeground(Color.BLACK);
		yeWuYuanB.setBounds(100, 270, 180, 40);
		yeWuYuanB.setSelectedIndex(-1);
		this.add(yeWuYuanB);
		
		if (accountInfoController.getAccountList() != null) {
			kongXianY = new JComboBox(accountInfoController.getAccountList());
			kongXianY.setFont(sFont);
			kongXianY.setForeground(Color.BLACK);
			kongXianY.setBounds(100, 320, 180, 40);
			kongXianY.setSelectedIndex(-1);
			kongXianY.setVisible(false);
			this.add(kongXianY);
		}

		if (middleController.getStorgerList(ID) != null) {
			String c ="���Ӳֿ����Ա";
			changKuGuanLiYuanB = new JComboBox(middleController.getStorgerList(ID));
			changKuGuanLiYuanB.addItem(c);
		}else {
			String[] a = {"���Ӳֿ����Ա"};
			changKuGuanLiYuanB = new JComboBox(a);
		}		
		changKuGuanLiYuanB.setFont(sFont);
		changKuGuanLiYuanB.setForeground(Color.BLACK);
		changKuGuanLiYuanB.setBounds(310, 270, 180, 40);
		changKuGuanLiYuanB.setSelectedIndex(-1);
		this.add(changKuGuanLiYuanB);
		
		if (accountInfoController.getAccountList() != null) {
			kongXianC = new JComboBox(accountInfoController.getAccountList());
			kongXianC.setFont(sFont);
			kongXianC.setForeground(Color.BLACK);
			kongXianC.setBounds(310, 320, 180, 40);
			kongXianC.setSelectedIndex(-1);
			kongXianC.setVisible(false);
			this.add(kongXianC);
		}
		
		//��ʱ���ټ�ͼƬ
		returnButton = new JButton(returnIcon);
		returnButton.setBounds(500, 530, 48, 48);
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
	
	private void registListener(final b2topmanagerui b2ui, final topmanagerJpanel tjpl,final b2MiddleChange b2MiddleChange, final String ID) {
		final MiddleController middleController = new MiddleController();
		final AccountInfoController accountInfoController = new AccountInfoController();
		
		returnButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(b2MiddleChange);
				new b2MiddleInfo(b2ui, tjpl, ID);
				tjpl.repaint();
			}
		});

		yesButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = cityI.getText();
				if (!input.equals("")) {
					boolean result = middleController.changeCity(ID, input);
					if (result) {
						JOptionPane.showMessageDialog(tjpl, "�޸ĳɹ�");
						tjpl.remove(b2MiddleChange);
						new b2MiddleInfo(b2ui, tjpl, ID);
						tjpl.repaint();
					}else {
						JOptionPane.showMessageDialog(tjpl, "�޸�ʧ��");
					}
				}else {
					JOptionPane.showMessageDialog(tjpl, "��������ת�������ڳ���");
				}
				
			}
		});

		yeWuYuanB.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub

				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					if (!yeWuYuanB.getSelectedItem().equals("����ҵ��Ա")) {
						Object[] options = { "ȷ��", "ȡ��" };
						int result = JOptionPane.showOptionDialog(null, "ɾ��ҵ��Ա", "ɾ����ҵ��Ա", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
						if (result == 0) {
							String temd = (String) yeWuYuanB.getSelectedItem();
							String[] Temp = temd.split("-");
							middleController.removeBussinessman(ID, Long.parseLong(Temp[0]));
							tjpl.remove(b2MiddleChange);
							new b2MiddleChange(b2ui, tjpl, ID);
							tjpl.repaint();
						}
					} else {
						if (accountInfoController.getAccountList() != null) {
							kongXianY.setVisible(true);
						}
					}

				}

			}
		});

		if (accountInfoController.getAccountList() != null) {
			kongXianY.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					
					int state = e.getStateChange();
					if (state == ItemEvent.SELECTED) {
						String temp = (String) kongXianY.getSelectedItem();
						String[] arr = temp.split("-");
						middleController.addBussinessman(ID, Long.parseLong(arr[0]));
						tjpl.remove(b2MiddleChange);
						new b2MiddleChange(b2ui, tjpl, ID);
						tjpl.repaint();

					}
				}
			});
		}
		

		changKuGuanLiYuanB.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				MiddleController middleController = new MiddleController();
				int state = e.getStateChange();
				if (state == ItemEvent.SELECTED) {
					if (!changKuGuanLiYuanB.getSelectedItem().equals("���Ӳֿ����Ա")) {
						Object[] options = { "ȷ��", "ȡ��" };
						int result = JOptionPane.showOptionDialog(null, "ɾ���ֿ����Ա", "ɾ���òֿ����Ա", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
						if (result == 0) {
							String temd = (String) changKuGuanLiYuanB.getSelectedItem();
							String[] Temp = temd.split("-");
							middleController.removeStorger(ID, Long.parseLong(Temp[0]));
							tjpl.remove(b2MiddleChange);
							new b2MiddleChange(b2ui, tjpl, ID);
							tjpl.repaint();

						}
					} else {
						if (accountInfoController.getAccountList() != null) {
							kongXianC.setVisible(true);
						}
						
					}

				}

			}
		});

		if (accountInfoController.getAccountList() != null) {
			kongXianC.addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					MiddleController middleController = new MiddleController();
					int state = e.getStateChange();
					if (state == ItemEvent.SELECTED) {
						String temp = (String) kongXianC.getSelectedItem();
						String[] arr = temp.split("-");
						middleController.addStorger(ID, Long.parseLong(arr[0]));
						tjpl.remove(b2MiddleChange);
						new b2MiddleChange(b2ui, tjpl, ID);
						tjpl.repaint();

					}

				}
			});
		}
		
		
	}
	
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }

}

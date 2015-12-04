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

import businesslogic.organizationbl.BusinessController;
import businesslogic.organizationbl.MiddleController;

public class b2MiddleInfo extends JPanel {
	private JLabel city,cityI,bianHao,bianHaoI,yeWuYuan,changKuGuanLiYuan,xiaXiaYingYeTing;
	
	private JComboBox yeWuYuanB,changKuGuanLiYuanB,xiaXiaYingYeTingB;
	private JButton change,delete,returnButton;
	
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");	
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	
	public b2MiddleInfo(b2topmanagerui b2ui,topmanagerJpanel tjpl,String ID){
		init(ID);
		tjpl.add(this);
		registListener(b2ui, tjpl, this, ID);
	}
	
	private void init(String ID) {
		MiddleController middleController = new MiddleController();
		String[] temp = ID.split("-");
		Font bFont = new Font("��Բ", Font.BOLD, 30);
		Font sFont = new Font("��Բ", Font.BOLD, 20);
		
		city = new JLabel("���ڳ���:");
		city.setFont(bFont);
		city.setForeground(Color.WHITE);
		city.setBounds(100, 80, 200, 50);
		this.add(city);
		
		cityI = new JLabel(middleController.GetInfo(ID));
		cityI.setFont(bFont);
		cityI.setForeground(Color.WHITE);
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
		
		xiaXiaYingYeTing = new JLabel("��ϽӪҵ���б�:");
		xiaXiaYingYeTing.setFont(sFont);
		xiaXiaYingYeTing.setForeground(Color.WHITE);
		xiaXiaYingYeTing.setBounds(200, 320, 180, 40);
		this.add(xiaXiaYingYeTing);
		
		yeWuYuanB = new JComboBox(middleController.getBussinessmanList(ID));
		yeWuYuanB.setFont(sFont);
		yeWuYuanB.setForeground(Color.BLACK);
		yeWuYuanB.setBounds(100, 270, 180, 40);
		this.add(yeWuYuanB);
		
		changKuGuanLiYuanB = new JComboBox(middleController.getStorgerList(ID));
		changKuGuanLiYuanB.setFont(sFont);
		changKuGuanLiYuanB.setForeground(Color.BLACK);
		changKuGuanLiYuanB.setBounds(310, 270, 180, 40);
		this.add(changKuGuanLiYuanB);
		
		xiaXiaYingYeTingB = new JComboBox(middleController.getBussinessHallList(ID));
		xiaXiaYingYeTingB.setFont(sFont);
		xiaXiaYingYeTingB.setForeground(Color.BLACK);
		xiaXiaYingYeTingB.setBounds(200, 370, 220, 40);
		this.add(xiaXiaYingYeTingB);
		
		// ��ʱ���ټ�ͼƬ
		change = new JButton("�޸�");
		change.setForeground(Color.BLACK);
		change.setContentAreaFilled(true);
		change.setBorderPainted(true);
		change.setBounds(120, 500, 160, 50);
		this.add(change);

		delete = new JButton("ɾ��");
		delete.setForeground(Color.BLACK);
		delete.setContentAreaFilled(true);
		delete.setBorderPainted(true);
		delete.setBounds(310, 500, 160, 50);
		this.add(delete);

		returnButton = new JButton(returnIcon);
		returnButton.setBounds(500, 500, 48, 48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);

		this.setBounds(260, 60, 730, 650);
		this.setLayout(null);
		this.setOpaque(false);
		
	}
	
	private void registListener(final b2topmanagerui b2ui, final topmanagerJpanel tjpl,final b2MiddleInfo b2MiddleInfo, final String ID) {
		
		returnButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(b2MiddleInfo);
				tjpl.add(b2ui.operationJpanel);
				b2ui.b1.setEnabled(true);
				b2ui.b2.setEnabled(true);
				b2ui.b3.setEnabled(true);
				b2ui.b4.setEnabled(false);
				b2ui.repaint();

			}
		});
		
		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object[] options = { "ȷ��", "ȡ��" };
				int result = JOptionPane.showOptionDialog(null, "ɾ����ת����", "ɾ����ת���ģ�", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
				if (result == 0) {
					MiddleController middleController = new MiddleController();
					boolean b = middleController.removeMiddleOrg(ID);
					if(b){
					tjpl.remove(b2MiddleInfo);
					tjpl.add(b2ui.operationJpanel);
					b2ui.b1.setEnabled(true);
					b2ui.b2.setEnabled(true);
					b2ui.b3.setEnabled(true);
					b2ui.b4.setEnabled(false);
					tjpl.repaint();
					}
				}
			}
		});
		
		change.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(b2MiddleInfo);
				new b2MiddleChange(b2ui, tjpl, ID);
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

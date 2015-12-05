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
import vo.orgVO.BussinessOrgVO;

public class b2BusinessInfo extends JPanel {
	private JLabel suoShu,suoShuC,suoZai,suoZaiC,bianHao,bianHaoC,kuaiDiYuan,yeWuYuan;
	private JButton change,delete,returnButton;
	private JComboBox kuaiDiYuanb,yeWuYuanb;

	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");	
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	
	public b2BusinessInfo(b2topmanagerui b2ui,topmanagerJpanel tjpl,String ID){
		
		init(b2ui, tjpl, ID);
		tjpl.add(this);
		registListener(b2ui, tjpl, this,ID);
	}
	private void init(b2topmanagerui b2ui,topmanagerJpanel tjpl,String ID) {
		
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
		
		suoZaiC = new JLabel(businessController.getInfo(ID));
		suoZaiC.setFont(bFont);
		suoZaiC.setForeground(Color.WHITE);
		suoZaiC.setBounds(290, 130, 150, 50);
		this.add(suoZaiC);
		
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
		
		if (businessController.getCourierList(ID) != null) {
			kuaiDiYuanb = new JComboBox(businessController.getCourierList(ID));
			kuaiDiYuanb.setFont(sFont);
			kuaiDiYuanb.setForeground(Color.BLACK);
			kuaiDiYuanb.setBounds(120, 310, 180, 40);
			this.add(kuaiDiYuanb);
		}
		
		if (businessController.getBussinessmanList(ID) != null) {
			yeWuYuanb = new JComboBox(businessController.getBussinessmanList(ID));
			yeWuYuanb.setFont(sFont);
			yeWuYuanb.setForeground(Color.BLACK);
			yeWuYuanb.setBounds(330, 310, 180, 40);
			this.add(yeWuYuanb);
		}
		
		
		
		
		
		//��ʱ���ټ�ͼƬ
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
	
	private void registListener(final b2topmanagerui b2ui,final topmanagerJpanel tjpl,final b2BusinessInfo b2BusinessInfo,final String ID) {
		
		returnButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(b2BusinessInfo);
				tjpl.add(b2ui.operationJpanel);
				b2ui.b1.setEnabled(true);
				b2ui.b2.setEnabled(true);
				b2ui.b3.setEnabled(true);
				b2ui.repaint();

			}
		});
		
		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object[] options = { "ȷ��", "ȡ��" };
				int result = JOptionPane.showOptionDialog(null, "ɾ���˺�", "ɾ���˺�", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
				if (result == 0) {
					BusinessController businessController = new BusinessController();
					boolean b = businessController.removeBussinessHall(ID, ID);
					if(b){
					tjpl.remove(b2BusinessInfo);
					tjpl.add(b2ui.operationJpanel);
					b2ui.b1.setEnabled(true);
					b2ui.b2.setEnabled(true);
					b2ui.b3.setEnabled(true);
					tjpl.repaint();
					}
				}
			}
		});
		
		change.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(b2BusinessInfo);
				new b2BusinessChange(b2ui, tjpl, ID);
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

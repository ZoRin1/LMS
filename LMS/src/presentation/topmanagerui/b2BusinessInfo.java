package presentation.topmanagerui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import vo.orgVO.BussinessOrgVO;

public class b2BusinessInfo extends JPanel {
	private JLabel suoShu,suoShuC,suoZai,suoZaiC,bianHao,bianHaoC,kuaiDiYuan,yeWuYuan;
	private JButton change,delete,returnButton;
	private JComboBox kuaiDiYuanb,yeWuYuanb;

	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");	
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	
	private void init(b2topmanagerui b2ui,topmanagerJpanel tjpl,BussinessOrgVO bussinessOrgVO) {
		
		Font bFont = new Font("��Բ", Font.BOLD, 30);
		Font sFont = new Font("��Բ", Font.BOLD, 20);
		
		suoShu = new JLabel("������ת���ı��");
		suoShu.setFont(bFont);
		suoShu.setForeground(Color.WHITE);
		suoShu.setBounds(100, 70, 240, 50);
		this.add(suoShu);
		
		suoShuC = new JLabel(bussinessOrgVO.getCodeNemberOfMiddle());
		suoShuC.setFont(bFont);
		suoShuC.setForeground(Color.WHITE);
		suoShuC.setBounds(350, 70, 200, 50);
		this.add(suoShuC);
		
		suoZai = new JLabel("���ڵ���");
		suoZai.setFont(bFont);
		suoZai.setForeground(Color.WHITE);
		suoZai.setBounds(100, 130, 180, 50);
		this.add(suoZai);
		
		suoZaiC = new JLabel(bussinessOrgVO.getCity());
		suoZaiC.setFont(bFont);
		suoZaiC.setForeground(Color.WHITE);
		suoZaiC.setBounds(290, 130, 150, 50);
		this.add(suoZaiC);
		
		bianHao = new JLabel("�������");
		bianHao.setFont(bFont);
		bianHao.setForeground(Color.WHITE);
		bianHao.setBounds(100, 190, 200, 50);
		this.add(bianHao);
		
		bianHaoC = new JLabel(bussinessOrgVO.getCodeNumber());
		bianHaoC.setFont(bFont);
		bianHaoC.setForeground(Color.WHITE);
		bianHaoC.setBounds(310, 190, 180, 50);
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
		
		kuaiDiYuanb = new JComboBox<>(bussinessOrgVO.getCourier().toArray());
		
		
		
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

}

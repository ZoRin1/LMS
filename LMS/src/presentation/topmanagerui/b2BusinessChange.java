package presentation.topmanagerui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import businesslogic.organizationbl.BusinessController;

public class b2BusinessChange extends JPanel {
	private JLabel suoShu,suoShuC,suoZai,bianHao,bianHaoC,kuaiDiYuan,yeWuYuan;
	private JTextField suoZaiF;
	private JComboBox kuaiDiYuanb,yeWuYuanb;
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	private ImageIcon yesIcon=new ImageIcon("picture/确定.png");
	
	private void init(String ID) {
		BusinessController businessController = new BusinessController();
		String[] temp = ID.split("-");
		Font bFont = new Font("幼圆", Font.BOLD, 30);
		Font sFont = new Font("幼圆", Font.BOLD, 20);
		
		suoShu = new JLabel("所属中转中心编号:");
		suoShu.setFont(bFont);
		suoShu.setForeground(Color.WHITE);
		suoShu.setBounds(100, 70, 300, 50);
		this.add(suoShu);
		
		suoShuC = new JLabel(temp[0]);
		suoShuC.setFont(bFont);
		suoShuC.setForeground(Color.WHITE);
		suoShuC.setBounds(400, 70, 200, 50);
		this.add(suoShuC);
		
		suoZai = new JLabel("所在地区:");
		suoZai.setFont(bFont);
		suoZai.setForeground(Color.WHITE);
		suoZai.setBounds(100, 130, 180, 50);
		this.add(suoZai);
		
		suoZaiF = new JTextField(businessController.getInfo(ID));
		suoZaiF.setFont(bFont);
		suoZaiF.setForeground(Color.WHITE);
		suoZaiF.setBounds(290, 130, 150, 50);
		this.add(suoZaiF);
		
		bianHao = new JLabel("机构编号:");
		bianHao.setFont(bFont);
		bianHao.setForeground(Color.WHITE);
		bianHao.setBounds(100, 190, 200, 50);
		this.add(bianHao);
		
		bianHaoC = new JLabel(temp[1]);
		bianHaoC.setFont(bFont);
		bianHaoC.setForeground(Color.WHITE);
		bianHaoC.setBounds(290, 190, 180, 50);
		this.add(bianHaoC);
		
		kuaiDiYuan = new JLabel("快递员列表:");
		kuaiDiYuan.setFont(sFont);
		kuaiDiYuan.setForeground(Color.WHITE);
		kuaiDiYuan.setBounds(120, 260, 180, 40);
		this.add(kuaiDiYuan);
		
		yeWuYuan = new JLabel("业务员列表:");
		yeWuYuan.setFont(sFont);
		yeWuYuan.setForeground(Color.WHITE);
		yeWuYuan.setBounds(330, 260, 180, 40);
		this.add(yeWuYuan);
		
		kuaiDiYuanb = new JComboBox(businessController.getCourierList(ID));
		kuaiDiYuanb.setFont(sFont);
		kuaiDiYuanb.setForeground(Color.BLACK);
		kuaiDiYuanb.setBounds(120, 310, 180, 40);
		this.add(kuaiDiYuanb);
		
		yeWuYuanb = new JComboBox(businessController.getBussinessmanList(ID));
		yeWuYuanb.setFont(sFont);
		yeWuYuanb.setForeground(Color.BLACK);
		yeWuYuanb.setBounds(330, 310, 180, 40);
		this.add(yeWuYuanb);
		
		
		
		
		//到时候再加图片
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
	

}

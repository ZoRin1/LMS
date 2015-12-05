package presentation.bhclerkui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import po.documentsPO.ReceiptPO;
import businesslogic.documentsbl.createDocument;
import businesslogic.documentsbl.documentController;

public class ReceiptJPanel extends JPanel{
	private String code2;//�տ���
	private String date2;//�տ�����
	private String account2;//�������˺�
	private String OrgCode;//Ӫҵ�����
	private double fund;//�տ���
	private String name2;//���Ա����
	private ArrayList<String> TCode2;//���ж����������
	private String state;
	private ReceiptPO po;
	
	private JLabel code;
	private JLabel code1;
	private JLabel doName;
	private JLabel date;
	private JLabel date1;
	private JLabel Name;
	private JTextField name;
	private JLabel account;
	private JTextField Account;
	private JLabel TCode;
	private JTextArea tcode;
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	public ReceiptJPanel(bhclerkui ui,bhclerkJpanel bhclerkJpanel,String account,String state) {
		init();
		this.account2=account;
		this.state=state;
		bhclerkJpanel.add(this);
		registListener(ui,bhclerkJpanel,this);
	}
	public void init(){
		Font font=new Font("��Բ",Font.BOLD,24);
		code=new JLabel("���ݱ�ţ�");
		code.setForeground(Color.white);
		code.setFont(font);
		code.setBounds(30,30,125,27);
		this.add(code);
		
		code1=new JLabel();
		code2=new documentController().getDocCode("�տ");
		code1.setText(code2);
		code1.setForeground(Color.white);
		code1.setFont(font);
		code1.setBounds(155,30,131,27);
		this.add(code1);
		
		doName=new JLabel("���������տ");
		doName.setForeground(Color.white);
		doName.setFont(font);
		doName.setBounds(360,30,175,27);
		this.add(doName);
		
		date=new JLabel("�տ�����:");
		date.setForeground(Color.white);
		date.setFont(font);
		date.setBounds(30,97,125,27);
		this.add(date);
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		date2= dateFormat.format( now );
		date1=new JLabel(date2);
		date1.setForeground(Color.white);
		date1.setFont(font);
		date1.setBounds(155,97,250,27);
		this.add(date1);
		
		Name=new JLabel("�տ���Ա����:");
		Name.setForeground(Color.white);
		Name.setFont(font);
		Name.setBounds(30,164,200,27);
		this.add(Name);
		
		name=new JTextField();
		name.setBounds(230,164,125,27);
		name.setFont(font);
		this.add(name);
		
		account=new JLabel("�տ��");
		account.setForeground(Color.white);
		account.setFont(font);
		account.setBounds(30,231,125,27);
		this.add(account);
		
		Account=new JTextField();
		Account.setBounds(155,231,125,27);
		Account.setFont(font);
		this.add(Account);
		
		TCode=new JLabel("����������ţ�");
		TCode.setForeground(Color.white);
		TCode.setFont(font);
		TCode.setBounds(30,298,175,27);
		this.add(TCode);
		
		tcode=new JTextArea();
		tcode.setBounds(205,298,143,108);
		tcode.setLineWrap(true);
		tcode.setFont(font);
		this.add(tcode);
		
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662,575,48,48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);
		
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(602, 575,48,48);
		yesButton.setContentAreaFilled(false);
		this.add(yesButton);
		
		this.setBounds(260, 60, 730,650);
		this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final bhclerkui ui,final bhclerkJpanel panel,
			final ReceiptJPanel panel2) {
		// TODO Auto-generated method stub
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.remove(panel2);
				panel.add(ui.operationJpanel);
				ui.carinformationbButton.setEnabled(true);
				ui.cashdocumentbButton.setEnabled(true);
				ui.documentreplyButton.setEnabled(true);
				ui.driverinformationbButton.setEnabled(true);
				ui.loaddocumentbButton.setEnabled(true);
				ui.acceptdocumentbButton.setEnabled(true);
				panel.repaint();
			}
		});
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(Account.getText().equals("")||tcode.getText().equals("")){
					new notFinishDialog(ui,"��������",true);
				}
				else{
					String[] list=state.split("-");
					OrgCode=list[3]+"-"+list[4];
					fund=Double.parseDouble(account.getText());
					name2=name.getText();
					String[] list2=tcode.getText().split("��");//�˴�����Ӧ�ü��Բ�����Ӣ�Ķ���תΪ���Ķ��Ż�Ҫ��Ա������ʹ���������뷨
					int size=list2.length;
					TCode2=new ArrayList<>();
					for(int i=0;i<size;i++){
						TCode2.add(list[i]);
					}
					po=new ReceiptPO(code2, "�տ", date2, account2, OrgCode, fund, name2, TCode2);
					new documentController().createBlock(po);
					new finishDialog2(ui, "�տ�������", true,"�տ");
					panel.remove(panel2);
					panel.add(ui.operationJpanel);
					ui.carinformationbButton.setEnabled(true);
					ui.cashdocumentbButton.setEnabled(true);
					ui.documentreplyButton.setEnabled(true);
					ui.driverinformationbButton.setEnabled(true);
					ui.loaddocumentbButton.setEnabled(true);
					ui.acceptdocumentbButton.setEnabled(true);
					panel.repaint();
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

package presentation.icclerkui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import po.documentsPO.ZLoadingPO;
import businesslogic.documentsbl.createDocument;
import businesslogic.documentsbl.documentController;

public class ZloadingJpanel extends JPanel{
	private String date2;
	private String code2;//װ�˵����
	private String account;//�������˺�
	private String transcode2;//��������
	private String departure2;//������
	private String arrival2;//�����
	private String name2;//��װԱ����
	private ArrayList<String> codeList;//���ж����������
	private double carriage;//�˷�
	private String state;//һ���λ�����Ϣ
	private ZLoadingPO po;
	
	private String state1;
	private JLabel code;
	private JLabel code1;
	private JLabel doName;
	private JLabel date;
	private JLabel date1;
	private JLabel departure;
	private JTextField depart;
	private JLabel arrival;
	private JTextField arrive;
	private JLabel transcode;
	private JTextField Transcode;
	private JLabel jianzhuangyuan;
	private JTextField name;
	private JLabel TCode;
	private JTextArea tcode;
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	public ZloadingJpanel(icclerkui ui,icclerkJpanel panel,String state1,String account,String state) {
		this.state1=state1;
		this.account=account;
		this.state=state;
		init(state1);
		ui.setTitle("��ת����ҵ��Ա-��ת���յ�����");
		panel.add(this);
		registListener(ui,panel,this);
	}
	public void init(String state1){
		Font font=new Font("��Բ",Font.BOLD,24);
		code=new JLabel("���ݱ�ţ�");
		code.setForeground(Color.white);
		code.setFont(font);
		code.setBounds(30,30,125,27);
		this.add(code);
		
		code1=new JLabel();
		code2=new documentController().getDocCode("��ת����ת�˵�");
		code1.setText(code2);
		code1.setForeground(Color.white);
		code1.setFont(font);
		code1.setBounds(155,30,131,27);
		this.add(code1);
		
		doName=new JLabel("����������ת����װ�˵�");
		doName.setForeground(Color.white);
		doName.setFont(font);
		doName.setBounds(360,30,275,27);
		this.add(doName);

		date=new JLabel("�տ�����:");
		date.setForeground(Color.white);
		date.setFont(font);
		date.setBounds(30,97,125,27);
		this.add(date);
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		date2 = dateFormat.format( now );
		date1=new JLabel(date2);
		date1.setForeground(Color.white);
		date1.setFont(font);
		date1.setBounds(155,97,250,27);
		this.add(date1);
		
		departure=new JLabel("�����أ�");
		departure.setForeground(Color.white);
		departure.setFont(font);
		departure.setBounds(30,164,100,27);
		this.add(departure);
		
		depart=new JTextField();
		depart.setBounds(130,164,125,27);
		depart.setFont(font);
		this.add(depart);
		
		arrival=new JLabel("����أ�");
		arrival.setForeground(Color.white);
		arrival.setFont(font);
		arrival.setBounds(360,164,100,27);
		this.add(arrival);
		
		arrive=new JTextField();
		arrive.setBounds(460,164,125,27);
		arrive.setFont(font);
		this.add(arrive);
		
		transcode=new JLabel();
		if(state1.equals("�ؿ�ר��"))
			transcode.setText("����ţ�");
		else
			transcode.setText("���κţ�");
		transcode.setForeground(Color.white);
		transcode.setFont(font);
		transcode.setBounds(30,231,100,27);
		this.add(transcode);
		
		Transcode=new JTextField();
		Transcode.setBounds(130,231,125,27);
		Transcode.setFont(font);
		this.add(Transcode);
		
		jianzhuangyuan=new JLabel("��װԱ��");
		jianzhuangyuan.setForeground(Color.white);
		jianzhuangyuan.setFont(font);
		jianzhuangyuan.setBounds(30,298,100,27);
		this.add(jianzhuangyuan);
		
		name=new JTextField();
		name.setBounds(130,298,125,27);
		name.setFont(font);
		this.add(name);
		
		TCode=new JLabel("���ж���������ţ�");
		TCode.setForeground(Color.white);
		TCode.setFont(font);
		TCode.setBounds(30,365,225,27);
		this.add(TCode);
		
		tcode=new JTextArea();
		tcode.setBounds(255,365,143,108);
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
	public void registListener(final icclerkui ui,final icclerkJpanel panel,final ZloadingJpanel panel2){
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ui.setTitle("��ת����ҵ��Ա������ת���յ����� ");
				panel.remove(panel2);
				panel.add(ui.operationJpanel);
				ui.b1.setEnabled(true);
				ui.b2.setEnabled(true);
				ui.b3.setEnabled(true);
				ui.b4.setEnabled(true);
				ui.b5.setEnabled(true);
				ui.b6.setEnabled(true);
				panel.repaint();
			}
		});
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(depart.getText().equals("")||arrive.getText().equals("")||Transcode.getText().equals("")||name.getText().equals("")
						||tcode.getText().equals("")){
					new notFinishDialog(ui, "��������", true);
					panel.repaint();
				}
				else{
					transcode2=Transcode.getText();
					departure2=depart.getText();
					arrival2=arrive.getText();
					name2=name.getText();
					String[] list=tcode.getText().split("��");//�˴�����Ӧ�ü��Բ�����Ӣ�Ķ���תΪ���Ķ��Ż�Ҫ��Ա������ʹ���������뷨
					int size=list.length;
					codeList=new ArrayList<>();
					for(int i=0;i<size;i++){
						codeList.add(list[i]);
					}
					DecimalFormat df = new DecimalFormat("0.00");
					documentController co=new documentController();
					String str;
					if(state=="�ؿ�ר��"){
						str=df.format(co.getCost(departure2, arrival2, state1, 50000));
					}
					else if(state=="��ͨ���"){
						str=df.format(co.getCost(departure2, arrival2, state1, 2000000));
					}
					else{
						str=df.format(co.getCost(departure2, arrival2, state1, 10000));
					}
					carriage=Double.parseDouble(str);
					po=new ZLoadingPO(date2, code2, "��ת����ת�˵�", account, transcode2, departure2, arrival2, name2, codeList, carriage);
					new documentController().createBlock(po);
					new finishDialog3(ui, "��ת����װ�˵��������", true , str);
					panel.remove(panel2);
					panel.add(ui.operationJpanel);
					ui.b1.setEnabled(true);
					ui.b2.setEnabled(true);
					ui.b3.setEnabled(true);
					ui.b4.setEnabled(true);
					ui.b5.setEnabled(true);
					ui.b6.setEnabled(true);
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
class finishDialog3 extends JDialog{
	private dialogJpanel jPanel;
	private JLabel jLabel;
	private JLabel jLabel1;
	private JButton jButton;
	private String str;
	public finishDialog3(JFrame frame,String title,boolean modal,String str) {
		super(frame,title,modal);
		this.str=str;
		init();
		registerListener();
		this.setVisible(true);
	}
	private void init(){
		ImageIcon yesIcon=new ImageIcon("picture/��¼.png");
		jLabel=new JLabel("��ת���ĵ��������",jLabel.CENTER);
		jLabel.setForeground(Color.white);
		jLabel.setFont(new Font("��Բ",Font.BOLD,27));
		jLabel.setBounds(0, 0, 500, 200);
		
		jLabel1=new JLabel("�˷ѣ�"+str+"Ԫ",jLabel.CENTER);
		jLabel1.setForeground(Color.white);
		jLabel1.setFont(new Font("��Բ",Font.BOLD,27));
		jLabel1.setBounds(0, 60, 500, 200);
		
		jButton=new JButton(yesIcon);
		jButton.setContentAreaFilled(false);
		jButton.setBounds(218,190, 64, 64);
		
		jPanel=new dialogJpanel();
		jPanel.setLayout(null);
		jPanel.add(jLabel);
		jPanel.add(jLabel1);
		jPanel.add(jButton);
		this.add(jPanel);
		this.setSize(500, 300);
		Toolkit kitToolkit =Toolkit.getDefaultToolkit();
		Dimension screenSize=kitToolkit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int dialogWidth=this.getWidth();
		int dialogHeight=this.getHeight();
		this.setLocation((screenWidth-dialogWidth)/2, (screenHeight-dialogHeight)/2);
		this.setResizable(false);
	}
	private void registerListener(){
		jButton.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				finishDialog3.this.dispose();
			}
		});
	}
}

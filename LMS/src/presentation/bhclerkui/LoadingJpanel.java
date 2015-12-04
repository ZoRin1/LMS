package presentation.bhclerkui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import po.documentsPO.LoadingPO;
import businesslogic.documentsbl.createDocument;
import businesslogic.documentsbl.documentController;


public class LoadingJpanel extends JPanel{
//	LoadingPO po;
//	String Code;
//	String date;
	
	private JLabel code;
	private JLabel code1;
	private JLabel doName;
	private JLabel departure;
	private JTextField depart;
	private JLabel arrival;
	private JTextField arrive;
	private JLabel jianzhuang;
	private JTextField jianzhuangyuan;
	private JLabel yayun;
	private JTextField yayunyuan;
	private JLabel carcode;
	private JTextField Carcode;
	private JLabel TCode;
	private JTextArea tcode;
	//�˴���ʡʱ���Ȳ����б���ʾ
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	public LoadingJpanel(bhclerkui ui,bhclerkJpanel bhclerkJpanel) {
		init();
		ui.setTitle("Ӫҵ��ҵ��Ա-װ��������");
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
		
		code1.setText(new documentController().getDocCode("Ӫҵ��װ����"));
		code1.setForeground(Color.white);
		code1.setFont(font);
		code1.setBounds(155,30,131,27);
		this.add(code1);
		
		doName=new JLabel("��������װ����");
		doName.setForeground(Color.white);
		doName.setFont(font);
		doName.setBounds(360,30,175,27);
		this.add(doName);
		
		departure=new JLabel("�����أ�");
		departure.setForeground(Color.white);
		departure.setFont(font);
		departure.setBounds(30,97,100,27);
		this.add(departure);
		
		depart=new JTextField();
		depart.setBounds(130,97,125,27);
		depart.setFont(font);
		this.add(depart);
		
		arrival=new JLabel("����أ�");
		arrival.setForeground(Color.white);
		arrival.setFont(font);
		arrival.setBounds(360,97,100,27);
		this.add(arrival);
		
		arrive=new JTextField();
		arrive.setBounds(460,97,125,27);
		arrive.setFont(font);
		this.add(arrive);
		
		jianzhuang=new JLabel("��װԱ��");
		jianzhuang.setForeground(Color.white);
		jianzhuang.setFont(font);
		jianzhuang.setBounds(30,164,100,27);
		this.add(jianzhuang);
		
		jianzhuangyuan=new JTextField();
		jianzhuangyuan.setBounds(130,164,125,27);
		jianzhuangyuan.setFont(font);
		this.add(jianzhuangyuan);
		
		yayun=new JLabel("Ѻ��Ա��");
		yayun.setForeground(Color.white);
		yayun.setFont(font);
		yayun.setBounds(360,164,100,27);
		this.add(yayun);
		
		yayunyuan=new JTextField();
		yayunyuan.setBounds(460,164,125,27);
		yayunyuan.setFont(font);
		this.add(yayunyuan);
		
		carcode=new JLabel("������ţ�");
		carcode.setForeground(Color.white);
		carcode.setFont(font);
		carcode.setBounds(30,231,125,27);
		this.add(carcode);
		
		Carcode=new JTextField();
		Carcode.setBounds(155,231,132,27);
		Carcode.setFont(font);
		this.add(Carcode);
		
		TCode=new JLabel("���ж���������ţ�");
		TCode.setForeground(Color.white);
		TCode.setFont(font);
		TCode.setBounds(30,298,225,27);
		this.add(TCode);
		
		tcode=new JTextArea();
		tcode.setBounds(255,298,143,108);
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
	private void registListener(final bhclerkui ui,final bhclerkJpanel panel,final LoadingJpanel panel2){

		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ui.setTitle("Ӫҵ��ҵ��Ա����װ�������� 1");
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
				if(depart.getText().equals("")||arrive.getText().equals("")||jianzhuangyuan.getText().equals("")
						||yayunyuan.getText().equals("")||Carcode.getText().equals("")||tcode.getText().equals("")){
					new notFinishDialog(ui, "��������", true);
				}
				else{
//					po=new LoadingPO(date, code, "Ӫҵ��װ����", account, departure, arrival, supervisor, supercargo, codeList, charge)
					new finishDialog(ui, "װ�������������", true);
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
	class notFinishDialog extends JDialog{
		private dialogJpanel jPanel;
		private JLabel jLabel;
		private JLabel jLabel1;
		private JButton jButton;
		public notFinishDialog(JFrame frame,String title,boolean modal) {
			super(frame,title,modal);
			init();
			registerListener();
			this.setVisible(true);
		}
		private void init(){
			ImageIcon yesIcon=new ImageIcon("picture/��¼.png");
			jLabel=new JLabel("�������벻���������鲹��",jLabel.CENTER);
			jLabel.setForeground(Color.white);
			jLabel.setFont(new Font("��Բ",Font.BOLD,27));
			jLabel.setBounds(0, 0, 500, 200);
			
			DecimalFormat df = new DecimalFormat("0.00");
			documentController co=new documentController();
			String str=df.format(co.getShortCost());
			
			jButton=new JButton(yesIcon);
			jButton.setContentAreaFilled(false);
			jButton.setBounds(218,190, 64, 64);
			
			jPanel=new dialogJpanel();
			jPanel.setLayout(null);
			jPanel.add(jLabel);
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
					notFinishDialog.this.dispose();
				}
			});
		}
	}
	class finishDialog extends JDialog{
		private dialogJpanel jPanel;
		private JLabel jLabel;
		private JLabel jLabel1;
		private JButton jButton;
		public finishDialog(JFrame frame,String title,boolean modal) {
			super(frame,title,modal);
			init();
			registerListener();
			this.setVisible(true);
		}
		private void init(){
			ImageIcon yesIcon=new ImageIcon("picture/��¼.png");
			jLabel=new JLabel("װ�����������",jLabel.CENTER);
			jLabel.setForeground(Color.white);
			jLabel.setFont(new Font("��Բ",Font.BOLD,27));
			jLabel.setBounds(0, 0, 500, 200);
			
			DecimalFormat df = new DecimalFormat("0.00");
			documentController co=new documentController();
			String str=df.format(co.getShortCost());
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
					finishDialog.this.dispose();
				}
			});
		}
	}
	class dialogJpanel extends JPanel{
		private ImageIcon dialogIcon=new ImageIcon("picture/����.png");
		public void paintComponent(Graphics g)  
		{  
		    super.paintComponent(g);    
		    g.drawImage(dialogIcon.getImage(),0,0,null);
	      
	     }
	   }
	

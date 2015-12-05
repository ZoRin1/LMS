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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import po.documentsPO.ZReceivePO;
import businesslogic.documentsbl.createDocument;
import businesslogic.documentsbl.documentController;


public class ZReceiveJpanel extends JPanel{
	private String code2;//��ת�����
	private String date2;
	private String account;//�������˺�
	private String zCode;//��ת���ı��
	private ArrayList<String> codeList;//���ж����������
	private String departure2;
	private String state2;
	private String arrival2;
	private ZReceivePO po;
	
	private JLabel code;
	private JLabel code1;
	private JLabel doName;
	private JLabel date;
	private JLabel date1;
	private JLabel departure;
	private JTextField depart;
	private JLabel TCode;
	private JTextArea tcode;
	private JLabel state;
	private JTextField State;
//	private JScrollPane jsp;
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	public ZReceiveJpanel(icclerkui ui,icclerkJpanel panel,String account,String state) {
		init();
		this.account=account;
		state2=state;
		ui.setTitle("��ת����ҵ��Ա-��ת���յ�����");
		panel.add(this);
		registListener(ui,panel,this);
	}
	public void init(){
		Font font=new Font("��Բ",Font.BOLD,24);
		code=new JLabel("���ݱ�ţ�");
		code.setForeground(Color.white);
		code.setFont(font);
		code.setBounds(30,30,125,27);
		this.add(code);
		
		code1=new JLabel();
		code2=new documentController().getDocCode("��ת���Ľ��յ�");
		code1.setText(code2);
		code1.setForeground(Color.white);
		code1.setFont(font);
		code1.setBounds(155,30,131,27);
		this.add(code1);
		
		doName=new JLabel("����������ת���Ľ��յ�");
		doName.setForeground(Color.white);
		doName.setFont(font);
		doName.setBounds(360,30,275,27);
		this.add(doName);
		
		date=new JLabel("��������:");
		date.setForeground(Color.white);
		date.setFont(font);
		date.setBounds(30,97,125,27);
		this.add(date);
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
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
		
		TCode=new JLabel("���ж���������ţ�");
		TCode.setForeground(Color.white);
		TCode.setFont(font);
		TCode.setBounds(30,231,225,27);
		this.add(TCode);
		
		tcode=new JTextArea();
		tcode.setBounds(255,231,143,108);
		tcode.setLineWrap(true);
		tcode.setFont(font);
//		jsp = new JScrollPane(tcode);
//		jsp.setBounds(388,231,20,108);
//		jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		this.add(tcode);
//		this.add(jsp);
		
		state=new JLabel("����״̬��");
		state.setForeground(Color.white);
		state.setFont(font);
		state.setBounds(30,365,125,27);
		this.add(state);
		
		State=new JTextField();
		State.setBounds(155,365,125,27);
		State.setFont(font);
		this.add(State);
		
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
	public void registListener(final icclerkui ui,final icclerkJpanel panel,final ZReceiveJpanel panel2){
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
				if(depart.getText().equals("")||tcode.getText().equals("")||State.getText().equals("")){
					new notFinishDialog(ui,"��������",true);
				}
				else{
					String[] list=state2.split("-");
					zCode=list[3];
					arrival2=list[2];
					departure2=depart.getText();
					String[] list2=tcode.getText().split("��");//�˴�����Ӧ�ü��Բ�����Ӣ�Ķ���תΪ���Ķ��Ż�Ҫ��Ա������ʹ���������뷨
					int size=list2.length;
					codeList=new ArrayList<>();
					for(int i=0;i<size;i++){
						codeList.add(list[i]);
					}
					po=new ZReceivePO(code2, "��ת����ת�˵�", date2, account, zCode, codeList, departure2, arrival2);
					new documentController().createBlock(po);
					new finishDialog2(ui, "��ת���յ��������", true,"��ת���յ�");
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
class finishDialog2 extends JDialog{
	private dialogJpanel jPanel;
	private JLabel jLabel;
	private JButton jButton;
	private String doName;
	public finishDialog2(JFrame frame,String title,boolean modal,String doName) {
		super(frame,title,modal);
		this.doName=doName;
		init();
		registerListener();
		this.setVisible(true);
	}
	private void init(){
		ImageIcon yesIcon=new ImageIcon("picture/��¼.png");
		jLabel=new JLabel(doName+"�������",jLabel.CENTER);
		jLabel.setForeground(Color.white);
		jLabel.setFont(new Font("��Բ",Font.BOLD,27));
		jPanel=new dialogJpanel();
		jButton=new JButton(yesIcon);
		jButton.setContentAreaFilled(false);
		jPanel.setLayout(null);
		jButton.setBounds(218,190, 64, 64);
		jLabel.setBounds(0, 0, 500, 200);
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
				finishDialog2.this.dispose();
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

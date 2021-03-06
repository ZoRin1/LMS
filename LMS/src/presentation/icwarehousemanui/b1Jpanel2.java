package presentation.icwarehousemanui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import po.documentsPO.OutbillsPO;
import businesslogic.documentsbl.documentController;
import businesslogic.storagebl.DriveModel.spaceBL;
import businesslogic.storagebl.OutDepot.OutDepotBL;


public class b1Jpanel2 extends JPanel{
	
	
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	private b1Jpanel1 b1Jpanel1;
	private JLabel j1,j2,j3,j4,j5,j6,j7,j8,t1,t2,t5,t6;
	private JTextField t3,t4,t7;
	private JButton yesButton;
	private String code;
	private String account;
	private String state;
	
	private documentController documentController;
	private spaceBL depot110;

	public b1Jpanel2(b1icwarehousemanui ui,icwarehousemanJpanel icwarehousemanJpanel,b1Jpanel1 b1Jpanel1,String code,String account,String state) {
		// TODO Auto-generated constructor stub
		this.code=code;
		this.account=account;
		this.state=state;
		init();
		icwarehousemanJpanel.add(this);
		registListener(ui,icwarehousemanJpanel,b1Jpanel1,this);
	}
	
	private void init(){
		documentController=new documentController();
		depot110 = new spaceBL();
		ImageIcon returnIcon=new ImageIcon("picture/����.png");
		ImageIcon i1 = new ImageIcon("picture/���ͼƬ/���ⵥ.png");
		ImageIcon i2 = new ImageIcon("picture/���ͼƬ/���ⵥ���.png");
		ImageIcon i3 = new ImageIcon("picture/���ͼƬ/��ݱ��.png");
		ImageIcon i4 = new ImageIcon("picture/���ͼƬ/Ŀ�ĵ�.png");
		ImageIcon i5 = new ImageIcon("picture/���ͼƬ/װ����ʽ.png");
		ImageIcon i6 = new ImageIcon("picture/���ͼƬ/������.png");
		ImageIcon i7 = new ImageIcon("picture/���ͼƬ/��������.png");
		ImageIcon i8 = new ImageIcon("picture/���ͼƬ/���˱��.png");
		ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
		returnButton=new JButton(returnIcon);
		j1 = new JLabel(i1);
		j2 = new JLabel(i2);
		j3 = new JLabel(i3);
		j4 = new JLabel(i4);
		j5 = new JLabel(i5);
		j6 = new JLabel(i6);
		j7 = new JLabel(i7);
		j8 = new JLabel(i8);

		
		j1.setBounds(324, 50, 121, 45);
		j2.setBounds(22, 162, 129, 27);
		j3.setBounds(22, 269, 105, 27);
		j4.setBounds(22, 360, 81, 27);
		j5.setBounds(22, 446, 105, 27);
		j6.setBounds(368, 162, 81, 27);
		j7.setBounds(368, 269, 105, 27);
		j8.setBounds(368, 360, 105, 27);
		
		t1 = new JLabel(documentController.getDocCode("���ⵥ"));
		t2 = new JLabel(code);
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JLabel("���ⵥ");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		t6 = new JLabel(dateFormat.format(new Date()));
		t7 = new JTextField();
		
		t1.setForeground(Color.white);
		t2.setForeground(Color.white);
		t5.setForeground(Color.white);
		t6.setForeground(Color.white);
		
		t1.setFont(new Font("��Բ",Font.BOLD,24));
		t2.setFont(new Font("��Բ",Font.BOLD,24));
		t3.setFont(new Font("��Բ",Font.BOLD,24));
		t4.setFont(new Font("��Բ",Font.BOLD,24));
		t5.setFont(new Font("��Բ",Font.BOLD,24));
		t6.setFont(new Font("��Բ",Font.BOLD,24));
		t7.setFont(new Font("��Բ",Font.BOLD,24));
		
		t1.setBounds(160, 162, 200, 27);
		t2.setBounds(160, 269, 200, 27);
		t3.setBounds(160, 360, 200, 27);
		t4.setBounds(160, 446, 200, 27);
		t5.setBounds(478, 162, 200, 27);
		t6.setBounds(478, 269, 250, 27);
		t7.setBounds(478, 360, 181, 27);
		
		yesButton=new JButton(yesIcon);
		yesButton.setBounds(602, 575,48,48);
		yesButton.setContentAreaFilled(false);
		
		this.add(j1);
		this.add(j2);
		this.add(j3);
		this.add(j4);
		this.add(j5);
		this.add(j6);
		this.add(j7);
		this.add(j8);
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(t4);
		this.add(t5);
		this.add(t6);
		this.add(t7);
		this.add(yesButton);
		
		
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);
		this.setOpaque(false);
		this.setBounds(260, 60, 730,650);
		this.setLayout(null);
	}
	private boolean isFull(){
		if (t3.getText().equals("")) {
			return false;
		}
		if (t4.getText().equals("")) {
			return false;
		}
		if (t7.getText().equals("")) {
			return false;
		}
		return true;
	}
	private void registListener(final b1icwarehousemanui ui,final icwarehousemanJpanel icwarehousemanJpanel,final b1Jpanel1 b1Jpanel1,final b1Jpanel2 b1jpanel2){
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				b1Jpanel1.t1.setText("");
				b1Jpanel1.dingdantiaoxingmanumJLabel.setText("");
				b1Jpanel1.repaint();
				icwarehousemanJpanel.remove(b1jpanel2);
				icwarehousemanJpanel.add(b1Jpanel1);
				ui.getB1().setEnabled(true);
				icwarehousemanJpanel.repaint();
			}
		});
		yesButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				if (isFull()) {
					documentController.createBlock(new OutbillsPO(t1.getText(), "���ⵥ", code, t6.getText(), account, t3.getText(), t4.getText(), t7.getText()));
					String stateList[]=state.split("-");
					documentController.updateDrive(code, stateList[1]); 
					outfinishDialog out = new outfinishDialog(ui, "���ⵥ�������", true);
					
					//����Ҫ���ӿ�汨���Ĺ��ܣ�������
					int[] used = depot110.usedSpaceInf(stateList[1]);
					int[] all = depot110.allSpaceInf(stateList[1]);
					if(((double)used[0]/(double)all[0])<0.8){
						System.out.println("������������");
						//����Ҫ�ı��汨����ͼƬ
					}
					if(((double)used[1]/(double)all[1])<0.8){
						System.out.println("������������");
						//����Ҫ�ı��汨����ͼƬ
					}
					if(((double)used[2]/(double)all[2])<0.8){
						System.out.println("������������");
						//����Ҫ�ı��汨����ͼƬ
					}
					//����Ҫ���ӿ�汨���Ĺ��ܣ�������
					
					icwarehousemanJpanel.remove(b1jpanel2);
					icwarehousemanJpanel.add(ui.getOperationJpanel());
					ui.getB1().setEnabled(true);
					icwarehousemanJpanel.repaint();
				}
				else {
					new failDialog(ui, "ʧ��", true);
				}
			}
		});
	}
	
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
	
	class outfinishDialog extends JDialog{
		private dialogJpanel jPanel;
		private JLabel jLabel;
		private JButton jButton;
		public outfinishDialog(JFrame frame,String title,boolean modal) {
			super(frame,title,modal);
			init();
			registerListener();
			this.setVisible(true);
		}
		private void init(){
			ImageIcon yesIcon=new ImageIcon("picture/��¼.png");
			jLabel=new JLabel("���ⵥ�������",jLabel.CENTER);
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
					outfinishDialog.this.dispose();
				}
			});
		}
	}
	class failDialog extends JDialog{
		private dialogJpanel jPanel;
		private JLabel jLabel;
		private JButton jButton;
		public failDialog(JFrame frame,String title,boolean modal) {
			super(frame,title,modal);
			init();
			registerListener();
			this.setVisible(true);
		}
		private void init(){
			ImageIcon yesIcon=new ImageIcon("picture/��¼.png");
			jLabel=new JLabel("��д���������������д",jLabel.CENTER);
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
					failDialog.this.dispose();
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
}

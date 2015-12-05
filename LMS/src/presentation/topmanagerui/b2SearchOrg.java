package presentation.topmanagerui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.ColorConvertOp;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import businesslogic.organizationbl.BusinessController;
import businesslogic.organizationbl.MiddleController;
import presentation.adminui.MyTable;
import presentation.adminui.NumberFieldListener;
import presentation.financialstaffui.financialstaffui;

public class b2SearchOrg extends JPanel {
	
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JLabel tiShi;
	private JTextField orgF;
	private JButton search,returnButton;
	JButton b4;
	ImageIcon b4Icon=new ImageIcon("picture/�½�.png");
	private String orgs;
	private String[][]data={{"",""}};
	private String[] columnNames = {"�������","��������"};
	private MyTable orgTable;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	
	public b2SearchOrg(b2topmanagerui b2ui,topmanagerJpanel tjpl,String org){
		init(b2ui, tjpl, this, org);
		tjpl.add(this);
		registListener(b2ui, tjpl, this, org);
	}
	
	private void init(final b2topmanagerui b2ui,final topmanagerJpanel tjpl,final b2SearchOrg b2SearchOrg,String org){
		
		
		Font font = new Font("��Բ", Font.BOLD, 30);
		
		tiShi = new JLabel("������" + org + "���");
		tiShi.setFont(font);
		tiShi.setForeground(Color.WHITE);
		tiShi.setBounds(150, 100, 300, 50);
		this.add(tiShi);
		
		orgF = new JTextField();
		orgF.setFont(font);
		orgF.setForeground(Color.BLACK);
		orgF.setBounds(150, 160, 200, 50);
//		orgF.addKeyListener(new NumberFieldListener());
		this.add(orgF);
		
		search = new JButton("����");
		search.setFont(font);
		search.setForeground(Color.WHITE);
		search.setBounds(360, 160, 100, 50);
		this.add(search);
		
		b4=new JButton(b4Icon);
		returnButton=new JButton(returnIcon);
		b4.setContentAreaFilled(false);
		b4.setBounds(250,480,200, 50);
		this.add(b4);
		
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);
		
		
		this.setBounds(260, 60, 730,650);	
	 	this.setLayout(null);
	 	this.setOpaque(false);
		
	}

	private void registListener(final b2topmanagerui b2ui,final topmanagerJpanel tjpl,
			final b2SearchOrg b2SearchOrg,final String org) {
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tjpl.remove(b2SearchOrg);
				if(org.equals("Ӫҵ��")){
					new b2BusinessAdd(b2ui, tjpl, org);
				}else {
					new b2MiddleAdd(b2ui, tjpl, org);
				}
				
				tjpl.repaint();
			}
		});
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Font font = new Font("��Բ", Font.BOLD, 30);
				final String input = orgF.getText();
				if (input != null) {
					if(org.equals("Ӫҵ��")){
						BusinessController businessController = new BusinessController();
						orgs = businessController.getInfo(input);			
					}else{
						MiddleController middleController = new MiddleController();
						orgs = middleController.GetInfo(input);
					}
					if (orgs != null) {
						data[0][1] = orgs + org;
						data[0][0] = input;
						orgTable = new MyTable(data,columnNames);
						orgTable.setForeground(Color.GRAY);
						orgTable.setFont(font);
						orgTable.getTableHeader().setFont(font);
						orgTable.setRowHeight(40);
						orgTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
						orgTable.getColumnModel().getColumn(0).setPreferredWidth(240);
						orgTable.getColumnModel().getColumn(1).setPreferredWidth(240);
						orgTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
						orgTable.setSelectionForeground(Color.BLACK);
						orgTable.getTableHeader().setFont(new Font("����", Font.BOLD, 20));
						
						orgTable.addMouseListener(new MouseAdapter() {
							
							 public void mouseClicked(MouseEvent e) {
								 if(e.getClickCount()==2){
									 
									 int r = orgTable.getSelectedRow();
									 if (org.equals("Ӫҵ��")) {
										 if(data[r][0] != null){
											 tjpl.remove(b2SearchOrg);
											 
											b2ui.b1.setEnabled(false);
											b2ui.b2.setEnabled(false);
											b2ui.b3.setEnabled(false);
											
											new b2BusinessInfo(b2ui, tjpl, data[r][0]);
											tjpl.repaint();
										 }
									}else {
										if(!data[r][0].equals("")){
											 tjpl.remove(b2SearchOrg);
											 
											b2ui.b1.setEnabled(false);
											b2ui.b2.setEnabled(false);
											b2ui.b3.setEnabled(false);
											new b2MiddleInfo(b2ui, tjpl, input);
											tjpl.repaint();
									}
								 }
								 
								 }
							 }
						});
					
						final JScrollPane jsp = new JScrollPane(orgTable);
						jsp.setBounds(150, 220, 482, 200);
						
						b2SearchOrg.add(jsp);
					
					
						
					}else{
						tjpl.remove(b2SearchOrg);
						new b2SearchOrg(b2ui, tjpl, org);
						tjpl.repaint();
					}
				}
				}
				
		});
		
		returnButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				tjpl.remove(b2SearchOrg);
				tjpl.add(b2ui.operationJpanel);

				b2ui.b1.setEnabled(true);
				b2ui.b2.setEnabled(true);
				b2ui.b3.setEnabled(true);
				

				b2ui.repaint();

			}
		});
		


	}
	public void paintComponent(Graphics g)  
	{  
			super.paintComponent(g);    
			g.drawImage(frameIcon.getImage(),-7,-12,null);
	 }
}

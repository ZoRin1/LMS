package presentation.icwarehousemanui;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class stockDepotPanel2 extends JPanel{
	
	
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	private JLabel j1;
	private stockDepotJTable2 stockTable2;
	private JButton tieyun,hangyun;
//	private inDepotCheckJTable inDepotCheckJTable;
//	private JTable inDepotTable;
	private stockDepotPanel stock;
	private stockDepotPanel1 stock1;
	
	public stockDepotPanel2(icwarehousemanui icwarehousemanui,icwarehousemanJpanel icwarehousemanJpanel){
		init();
		icwarehousemanJpanel.add(this);
		registListener(icwarehousemanui,icwarehousemanJpanel,this);
	}
	
	
	private void  init(){
		ImageIcon returnIcon=new ImageIcon("picture/����.png");
		ImageIcon kuangjia = new ImageIcon("picture/���ͼƬ/������.png");
		returnButton=new JButton(returnIcon);
		tieyun = new JButton();
		tieyun.setBounds(82, 15, 38, 15);
		tieyun.setContentAreaFilled(false);
		tieyun.setBorderPainted(false);
		hangyun = new JButton();
		hangyun.setBounds(20, 16, 38, 17);
		hangyun.setContentAreaFilled(false);
		hangyun.setBorderPainted(false);
		j1 = new JLabel(kuangjia);
		j1.setBounds(0, 0, 720, 570);
		
		
		stockTable2 = new stockDepotJTable2(this);
//		initTable();
//		JScrollPane scrollPane = new JScrollPane(inDepotTable); 
//		scrollPane.getViewport().setOpaque(false);
//		scrollPane.setOpaque(false);
//		scrollPane.setViewportView(inDepotTable);
//        scrollPane.setColumnHeaderView(inDepotTable.getTableHeader());
//        
//        scrollPane.getColumnHeader().setOpaque(false);
//		scrollPane.setBounds(0, 57, 730, 475);
		
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		
		this.add(j1);
		this.add(returnButton);
		j1.add(stockTable2.getScrollPane());
		j1.add(hangyun);
		j1.add(tieyun);
		this.setOpaque(false);
		this.setBounds(260, 60, 730,650);
		this.setLayout(null);
	}
	
	private void registListener(final icwarehousemanui ui,final icwarehousemanJpanel icwarehousemanJpanel,final stockDepotPanel2 stockDepotPanel2){
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				icwarehousemanJpanel.remove(stockDepotPanel2);
				ui.getB1().setEnabled(true);
				ui.getB2().setEnabled(true);
				ui.getB3().setEnabled(true);
				ui.getB4().setEnabled(true);
				ui.getB5().setEnabled(true);
				ui.getB6().setEnabled(true);
				icwarehousemanJpanel.add(ui.getOperationJpanel());
				icwarehousemanJpanel.repaint();
			}
		});
		tieyun.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				System.out.println("tieyun");
				icwarehousemanJpanel.remove(stockDepotPanel2);
				stock1 = new stockDepotPanel1(ui, icwarehousemanJpanel);
				icwarehousemanJpanel.add(stock1);
				icwarehousemanJpanel.repaint();
			}
		});
		hangyun.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				System.out.println("qiyun");
				icwarehousemanJpanel.remove(stockDepotPanel2);
				stock = new stockDepotPanel(ui, icwarehousemanJpanel);
				icwarehousemanJpanel.add(stock);
				icwarehousemanJpanel.repaint();
			}
		});
	}
	
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
	
//	private void initTable(){
//		//���������
//		String[] inDepotName = new String[]{" "," "," "," "," "};
//		
//		Object[][] inDepotValue = new Object[][]{{"����","2321","fyk","2012-07-28 19:36:21","545"},
//				{"������","232134 KB","fykhlp","2012-07-28 19:36:21","455"},
//			{"������","2324 KB","fhlp","2012-07-28 19:36:21","454545"},
//					{"���㴫��","2324 KB","fykhlp","2012-07-28 19:36:21","455"},
//				{"����","232134 KB","fykhlp","2012-07-28 19:36:21","455"}
//					};
//		//��������ݣ� ���ƺ�Ҫ�����ݿ���ȡ��������д���
//		
//		DefaultTableModel tableModel = new DefaultTableModel(inDepotValue,inDepotName);
//		
//		inDepotTable = new JTable(tableModel);
//		inDepotTable.setRowHeight(32);
//		inDepotTable.setShowGrid(false);
//		TableColumn column = null;
//		column = inDepotTable.getColumnModel().getColumn(0);
//		column.setPreferredWidth(238);
//		column = inDepotTable.getColumnModel().getColumn(1);
//		column.setPreferredWidth(122);
//		column = inDepotTable.getColumnModel().getColumn(2);
//		column.setPreferredWidth(122);
//		column = inDepotTable.getColumnModel().getColumn(3);
//		column.setPreferredWidth(122);
//		column = inDepotTable.getColumnModel().getColumn(4);
//		column.setPreferredWidth(122);
//		
//		
//		inDepotTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//		inDepotTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
//		
//		inDepotTable.setOpaque(false); 
//		DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
//		render.setOpaque(false);
//		
//		inDepotTable.setDefaultRenderer(Object.class,render);
//		
//		JTableHeader header = inDepotTable.getTableHeader();
//		header.setOpaque(false);
//		header.getTable().setOpaque(false);
//		
//		header.setDefaultRenderer(render); 
//		TableCellRenderer headerRenderer = header.getDefaultRenderer();
//		if (headerRenderer instanceof JLabel) {
//			((JLabel) headerRenderer).setHorizontalAlignment(JLabel.CENTER);
//			((JLabel) headerRenderer).setOpaque(false); 
//		}
//	}
}

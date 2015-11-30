package presentation.icwarehousemanui;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class checkDepotPanel1 extends JPanel{
	
	
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	private JLabel j1;
	private inDepotCheckJTable1 inDepotCheckJTable1;
	private JButton inDepot;
	private checkDepotPanel check;
//	private JTable inDepotTable;
	
	public checkDepotPanel1(icwarehousemanui icwarehousemanui,icwarehousemanJpanel icwarehousemanJpanel){
		init();
		icwarehousemanJpanel.add(this);
		registListener(icwarehousemanui,icwarehousemanJpanel,this);
	}
	
	
	private void  init(){
		ImageIcon returnIcon=new ImageIcon("picture/返回.png");
		ImageIcon kuangjia = new ImageIcon("picture/库存图片/库存信息框(出库).png");
		returnButton=new JButton(returnIcon);
		inDepot = new JButton();
		inDepot.setBounds(22, 17, 34, 17);
		inDepot.setContentAreaFilled(false);
		inDepot.setBorderPainted(false);
		j1 = new JLabel(kuangjia);
		j1.setBounds(0, 0, 720, 570);
		
		inDepotCheckJTable1 = new inDepotCheckJTable1(this);
		
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
		j1.add(inDepotCheckJTable1.getScrollPane());
		j1.add(inDepot);
		this.setOpaque(false);
		this.setBounds(260, 60, 730,650);
		this.setLayout(null);
	}
	
	private void registListener(final icwarehousemanui ui,final icwarehousemanJpanel icwarehousemanJpanel,final checkDepotPanel1 checkDepotPanel1){
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				icwarehousemanJpanel.remove(checkDepotPanel1);
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
		inDepot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				icwarehousemanJpanel.remove(checkDepotPanel1);
				check = new checkDepotPanel(ui, icwarehousemanJpanel);
				icwarehousemanJpanel.add(check);
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
//		//假设的数据
//		String[] inDepotName = new String[]{" "," "," "," "," "};
//		
//		Object[][] inDepotValue = new Object[][]{{"楚留","2321","fyk","2012-07-28 19:36:21","545"},
//				{"楚留奇","232134 KB","fykhlp","2012-07-28 19:36:21","455"},
//			{"楚留奇","2324 KB","fhlp","2012-07-28 19:36:21","454545"},
//					{"楚香传奇","2324 KB","fykhlp","2012-07-28 19:36:21","455"},
//				{"楚奇","232134 KB","fykhlp","2012-07-28 19:36:21","455"}
//					};
//		//假设的数据： 完善后要从数据库拿取数据来填写表格
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

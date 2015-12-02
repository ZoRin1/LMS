package presentation.icwarehousemanui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class checkDepotPanel extends JPanel{
	
	
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	private JLabel j1;
	private inDepotCheckJTable inDepotCheckJTable;
	private JButton outDepot;
	private checkDepotPanel1 check1;
//	private JTable inDepotTable;
	
	public checkDepotPanel(icwarehousemanui icwarehousemanui,icwarehousemanJpanel icwarehousemanJpanel){
		init();
		icwarehousemanJpanel.add(this);
		registListener(icwarehousemanui,icwarehousemanJpanel,this);
	}
	
	
	private void  init(){
		ImageIcon returnIcon=new ImageIcon("picture/返回.png");
		ImageIcon kuangjia = new ImageIcon("picture/库存图片/库存信息框.png");
		returnButton=new JButton(returnIcon);
		outDepot = new JButton();
		outDepot.setBounds(61, 17, 34, 17);
		outDepot.setContentAreaFilled(false);
		outDepot.setBorderPainted(false);
		j1 = new JLabel(kuangjia);
		j1.setBounds(0, 0, 720, 570);
		
		inDepotCheckJTable = new inDepotCheckJTable(this);//还要加一个单据的参数  这样才能显示！！！！
		
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
		j1.add(inDepotCheckJTable.getScrollPane());
		j1.add(outDepot);
		this.setOpaque(false);
		this.setBounds(260, 60, 730,650);
		this.setLayout(null);
	}
	
	private void registListener(final icwarehousemanui ui,final icwarehousemanJpanel icwarehousemanJpanel,final checkDepotPanel checkDepotPanel){
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				icwarehousemanJpanel.remove(checkDepotPanel);
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
		outDepot.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO 自动生成的方法存根
				icwarehousemanJpanel.remove(checkDepotPanel);
				check1 = new checkDepotPanel1(ui, icwarehousemanJpanel);
				icwarehousemanJpanel.add(check1);
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

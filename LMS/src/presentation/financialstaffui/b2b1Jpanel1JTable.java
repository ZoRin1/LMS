package presentation.financialstaffui;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import presentation.icwarehousemanui.checkDepotPanel;

public class b2b1Jpanel1JTable {
	
	private JTable accountJtabel;
	private b2b1Jpanel1 b2b1Jpanel1;
	private JScrollPane scrollPane;
	
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public b2b1Jpanel1JTable(b2b1Jpanel1 b2b1Jpanel1){
		this.b2b1Jpanel1 = b2b1Jpanel1;
		initTable();
		init();
	}
	private void init(){
        scrollPane = new JScrollPane(accountJtabel); 
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		scrollPane.setViewportView(accountJtabel);
        scrollPane.setColumnHeaderView(accountJtabel.getTableHeader());
        
        scrollPane.getColumnHeader().setOpaque(false);
		scrollPane.setBounds(0,34, 730, 540);
        
		b2b1Jpanel1.add(scrollPane);
	}
	
	private void initTable(){
		//假设的数据
		String[] inDepotName = new String[]{"帐户名称","账户余额"};
		
		Object[][] inDepotValue = new Object[][]{{"楚留","2321"},
				{"楚留奇","232134 KB"},
			{"楚留奇","2324 KB"},
					{"楚香传奇","2324 KB"},
				{"楚奇","232134 KB"}
					};
		//假设的数据： 完善后要从数据库拿取数据来填写表格
		
		DefaultTableModel tableModel = new DefaultTableModel(inDepotValue,inDepotName);
		
		accountJtabel = new JTable(tableModel);
		accountJtabel.setRowHeight(32);
		accountJtabel.setShowGrid(false);
		TableColumn column = null;
		column = accountJtabel.getColumnModel().getColumn(0);
		column.setPreferredWidth(361);
		column = accountJtabel.getColumnModel().getColumn(1);
		column.setPreferredWidth(366);
		
		
		accountJtabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		accountJtabel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		
		accountJtabel.setOpaque(false); 
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
		render.setOpaque(false);
		
		accountJtabel.setDefaultRenderer(Object.class,render);
		
		JTableHeader header = accountJtabel.getTableHeader();
		header.setOpaque(false);
		header.getTable().setOpaque(false);
		
		header.setDefaultRenderer(render); 
		TableCellRenderer headerRenderer = header.getDefaultRenderer();
		if (headerRenderer instanceof JLabel) {
			((JLabel) headerRenderer).setHorizontalAlignment(JLabel.CENTER);
			((JLabel) headerRenderer).setOpaque(false); 
		}
	}
	
}

package presentation.icwarehousemanui;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

public class inDepotCheckJTable {
	private JTable inDepotTable;
	private checkDepotPanel checkDepotPanel;
	
	public inDepotCheckJTable(checkDepotPanel checkDepotPanel){
		System.out.println("haha");
		initTable();
		JScrollPane scrollPane = new JScrollPane(); 
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		scrollPane.setViewportView(inDepotTable);
        scrollPane.setColumnHeaderView(inDepotTable.getTableHeader());
        
        scrollPane.getColumnHeader().setOpaque(false);
        
        checkDepotPanel.add(scrollPane);
//		init();
	}
//	private void init(){
//		JScrollPane scrollPane = new JScrollPane(); 
//		scrollPane.getViewport().setOpaque(false);
//		scrollPane.setOpaque(false);
//		scrollPane.setViewportView(inDepotTable);
//        scrollPane.setColumnHeaderView(inDepotTable.getTableHeader());
//        
//        scrollPane.getColumnHeader().setOpaque(false);
//        
//        checkDepotPanel.add(scrollPane);
//	}
	
	private void initTable(){
		String[] inDepotName = new String[]{" "," "," "," "," "};
		
		Object[][] inDepotValue = new Object[][]{{"³þÁôÏã´«Ææ","232134 KB","fykhlp","2012-07-28 19:36:21","454545"},
				{"³þÁôÏã´«Ææ","232134 KB","fykhlp","2012-07-28 19:36:21","454545"},
			{"³þÁôÏã´«Ææ","232134 KB","fykhlp","2012-07-28 19:36:21","454545"},
					{"³þÁôÏã´«Ææ","232134 KB","fykhlp","2012-07-28 19:36:21","454545"},
				{"³þÁôÏã´«Ææ","232134 KB","fykhlp","2012-07-28 19:36:21","454545"}
					};
		inDepotTable = new JTable(inDepotValue,inDepotName);
		inDepotTable.setRowHeight(32);
		inDepotTable.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);  
		inDepotTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		inDepotTable.setIntercellSpacing(new Dimension(0, 0));   
		
		inDepotTable.setOpaque(false); 
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
		render.setOpaque(false);
		
		inDepotTable.setDefaultRenderer(Object.class,render); 
		
		Dimension viewSize = new Dimension();
		viewSize.width = inDepotTable.getColumnModel().getTotalColumnWidth();
		viewSize.height = 10 * inDepotTable.getRowHeight();
		inDepotTable.setPreferredScrollableViewportSize(viewSize);
		
		JTableHeader header = inDepotTable.getTableHeader();
		header.setPreferredSize(new Dimension(30, 26)); 
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

package presentation.financialstaffui;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class b4Jpanel2JTable {
	
	private JTable billsJtabel;
	private b4Jpanel2 b4Jpanel2;
	private JScrollPane scrollPane;
	
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public b4Jpanel2JTable(b4Jpanel2 b4Jpanel2){
		this.b4Jpanel2 = b4Jpanel2;
		initTable();
		init();
	}
	private void init(){
        scrollPane = new JScrollPane(billsJtabel); 
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		scrollPane.setViewportView(billsJtabel);
        scrollPane.setColumnHeaderView(billsJtabel.getTableHeader());
        
        scrollPane.getColumnHeader().setOpaque(false);
		scrollPane.setBounds(0,35, 730, 540);
        
		b4Jpanel2.add(scrollPane);
	}
	
	private void initTable(){
		//假设的数据
		String[] inDepotName = new String[]{" "," "," "," "," "," "};
		
		Object[][] inDepotValue = new Object[][]{{"楚留","2321","dfsd","sdsd","sdsad","dsdsd"},
				{"楚留奇","232134 KB","dfsd","sdsd","sdsad","dsdsd"},
			{"楚留奇","2324 KB","dfsd","sdsd","sdsad","dsdsd"},
					{"楚香传奇","2324 KB","dfsd","sdsd","sdsad","dsdsd"},
				{"楚奇","232134 KB","dfsd","sdsd","sdsad","dsdsd"}
					};
		//假设的数据： 完善后要从数据库拿取数据来填写表格
		
		DefaultTableModel tableModel = new DefaultTableModel(inDepotValue,inDepotName);
		
		billsJtabel = new JTable(tableModel);
		billsJtabel.setRowHeight(32);
		billsJtabel.setShowGrid(false);
		TableColumn column = null;
		column = billsJtabel.getColumnModel().getColumn(0);
		column.setPreferredWidth(142);
		column = billsJtabel.getColumnModel().getColumn(1);
		column.setPreferredWidth(110);
		column = billsJtabel.getColumnModel().getColumn(2);
		column.setPreferredWidth(110);
		column = billsJtabel.getColumnModel().getColumn(3);
		column.setPreferredWidth(146);
		column = billsJtabel.getColumnModel().getColumn(4);
		column.setPreferredWidth(110);
		column = billsJtabel.getColumnModel().getColumn(5);
		column.setPreferredWidth(107);
		
		
		
		billsJtabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		billsJtabel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		
		billsJtabel.setOpaque(false); 
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
		render.setOpaque(false);
		
		billsJtabel.setDefaultRenderer(Object.class,render);
		
		JTableHeader header = billsJtabel.getTableHeader();
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

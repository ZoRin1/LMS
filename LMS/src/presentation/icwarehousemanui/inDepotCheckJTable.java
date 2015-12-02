package presentation.icwarehousemanui;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableColumnModelEvent;
import javax.swing.event.TableColumnModelListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class inDepotCheckJTable {
	private JTable inDepotTable;
	private checkDepotPanel checkDepotPanel;
	private JScrollPane scrollPane;
	
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public inDepotCheckJTable(checkDepotPanel checkDepotPanel){
		this.checkDepotPanel = checkDepotPanel;
		initTable();
		init();
	}
	private void init(){
        scrollPane = new JScrollPane(inDepotTable); 
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		scrollPane.setViewportView(inDepotTable);
        scrollPane.setColumnHeaderView(inDepotTable.getTableHeader());
        
        scrollPane.getColumnHeader().setOpaque(false);
		scrollPane.setBounds(0, 57, 730, 475);
        
        checkDepotPanel.add(scrollPane);
	}
	
	private void initTable(){
		//假设的数据
		String[] inDepotName = new String[]{" "," "," "," "," "};
		
		Object[][] inDepotValue = new Object[][]{{"楚留","2321","fyk","2012-07-28 19:36:21","545"},
				{"楚留奇","232134 KB","fykhlp","2012-07-28 19:36:21","455"},
			{"楚留奇","2324 KB","fhlp","2012-07-28 19:36:21","454545"},
					{"楚香传奇","2324 KB","fykhlp","2012-07-28 19:36:21","455"},
				{"楚奇","232134 KB","fykhlp","2012-07-28 19:36:21","455"}
					};
		//假设的数据： 完善后要从数据库拿取数据来填写表格
		
//		TableModel tableModel = new TableModel(inDepotValue,inDepotName);
		DefaultTableModel tableModel = new DefaultTableModel(inDepotValue,inDepotName);
		inDepotTable = new JTable(tableModel){
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		
		inDepotTable.getTableHeader().setReorderingAllowed(false); //设置列不可重排
		inDepotTable.getTableHeader().setResizingAllowed(false); //设置列不可拖动
		
		//对双击的监听
		inDepotTable.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2){
					int row = inDepotTable.getSelectedRow();
					String value = inDepotTable.getValueAt(row, 0).toString().trim();
					System.out.println(value);
					
					//下面实现对出入库单的调用！！！！
					//还要实现一个出入库单的dialog 来显示调用的出入库单
				}
			}
		});
		inDepotTable.setRowHeight(32);
		inDepotTable.setShowGrid(false);
		TableColumn column = null;
		column = inDepotTable.getColumnModel().getColumn(0);
		column.setPreferredWidth(238);
		column = inDepotTable.getColumnModel().getColumn(1);
		column.setPreferredWidth(122);
		column = inDepotTable.getColumnModel().getColumn(2);
		column.setPreferredWidth(122);
		column = inDepotTable.getColumnModel().getColumn(3);
		column.setPreferredWidth(122);
		column = inDepotTable.getColumnModel().getColumn(4);
		column.setPreferredWidth(122);
		
		
		inDepotTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		inDepotTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		
		inDepotTable.setOpaque(false); 
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
		render.setOpaque(false);
		
		inDepotTable.setDefaultRenderer(Object.class,render);
		
		JTableHeader header = inDepotTable.getTableHeader();
		header.setOpaque(false);
		header.getTable().setOpaque(false);
		
		header.setDefaultRenderer(render); 
		TableCellRenderer headerRenderer = header.getDefaultRenderer();
		if (headerRenderer instanceof JLabel) {
			((JLabel) headerRenderer).setHorizontalAlignment(JLabel.CENTER);
			((JLabel) headerRenderer).setOpaque(false); 
		}
	}
	
	private class TableModel extends DefaultTableModel{
		public boolean isCellEditable(int row, int column){
			return false;
		}
	}
}

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
		//���������
		String[] inDepotName = new String[]{"�ʻ�����","�˻����"};
		
		Object[][] inDepotValue = new Object[][]{{"����","2321"},
				{"������","232134 KB"},
			{"������","2324 KB"},
					{"���㴫��","2324 KB"},
				{"����","232134 KB"}
					};
		//��������ݣ� ���ƺ�Ҫ�����ݿ���ȡ��������д���
		
		DefaultTableModel tableModel = new DefaultTableModel(inDepotValue,inDepotName);
		
		accountJtabel = new JTable(tableModel){
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		
		accountJtabel.getTableHeader().setReorderingAllowed(false); //�����в�������
		accountJtabel.getTableHeader().setResizingAllowed(false);//�����в����϶�
		
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

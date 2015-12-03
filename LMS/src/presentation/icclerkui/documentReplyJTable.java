package presentation.icclerkui;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;


public class documentReplyJTable {
	private JTable Jtabel;
	private icclerkdocumentreplyOperationJpanel panel;
	private JScrollPane scrollPane;
	
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public documentReplyJTable(icclerkdocumentreplyOperationJpanel jpanel){
		this.panel = jpanel;
		initTable();
		init();
	}
	private void init(){
        scrollPane = new JScrollPane(Jtabel); 
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		scrollPane.setViewportView(Jtabel);
        scrollPane.setColumnHeaderView(Jtabel.getTableHeader());
        
        scrollPane.getColumnHeader().setOpaque(false);
		scrollPane.setBounds(0,32, 723, 540);
        
		panel.add(scrollPane);
	}
	
	private void initTable(){
		//���������
		String[] inDepotName = new String[]{" "," "};
		
		Object[][] inDepotValue = new Object[][]{{"����","2321"},
				{"������","232134 KB"},
			{"������","2324 KB"},
					{"���㴫��","2324 KB"},
				{"����","232134 KB"}
					};
		//��������ݣ� ���ƺ�Ҫ�����ݿ���ȡ��������д���
		
		DefaultTableModel tableModel = new DefaultTableModel(inDepotValue,inDepotName);
		
		Jtabel = new JTable(tableModel){
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		
		Jtabel.getTableHeader().setReorderingAllowed(false); //�����в�������
		Jtabel.getTableHeader().setResizingAllowed(false);//�����в����϶�
		
		
		Jtabel.setRowHeight(32);
		Jtabel.setShowGrid(false);
		TableColumn column = null;
		column = Jtabel.getColumnModel().getColumn(0);
		column.setPreferredWidth(361);
		column = Jtabel.getColumnModel().getColumn(1);
		column.setPreferredWidth(366);
		
		
		Jtabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		Jtabel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		
		Jtabel.setOpaque(false); 
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
		render.setOpaque(false);
		
		Jtabel.setDefaultRenderer(Object.class,render);
		
		JTableHeader header = Jtabel.getTableHeader();
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

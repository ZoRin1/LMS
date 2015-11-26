package presentation.adminui;

import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;


/**
 * �����࣬����̳���JTable���Ϊ���
 */

public class MyTable extends JTable {						// ʵ���Լ��ı����
	// ��дJTable��Ĺ��췽��
	public MyTable(Object[][]data,String[]ColumnsNames) {//Vector rowData, Vector columnNames
		super(data,ColumnsNames);						// ���ø���Ĺ��췽��
	}
	// ��дJTable���getTableHeader()����
	public JTableHeader getTableHeader() {					// ������ͷ
		JTableHeader tableHeader = super.getTableHeader();	// ��ñ��ͷ����
		tableHeader.setReorderingAllowed(false);			// ���ñ���в�������
		DefaultTableCellRenderer hr = (DefaultTableCellRenderer) tableHeader
				.getDefaultRenderer(); 						// ��ñ��ͷ�ĵ�Ԫ�����
		hr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);		// ��������������ʾ
		return tableHeader;
	}
	// ��дJTable���getDefaultRenderer(Class<?> columnClass)����
	public TableCellRenderer getDefaultRenderer(Class<?> columnClass) {	// ���嵥Ԫ��
		DefaultTableCellRenderer cr = (DefaultTableCellRenderer) super
				.getDefaultRenderer(columnClass); 						// ��ñ��ĵ�Ԫ�����
		cr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER); 	// ���õ�Ԫ�����ݾ�����ʾ
		return cr;
	}
	// ��дJTable���isCellEditable(int row, int column)����
	public boolean isCellEditable(int row, int column) {				// ��񲻿ɱ༭
		return false;
	}
}


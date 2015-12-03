package presentation.bhclerkui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class CarInfoJpanelJTable {
	
	private JTable carInfTable;
	private CarInfoJpanel CarInfoJpanel;
	private JScrollPane scrollPane;
	
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	
	public CarInfoJpanelJTable(CarInfoJpanel CarInfoJpanel){
		this.CarInfoJpanel = CarInfoJpanel;
		initTable();
		init();
	}
	
	private void init(){
        scrollPane = new JScrollPane(carInfTable); 
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		scrollPane.setViewportView(carInfTable);
        scrollPane.setColumnHeaderView(carInfTable.getTableHeader());
        
        scrollPane.getColumnHeader().setOpaque(false);
		scrollPane.setBounds(0, 0, 730, 571);
        
		CarInfoJpanel.add(scrollPane);
	}
	
	private void initTable(){
		//���������
		String[] inDepotName = new String[]{"��������","���ƺ�"};
		
		Object[][] inDepotValue = new Object[][]{{"fyk","2012-07-"},
				{"sfdf","dfsd"},
			{"2012-07-2","454545"},
					{"dsad","dsad"},
				{"����","232134 KB"}
					};
		//��������ݣ� ���ƺ�Ҫ�����ݿ���ȡ��������д���
		
		DefaultTableModel tableModel = new DefaultTableModel(inDepotValue,inDepotName);
		
		carInfTable = new JTable(tableModel){
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		
		carInfTable.getTableHeader().setReorderingAllowed(false); //�����в�������
		carInfTable.getTableHeader().setResizingAllowed(false); //�����в����϶�
		
		//��˫���ļ���
		carInfTable.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2){
					int row = carInfTable.getSelectedRow();
					String value = carInfTable.getValueAt(row, 0).toString().trim();
					System.out.println(value);
					
					
					//�����ľ���ʵ��
				}
			}
		});
		
		carInfTable.setRowHeight(32);
		carInfTable.setShowGrid(false);
		TableColumn column = null;
		column = carInfTable.getColumnModel().getColumn(0);
		column.setPreferredWidth(413);
		column = carInfTable.getColumnModel().getColumn(1);
		column.setPreferredWidth(310);
		
		
		carInfTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		carInfTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		
		carInfTable.setOpaque(false); 
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
		render.setOpaque(false);
		
		carInfTable.setDefaultRenderer(Object.class,render);
		
		JTableHeader header = carInfTable.getTableHeader();
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

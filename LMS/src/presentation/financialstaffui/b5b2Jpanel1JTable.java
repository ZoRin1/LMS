package presentation.financialstaffui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import po.financePO.BooksPO;

public class b5b2Jpanel1JTable {
	
	private JTable booksJtabel;
	private b5b2Jpanel1 b5b2Jpanel1;
	private JScrollPane scrollPane;
	
	private ArrayList<BooksPO> bookList;
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public b5b2Jpanel1JTable(b5b2Jpanel1 b5b2Jpanel1,ArrayList<BooksPO> bookList){
		this.bookList = bookList;
		this.b5b2Jpanel1 = b5b2Jpanel1;
		initTable();
		init();
	}
	private void init(){
        scrollPane = new JScrollPane(booksJtabel); 
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		scrollPane.setViewportView(booksJtabel);
        scrollPane.setColumnHeaderView(booksJtabel.getTableHeader());
        
        scrollPane.getColumnHeader().setOpaque(false);
		scrollPane.setBounds(0,35, 730, 540);
        
		b5b2Jpanel1.add(scrollPane);
	}
	
	private void initTable(){
		//���������
		String[] inDepotName = new String[]{" "," "};
		
//		
//		Object[][] inDepotValue = new Object[][]{{"����","2321"},
//				{"������","232134 KB"},
//			{"������","2324 KB"},
//					{"���㴫��","2324 KB"},
//				{"����","232134 KB"}
//					};
		
		Object[][] inDepotValue = new Object[bookList.size()][2];
		for(int i = 0 ; i < bookList.size();i++){
			inDepotValue[i][0] = bookList.get(i).getAccountName();
			inDepotValue[i][1] = bookList.get(i).getDate();
			
		}
		//��������ݣ� ���ƺ�Ҫ�����ݿ���ȡ��������д���
		
		DefaultTableModel tableModel = new DefaultTableModel(inDepotValue,inDepotName);
		
		booksJtabel = new JTable(tableModel){
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		
		booksJtabel.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				// TODO �Զ����ɵķ������
				if(e.getClickCount()==2){
					System.out.println("����");
					
					//��ȡ��������� ���õ���Ӧ������ ��ͨ��dialog ��ʾ����������
					//��ȡ��������� ���õ���Ӧ������ ��ͨ��dialog ��ʾ����������
					
				}
			}
		});
		
		booksJtabel.getTableHeader().setReorderingAllowed(false); //�����в�������
		booksJtabel.getTableHeader().setResizingAllowed(false);//�����в����϶�
		
		booksJtabel.setRowHeight(32);
		booksJtabel.setShowGrid(false);
		TableColumn column = null;
		column = booksJtabel.getColumnModel().getColumn(0);
		column.setPreferredWidth(361);
		column = booksJtabel.getColumnModel().getColumn(1);
		column.setPreferredWidth(362);
		
		
		booksJtabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		booksJtabel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
		
		booksJtabel.setOpaque(false); 
		DefaultTableCellRenderer render = new DefaultTableCellRenderer();   
		render.setOpaque(false);
		
		booksJtabel.setDefaultRenderer(Object.class,render);
		
		JTableHeader header = booksJtabel.getTableHeader();
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

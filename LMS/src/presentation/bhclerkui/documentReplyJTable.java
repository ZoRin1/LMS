package presentation.bhclerkui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import po.documentsPO.DocumentPO;
import po.documentsPO.LoadingPO;
import po.documentsPO.ReceiptPO;
import po.documentsPO.YDispatchPO;
import po.documentsPO.YReceivePO;
import businesslogic.documentsbl.documentController;

public class documentReplyJTable {
	
	private JTable Jtabel;
	private bhclerkdocumentreplyOperationJpanel panel;
	private JScrollPane scrollPane;
	private String account;
	private DocumentPO po;
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public documentReplyJTable(bhclerkdocumentreplyOperationJpanel jpanel,String account){
		this.panel = jpanel;
		this.account=account;
		initTable();
		init();
	}
	private void init(){
        scrollPane = new JScrollPane(Jtabel); 
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		scrollPane.setViewportView(Jtabel);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setColumnHeaderView(Jtabel.getTableHeader());
        
        scrollPane.getColumnHeader().setOpaque(false);
		scrollPane.setBounds(0,32, 723,535);
        
		panel.add(scrollPane);
	}
	
	private void initTable(){
		//假设的数据
		String[] inDepotName = new String[]{" "," "};
		ArrayList<String> list=new documentController().showOwnList(account);
		int length=list.size();
		String [][] inDepotValue=new String[length][2];
		for(int i=0;i<length;i++){
			String str[]=list.get(i).split(",");
			inDepotValue[i][0]=str[0];
			inDepotValue[i][1]=str[1];
		}
		
		DefaultTableModel tableModel = new DefaultTableModel(inDepotValue,inDepotName);
		
		Jtabel = new JTable(tableModel){
			public boolean isCellEditable(int row, int column){
				return false;
			}
		};
		
		Jtabel.getTableHeader().setReorderingAllowed(false); //设置列不可重排
		Jtabel.getTableHeader().setResizingAllowed(false);//设置列不可拖动
		
		//对双击的监听
		Jtabel.addMouseListener(new MouseAdapter() {
					
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2){
					int row = Jtabel.getSelectedRow();
					String value = Jtabel.getValueAt(row, 0).toString().trim();
					String value2= Jtabel.getValueAt(row, 1).toString().trim();
					po=new documentController().getBufferedInfo(value, value2);
					if(value2.equals("营业厅装车单")){
						LoadingPO po1=(LoadingPO)po;
					}
					else if(value2.equals("营业厅接收单")){
						YReceivePO po1=(YReceivePO)po;
					}
					else if(value2.equals("派件单")){
						YDispatchPO po1=(YDispatchPO)po;
					}
					else{
						ReceiptPO po1=(ReceiptPO)po;
					}
					//监听的具体实现
				}
			}
		});
				
		Jtabel.setRowHeight(32);
		Jtabel.setShowGrid(false);
		TableColumn column = null;
		column = Jtabel.getColumnModel().getColumn(0);
		column.setPreferredWidth(360);
		column = Jtabel.getColumnModel().getColumn(1);
		column.setPreferredWidth(360);
		
		
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

package presentation.icclerkui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
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

import businesslogic.documentsbl.documentController;
import po.documentsPO.DocumentPO;
import po.documentsPO.LoadingPO;
import po.documentsPO.ZLoadingPO;
import po.documentsPO.ZReceivePO;
import presentation.icclerkui.icclerkdocumentreplyOperationJpanel;

public class documentReplyJTable {
	private JTable Jtabel;
	private icclerkdocumentreplyOperationJpanel panel;
	private JScrollPane scrollPane;
	private String account;
	private DocumentPO po;
	public JScrollPane getScrollPane() {
		return scrollPane;
	}
	public documentReplyJTable(icclerkdocumentreplyOperationJpanel jpanel,String account){
		this.account=account;
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
		scrollPane.setBounds(0,32, 723, 535);
        
		panel.add(scrollPane);
	}
	
	private void initTable(){
		//���������
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
		
		Jtabel.getTableHeader().setReorderingAllowed(false); //�����в�������
		Jtabel.getTableHeader().setResizingAllowed(false);//�����в����϶�
		
		Jtabel.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2){
					int row = Jtabel.getSelectedRow();
					String value = Jtabel.getValueAt(row, 0).toString().trim();
					String value2= Jtabel.getValueAt(row, 1).toString().trim();
					po=new documentController().getBufferedInfo(value, value2);
					System.out.println("m");
					if(value2.equals("Ӫҵ��װ����")){
						LoadingPO po1=(LoadingPO)po;
					}
					else if(value2.equals("��ת���Ľ��յ�")){
						ZReceivePO po1=(ZReceivePO)po;
					}
					else{
						ZLoadingPO po1=(ZLoadingPO)po;
					}
					//�����ľ���ʵ��
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
class LoadingDialog extends JDialog{
	private dialogJpanel jPanel;
	private JButton jButton;
	private JTable Jtabel;
	private LoadingPO po;
	private JScrollPane scrollPane;
	public LoadingDialog(JFrame frame,String title,boolean modal,LoadingPO po) {
		super(frame,title,modal);
		this.po=po;
		initTable();
		init();
		registerListener();
		this.setVisible(true);
	}
	private void initTable(){
		//���������
		String[] inDepotName = new String[]{" "," "};
		ArrayList<String> list=po.getCodeList();
		int length=list.size();
		String [][] inDepotValue=new String[length+5][2];
		inDepotValue[0][0]="�����أ�";
		inDepotValue[0][1]=po.getDeparture();
		inDepotValue[1][0]="����أ�";
		inDepotValue[1][1]=po.getArrival();
		inDepotValue[2][0]="��װԱ��";
		inDepotValue[2][1]=po.getSupervisor();
		inDepotValue[3][0]="Ѻ��Ա��";
		inDepotValue[3][1]=po.getSupercargo();
		inDepotValue[4][0]="�������˵��ţ�";
		inDepotValue[length+4][0]="�˷�:";
		inDepotValue[length+4][1]=po.getCharge()+"";
		for(int i=0;i<length;i++){
			inDepotValue[i+4][1]=list.get(i);
		}
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
		column.setPreferredWidth(360);
		column = Jtabel.getColumnModel().getColumn(1);
		column.setPreferredWidth(360);
		
		Jtabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		Jtabel.setEnabled(false);
		
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
	private void init(){
		scrollPane = new JScrollPane(Jtabel); 
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setOpaque(false);
		scrollPane.setViewportView(Jtabel);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setColumnHeaderView(Jtabel.getTableHeader());
        scrollPane.getColumnHeader().setOpaque(false);
        scrollPane.setBounds(50,5,400,180);
        this.add(scrollPane);
        
		ImageIcon yesIcon=new ImageIcon("picture/��¼.png");
		jPanel=new dialogJpanel();
		
		jButton=new JButton(yesIcon);
		jButton.setContentAreaFilled(false);
		jButton.setBounds(218,190, 64, 64);
		jPanel.add(jButton);
		jPanel.setLayout(null);
		
		this.add(jPanel);
		this.setSize(500, 300);
		Toolkit kitToolkit =Toolkit.getDefaultToolkit();
		Dimension screenSize=kitToolkit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int dialogWidth=this.getWidth();
		int dialogHeight=this.getHeight();
		this.setLocation((screenWidth-dialogWidth)/2, (screenHeight-dialogHeight)/2);
		this.setResizable(false);
	}
	private void registerListener(){
		jButton.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				LoadingDialog.this.dispose();
			}
		});
	}
}

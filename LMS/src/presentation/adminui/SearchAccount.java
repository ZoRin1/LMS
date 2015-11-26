package presentation.adminui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class SearchAccount extends JPanel {
	private ImageIcon frameIcon =new ImageIcon("picture/²Ù×÷Ãæ°å.png");
	private MyTable accountTable;
	private String[][]data={{"",""},{"",""},{"",""}};
	private String[] columnNames = {"ÕËºÅ","ÐÕÃû"};
	
	public SearchAccount(final adminui aui,final adminJpanel apl,String[]accounts){
		
		init(accounts);
		apl.add(this);
		registListener(aui, apl, this);
	}
	
	private void init(String[] accounts) {
		System.out.println(accounts[0]);
		String[]temp = accounts[0].split("-");
		System.out.println(temp[0]);
		data[0][0] = temp[0];
		data[0][1] = temp[1];
		accountTable = new MyTable(data,columnNames);
		Font font = new Font("Ó×Ô²", Font.BOLD, 20);
		accountTable.setForeground(Color.LIGHT_GRAY);
		accountTable.setFont(font);
		accountTable.getTableHeader().setFont(font);
		accountTable.setRowHeight(30);
		accountTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		accountTable.getColumnModel().getColumn(0).setPreferredWidth(200);
		accountTable.getColumnModel().getColumn(1).setPreferredWidth(200);
		accountTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		accountTable.setCellEditor(null);

		accountTable.addMouseListener(new MouseAdapter() {
			
			 public void mouseClicked(MouseEvent e) {
				 if(e.getClickCount()==2)
					 System.out.println("¹þ¹þ¹þ¹þ");
			 }
		});
		JScrollPane jsp = new JScrollPane(accountTable);
		jsp.setBounds(100, 80, 400, 200);
		this.add(jsp);
		this.setBounds(260, 60, 730,650);	
	 	this.setLayout(null);
	 	this.setOpaque(false);	
		
		}
		
	
	private void registListener(final adminui aui,final adminJpanel apl,final SearchAccount searchAccount) {
		
	}
	
	
	public void paintComponent(Graphics g)  
	{  
			super.paintComponent(g);    
			g.drawImage(frameIcon.getImage(),-7,-12,null);
	 }
	

}

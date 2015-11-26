package presentation.adminui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;

public class SearchAccount extends JPanel {
	private ImageIcon frameIcon =new ImageIcon("picture/²Ù×÷Ãæ°å.png");
	private JTable accountTable;
	private String[][]data = {{"123","Ñî»ª°²"}};
	private String[] columnNames = {"ÐÕÃû","ÕËºÅ"};
	
	public SearchAccount(final adminui aui,final adminJpanel apl,String[]accounts){
		
		init(accounts);
		apl.add(this);
		registListener(aui, apl, this);
	}
	
	private void init(String[] accounts) {
		System.out.println(accounts[0]);
//		String[]temp = accounts[0].split("-");
//		System.out.println(temp[0]);
//		data[0][0] = temp[0];
//		data[0][1] = temp[1];
		accountTable = new JTable(data,columnNames);
		Font font = new Font("Ó×Ô²", Font.BOLD, 30);
		accountTable.setForeground(Color.WHITE);
		accountTable.setFont(font);
		accountTable.setRowHeight(50);
		accountTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		accountTable.getColumnModel().getColumn(0).setPreferredWidth(100);
		accountTable.getColumnModel().getColumn(1).setPreferredWidth(100);

		accountTable.setBounds(60, 40, 500, 400);
		this.add(accountTable);
		
		this.setBounds(260, 60, 730,650);	
	 	this.setLayout(null);
	 	this.setOpaque(false);	
//		accountTable.addMouseListener(new MouseAdapter() {
//			
//			int r = accountTable.getSelectedRow();
//			Object value = accountTable.getValueAt(r, 1);
//			long ID = Long.parseLong(value.toString());
//			
//			
//		});
		
	}
	private void registListener(final adminui aui,final adminJpanel apl,final SearchAccount searchAccount) {
		
	}
	
	
	public void paintComponent(Graphics g)  
	{  
			super.paintComponent(g);    
			g.drawImage(frameIcon.getImage(),-7,-12,null);
	 }
	

}

package presentation.icwarehousemanui;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class checkDepotPanel extends JPanel{
	
	
	private ImageIcon frameIcon =new ImageIcon("picture/²Ù×÷Ãæ°å.png");
	private JButton returnButton;
	private JLabel j1;
	private inDepotCheckJTable inDepotCheckJTable;
	
	public checkDepotPanel(icwarehousemanui icwarehousemanui,icwarehousemanJpanel icwarehousemanJpanel){
		init();
		icwarehousemanJpanel.add(this);
		registListener(icwarehousemanui,icwarehousemanJpanel,this);
	}
	
	
	private void  init(){
		ImageIcon returnIcon=new ImageIcon("picture/·µ»Ø.png");
		ImageIcon kuangjia = new ImageIcon("picture/¿â´æÍ¼Æ¬/Ê×Ò³.png");
		returnButton=new JButton(returnIcon);
		j1 = new JLabel(kuangjia);
		j1.setBounds(0, 0, 720, 570);
		
//		inDepotCheckJTable = new inDepotCheckJTable(this);
		
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		
		this.add(j1);
		this.add(returnButton);
		this.setOpaque(false);
		this.setBounds(260, 60, 730,650);
		this.setLayout(null);
	}
	
	private void registListener(final icwarehousemanui ui,final icwarehousemanJpanel icwarehousemanJpanel,final checkDepotPanel checkDepotPanel){
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				icwarehousemanJpanel.remove(checkDepotPanel);
				icwarehousemanJpanel.add(ui.getOperationJpanel());
				icwarehousemanJpanel.repaint();
			}
		});
	}
	
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}

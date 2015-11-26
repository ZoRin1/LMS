package presentation.financialstaffui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class b4Jpanel1 extends JPanel{
	
	private ImageIcon frameIcon =new ImageIcon("picture/²Ù×÷Ãæ°å.png");
	private JButton returnButton;
	private ImageIcon returnIcon=new ImageIcon("picture/·µ»Ø.png");
	public b4Jpanel1(financialstaffui financialstaffui,financialstaffJpanel financialstaffJpanel) {
		// TODO Auto-generated constructor stub
		init();
		financialstaffJpanel.add(this);
		registListener(financialstaffui,financialstaffJpanel,this);
	}
	private void init(){
		Font font=new Font("Ó×Ô²",Font.BOLD,20);

		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);

	 	this.setBounds(260, 60, 730,650);

	 	this.add(returnButton);
	 	this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final financialstaffui financialstaffui,final financialstaffJpanel financialstaffJpanel,final b4Jpanel1 b4Jpanel1){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				financialstaffJpanel.remove(b4Jpanel1);
				financialstaffJpanel.add(financialstaffui.operationJpanel);
				financialstaffui.b1.setEnabled(true);
				financialstaffui.b2.setEnabled(true);
				financialstaffui.b3.setEnabled(true);
				financialstaffui.b4.setEnabled(true);
				financialstaffui.b5.setEnabled(true);
				financialstaffJpanel.repaint();
			}
		});
	}
	public void paintComponent(Graphics g)  
{  
		super.paintComponent(g);    
		g.drawImage(frameIcon.getImage(),-7,-12,null);
 }
}

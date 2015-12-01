package presentation.courierui;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class documentJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/²Ù×÷Ãæ°å.png");
	private JButton returnButton;
	private ImageIcon returnIcon=new ImageIcon("picture/·µ»Ø.png");
	public documentJpanel(courierui courierui,courierJpanel courierJpanel) {
		// TODO Auto-generated constructor stub
		init();
	 	courierJpanel.add(this);
		registListener(courierui,courierJpanel,this);
	}
	private void init(){
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
	 	this.setBounds(260, 60, 730,650);
	 	this.add(returnButton);
	 	this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final courierui courierui,final courierJpanel courierJpanel,final documentJpanel documentb1Jpanel1){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				courierJpanel.remove(documentb1Jpanel1);
				courierJpanel.add(courierui.operationJpanel);
				courierui.orderfinishButton.setEnabled(true);
				courierui.orderfoundButton.setEnabled(true);
				courierui.documentreplyButton.setEnabled(true);
				courierJpanel.repaint();
			}
		});
		
	}
	public void paintComponent(Graphics g)  
{  
		super.paintComponent(g);    
		g.drawImage(frameIcon.getImage(),-7,-12,null);
 }
}
package presentation.financialstaffui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class b3b2Jpanel1 extends JPanel{
	
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	public b3b2Jpanel1(b3financialstaffui b3financialstaffui,financialstaffJpanel financialstaffJpanel) {
		// TODO Auto-generated constructor stub
		init();
		financialstaffJpanel.add(this);
		registListener(b3financialstaffui,financialstaffJpanel,this);
	}
	private void init(){
		Font font=new Font("��Բ",Font.BOLD,20);

		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);

	 	this.setBounds(260, 60, 730,650);

	 	this.add(returnButton);
	 	this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final b3financialstaffui b3financialstaffui,final financialstaffJpanel financialstaffJpanel,final b3b2Jpanel1 b3b2Jpanel1){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				financialstaffJpanel.remove(b3b2Jpanel1);
				financialstaffJpanel.add(b3financialstaffui.operationJpanel);
				b3financialstaffui.b1.setEnabled(true);
				b3financialstaffui.b2.setEnabled(true);
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

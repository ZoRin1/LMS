package presentation.financialstaffui;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class b5b2Jpanel1 extends JPanel{
	
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	private ImageIcon returnIcon=new ImageIcon("picture/返回.png");
	private JLabel j1;
	
	public b5b2Jpanel1(b5financialstaffui b5financialstaffui,financialstaffJpanel financialstaffJpanel) {
		// TODO Auto-generated constructor stub
		init();
		financialstaffJpanel.add(this);
		registListener(b5financialstaffui,financialstaffJpanel,this);
	}
	private void init(){
		Font font=new Font("幼圆",Font.BOLD,20);
		ImageIcon i1 = new ImageIcon("picture/财务图片/账本列表.png");
		j1 = new JLabel(i1);
		j1.setBounds(0, 0, 723, 569);

		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);

	 	this.setBounds(260, 60, 730,650);

	 	this.add(j1);
	 	this.add(returnButton);
	 	this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final b5financialstaffui b5financialstaffui,final financialstaffJpanel financialstaffJpanel,final b5b2Jpanel1 b5b2Jpanel1){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Component b3b1Jpanel1;
				// TODO Auto-generated method stub
				financialstaffJpanel.remove(b5b2Jpanel1);
				financialstaffJpanel.add(b5financialstaffui.operationJpanel);
				b5financialstaffui.b1.setEnabled(true);
				b5financialstaffui.b2.setEnabled(true);
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


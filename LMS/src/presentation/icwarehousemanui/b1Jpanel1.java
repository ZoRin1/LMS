package presentation.icwarehousemanui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class b1Jpanel1 extends JPanel{
	
	
	private ImageIcon frameIcon =new ImageIcon("picture/²Ù×÷Ãæ°å.png");
	private JButton returnButton;
	private JLabel j1,j2,j3,j4,j5,j6,j7,j8;
	private JTextField t1,t2,t3,t4,t5,t6,t7;
	private JButton queding,quxiao;
	
	public b1Jpanel1(b1icwarehousemanui ui,icwarehousemanJpanel icwarehousemanJpanel) {
		// TODO Auto-generated constructor stub
		init();
		icwarehousemanJpanel.add(this);
		registListener(ui,icwarehousemanJpanel,this);
	}
	
	private void init(){
		ImageIcon returnIcon=new ImageIcon("picture/·µ»Ø.png");
		ImageIcon i1 = new ImageIcon("picture/¿â´æÍ¼Æ¬/³ö¿âµ¥.png");
		ImageIcon i2 = new ImageIcon("picture/¿â´æÍ¼Æ¬/³ö¿âµ¥±àºÅ.png");
		ImageIcon i3 = new ImageIcon("picture/¿â´æÍ¼Æ¬/¿ìµÝ±àºÅ.png");
		ImageIcon i4 = new ImageIcon("picture/¿â´æÍ¼Æ¬/Ä¿µÄµØ.png");
		ImageIcon i5 = new ImageIcon("picture/¿â´æÍ¼Æ¬/×°ÔËÐÎÊ½.png");
		ImageIcon i6 = new ImageIcon("picture/¿â´æÍ¼Æ¬/µ¥¾ÝÃû.png");
		ImageIcon i7 = new ImageIcon("picture/¿â´æÍ¼Æ¬/³ö¿âÈÕÆÚ.png");
		ImageIcon i8 = new ImageIcon("picture/¿â´æÍ¼Æ¬/ÆûÔË±àºÅ.png");
		returnButton=new JButton(returnIcon);
		j1 = new JLabel(i1);
		j2 = new JLabel(i2);
		j3 = new JLabel(i3);
		j4 = new JLabel(i4);
		j5 = new JLabel(i5);
		j6 = new JLabel(i6);
		j7 = new JLabel(i7);
		j8 = new JLabel(i8);

		
		j1.setBounds(324, 50, 121, 45);
		j2.setBounds(22, 162, 129, 27);
		j3.setBounds(22, 269, 105, 27);
		j4.setBounds(22, 360, 81, 27);
		j5.setBounds(22, 446, 105, 27);
		j6.setBounds(385, 162, 81, 27);
		j7.setBounds(385, 269, 105, 27);
		j8.setBounds(385, 360, 105, 27);
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		t7 = new JTextField();
		
		t1.setForeground(Color.black);
		t2.setForeground(Color.black);
		t3.setForeground(Color.black);
		t4.setForeground(Color.black);
		t5.setForeground(Color.black);
		t6.setForeground(Color.black);
		t7.setForeground(Color.black);
		
		t1.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t2.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t3.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t4.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t5.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t6.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t7.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		
		t1.setBounds(160, 162, 200, 27);
		t2.setBounds(160, 269, 200, 27);
		t3.setBounds(160, 360, 200, 27);
		t4.setBounds(160, 446, 200, 27);
		t5.setBounds(483, 162, 200, 27);
		t6.setBounds(483, 269, 181, 27);
		t7.setBounds(483, 360, 181, 27);
		
		this.add(j1);
		this.add(j2);
		this.add(j3);
		this.add(j4);
		this.add(j5);
		this.add(j6);
		this.add(j7);
		this.add(j8);
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(t4);
		this.add(t5);
		this.add(t6);
		this.add(t7);
		
		
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);
		this.setOpaque(false);
		this.setBounds(260, 60, 730,650);
		this.setLayout(null);
	}
	
	private void registListener(final b1icwarehousemanui ui,final icwarehousemanJpanel icwarehousemanJpanel,final b1Jpanel1 b1jpanel){
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				icwarehousemanJpanel.remove(b1jpanel);
				icwarehousemanJpanel.add(ui.getOperationJpanel());
				ui.getB1().setEnabled(true);
				ui.getB2().setEnabled(true);
				icwarehousemanJpanel.repaint();
			}
		});
		
//		quxiao.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent arg0) {
//				// TODO ×Ô¶¯Éú³ÉµÄ·½·¨´æ¸ù
//				icwarehousemanJpanel.remove(b2jpanel);
//				icwarehousemanJpanel.add(ui.getOperationJpanel());
//				ui.getB1().setEnabled(true);
//				ui.getB2().setEnabled(true);
//				icwarehousemanJpanel.repaint();
//			}
//		});
	}
	
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
}

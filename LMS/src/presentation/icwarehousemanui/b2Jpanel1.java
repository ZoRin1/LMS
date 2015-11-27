package presentation.icwarehousemanui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class b2Jpanel1 extends JPanel{

	private ImageIcon frameIcon =new ImageIcon("picture/²Ù×÷Ãæ°å.png");
	private JButton returnButton;
	private JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11;
	private JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
	private JButton queding,quxiao;
	public b2Jpanel1(b2icwarehousemanui ui,icwarehousemanJpanel icwarehousemanJpanel) {
		// TODO Auto-generated constructor stub
		init();
		icwarehousemanJpanel.add(this);
		registListener(ui,icwarehousemanJpanel,this);
	}
	private void init(){
		ImageIcon returnIcon=new ImageIcon("picture/·µ»Ø.png");
		ImageIcon i1 = new ImageIcon("picture/¿â´æÍ¼Æ¬/Èë¿âµ¥.png");
		ImageIcon i2 = new ImageIcon("picture/¿â´æÍ¼Æ¬/Èë¿âµ¥±àºÅ.png");
		ImageIcon i3 = new ImageIcon("picture/¿â´æÍ¼Æ¬/µ¥¾ÝÃû.png");
		ImageIcon i4 = new ImageIcon("picture/¿â´æÍ¼Æ¬/Èë¿â¿ìµÝµ¥ºÅ.png");
		ImageIcon i5 = new ImageIcon("picture/¿â´æÍ¼Æ¬/Èë¿âÈÕÆÚ.png");
		ImageIcon i6 = new ImageIcon("picture/¿â´æÍ¼Æ¬/Ä¿µÄµØ.png");
		ImageIcon i7 = new ImageIcon("picture/¿â´æÍ¼Æ¬/´æ´¢Î»ÖÃ.png");
		ImageIcon i8 = new ImageIcon("picture/¿â´æÍ¼Æ¬/Çø.png");
		ImageIcon i9 = new ImageIcon("picture/¿â´æÍ¼Æ¬/ÅÅ.png");
		ImageIcon i10 = new ImageIcon("picture/¿â´æÍ¼Æ¬/¼Ü.png");
		ImageIcon i11 = new ImageIcon("picture/¿â´æÍ¼Æ¬/Î».png");
		ImageIcon ex = new ImageIcon("picture/¶Ô»°¿òÈ·¶¨.png");
		ImageIcon es = new ImageIcon("picture/È¡Ïû.png");
		returnButton=new JButton(returnIcon);
		j1 = new JLabel(i1);
		j2 = new JLabel(i2);
		j3 = new JLabel(i3);
		j4 = new JLabel(i4);
		j5 = new JLabel(i5);
		j6 = new JLabel(i6);
		j7 = new JLabel(i7);
		j8 = new JLabel(i8);
		j9 = new JLabel(i9);
		j10 = new JLabel(i10);
		j11 = new JLabel(i11);
		
		j1.setBounds(298,45,121,45);
		j2.setBounds(12, 137, 129, 27);
		j3.setBounds(381,136, 81, 27);
		j4.setBounds(12,194, 153, 27);
		j5.setBounds(381,194, 105, 27);
		j6.setBounds(48,264, 81, 27);
		j7.setBounds(36,340, 105, 27);
		j8.setBounds(236,344, 16, 18);
		j9.setBounds(430,344, 16, 18);
		j10.setBounds(236,409, 16, 18);
		j11.setBounds(430,409, 16, 18);
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		t6 = new JTextField();
		t7 = new JTextField();
		t8 = new JTextField();
		t9 = new JTextField();
		
		t1.setForeground(Color.black);
		t2.setForeground(Color.black);
		t3.setForeground(Color.black);
		t4.setForeground(Color.black);
		t5.setForeground(Color.black);
		t6.setForeground(Color.black);
		t7.setForeground(Color.black);
		t8.setForeground(Color.black);
		t9.setForeground(Color.black);
		
		t1.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t2.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t3.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t4.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t5.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t6.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t7.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t8.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		t9.setFont(new Font("Ó×Ô²",Font.BOLD,24));
		
		t1.setBounds(158, 138, 200, 27);
		t2.setBounds(476, 138, 200, 27);
		t3.setBounds(174, 194, 182, 27);
		t4.setBounds(495, 193, 181, 27);
		t5.setBounds(158, 264, 200, 27);
		t6.setBounds(200, 378, 98, 24);
		t7.setBounds(389, 375, 98, 24);
		t8.setBounds(200, 437, 98, 24);
		t9.setBounds(389, 437, 98, 24);
		
		queding = new JButton(ex);
		quxiao = new JButton(es);
		
		queding.setBounds(427, 511, 72, 24);
		quxiao.setBounds(575, 511, 72, 24);
		
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		this.add(returnButton);
		this.add(j1);
		this.add(j2);
		this.add(j3);
		this.add(j4);
		this.add(j5);
		this.add(j6);
		this.add(j7);
		this.add(j8);
		this.add(j9);
		this.add(j10);
		this.add(j11);
		this.add(t1);
		this.add(t2);
		this.add(t3);
		this.add(t4);
		this.add(t5);
		this.add(t6);
		this.add(t7);
		this.add(t8);
		this.add(t9);
		this.add(queding);
		this.add(quxiao);
		
		this.setOpaque(false);
		this.setBounds(260, 60, 730,650);
		this.setLayout(null);
	}
	private void registListener(final b2icwarehousemanui ui,final icwarehousemanJpanel icwarehousemanJpanel,final b2Jpanel1 b2jpanel){
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				icwarehousemanJpanel.remove(b2jpanel);
				icwarehousemanJpanel.add(ui.getOperationJpanel());
				ui.getB1().setEnabled(true);
				ui.getB2().setEnabled(true);
				icwarehousemanJpanel.repaint();
			}
		});
		
		quxiao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO ×Ô¶¯Éú³ÉµÄ·½·¨´æ¸ù
				icwarehousemanJpanel.remove(b2jpanel);
				icwarehousemanJpanel.add(ui.getOperationJpanel());
				ui.getB1().setEnabled(true);
				ui.getB2().setEnabled(true);
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

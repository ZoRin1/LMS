package presentation.financialstaffui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import vo.financeVO.AccountVO;

public class b2b1Jpanel1 extends JPanel{
	
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton,updateButton;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private JLabel j1;
	private b2b1Jpanel1JTable b2b1Jpanel1JTable;
	private ArrayList<AccountVO> accountInf;
	private JButton b2,b3,b4,b5;
	private b2financialstaffui b2financialstaffui;
	
	public b2b1Jpanel1(b2financialstaffui b2financialstaffui,financialstaffJpanel financialstaffJpanel,ArrayList<AccountVO> accountInf,
			JButton b2,JButton b3,JButton b4,JButton b5) {
		// TODO Auto-generated constructor stub
		this.b2financialstaffui = b2financialstaffui;
		this.accountInf = accountInf;
		this.b2 = b2;
		this.b3 = b3;
		this.b4 = b4;
		this.b5 = b5;
		init();
		financialstaffJpanel.add(this);
		registListener(b2financialstaffui,financialstaffJpanel,this);
	}
	private void init(){
		Font font=new Font("��Բ",Font.BOLD,20);
		ImageIcon i1 = new ImageIcon("picture/����ͼƬ/�˻�����.png");
		
		j1 = new JLabel(i1);
		j1.setBounds(0, 0, 722, 574);
		
		b2b1Jpanel1JTable = new b2b1Jpanel1JTable(b2financialstaffui,this,accountInf,b2,b3,b4,b5);

		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575,48,48);
		returnButton.setContentAreaFilled(false);
		
		updateButton = new JButton();//����Ҫ����48,48 ��ȷ��ͼƬ
		updateButton.setBounds(600, 575, 48, 48);    //Ҫ���ϸ����˻��ļ���
		updateButton.setContentAreaFilled(false);

		
	 	this.setBounds(260, 60, 730,650);

	 	j1.add(b2b1Jpanel1JTable.getScrollPane());
	 	this.add(j1);
	 	this.add(returnButton);
	 	this.add(updateButton);
	 	this.setLayout(null);
	 	this.setOpaque(false);
	}
	private void registListener(final b2financialstaffui b2financialstaffui,final financialstaffJpanel financialstaffJpanel,final b2b1Jpanel1 b2b1Jpanel1){
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				financialstaffJpanel.remove(b2b1Jpanel1);
				financialstaffJpanel.add(b2financialstaffui.operationJpanel);
				financialstaffJpanel.remove(b2financialstaffui.b2);
				financialstaffJpanel.remove(b2financialstaffui.b3);
				financialstaffJpanel.remove(b2financialstaffui.b4);
				financialstaffJpanel.remove(b2financialstaffui.b5);
				financialstaffJpanel.add(b2financialstaffui.b1);
				financialstaffJpanel.repaint();
			}
		});
		updateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				
			}
		});
	}
	public void paintComponent(Graphics g)  
{  
		super.paintComponent(g);    
		g.drawImage(frameIcon.getImage(),-7,-12,null);
 }
}


package presentation.icwarehousemanui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

import presentation.financialstaffui.DateChooser;

public class checkDepotDialog {
	JDialog checkDepot;
	JButton b1,b2;
	JTextField startTime,endTime;
	JComboBox jcombobox1,jcombobox2,jcombobox3,jcombobox4,jcombobox5,jcombobox6;
	JLabel shi,fen,miao,shi1,fen1,miao1;
	String shi_1,fen_1,miao_1,shi_2,fen_2,miao_2;
	JLabel start,end;
	JPanel panel;
	ImageIcon checkIcon,b1Icon,b2Icon;
	icwarehousemanui icUI;
	checkDepotPanel panel1;
	icwarehousemanJpanel icwarehousemanJpanel;
	icwarehousemanOperationJpanel operationJpanel;
	
	public checkDepotDialog(final icwarehousemanui ui){
		final String labels[] = {"00","01","02","03","04","05","06","07","08","09",
				"10","11","12","13","14","15","16","17","18","19","20","21","22",
				"23"};
		final String labels1[] = {"00","01","02","03","04","05","06","07","08","09",
				"10","11","12","13","14","15","16","17","18","19","20","21","22",
				"23","24","25","26","27","28","29","30","31","32","33","34","35",
				"36","37","38","39","40","41","42","43","44","45","46","47","48","49","50",
				"51","52","53","54","55","56","57","58","59","60"};
		DateChooser date1 =  DateChooser.getInstance("yyyy-MM-dd");
		DateChooser date2 =  DateChooser.getInstance("yyyy-MM-dd");
//		timeChooser date = new timeChooser(this);
		
		icUI = ui;
		icwarehousemanJpanel = ui.getIcwarehousemanJpanel();
		operationJpanel = ui.getOperationJpanel();
	    checkIcon = new ImageIcon("picture/����ѯ��.png");
	    b1Icon = new ImageIcon("picture/�Ի���ȷ��.png");
	    b2Icon = new ImageIcon("picture/ȡ��.png");
		checkDepot = new JDialog(ui,"ʱ�������",true);
		b1 = new JButton(b1Icon);
		b2 = new JButton(b2Icon);
		start = new JLabel();
		start.setText("��ʼʱ��:");
		start.setForeground(Color.black);
		start.setFont(new Font("��Բ",Font.BOLD,20));
		end = new JLabel();
		end.setText("��ֹʱ��:");
		end.setForeground(Color.black);
		end.setFont(new Font("��Բ",Font.BOLD,20));
		//JCombobox
		jcombobox1 = new JComboBox(labels);
		jcombobox1.setEditable(false);
		jcombobox1.setBounds(150, 60, 60, 24);
		shi = new JLabel("ʱ");
		shi.setFont(new Font("��Բ",Font.BOLD,16));
		shi.setBounds(215, 60, 30, 24);
		 
	    jcombobox1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent itemEvent) {
				// TODO �Զ����ɵķ������
		          int state = itemEvent.getStateChange();   
//		          System.out.println((state == ItemEvent.SELECTED) ? "Selected" : "Deselected");  
		          if(state == itemEvent.SELECTED){
			          System.out.println("Item: " + itemEvent.getItem());  
			          shi_1 = itemEvent.getItem().toString();
			          System.out.println(shi_1+"����"); 
		          }
//		          System.out.println("Item: " + itemEvent.getItem());   
//		          ItemSelectable is = itemEvent.getItemSelectable();   
//		          System.out.println(", Selected: " + is); 
			}
		});
	      
		jcombobox2 = new JComboBox(labels1);
		jcombobox2.setEditable(false);
		jcombobox2.setBounds(240, 60, 60, 24);
		fen = new JLabel("��");
		fen.setFont(new Font("��Բ",Font.BOLD,16));
		fen.setBounds(305, 60, 30, 24);
	    jcombobox2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent itemEvent) {
				// TODO �Զ����ɵķ������
		          int state = itemEvent.getStateChange();   
		          if(state == itemEvent.SELECTED){
			          System.out.println("Item: " + itemEvent.getItem());  
			          fen_1 = itemEvent.getItem().toString();
			          System.out.println(fen_1+"����"); 
		          }
			}
		});
		
		jcombobox3 = new JComboBox(labels1);
		jcombobox3.setEditable(false);
		jcombobox3.setBounds(325, 60, 60, 24);
		miao = new JLabel("��");
		miao.setFont(new Font("��Բ",Font.BOLD,16));
		miao.setBounds(390, 60, 30, 24);
	    jcombobox3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent itemEvent) {
				// TODO �Զ����ɵķ������
		          int state = itemEvent.getStateChange();  
		          if(state == itemEvent.SELECTED){
			          System.out.println("Item: " + itemEvent.getItem()); 
				      miao_1 = itemEvent.getItem().toString();
			          System.out.println(miao_1+"����"); 
		          }
			}
		});
		
		jcombobox4 = new JComboBox(labels);
		jcombobox4.setEditable(false);
		jcombobox4.setBounds(150,130, 60, 24);
		shi1 = new JLabel("ʱ");
		shi1.setFont(new Font("��Բ",Font.BOLD,16));
		shi1.setBounds(215, 130, 30, 24);
	    jcombobox4.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent itemEvent) {
				// TODO �Զ����ɵķ������
		          int state = itemEvent.getStateChange();   
		          if(state == itemEvent.SELECTED){
			          System.out.println("Item: " + itemEvent.getItem());  
			          shi_2 = itemEvent.getItem().toString();
			          System.out.println(shi_2+"����"); 
		          }
			}
		});
		
		jcombobox5 = new JComboBox(labels1);
		jcombobox5.setEditable(false);
		jcombobox5.setBounds(240, 130, 60, 24);
		fen1 = new JLabel("��");
		fen1.setFont(new Font("��Բ",Font.BOLD,16));
		fen1.setBounds(305, 130, 30, 24);
	    jcombobox5.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent itemEvent) {
				// TODO �Զ����ɵķ������
		          int state = itemEvent.getStateChange();   
		          if(state == itemEvent.SELECTED){
			          System.out.println("Item: " + itemEvent.getItem());  
			          fen_2 = itemEvent.getItem().toString();
			          System.out.println(fen_2+"����"); 
		          }
			}
		});
		
		jcombobox6 = new JComboBox(labels1);
		jcombobox6.setEditable(false);
		jcombobox6.setBounds(325, 130, 60, 24);
		miao1 = new JLabel("��");
		miao1.setFont(new Font("��Բ",Font.BOLD,16));
		miao1.setBounds(390, 130, 30, 24);
	    jcombobox6.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent itemEvent) {
				// TODO �Զ����ɵķ������
		          int state = itemEvent.getStateChange();   
		          if(state == itemEvent.SELECTED){
			          System.out.println("Item: " + itemEvent.getItem());  
			          if(itemEvent.getItem()==null){
			        	  miao_2 = "00";
			          }else{
				          miao_2 = itemEvent.getItem().toString();
			          }
			          System.out.println(miao_2+"����"); 
		          }
			}
		});
		//JCombobox
	    
//		startTime = new JTextField();
//		endTime = new JTextField();
//		startTime.setForeground(Color.black);
//		endTime.setForeground(Color.black);
//		startTime.setFont(new Font("��Բ",Font.BOLD,20));
//		endTime.setFont(new Font("��Բ",Font.BOLD,20));
//		date.register(startTime);
//		date1.register(startTime);
//		date2.register(endTime);
//		startTime.setBounds(150, 60, 200, 24);
//		endTime.setBounds(150, 130, 200, 24);
	    
		checkDepot.setBounds(830, 400, 450, 249);
		//checkDepot.setLocationRelativeTo(null);
		
		panel = new tempJpanel();
		panel.setLayout(null);
		panel.add(b1);
		panel.add(b2);
		panel.add(start);
		panel.add(end);
		
//		panel.add(startTime);
//		panel.add(endTime);
		
		panel.add(jcombobox1);
		panel.add(shi);
		panel.add(jcombobox2);
		panel.add(fen);
		panel.add(jcombobox3);
		panel.add(miao);
		panel.add(jcombobox4);
		panel.add(shi1);
		panel.add(jcombobox5);
		panel.add(fen1);
		panel.add(jcombobox6);
		panel.add(miao1);
		
		b1.setBounds(250, 180, 72, 24);
		b2.setBounds(350, 180, 72, 24);
		start.setBounds(40, 50, 180, 40);
		end.setBounds(40, 120, 180, 40);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				//����Ҫ�Ӷ�ʱ���ǰ����ж�
				if(miao_1==null){
					miao_1 = "00";
				}
				if(miao_2==null){
					miao_2 = "00";
				}
				if(fen_1==null){
					fen_1 = "00";
				}
				if(fen_2==null){
					fen_2 = "00";
				}
				String starttime = shi_1+":"+fen_1+":"+miao_1;
				System.out.println(starttime);
				String endtime = shi_2+":"+fen_2+":"+miao_2;
				System.out.println(endtime);
				//����Ҫ�Ӷ�ʱ���ǰ����ж�
				
				//���м�Ҫ�ӶԵ��ݵĵ���
				
				
				//���м�Ҫ�ӶԵ��ݵĵ���
				checkDepot.dispose();
				icwarehousemanJpanel.remove(operationJpanel);
				new checkDepotPanel(ui,icwarehousemanJpanel);//checkDepotPanel�Ĺ��캯����Ҫ���ϵ��ݵĲ���������ʾ
				icwarehousemanJpanel.repaint();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				checkDepot.dispose();
				ui.getB1().setEnabled(true);
				ui.getB2().setEnabled(true);
				ui.getB3().setEnabled(true);
				ui.getB4().setEnabled(true);
				ui.getB5().setEnabled(true);
				ui.getB6().setEnabled(true);
			}
		});
//		startTime.addKeyListener(new KeyAdapter() {
//			public void keyTyped(KeyEvent e) {
//				int keyChar = e.getKeyChar();
//				if(keyChar>=KeyEvent.VK_0&&keyChar<=KeyEvent.VK_9){
//					
//				}else if(keyChar==KeyEvent.VK_SHIFT){
//					if(keyChar==KeyEvent.VK_SEMICOLON){
//						
//					}else{
//						e.consume();
//					}
//				}else{
//					e.consume();
//				}
//			}
//		});
//		endTime.addKeyListener(new KeyAdapter() {
//			public void keyTyped(KeyEvent e) {
//				int keyChar = e.getKeyChar();
//				if(keyChar>=KeyEvent.VK_0&&keyChar<=KeyEvent.VK_9){
//					
//				}else if(keyChar==KeyEvent.VK_SHIFT){
//					if(keyChar==KeyEvent.VK_SEMICOLON){
//						
//					}else{
//						e.consume();
//					}
//				}else{
//					e.consume();
//				}
//			}
//		});
		checkDepot.add(panel);
		checkDepot.setUndecorated(true);
		checkDepot.setVisible(true);
	}
	
	private boolean checkFormat(String test){
		return false;
	}
	
	
	private class tempJpanel extends JPanel{
		public tempJpanel(){
			
		}
		
		public void paintComponent(Graphics g){
		    super.paintComponent(g);  
			g.drawImage(checkIcon.getImage(),0,0,null);
		}
	}
}

package presentation.icwarehousemanui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class checkDepotDialog {
	JDialog checkDepot;
	JButton b1,b2;
	JTextField startTime,endTime;
	JLabel start,end;
	JPanel panel;
	ImageIcon checkIcon,b1Icon,b2Icon;
	icwarehousemanui icUI;
	checkDepotPanel panel1;
	icwarehousemanJpanel icwarehousemanJpanel;
	icwarehousemanOperationJpanel operationJpanel;
	
	public checkDepotDialog(final icwarehousemanui ui){
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
		startTime = new JTextField();
		endTime = new JTextField();
		startTime.setForeground(Color.black);
		endTime.setForeground(Color.black);
		startTime.setFont(new Font("��Բ",Font.BOLD,20));
		endTime.setFont(new Font("��Բ",Font.BOLD,20));
		startTime.setBounds(150, 60, 200, 24);
		endTime.setBounds(150, 130, 200, 24);
		checkDepot.setBounds(830, 400, 450, 249);
		//checkDepot.setLocationRelativeTo(null);
		
		panel = new tempJpanel();
		panel.setLayout(null);
		panel.add(b1);
		panel.add(b2);
		panel.add(start);
		panel.add(end);
		panel.add(startTime);
		panel.add(endTime);
		b1.setBounds(250, 180, 72, 24);
		b2.setBounds(350, 180, 72, 24);
		start.setBounds(40, 50, 180, 40);
		end.setBounds(40, 120, 180, 40);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO �Զ����ɵķ������
				//����Ҫ�Ӷ�ʱ��θ�ʽ���ж�
				String starttime = startTime.getText();
				System.out.println(starttime);
				String endtime = endTime.getText();
				System.out.println(endtime);
				//����Ҫ�Ӷ�ʱ��θ�ʽ���ж�
				
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
		startTime.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				int keyChar = e.getKeyChar();
				if(keyChar>=KeyEvent.VK_0&&keyChar<=KeyEvent.VK_9){
					
				}else if(keyChar==KeyEvent.VK_SHIFT){
					if(keyChar==KeyEvent.VK_SEMICOLON){
						
					}else{
						e.consume();
					}
				}else{
					e.consume();
				}
			}
		});
		endTime.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				int keyChar = e.getKeyChar();
				if(keyChar>=KeyEvent.VK_0&&keyChar<=KeyEvent.VK_9){
					
				}else if(keyChar==KeyEvent.VK_SHIFT){
					if(keyChar==KeyEvent.VK_SEMICOLON){
						
					}else{
						e.consume();
					}
				}else{
					e.consume();
				}
			}
		});
		checkDepot.add(panel);
		checkDepot.setUndecorated(true);
		checkDepot.setVisible(true);
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

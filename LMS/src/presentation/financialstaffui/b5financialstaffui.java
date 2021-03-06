package presentation.financialstaffui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import po.financePO.BooksPO;
import businesslogic.financebl.BooksModel.BooksController;

public class b5financialstaffui extends JFrame{
	private financialstaffJpanel financialstaffJpanel;
	financialstaffb5OperationJpanel operationJpanel;
	JButton b1,b2;
	private JButton tuichuButton;
	private JButton zuixiaohuaButton;
		
	private BooksController BookController;
	private ArrayList<BooksPO> bookList;
	public b5financialstaffui(String s,financialstaffui fsui) {
		// TODO Auto-generated constructor stub
		super(s);
		init(fsui);
		registListener(this,financialstaffJpanel);
	}
	private void registListener(
		final b5financialstaffui b5financialstaffui,
		final 	financialstaffJpanel financialstaffJpanel) {
		zuixiaohuaButton.addMouseListener(new MouseAdapter() {
			ImageIcon zuixiaohuaIcon=new ImageIcon("picture/最小化.png");
			ImageIcon zuixiaohuaIcon2=new ImageIcon("picture/最小化2.png");
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				zuixiaohuaButton.setIcon(zuixiaohuaIcon);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				zuixiaohuaButton.setIcon(zuixiaohuaIcon2);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				b5financialstaffui.setExtendedState(JFrame.ICONIFIED);
			}
		});
		tuichuButton.addMouseListener(new MouseAdapter() {
			ImageIcon tuichuIcon=new ImageIcon("picture/退出.png");
			ImageIcon tuichuIcon2=new ImageIcon("picture/退出2.png");
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);	
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				tuichuButton.setIcon(tuichuIcon);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				tuichuButton.setIcon(tuichuIcon2);
			}
		});
		// TODO Auto-generated method stub
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new b5b1Jpanel1(b5financialstaffui, financialstaffJpanel);
				financialstaffJpanel.remove(operationJpanel);
				b1.setEnabled(false);
				b2.setEnabled(false);
				financialstaffJpanel.repaint();
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				BookController =new BooksController();
				bookList = BookController.getBook();
//				BooksPO p1 = new BooksPO("132123,12123,123132","sdsad,456456,dasda","sdasd,55445,4554","sadsad,sadasdas,sdada","a,a,a","q,a,s,d,f", "张三", "2015");
//				BooksPO p2 = new BooksPO("132123,12123,123132","sdsad,456456,dasda","sdasd,55445,4554","sadsad,sadasdas,sdada","a,a,a","q,a,s,d,f",  "李四", "2015");
//				BooksPO p3 = new BooksPO("132123,12123,123132","sdsad,456456,dasda","sdasd,55445,4554","sadsad,sadasdas,sdada","a,a,a","q,a,s,d,f",  "王五", "2015");
//				BooksPO p4 = new BooksPO("132123,12123,123132","sdsad,456456,dasda","sdasd,55445,4554","sadsad,sadasdas,sdada","a,a,a","q,a,s,d,f",  "冯六", "2015");
//				BooksPO p5 = new BooksPO("132123,12123,123132","sdsad,456456,dasda","sdasd,55445,4554","sadsad,sadasdas,sdada","a,a,a","q,a,s,d,f",  "周期", "2015");
//				BooksPO p6 = new BooksPO("132123,12123,123132","sdsad,456456,dasda","sdasd,55445,4554","sadsad,sadasdas,sdada","a,a,a","q,a,s,d,f",  "钱八", "2015");
//				bookList = new ArrayList<BooksPO>();
//				bookList.add(p1);
//				bookList.add(p2);
//				bookList.add(p3);
//				bookList.add(p4);
//				bookList.add(p5);
//				bookList.add(p6);
				
				new b5b2Jpanel1(b5financialstaffui, financialstaffJpanel,bookList);
				financialstaffJpanel.remove(operationJpanel);
				b1.setEnabled(false);
				b2.setEnabled(false);
				financialstaffJpanel.repaint();
			}
		});
	}
	private void init(financialstaffui fsui){
		financialstaffJpanel=new financialstaffJpanel();
		operationJpanel=new financialstaffb5OperationJpanel(financialstaffJpanel,fsui,this);
		ImageIcon b1Icon=new ImageIcon("picture/新建账本.png");
		ImageIcon b2Icon=new ImageIcon("picture/查询账本.png");
		ImageIcon returnIcon=new ImageIcon("picture/返回.png");
		ImageIcon tuichuIcon=new ImageIcon("picture/退出.png");
		ImageIcon zuixiaohuaIcon=new ImageIcon("picture/最小化.png");
		zuixiaohuaButton=new JButton(zuixiaohuaIcon);
		zuixiaohuaButton.setBounds(904, 0, 50, 50);
		zuixiaohuaButton.setContentAreaFilled(false);
		zuixiaohuaButton.setBorderPainted(false);
		tuichuButton=new JButton(tuichuIcon);
		tuichuButton.setBounds(974, 0, 50, 50);
		tuichuButton.setContentAreaFilled(false);
		tuichuButton.setBorderPainted(false);
		b1=new JButton(b1Icon);
		b2=new JButton(b2Icon);
		b1.setBounds(30, 230,200, 50);
		b2.setBounds(30, 430,200, 50);
		b1.setContentAreaFilled(false);
		b2.setContentAreaFilled(false);
		financialstaffJpanel.add(b1);
		financialstaffJpanel.add(b2);
		financialstaffJpanel.add(tuichuButton);
		financialstaffJpanel.add(zuixiaohuaButton);
		financialstaffJpanel.setLayout(null);
		this.add(financialstaffJpanel);
		this.setSize( 1024, 730);
		//居中
		Toolkit kitToolkit =Toolkit.getDefaultToolkit();
		Dimension screenSize=kitToolkit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int windowWidth=this.getWidth();
		int windowHeight=this.getHeight();
		this.setLocation((screenWidth-windowWidth)/2, (screenHeight-windowHeight)/2);
		//不允许窗口改变大小
		this.setResizable(false);
		this.setUndecorated(true);
		this.setVisible(true);
	}

}
class financialstaffb5OperationJpanel extends JPanel{
	private ImageIcon frameIcon =new ImageIcon("picture/操作面板.png");
	private JButton returnButton;
	public financialstaffb5OperationJpanel(financialstaffJpanel financialstaffJpanel,financialstaffui fsui,b5financialstaffui b5fsui) {
		// TODO Auto-generated constructor stub
		init();
		financialstaffJpanel.add(this);
		registListener(fsui, b5fsui);
	}
	private void init(){
		ImageIcon returnIcon=new ImageIcon("picture/返回.png");
		returnButton=new JButton(returnIcon);
		returnButton.setBounds(662, 575, 48,48);
		returnButton.setContentAreaFilled(false);	
		this.setLayout(null);
		this.setOpaque(false);
		this.setBounds(260, 60, 730,650);
		this.add(returnButton);
	}
	private void registListener(final financialstaffui fsui,final b5financialstaffui b5fsui){
		returnButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				fsui.setVisible(true);
				b5fsui.dispose();
			}
		});
	}
	public void paintComponent(Graphics g)  
	{  
	    super.paintComponent(g);    
	    g.drawImage(frameIcon.getImage(),-7,-12,null);
     }
	
}

package presentation.bhclerkui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class LoadingJpanel extends JPanel{
	private JLabel code;
	private JLabel doName;
	private JLabel OrgCode;
	private JLabel departure;
	private JTextField depart;
	private JLabel arrival;
	private JTextField arrive;
	private JLabel jianzhuang;
	private JTextField jianzhuangyuan;
	private JLabel yayun;
	private JTextField yayunyuan;
	private JLabel carcode;
	private JTextField Carcode;
	private JLabel TCode;
	private JTextField tcode;
	//�˴���ʡʱ���Ȳ����б���ʾ
	private JLabel charge;
	private JTextField chargearea;
	private ImageIcon frameIcon =new ImageIcon("picture/�������.png");
	private JButton returnButton;
	private JButton yesButton;
	private ImageIcon returnIcon=new ImageIcon("picture/����.png");
	private ImageIcon yesIcon=new ImageIcon("picture/ȷ��.png");
	public LoadingJpanel(bhclerkui ui,bhclerkJpanel bhclerkJpanel) {
		init();
		ui.setTitle("Ӫҵ��ҵ��Ա-װ��������");
		bhclerkJpanel.add(this);
		registListener(ui,bhclerkJpanel,this);
	}
	public void init(){
		Font font=new Font("��Բ",Font.BOLD,20);
		code=new JLabel("���ݱ��");
		code.setForeground(Color.white);
		code.setFont(font);
		code.setBounds(10,30,80,27);
	}
	private void registListener(final bhclerkui ui,final bhclerkJpanel panel,final LoadingJpanel panel2){
		
	}
}

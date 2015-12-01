package presentation.topmanagerui;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CostConst extends JPanel {
	private ImageIcon frameIcon =new ImageIcon("picture/²Ù×÷Ãæ°å.png");
	private JLabel daBiaoTi,danWei;
	
	
	
	
	
	public void paintComponent(Graphics g)  
	{  
			super.paintComponent(g);    
			g.drawImage(frameIcon.getImage(),-7,-12,null);
	 }
}

package Chapter3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3PE14 extends JFrame
{
	
	public static void main(String[] arg)
	{
		JFrame frame = new C3PE14();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE14()
	{
		super("Programming Exercise 3.14");
		JPanel contentPanel = new JPanel(new FlowLayout());
		JPanel panel = new DrawIt();
		panel.setPreferredSize(new Dimension(600,600));
		contentPanel.add(panel);
		add(contentPanel);
	}
	
	class DrawIt extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			g2.translate(300, 300);
			
			Font font = new Font("Serif", Font.BOLD, 36);
			g2.setFont(font);
			double rotate = Math.PI/4;
			g2.setFont(g2.getFont().deriveFont(AffineTransform.getRotateInstance(rotate)));
			g2.drawString("drawing this string",0,0);
		}
	}
}

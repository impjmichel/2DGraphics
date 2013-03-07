package Chapter3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3PE8 extends JFrame
{
	
	public static void main(String[] arg)
	{
		JFrame frame = new C3PE8();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE8()
	{
		super("Programming Exercise 3.8");
		JPanel contentPanel = new JPanel(new FlowLayout());
		JPanel panel = new DrawIt();
		panel.setPreferredSize(new Dimension(400,400));
		contentPanel.add(panel);
		add(contentPanel);
	}
	
	class DrawIt extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			
			Font f = g2.getFont();
			g2.drawString("hello 2D.", 55, 30);
			g2.setFont(f.deriveFont(new AffineTransform(1,0,0,-1,0,0)));
			g2.drawString("hello 2D.", 55, 35);
			g2.setFont(f.deriveFont(new AffineTransform(-1,0,0,1,0,0)));
			g2.drawString("hello 2D.", 50, 30);
		}
	}
}

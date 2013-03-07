package Chapter3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class C3PE1 extends JFrame
{
	private Color[] c;
	
	public static void main(String[] arg)
	{
		JFrame frame = new C3PE1();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE1()
	{
		super("Programming Exercise 3.1");
		c = new Color[] {Color.BLACK, Color.DARK_GRAY, Color.GRAY, Color.LIGHT_GRAY, Color.WHITE,
				Color.BLUE, Color.CYAN, Color.GREEN, Color.MAGENTA, Color.ORANGE, Color.PINK,
				Color.RED, Color.YELLOW};
		JPanel panel = new DrawIt();
		panel.setPreferredSize(new Dimension(400,400));
		add(panel);
	}
	
	class DrawIt extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			
			for(int id = 0; id < c.length; id++)
			{
				Rectangle2D rect = new Rectangle2D.Double(10+(id*50), 10, 50, 50);
				g2.setColor(c[id]);
				g2.fill(rect);
				g2.setColor(c[0]);
				g2.draw(rect);
			}			
		}
	}
}
package Chapter2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PE5 extends JFrame
{
	private static final long serialVersionUID = 6238579104479982161L;

	public static void main(String arg[]) 
	{
	    JFrame frame = new PE5();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	  }
	
	public PE5()
	{
		super("Programming Exercise 2.5");
		JPanel panel = new DrawStuff();
		panel.setPreferredSize(new Dimension(400,400));
		add(panel);
	}
	
	class DrawStuff extends JPanel
	{
		private static final long serialVersionUID = -8897760414214464286L;
		int nPoints = 1000;

		public DrawStuff()
		{
			
		}
		
		 public void paintComponent(Graphics g) 
		 {
			 super.paintComponent(g);
			 Graphics2D g2 = (Graphics2D)g;
			 g2.translate(100,100);
			 Ellipse2D.Double e1 = new Ellipse2D.Double(0, 0, 200, 100);
			 Ellipse2D.Double e2 = new Ellipse2D.Double(50, 0, 200, 100);
			 Ellipse2D.Double e3 = new Ellipse2D.Double(0, 0, 200, 100);
			 Area a1 = new Area(e1);
			 Area a2 = new Area(e2);
			 Area a3 = new Area(e3);
			 a3.intersect(a2);
			 a1.exclusiveOr(a3);
			 g2.fill(a1);
		 }
	}
}

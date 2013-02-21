package Chapter2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PE6 extends JFrame
{
	private static final long serialVersionUID = 6238579104479982161L;

	public static void main(String arg[]) 
	{
	    JFrame frame = new PE6();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	  }
	
	public PE6()
	{
		super("Programming Exercise 2.6");
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
			 GeneralPath path = new GeneralPath();
			 Arc2D.Double arc1 = new Arc2D.Double(0, 0, 75, 100, 90, 180, Arc2D.OPEN); 
			 Arc2D.Double arc2 = new Arc2D.Double(-25, 0, 125, 100, 90, 180, Arc2D.OPEN); 
			 path.append(arc1, false);
			 path.append(arc2, false);
			 path.setWindingRule(GeneralPath.WIND_EVEN_ODD);
			 g2.fill(path);
		 }
	}
}

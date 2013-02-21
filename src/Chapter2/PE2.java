package Chapter2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PE2 extends JFrame
{
	private static final long serialVersionUID = 6238579104479982161L;

	public static void main(String arg[]) 
	{
	    JFrame frame = new PE2();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	  }
	
	public PE2()
	{
		super("Programming Exercise 2.2");
		JPanel panel = new DrawStuff();
		panel.setPreferredSize(new Dimension(400,400));
		add(panel);
	}
	
	class DrawStuff extends JPanel
	{
		private static final long serialVersionUID = -8897760414214464286L;
		int nPoints = 720;

		public DrawStuff()
		{
			
		}
		
		 public void paintComponent(Graphics g) 
		 {
			 super.paintComponent(g);
			 Graphics2D g2 = (Graphics2D)g;
			 g2.translate(200,200);
			 int x1 = 0;
			 int y1 = 0;
			 int x2;
			 int y2;
			 for (int i = 0; i < nPoints; i++) 
			 {
				 double t = i * Math.PI / 180;
				 x2 = (int) ((int) 20*t*Math.cos(t));
				 y2 = (int) ((int) 20*t*Math.sin(t));
				 g2.drawLine(x1, y1, x2, y2);
				 x1 = x2;
				 y1 = y2;
			 }
		 }
	}
}

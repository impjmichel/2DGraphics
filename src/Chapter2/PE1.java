package Chapter2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PE1 extends JFrame
{
	private static final long serialVersionUID = 6238579104479982161L;

	public static void main(String arg[]) 
	{
	    JFrame frame = new PE1();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	  }
	
	public PE1()
	{
		super("Programming Exercise 2.1");
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
			 g2.translate(200,200);
			 int x1 = 0;
			 int y1 = 0;
			 int x2;
			 int y2;
			 for (int i = 0; i < nPoints; i++) 
			 {
				 x2 = (int)Math.pow(i, 3);
				 y2 = (int)Math.pow(i, 2);
				 g2.drawLine(x1, y1, x2, y2);
				 x1 = x2;
				 y1 = y2;
			 }
		 }
	}
}

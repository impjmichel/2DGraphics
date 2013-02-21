package Chapter2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PE4 extends JFrame
{
	private static final long serialVersionUID = 6238579104479982161L;

	public static void main(String arg[]) 
	{
	    JFrame frame = new PE4();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	  }
	
	public PE4()
	{
		super("Programming Exercise 2.4");
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
			 g2.translate(20,20);
			 boolean black = false;
			 for(int row = 0; row < 8; row++)
			 {
				 for(int column = 0; column < 8; column++)
				 {
					 Rectangle2D.Double rect = new Rectangle2D.Double(column*40,row*40,40,40);
					 if(black)
						 g2.fill(rect);
					 else
						 g2.draw(rect);
					 black = !black;
				 }
				 black = !black;
			 }
		 }
	}
}

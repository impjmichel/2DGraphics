package Chapter3;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3PE7 extends JFrame
{
	private static final long serialVersionUID = 6238579104479982161L;

	public static void main(String arg[]) 
	{
	    JFrame frame = new C3PE7();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	  }
	
	public C3PE7()
	{
		super("Programming Exercise 3.7");
		JPanel panel = new DrawStuff();
		panel.setPreferredSize(new Dimension(400,400));
		add(panel);
	}
	
	class DrawStuff extends JPanel
	{
		 public void paintComponent(Graphics g) 
		 {
			 super.paintComponent(g);
			 Graphics2D g2 = (Graphics2D)g;		
			 
			 Rectangle2D.Double rect = new Rectangle2D.Double(0,0,100,100);
			 rect.setRect(-rect.width/2, -rect.height/2, rect.width, rect.height);
			 
			 AffineTransform at = new AffineTransform();
			 at.setTransform(Math.PI/4, Math.PI/4, -Math.PI/4, Math.PI/4, 0, 0);
			 g2.setTransform(at);
			 
			 g2.translate(200, 0);
			 g2.draw(rect);
		 }
	}
}

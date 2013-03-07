package Chapter3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3PE9 extends JFrame
{
	
	public static void main(String[] arg)
	{
		JFrame frame = new C3PE9();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE9()
	{
		super("Programming Exercise 3.9");
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
			
			g2.drawLine(0, 0, 500, 1000);
			Rectangle2D rect = new Rectangle2D.Double(0,100,100,50);
			g2.setColor(Color.BLUE);
			g2.draw(rect);
			g2.setColor(Color.RED);
			
			/*
			 * line l : y = 2x  ( 1 , 2 )
			 * 
			 *  1/(x*x+y*y)  *  1*1-2*2 , 2*1*2 , 2*1*2 , 2*2-1*1
			 * 
			 * ( (1/5)*-3, (1/5)*4, 0
			 *   (1/5)*4, (1/5)*3, 0 )
			 */
			
			g2.setTransform(new AffineTransform(0,1,1,0, 5, 5));
			g2.draw(rect);
		}
	}
}
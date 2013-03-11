package Chapter3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
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
			
			Shape rect = null;
			Shape rect2 = null;
			rect = new Rectangle2D.Double(0,100,100,50);
			g2.setColor(Color.BLUE);
			g2.draw(rect);
			g2.setColor(Color.RED);	
//			int k = 2;
			AffineTransform tr = new AffineTransform();
			tr.setTransform(-0.6,0.8,0.8,0.6,0,0); //(2/(1+k*k))-1, (2*k)/(1+k*k), (2*k)/(1+k*k), ((2*k*k)/(1+k*k))-1, 0, 0);
			rect2 = tr.createTransformedShape(rect);
			g2.draw(rect2);
		}
	}
}
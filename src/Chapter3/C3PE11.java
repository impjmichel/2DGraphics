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

public class C3PE11 extends JFrame
{
	
	public static void main(String[] arg)
	{
		JFrame frame = new C3PE11();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE11()
	{
		super("Programming Exercise 3.11");
		JPanel contentPanel = new JPanel(new FlowLayout());
		JPanel panel = new DrawIt();
		panel.setPreferredSize(new Dimension(600,600));
		contentPanel.add(panel);
		add(contentPanel);
	}
	
	class DrawIt extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			
			g2.translate(300, 300);
			g2.scale(1, -1);
			g2.drawLine(0, -500, 0, 500);
			g2.drawLine(-500, 0, 500, 0);
			g2.drawLine(-500, -500, 500, 500);
			
			Shape rect = null;
			Shape rect2 = null;
			rect = new Rectangle2D.Double(-50,-50,100,100);
			g2.setColor(Color.BLUE);
			g2.draw(rect);
			g2.setColor(Color.RED);	
			AffineTransform tr = new AffineTransform();
			tr.rotate(Math.PI/4);
			tr.scale(3,1);
			tr.rotate(-Math.PI/4);
			rect2 = tr.createTransformedShape(rect);
			g2.draw(rect2);
		}
	}
}
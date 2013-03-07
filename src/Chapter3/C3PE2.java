package Chapter3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TexturePaint;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3PE2 extends JFrame
{
	private Color c;
	private GradientPaint grade;
	
	public static void main(String[] arg)
	{
		JFrame frame = new C3PE2(Color.GREEN);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE2(Color c)
	{
		super("Programming Exercise 3.2");
		this.c = c;
		grade = null;
		JPanel panel = new DrawIt();
		panel.setPreferredSize(new Dimension(400,400));
		add(panel);
	}
	public C3PE2(GradientPaint grade)
	{
		super("Programming Exercise 3.3");
		this.grade = grade;
		c = null;
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
			
			Rectangle2D rect = new Rectangle2D.Double(50,50,100,100);
			Ellipse2D circle = new Ellipse2D.Double(75, 75, 50, 50);
			g2.setBackground(Color.WHITE);
			if (! (c== null))
				g2.setColor(c);
			else if (! (grade==null))
				g2.setPaint(grade);
			g2.fill(rect);
			g2.setColor(Color.WHITE);
			g2.fill(circle);
			g2.setColor(Color.BLACK);
			g2.draw(rect);
			g2.draw(circle);
		}
	}
}

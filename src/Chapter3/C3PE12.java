package Chapter3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3PE12 extends JFrame
{
	
	public static void main(String[] arg)
	{
		JFrame frame = new C3PE12();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(600,600));
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE12()
	{
		super("Programming Exercise 3.12");
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
			
			g2.translate(200, 200);
			
			GeneralPath clipper = new GeneralPath();
			Rectangle2D rect = new Rectangle2D.Double(0,-50,100,100);
			Ellipse2D circle = new Ellipse2D.Double(25, -25, 50, 50);
			clipper.append(rect, false);
			clipper.append(circle, false);
			clipper.setWindingRule(GeneralPath.WIND_EVEN_ODD);
			g2.setClip(clipper);
			g2.draw(clipper);
			Font font = new Font("Serif", Font.BOLD, 30);
			g2.setFont(font);
			g2.drawString("Java 2D", 0, 0);
			
		}
	}
}
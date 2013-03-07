package Chapter3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3PE5 extends JFrame
{
	private Color c;
	private JColorChooser jcc;
	
	public static void main(String[] arg)
	{
		JFrame frame = new C3PE5(Color.GREEN);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE5(Color c)
	{
		super("Programming Exercise 3.5");
		this.c = c;
		JPanel contentPanel = new JPanel(new FlowLayout());
		JPanel panel = new DrawIt();
		panel.setPreferredSize(new Dimension(140,140));
		
		jcc = new JColorChooser();
		contentPanel.add(jcc);
		contentPanel.add(panel);
		add(contentPanel);
	}
	
	class DrawIt extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			
			Rectangle2D rect = new Rectangle2D.Double(20,20,100,100);
			Ellipse2D circle = new Ellipse2D.Double(45, 45, 50, 50);
			g2.setBackground(Color.WHITE);
			
				g2.setColor(jcc.getColor());
				repaint();
				
			g2.fill(rect);
			g2.setColor(Color.WHITE);
			g2.fill(circle);
			g2.setColor(Color.BLACK);
			g2.draw(rect);
			g2.draw(circle);
		}
	}
}
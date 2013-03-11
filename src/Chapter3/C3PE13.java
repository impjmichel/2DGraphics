package Chapter3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3PE13 extends JFrame
{
	private BufferedImage img = null;
	
	public static void main(String[] arg)
	{
		JFrame frame = new C3PE13();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(600,600));
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE13()
	{
		super("Programming Exercise 3.13");
		JPanel contentPanel = new JPanel(new FlowLayout());
		
		try {
			img = ImageIO.read(getClass().getResource("/texture.jpg"));
			} catch (IOException e) { e.printStackTrace(); } 
		
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
			Ellipse2D ellipse = new Ellipse2D.Double(-150, -50, 300, 100);
			g2.setClip(ellipse);
			g2.draw(ellipse);
			g2.drawImage(img, -200, -200, null);
		}
	}
}
package Chapter3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.TexturePaint;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3PE4 extends JFrame
{
	private BufferedImage image;
	private TexturePaint texture;
	
	public static void main(String[] arg)
	{
		JFrame frame = new C3PE4();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE4()
	{
		super("Programming Exercise 3.4");
		
		URL url = getClass().getClassLoader().getResource
			       ("texture.jpg");
		try 
		{
			image = ImageIO.read(url);
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
		texture = new TexturePaint(image, new Rectangle2D.Double(0,0,100,100));
			     
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
			g2.setPaint(texture);
			g2.fill(rect);
			g2.setColor(Color.WHITE);
			g2.fill(circle);
			g2.setColor(Color.BLACK);
			g2.draw(rect);
			g2.draw(circle);
		}
	}
}

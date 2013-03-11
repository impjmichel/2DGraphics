package Chapter3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3PE15 extends JFrame
{
	public static void main(String[] arg)
	{
		JFrame frame = new C3PE15();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE15()
	{
		super("Programming Exercise 3.15");
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
			
			Font font = new Font("Serif", Font.BOLD, 60);
			g2.setFont(font);
			FontRenderContext frc = g2.getFontRenderContext();
			GlyphVector gvN = font.createGlyphVector(frc, "N");
			GlyphVector gvY = font.createGlyphVector(frc, "Y");
			Shape glyphN = gvN.getOutline(0,0);
			Shape glyphY = gvY.getOutline(30,0);
			g2.draw(glyphN);
			g2.draw(glyphY);
		}
	}
}

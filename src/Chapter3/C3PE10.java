package Chapter3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3PE10 extends JFrame
{
	private String[] s = {"J","a","v","a","G","r","a","p","h","i","c","s"};
	
	public static void main(String[] arg)
	{
		JFrame frame = new C3PE10();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE10()
	{
		super("Programming Exercise 3.10");
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
			
			Font font = new Font("Serif", Font.BOLD, 36);
			g2.setFont(font);
			for(int id = 0; id < s.length; id++)
			{
				double rotate = (2*Math.PI)/13;
				g2.setFont(g2.getFont().deriveFont(AffineTransform.getRotateInstance(rotate*id)));
				g2.drawString(s[id], (int) (Math.cos(rotate*id)*100), (int) (Math.sin(rotate*id)*100));
			}
		}
	}
}

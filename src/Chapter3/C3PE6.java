package Chapter3;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3PE6 extends JFrame
{
	private JPanel panel;
	
	public static void main(String[] arg)
	{
		JFrame frame = new C3PE6();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE6()
	{
		super("Programming Exercise 3.6");
		JPanel contentPanel = new JPanel(new FlowLayout());
		panel = new DrawIt();
		panel.setPreferredSize(new Dimension(400,400));
		contentPanel.add(panel);
		add(contentPanel);
	}
	
	private GeneralPath drawCorners(int corners, int lineLength)
	{
	    GeneralPath e = new GeneralPath(GeneralPath.WIND_EVEN_ODD, corners);
	    double angle_to_turn = 2 * Math.PI / corners;
	    double angle = angle_to_turn;
	    
	    int x = 0;
	    int y = 0;
	    e.moveTo(x, y);
	    
	    for(int i = 0; i < corners; i++)
	    {
	    	x = x + (int)(Math.cos(angle) * lineLength);
	    	y = y + (int)(Math.sin(angle) * lineLength);
	     
	    	e.lineTo(x, y);
	    	angle += angle_to_turn;
	    }
	    e.closePath();
	    
	    return e;
	}
	
	class DrawIt extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g;
			
			g2.translate(panel.getWidth()/2, panel.getHeight()/4);
			
			GeneralPath gp = drawCorners(5,100);
			Stroke s = new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
			g2.setStroke(s);
			g2.draw(gp);
		}
	}
}

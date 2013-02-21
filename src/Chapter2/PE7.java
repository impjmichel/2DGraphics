package Chapter2;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PE7 extends JFrame
{
	private static final long serialVersionUID = 6238579104479982161L;

	public static void main(String arg[]) 
	{
	    JFrame frame = new PE7();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	  }
	
	public PE7()
	{
		super("Programming Exercise 2.7");
		JPanel panel = new DrawStuff();
		panel.setPreferredSize(new Dimension(400,400));
		add(panel);
	}
	
	class DrawStuff extends JPanel
	{
		private static final long serialVersionUID = -8897760414214464286L;
		int nPoints = 1000;

		public DrawStuff()
		{
			
		}
		
		 public void paintComponent(Graphics g) 
		 {
			 super.paintComponent(g);
			 Graphics2D g2 = (Graphics2D)g;
			 g2.translate(getWidth()/3,getHeight()/2);
			 g2.scale(1, -1);
			 Ellipse2D bigCircle = new Ellipse2D.Double(0,0,200,200);
			 Ellipse2D smallCircle1 = new Ellipse2D.Double((int)bigCircle.getCenterX()-5,(int)bigCircle.getCenterY()/2-5,10,10);
			 Ellipse2D smallCircle2 = new Ellipse2D.Double((int)bigCircle.getCenterX()-5,(int)bigCircle.getCenterY()/2+(int)bigCircle.getCenterY()-5,10,10);
			 Arc2D arc = new Arc2D.Float((int)bigCircle.getCenterX()-(int)bigCircle.getWidth()/4, 100, 100, 100, 90, 180, Arc2D.OPEN);
			 Arc2D arc2 = new Arc2D.Float((int)bigCircle.getCenterX()-(int)bigCircle.getWidth()/4, 0, 100, 100, 270, 180, Arc2D.OPEN);
			 Area area = new Area(bigCircle);
			 Area area2 = new Area(smallCircle1);
			 Area area3 = new Area(smallCircle2);
			 Area area4 = new Area(arc);
			 Area area5 = new Area(arc2);
			 Area areaNew = new Area(bigCircle);
			 Area rect = new Area(new Rectangle2D.Double(0,0,100,200));
			 g2.draw(arc);
			 g2.draw(arc2);
			 g2.draw(bigCircle);
			 areaNew.intersect(rect);
			 areaNew.exclusiveOr(area4);
			 areaNew.exclusiveOr(area5);
			 areaNew.exclusiveOr(area2);
			 areaNew.exclusiveOr(area3);
//			 g2.draw(smallCircle1);
//			 g2.draw(smallCircle2);
			 g2.fill(areaNew);
		 }
	}
}

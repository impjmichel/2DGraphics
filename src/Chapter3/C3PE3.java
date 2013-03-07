package Chapter3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C3PE3 extends JFrame
{
	private Color c;
	
	public static void main(String[] arg)
	{
		GradientPaint grade = new GradientPaint(0,0,Color.BLACK,0,150,Color.WHITE);
		JFrame frame = new C3PE2(grade);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.setSize(new Dimension(400,400));
	    frame.pack();
	    frame.setVisible(true);
	}
	
	public C3PE3()
	{
		super("Programming Exercise 3.3");
		JPanel panel = new DrawIt();
		panel.setPreferredSize(new Dimension(400,400));
		add(panel);
	}
	
	class DrawIt extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
		}
	}
}

package Chapter2;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PE2 extends JFrame
{
	public static void main(String arg[]) 
	{
	    JFrame frame = new PE2();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    frame.pack();
	    frame.setVisible(true);
	  }
	
	public PE2()
	{
		super("Programming Exercise 2.1");
		JPanel p = new DrawStuff();
		add(p);
	}
	
	class DrawStuff extends JPanel
	{
		public DrawStuff()
		{
			
		}
	}
}

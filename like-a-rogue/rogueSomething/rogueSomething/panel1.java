package rogueSomething;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class panel1 extends JPanel
{
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g)
	{
		Graphics2D rectangle = (Graphics2D) g;
		rectangle.setColor(Color.ORANGE);
		rectangle.drawRect(50, 50, 50, 50);
		rectangle.fillRect(50, 50, 50, 50);
//		rectangle.draw(new Ellipse2D.Double(0, 100, 30, 30));
		
	}
}

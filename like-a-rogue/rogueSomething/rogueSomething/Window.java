package rogueSomething;

import java.awt.*;
import javax.swing.JFrame;
@SuppressWarnings("unused")
public class Window 
{
	public JFrame makeWindow(int l, int w, String t)
	{
		
		JFrame window = new JFrame(t);
		
		window.setBounds(500,500, l, w);
		window.setVisible(true);
		return window;
	}
}

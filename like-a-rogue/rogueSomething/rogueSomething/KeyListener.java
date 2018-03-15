package rogueSomething;

import java.awt.event.KeyEvent;

import javax.swing.JPanel;

public class KeyListener extends JPanel{

	private static final long serialVersionUID = 1L;
	
	Main main = new Main();
	int x = main.getX();
	int y = main.getY();
	
	
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_A)
		{
			x--;
		}
		if(e.getKeyCode() == KeyEvent.VK_D)
		{
			x++;
		}
	}
	Main otherMain = new Main();
}

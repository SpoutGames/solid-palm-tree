package player;


import java.awt.event.*;
@SuppressWarnings("unused")
public class Input implements KeyListener, MouseListener
{
	
	private int x, y;
	private static final int MOVEMENT_SPEED = 10;
	private static final int JUMP_SPEED = 10;
	private final int MAX_JUMP_HEIGHT = 40;
	public Input(int newX, int newY)
	{
		x = newX;
		y = newY;
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_A)
		{
			x = x - MOVEMENT_SPEED;
			
		}
		if(e.getKeyCode() == KeyEvent.VK_D)
		{
			x = x + MOVEMENT_SPEED;
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			
			if(y == MAX_JUMP_HEIGHT)
			{
				
			}else
			{
				y = y + JUMP_SPEED;
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) 
	{
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}

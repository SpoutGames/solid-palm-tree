package framework;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

import state.AbstractMain;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Display extends JPanel implements KeyListener{ 

	private static final long serialVersionUID = 1L;
	
	AbstractMain main = new AbstractMain();
	int x = main.getX();
	int y = main.getY();
	
	@SuppressWarnings("unused")
	
	
	private Rectangle2D rect;
	
	public int stop;
	
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawRectangle(g);
    }
    public void main(String[] args)
    {
    	
    	//main.setY(y);
    }
    @Override
    public void keyPressed(KeyEvent e) 
	{
		if(e.getKeyCode() == KeyEvent.VK_A)
		{
			
			x--;
			super.setLocation(x, y);
			main.setX(x);
		}
		if(e.getKeyCode() == KeyEvent.VK_D)
		{
			x++;
			super.setLocation(x, y);
			main.setX(x);
		}
	}
    
    private void drawRectangle(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        
        Rectangle2D e = new Rectangle2D.Double(x, y, 20, 20);
        g2d.setColor(Color.MAGENTA);
        g2d.fillRect(x, y, 20, 20);
        g2d.draw(e);

    }

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void setX(int newX) {
		x = newX;
	}

	public void setY(int newY) {
		y =  newY;
	}

	

	
}
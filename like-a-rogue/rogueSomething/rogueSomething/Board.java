package rogueSomething;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JPanel implements KeyListener{ 

	private static final long serialVersionUID = 1L;
	
	Main main = new Main();
	int x = main.getX();
	int y = main.getY();

	
	private Rectangle2D rect;
	
	public void int()
	
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawRectangle(g);
    }
    
    @Override
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

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	

	
}
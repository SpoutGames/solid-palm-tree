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
	
	//variables initialize
	
		AbstractMain main = new AbstractMain();
		int x = main.getX();
		int y = main.getY();
		
		public int stop;
	
	
		
	//does the drawing of the cube
	
	    @Override
	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	
	        drawRectangle(g);
	    }
    
    
    //Moves cube when key is pressed (Will probably be deleted in future)
    
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
    
	    
	//defines properties of rectangle
	    
	    private void drawRectangle(Graphics g) {
	
	        Graphics2D g2d = (Graphics2D) g;
	        
	        Rectangle2D e = new Rectangle2D.Double(x, y, 20, 20);
	        g2d.setColor(Color.MAGENTA);
	        g2d.fillRect(x, y, 20, 20);
	        g2d.draw(e);
	
	    }
	    
	    
	//sets Mains x and y to this.x,y
	    
		public void setX(int newX) {
			x = newX;
		}
	
		public void setY(int newY) {
			y =  newY;
		}

		
		
		
	//for keylistener for it to shut up
		
		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

	
	
}
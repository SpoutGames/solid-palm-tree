package player;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Input implements KeyListener, MouseListener
{
	
	//lists off variables
		private boolean[] keys;
		public boolean left, right;
		public boolean up;
	
	
	//constructor
		public Input() {
			keys = new boolean[256];
		}
	
	
	//will run each tick
		public void tick() {
			left = keys[KeyEvent.VK_A];
			right = keys[KeyEvent.VK_D];
			up = keys[KeyEvent.VK_W];
		}
	
	
	
	
	
	//what to do when player gives input
		@Override
		public void keyPressed(KeyEvent e) {
			keys[e.getKeyCode()] = true;
		}
	
		@Override
		public void keyReleased(KeyEvent e) {
			keys[e.getKeyCode()] = false;
		}
	
		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
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

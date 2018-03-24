package player;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Input implements KeyListener, MouseListener
{
	
	//lists off variables
		private boolean[] keys;
		public boolean up, down, left, right, backSpace, space, shift, control, tab, keyE, keyQ, fKey1;
	
	
	//constructor
		public Input() {
			keys = new boolean[256];
		}
	
	
	//will run each tick
		public void tick() {
			left = keys[KeyEvent.VK_A];
			right = keys[KeyEvent.VK_D];
			up = keys[KeyEvent.VK_W];
			down = keys[KeyEvent.VK_S];
			backSpace = keys[KeyEvent.VK_BACK_SPACE];
			space = keys[KeyEvent.VK_SPACE];
			shift = keys[KeyEvent.VK_SHIFT];
			control = keys[KeyEvent.VK_CONTROL];
			tab = keys[KeyEvent.VK_TAB];
			keyE = keys[KeyEvent.VK_E];
			keyQ = keys[KeyEvent.VK_Q];
			fKey1 = keys[KeyEvent.VK_F1];
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

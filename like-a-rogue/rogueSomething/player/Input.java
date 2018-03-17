package player;


import java.awt.event.*;

public class Input implements KeyListener, MouseListener
{
	
	//lists off variables
		private boolean[] keys;
		public boolean left, right;
	
	
	//constructor
		public Input() {
			keys = new boolean[256];
		}
	
	
	//will run each tick
		public void tick() {
			left = keys[KeyEvent.VK_A];
			right = keys[KeyEvent.VK_D];
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

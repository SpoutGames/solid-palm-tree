package state;

import framework.Window;

public class AbstractMain{
	
	//Variables initialize
		private final static int WIDTH = 320;
		private final static int HEIGHT = WIDTH / 16 * 9;
		private final static int SCALE = 3;
		private final static String NAME = "Game title goes here";
		private static boolean running = false;
		private int x;
		private int y;
	
	//setters and getters (these will probably be deleted in the future)
		public int getX() {
			return this.x;
		}
		public void setX(int thisX) {
			x = thisX;
		}
		public int getY() {
			return this.y;
		}
		public void setY(int thisY) {
			y = thisY;
		}
		
		
	//ticks and frame
		
		
		
		
		
	//Main loop
		//Game is running
		public void start() {
			
		}
		
		//Game is not running
		public void stop() {
			
		}
		
		
	//Main run command
		public static void main(String[] a) {
			Window window = new Window();
			window.makeWindow(WIDTH * SCALE, HEIGHT * SCALE, NAME);
		}
}
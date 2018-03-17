package state;

public class Launcher{
	
	
	//Variables initialize
		private int x, y;
		
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
	
	//Main run command
			public static void main(String[] a) {
				Main game = new Main();
				game.start();
			}
		
}

package rogueSomething;

public class Main{
	
	private final static int WIDTH = 320;
	private final static int HEIGHT = WIDTH / 16 * 9;
	private final static int SCALE = 3;
	private final static String NAME = "Game title goes here";
	private int x;
	private int y;
	
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public static void main(String[] a) {
		Window window = new Window();
		window.makeWindow(WIDTH * SCALE, HEIGHT * SCALE, NAME);
	}
}
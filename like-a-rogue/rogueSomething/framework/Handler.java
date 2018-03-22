package framework;

import player.Input;

public class Handler{
	
	private Main main;
	
	public Handler(Main main) {
		this.main = main;
	}
	
	
	
	public Camera getCamera() {
		return main.getCamera();
	}
	public Input getInput() {
		return main.getInput();
	}
	public double getWidth() {
		return main.getWidth();
	}
	public double getHeight() {
		return main.getHeight();
	}
	public double getxOffset() {
		return main.getCamera().getxOffset();
	}
	public double getyOffset() {
		return main.getCamera().getyOffset();
	}
	
}
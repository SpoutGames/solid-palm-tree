package framework;

import player.Input;

public class Handler{
	
	private Main main;
	
	public Handler(Main main) {
		this.main = main;
	}
	
	public Input getInput() {
		return main.getInput();
	}
	
	
	
}
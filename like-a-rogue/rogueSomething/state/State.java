package state;

import java.awt.Graphics;

public abstract class State {
	
	public static State currentState = null;
	
	protected Main game;
	
	public State(Main game) {
		this.game = game;
	}
	
	public static  void setState(State state) {
		currentState = state;
	}
	public static State getState() {
		return currentState;
	}
	
	
	
	public abstract void tick();
	public abstract void render(Graphics g);
}

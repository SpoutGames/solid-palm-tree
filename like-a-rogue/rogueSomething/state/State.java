package state;

import java.awt.Graphics;

public abstract class State {
	
	//constants
	
	//public
		public static State currentState = null;
		public static State state;
		//abstract
			public abstract void tick();
			public abstract void render(Graphics g);
	
	//objects
			protected Main game;
	
	//constructor
		public State(Main game) {
			this.game = game;
		}
	
	//getters and setters
		public static void setState(State state) {
			currentState = state;
		}
		public static State getState() {
			return currentState;
		}
	
	
	
	
}

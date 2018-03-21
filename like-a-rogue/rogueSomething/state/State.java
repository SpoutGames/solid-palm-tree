package state;

import java.awt.Graphics;

import framework.Handler;

public abstract class State {
	
	//constants
	
	//public
		public static State currentState = null;
		public static State state;
		//abstract
			public abstract void tick();
			public abstract void render(Graphics g);
	
	//objects
		protected Handler handler;
	
	//constructor
		public State(Handler handler) {
			this.handler = handler;
		}
	
	//getters and setters
		public static void setState(State state) {
			currentState = state;
		}
		public static State getState() {
			return currentState;
		}
	
	
	
	
}

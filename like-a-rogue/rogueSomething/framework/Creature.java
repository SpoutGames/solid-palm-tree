package framework;

import java.awt.Graphics;

import state.Main;

public abstract class Creature extends Entity{
	
	//constants
		public static final int DEFAULT_HEALTH = 30;
		public static final double DEFAULT_HORIZONTAL_SPEED = 0.025;
		public static final double DEFAULT_JUMP_SPEED = 2;
		
	//protected
		protected int health;
		protected double horizontalSpeed, verticalSpeed, jumpSpeed;
	
	//public
		public double xMove, yMove;
		//abstracts
			public abstract void render(Graphics g);
			public abstract void tick();
			
	//constructor	
		public Creature(Main game, int x, int y) {
			super(game, x, y);
			health = DEFAULT_HEALTH;
			horizontalSpeed = DEFAULT_HORIZONTAL_SPEED;
			jumpSpeed = DEFAULT_JUMP_SPEED;
		}
	
	//functions
		public void move() {
			if (Math.abs(velX) < 6) {
				velX += xMove;
			}
			x += velX;
			y += velY;
		}

	
	//getters and setters
		public double getxMove() {
			return xMove;
		}
	
		public void setxMove(float xMove) {
			this.xMove = xMove;
		}
	
		public double getyMove() {
			return yMove;
		}
	
		public void setyMove(float yMove) {
			this.yMove = yMove;
		}

}

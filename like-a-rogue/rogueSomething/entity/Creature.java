package entity;

import java.awt.Graphics;
import java.awt.Rectangle;

import framework.Handler;

public abstract class Creature extends Entity{
	
	//constants
		public static final int DEFAULT_HEALTH = 30;
		public static final double DEFAULT_HORIZONTAL_SPEED = 5;
		public static final double DEFAULT_JUMP_SPEED = 2;
		
	//protected
		protected int health;
		protected double horizontalSpeed, verticalSpeed, jumpSpeed;
		protected int width, height;
		protected Rectangle bounds;
		protected double velocityX, velocityY;
		protected double xMove, yMove;
	
	//public
		
		//abstracts
			public abstract void render(Graphics g);
			public abstract void tick();
			
	//objects
		private Handler handler;
			
	//constructor	
		public Creature(Handler handler, int x, int y) {
			super(handler, x, y);
			this.handler = handler;
			health = DEFAULT_HEALTH;
			horizontalSpeed = DEFAULT_HORIZONTAL_SPEED;
			jumpSpeed = DEFAULT_JUMP_SPEED;
			
			bounds = new Rectangle(0,0,handler.getTileWidth(),handler.getTileHeight());
		}
	
	//functions
		public void move() {
			moveX();
			moveY();
		}
		
		public void moveX() {
			if (xMove > 0) {
				if (!collidingWithTile((int)((x + bounds.width + xMove)/48),(int) y) && !collidingWithTile((int)((x + bounds.width + xMove)/48),(int) (y+bounds.height))){
					x += xMove;
				} else {
					while (!collidingWithTile((int)((x + bounds.width + 1)/48),(int) y) && !collidingWithTile((int)((x + bounds.width + 1)/48),(int) (y+bounds.height))) {
						x += 1;
					}
				}
			}
			if (xMove < 0) {
				if (!collidingWithTile((int)(x + xMove),(int) y)){
					x += xMove;
				}
			}
		}
		public void moveY() {
			y += velocityY;
			if (!collidingWithTile((int)x,(int)((y+bounds.height+velocityY+1)/48))) {
				if (velocityY < 3) {
					velocityY += .5;
				}
			} else {
				while (!collidingWithTile((int)x,(int)((y + bounds.height + 1)/48))) {
					y += Math.signum(velocityY);
				}
			}
			if (collidingWithTile((int)x,(int)((y+bounds.height+1)/48))) {
				velocityY = 0;
			}
		}
		
		
		
		public boolean collidingWithTile(int x, int y) {
			return handler.getWorld().getTile(x, y).isSolid();
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

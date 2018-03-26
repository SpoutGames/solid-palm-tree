package entity;

import java.awt.Graphics;
import java.awt.Rectangle;

import framework.Handler;

public abstract class Creature extends Entity{
	
	//constants
		public static final int DEFAULT_HEALTH = 30;
		public static final double DEFAULT_HORIZONTAL_SPEED = 3;
		public static final double DEFAULT_JUMP_SPEED = 2;
		
	//protected
		protected double hspd, vspd, jspd;
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
			hspd = DEFAULT_HORIZONTAL_SPEED;
			jspd = DEFAULT_JUMP_SPEED;
			
			bounds = new Rectangle(0,0,handler.getTileWidth(),handler.getTileHeight());
		}
	
	//functions
		public void move() {
			moveX();
			moveY();
		}
		
		public void moveX() {
			if (!placeMeeting((int)(x+xMove)/handler.getTileWidth(),(int)(y-bounds.y)/handler.getTileHeight()) || !placeMeeting((int)((x - bounds.width + xMove)/handler.getTileWidth()), (int)((y-bounds.y)/handler.getTileHeight()))) {
				x += xMove;
			}
			
		}
		public void moveY() {
			if (!placeMeeting((int)((x - bounds.width)/handler.getTileWidth()), (int)(y/handler.getTileHeight())) || !placeMeeting((int)((x)/handler.getTileWidth()), (int)(y/handler.getTileHeight())) ) {
				y += 1;
				if (handler.getInput().up) {
					y-= 2;
				}
			}
		}
		
		private boolean placeMeeting(int x, int y) {
			return handler.getWorld().getTile(x,y).isSolid();
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

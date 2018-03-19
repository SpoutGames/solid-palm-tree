package framework;

import java.awt.Graphics;

import state.Main;

public abstract class Entity {

	//protected
		protected double x, y, velY, velX;
		
	//private
		private Main game;
		
	//public
		public abstract void tick();
		public abstract void render(Graphics g);
		
		
	//constructor
		public Entity(Main game, int newX, int newY) 
		{
			this.setGame(game);
			x = newX;
			y = newY;
		}
	
		
	//getter and setters
		//x and y
			public void setX(float x) 
			{
				this.x = x;
			}
			public double getX() 
			{
				return x;
			}
			public void setY(float y) 
			{
				this.y = y;
			}
			public double getY() 
			{
				return y;
			}
		
		//velocities
			public double getVelY() 
			{
				return velY;
			}
			public void setVelY(double velY) 
			{
				this.velY = velY;
			}
			public double getVelX() 
			{
				return velX;
			}
			public void setVelX(double velX) 
			{
				this.velX = velX;
			}
			
		//other
			public Main getGame() {
				return game;
			}
			public void setGame(Main game) {
				this.game = game;
			}
	
}

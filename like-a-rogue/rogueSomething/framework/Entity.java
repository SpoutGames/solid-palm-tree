package framework;

import java.awt.Graphics;

public abstract class Entity {
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	
	protected float x, y;
	
	public Entity(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	//getters and setters
		public void setX(float x) {
			this.x = x;
		}
	
		public float getX() {
			return x;
		}
		
		public void setY(float y) {
			this.y = y;
		}
		public float getY() {
			return y;
		}
	
}

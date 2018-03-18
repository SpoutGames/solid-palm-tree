package framework;

import java.awt.Graphics;
import map.*;
import state.Main;

public abstract class Entity {
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	
	protected double x, y;
	private double gravityConstant;
	private World world;
	public Entity(int newX, int newY)
	{
		//world = new World(game);
		gravityConstant = 1;
		x = newX;
		y = newY;
	}
	
	/*
	public boolean isColliding()
	{
		//if(world.getTiles)
	}
	*/
	public void Gravity()
	{
		//if(isColliding())
		//{
		//	
		//}
	}
	//getters and setters
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
	
}

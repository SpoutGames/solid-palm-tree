package framework;

import Tiles.Tiles;
import player.Input;

public class Handler{
	
	private Main main;
	private World world;
	
	public Handler(Main main) {
		this.main = main;
	}
	
	
	public World getWorld() {
		return world;
	}
	public void setWorld(World world) {
		this.world = world;
	}
	
	
	
	public Camera getCamera() {
		return main.getCamera();
	}
	public Input getInput() {
		return main.getInput();
	}
	public double getWidth() {
		return main.getWidth();
	}
	public double getHeight() {
		return main.getHeight();
	}
	public double getxOffset() {
		return main.getCamera().getxOffset();
	}
	public double getyOffset() {
		return main.getCamera().getyOffset();
	}
	public int getTileWidth() {
		return Tiles.getTileWidth();
	}
	public int getTileHeight() {
		return Tiles.getTileHeight();
	}
	
}
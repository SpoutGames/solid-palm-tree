package framework;

import Tiles.Tiles;
import fonts.Fonts;
import player.Input;

public class Handler{
	//privates
		private Main main;
		private World world;
	
	//constructor
		public Handler(Main main) {
			this.main = main;
		}
	
	//get world
		public World getWorld() {
			return world;
		}
		public void setWorld(World world) {
			this.world = world;
		}
	
		
	//get objects
		public Camera getCamera() {
			return main.getCamera();
		}
		public Input getInput() {
			return main.getInput();
		}
		public Fonts getFonts() {
			return main.getFonts();
		}
	
	
	//getters and setters
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
		public Main getMain() {
			return main;
		}
	
}
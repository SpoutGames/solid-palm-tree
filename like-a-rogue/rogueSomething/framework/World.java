package framework;
import java.awt.Graphics;

import Tiles.Tiles;
public class World
{
	//privates
		private int width, height;
		private int[][] tiles;
		
	//objects
		private Handler handler;

	
	
	//constructor
		public World(Handler handler, String path) {
			loadWorld(path);
			this.handler = handler;
		}

	
	
	//functions 
		private void loadWorld(String path) {
			width = 10;
			height = 1;
			tiles = new int[width][height];
			
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < height; y++) {
					tiles[x][y] = 0;
				}
			}
		}
		
		public Tiles getTile(int x, int y) {
			Tiles t = Tiles.tiles[tiles[x][y]];
			if (t == null) {
				return Tiles.tiles[0];
			}
			return t;
		}
		
		public void tick() {
			
			
		}
	
		public void render(Graphics g) {
			for (int y = 0; y < height; y++) {
				for (int x = 0; x < width; x++) {
					getTile(x, y).render(g, (int) ((x * 16) - handler.getxOffset()), (int) ((y * 16) - handler.getyOffset()));
				}
			}
		}

}

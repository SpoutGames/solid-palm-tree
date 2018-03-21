package framework;
import java.awt.Graphics;

import Tiles.Tiles;
public class World
{
	private int width, height;
	private int[][] tiles;

	
	
	//constructor
		public World(String path) {
			loadWorld(path);
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
					getTile(x, y).render(g, x * 16, y * 16);;
				}
			}
		}

}

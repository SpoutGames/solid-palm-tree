package framework;
import java.awt.Graphics;

import Gfx.Assets;
import Tiles.Tiles;
public class World
{
	//privates
		private int width, height;
		private int[][] tilesPos;		
	//objects
		private Handler handler;	
	
	//constructor
		public World(Handler handler, String path) {
			loadWorld(path);
			this.handler = handler;
			this.handler.setWorld(this);
		}
	
	
	
	//functions 
		private void loadWorld(String path) {
			width = 10;
			height = 1;
			tilesPos = new int[width][height];
			
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < height; y++) {
					tilesPos[x][y] = 0;
				}
			}
		}
		
		public Tiles getTile(int x, int y) {
			if (x < 0 || y < 0) {
				return Tiles.dirt();
			}
			try {
				Tiles t = Tiles.tiles[tilesPos[x][y]];
				return t;
			}
			catch (ArrayIndexOutOfBoundsException e){
				return Tiles.tiles[0];
			}
		}
		
		public void tick() {
			
			
		}
	
		public void render(Graphics g) {
			for (int x = 0; x < width; x++) {
				for (int y = 0; y < height; y++) {
					getTile(x, y).render(g, (int) ((x * 48) - handler.getxOffset()), (int) ((y * 48) - handler.getyOffset()));
				}
			}
		}
}

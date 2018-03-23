package Tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tiles {
	
	
	//static
		public static Tiles[] tiles = new Tiles[200];
		public static Tiles topGrassTile = new TopGrassTile(0);
		public static Tiles stone = new StoneTile(1);
		public static Tiles dirt = new DirtTile(2);
	
	//protected
		protected BufferedImage texture;
		protected int id;
		
	//private
		private static final int tileWidth = 48;
		private static final int tileHeight = 48;
	
	
	//constructor
		public Tiles(BufferedImage texture, int id) {
			this.texture = texture;
			this.id = id;
			
			tiles[id] = this;
		}
	
		
	//methods
		
		public void tick() {
			
		}
		
		public void render(Graphics g, int x, int y) {
			g.drawImage(texture, x, y, tileWidth, tileHeight, null);
		}
		
				
	//getters and setters
		public boolean isSolid() {
			return false;
		}
		
		public int getId() {
			return id;
		}


		public static int getTileWidth() {
			return tileWidth;
		}


		public static int getTileHeight() {
			return tileHeight;
		}


		public static Tiles dirt() {
			return dirt;
		}

		
		
}

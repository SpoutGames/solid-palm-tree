package Tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tiles {
	
	
	//static
		public static Tiles[] tiles = new Tiles[200];
		public static Tiles topGrassTile = new TopGrassTile(0);
	
	//protected
		protected BufferedImage texture;
		protected int id;
	
	
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
			g.drawImage(texture, x, y, null);
		}
		
				
	//getters and setters
		public boolean isSolid() {
			return true;
		}
		
		public int getId() {
			return id;
		}
}

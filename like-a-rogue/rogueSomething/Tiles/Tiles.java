package Tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tiles {
	
	protected BufferedImage texture;
	private final int id;
	
	
	private static Tiles[] tile;
	
	public Tiles(BufferedImage newTexture, int newId){
		this.texture = newTexture;
		this.id = newId;
		
	}
	
	
	
	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture, x, y, null);
	}
	
	
	public int getId() {
		return id;
	}
}

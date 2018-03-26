package Gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	public static int width = 16, height = 16;
	public static BufferedImage topGrass, dirt, stone;
	public static BufferedImage temPlayer;
	public static BufferedImage mainMenuCursor;
	
	public static void init() {
		//find all spritesheets
			SpriteSheet groundTextures = new SpriteSheet(ImageLoader.loadImage("/textures/TilesetGround.png"));
			SpriteSheet player = new SpriteSheet(ImageLoader.loadImage("/textures/TempPlayer.png"));
			SpriteSheet cursor = new SpriteSheet(ImageLoader.loadImage("/textures/mainMenuCursor.png"));
		
		//seperate textures
			topGrass = groundTextures.crop(0, 0, width, height);
			dirt = groundTextures.crop(width , 0, width, height);
			stone = groundTextures.crop(width * 2, 0, width, height);
			
			temPlayer = player.crop(0, 0, width/2, height);
			
			mainMenuCursor = cursor.crop(0, 0, width, height);
	}
	
}

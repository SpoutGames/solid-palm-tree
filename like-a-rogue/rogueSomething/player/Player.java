package player;

import java.awt.Color;
import java.awt.Graphics;

import Gfx.Assets;
import entity.Creature;
import framework.Handler;


public class Player extends Creature{
	
	//privates
		private boolean toggleDebug = false;
		private boolean toggleDebugLock = false;
	
	private Handler handler;
	
	public Player(Handler handler, int x, int y) {
		super(handler, x, y);
		this.handler = handler;
		
		bounds.x = handler.getTileWidth()/2;
		bounds.width = handler.getTileWidth()/2;
		bounds.y = handler.getTileHeight();
		bounds.height = handler.getTileHeight();
		
	}

	@Override
	public void tick() {
		move();
		input();
		
		handler.getCamera().centerCameraOnEntity(this);
	}
	
	public void input() {
		//xMove
			if (handler.getInput().left){
				xMove = -hspd;
			}
			if (handler.getInput().right) {
				xMove = hspd;
			}
			if (!handler.getInput().left && !handler.getInput().right) {
				xMove = 0;
			}
		
		
		//debug info
			if (handler.getInput().fKey1) {
				if (toggleDebugLock == false) {
					toggleDebug = !toggleDebug;
				}
				toggleDebugLock = true;
			} else {
				toggleDebugLock = false;
			}
	}
	
	
	
	
	
	
	@Override
	public void render(Graphics g) {		
		
		g.drawImage(Assets.temPlayer, (int) (x - handler.getxOffset()), (int) (y - handler.getyOffset()), handler.getTileWidth()/2, handler.getTileHeight(), null);
		
		//g.setColor(Color.red);
		//g.fillRect((int) ((x - bounds.width) + (bounds.x - handler.getxOffset())), (int) (y - bounds.height + bounds.y - handler.getyOffset()), bounds.width, bounds.height);
		
		if (toggleDebug) {
			g.setColor(Color.BLACK);
			g.drawString("Player X: " + (int) x, 10, 10);
			g.drawString("Player X as Tile chordinates: " + (int) x/48, 10, 25);
			g.drawString("Player Y: " + (int) y, 10, 40);
			g.drawString("Player Y as Tile chordinates: " + (int) y/48, 10, 55);
			g.drawString("Checking vaule 1:  " + (int) ((x-bounds.x-48/2)/48), 10, 70);
			g.drawString("Checking vaule 2:  " + (int) (((x-bounds.x+bounds.width)/48)), 10, 85);
		}
	}

}

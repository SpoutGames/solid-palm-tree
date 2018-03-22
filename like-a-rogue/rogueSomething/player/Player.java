package player;

import java.awt.Graphics;

import Gfx.Assets;
import entity.Creature;
import framework.Handler;


public class Player extends Creature{
	
	private Handler handler;
	
	public Player(Handler handler, int x, int y) {
		super(handler, x, y);
		this.handler = handler;
	}

	@Override
	public void tick() {
		input();
		move();
		
		handler.getCamera().centerCameraOnEntity(this);
	}
	
	public void input() {
		if (handler.getInput().left) {
			xMove = -horizontalSpeed;
		}
		if (handler.getInput().right) {
			xMove = horizontalSpeed;
		}
		if (!handler.getInput().left && !handler.getInput().right) {
			xMove = 0;
			velX = 0;
		}
	}
	
	
	
	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.temPlayer, (int) (x - handler.getxOffset()), (int) (y - handler.getyOffset()), null);
	}

}

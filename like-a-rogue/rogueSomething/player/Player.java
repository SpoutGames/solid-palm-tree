package player;

import java.awt.Graphics;

import Gfx.Assets;
import framework.Creature;

public class Player extends Creature{
	
	public Player(int x, int y) {
		super(x, y);
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.temPlayer, (int) x, (int) y, null);
	}

}

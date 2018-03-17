package player;

import java.awt.Graphics;

import Gfx.Assets;
import framework.Creature;
import state.Main;

public class Player extends Creature{
	
	private Main game;
	
	public Player(Main game, int x, int y) {
		super(x, y);
		this.game = game;
	}

	@Override
	public void tick() {
		input();
	}
	
	public void input() {
		xMove = 0;
		yMove = 0;

		if (game.getInput().left) {
			x += -horizontalSpeed;
		}
		if (game.getInput().right) {
			x += horizontalSpeed;
		}
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.temPlayer, (int) x, (int) y, null);
	}

}

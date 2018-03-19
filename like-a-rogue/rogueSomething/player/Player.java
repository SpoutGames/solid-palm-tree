package player;

import java.awt.Graphics;

import Gfx.Assets;
import framework.Creature;
import state.Main;

public class Player extends Creature{
	
	private Main game;
	
	public Player(Main game, int x, int y) {
		super(game, x, y);
		this.game = game;
	}

	@Override
	public void tick() {
		input();
		move();
	}
	
	public void input() {
		if (game.getInput().left) {
			xMove = -horizontalSpeed;
		}
		if (game.getInput().right) {
			xMove = horizontalSpeed;
		}
		if (!game.getInput().left && !game.getInput().right) {
			xMove = 0;
			velX = 0;
		}
	}

	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.temPlayer, (int) x, (int) y, null);
	}

}

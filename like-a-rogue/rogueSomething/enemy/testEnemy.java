package enemy;

import java.awt.Graphics;

import Gfx.Assets;
import player.Player;
import state.Main;

public class testEnemy extends enemyAi{

	int move = 0;
	private Player player;
	
	
	public testEnemy(Main game, int x, int y) {
		super(game, x, y);
		player = new Player(game, x, y);
		this.x = (int) super.x;
	}
	

	public void tick() {
		
		double move = player.getX();
		if (x+move != playerx) {
			move += Math.signum((playerx - x+move));
		}
		
	}

	public void render(Graphics g) {
		g.drawImage(Assets.stone,(int) x + move, 20, null);		
	}

}

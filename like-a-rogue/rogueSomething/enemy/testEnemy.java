package enemy;

import java.awt.Graphics;

import Gfx.Assets;
import framework.Main;

public class testEnemy extends enemyAi{

	//private

	//public
	
	//objects
		public Main game;
	
	
	public testEnemy(Main game, int x, int y) {
		super(game, x, y);
		this.game = game;
	}
	

	public void tick() {
		
	}

	public void render(Graphics g) {
		g.drawImage(Assets.stone, (int)x, (int)y, null);		
	}

}

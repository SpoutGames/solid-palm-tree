package enemy;

import java.awt.Graphics;

import framework.Creature;
import state.Main;

public abstract class enemyAi extends Creature {

	//Defaults
		protected static final int DEFAULT_DAMAGE = 5;
		protected static final int DEFAULT_BEHAVIOUR = 0;
		
		
	//variables
		public int damage, behaviour;
	
	
	private Main game;

	public enemyAi(Main game, int x, int y) {
		super(game, x, y);
		this.game = game;
		damage = DEFAULT_DAMAGE;
		behaviour = DEFAULT_BEHAVIOUR;
		
	}





	public abstract void tick();
	public abstract void render(Graphics g);
}

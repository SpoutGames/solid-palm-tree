package enemy;

import java.awt.Graphics;

import framework.Creature;
import state.Main;

public abstract class enemyAi extends Creature {

	//Defaults
		protected static final int DEFAULT_DAMAGE = 5;
		protected static final int DEFAULT_BEHAVIOUR = 0;
		
		
	//public
		public int damage, behaviour;
		//abstract
			public abstract void tick();
			public abstract void render(Graphics g);

		
	//constructor
		public enemyAi(Main game, int x, int y) {
			super(game, x, y);
			damage = DEFAULT_DAMAGE;
			behaviour = DEFAULT_BEHAVIOUR;
			
		}
}

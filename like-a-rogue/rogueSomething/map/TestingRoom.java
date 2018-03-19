package map;

import java.awt.Graphics;

import enemy.testEnemy;
import player.Player;
import state.Main;
import state.State;

public class TestingRoom extends State{
	
	private static Player player;
	private testEnemy enemy;
	
	public TestingRoom(Main game) {
		super(game);
		player = new Player(game, 0, 0);
		enemy = new testEnemy(game, 20, 20);
	}

	public static Player getPlayer() {
		return player;
	}


	@Override
	public void tick() {
		player.tick();
		enemy.tick();
	}
	
	@Override
	public void render(Graphics g) {
		player.render(g);
		enemy.render(g);
	}
	
	

}
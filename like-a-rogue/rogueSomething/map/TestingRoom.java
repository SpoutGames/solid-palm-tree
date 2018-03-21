package map;

import java.awt.Graphics;

import Tiles.Tiles;
import enemy.testEnemy;
import framework.Handler;
import framework.World;
import player.Player;
import state.State;

public class TestingRoom extends State{
	
	private static Player player;
	private testEnemy enemy;
	private World test;
	
	public TestingRoom(Handler handler) {
		super(handler);
		player = new Player(handler, 0, 0);
	}

	public static Player getPlayer() {
		return player;
	}


	@Override
	public void tick() {
		test = new World("");
		player.tick();
	}
	
	@Override
	public void render(Graphics g) {
		test.render(g);
		player.render(g);
	}
	
	

}
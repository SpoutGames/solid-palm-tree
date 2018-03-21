package map;

import java.awt.Graphics;

import Tiles.Tiles;
import enemy.testEnemy;
import framework.Handler;
import player.Player;
import state.State;

public class TestingRoom extends State{
	
	private static Player player;
	private testEnemy enemy;
	
	public TestingRoom(Handler handler) {
		super(handler);
		player = new Player(handler, 0, 0);
	}

	public static Player getPlayer() {
		return player;
	}


	@Override
	public void tick() {
		player.tick();
	}
	
	@Override
	public void render(Graphics g) {
		player.render(g);
		Tiles.tiles[0].render(g, 10, 10);
	}
	
	

}
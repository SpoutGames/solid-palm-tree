package map;

import java.awt.Graphics;

import framework.Handler;
import framework.World;
import player.Player;
import state.State;

public class TestingRoom extends State{
	
	private static Player player;
	private World test;
	
	public TestingRoom(Handler handler) {
		super(handler);
		player = new Player(handler, 0, 0);
		
		handler.getCamera().move(0, 0);
	}

	public static Player getPlayer() {
		return player;
	}


	@Override
	public void tick() {
		test = new World(handler, "");
		player.tick();
	}
	
	@Override
	public void render(Graphics g) {
		test.render(g);
		player.render(g);
	}
	
	

}
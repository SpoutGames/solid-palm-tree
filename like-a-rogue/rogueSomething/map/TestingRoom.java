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
		player = new Player(handler, 0, -64);
		
		handler.getCamera().move(0, 0);
		test = new World(handler, "");
		
	}

	public static Player getPlayer() {
		return player;
	}


	@Override
	public void tick() {
		test.tick();
		player.tick();

	}
	
	@Override
	public void render(Graphics g) {
		test.render(g);
		player.render(g);
		
	}
	
	

}
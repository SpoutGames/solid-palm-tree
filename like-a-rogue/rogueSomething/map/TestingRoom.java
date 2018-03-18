package map;

import java.awt.Graphics;

import player.Player;
import state.Main;
import state.State;
import map.World;
public class TestingRoom extends World{
	
	private Player player;
	
	public TestingRoom(Main game) {
		super.super(game);
		player = new Player(game, 0, 0);
	}

	@Override
	public void tick() {
		player.tick();
	}
	
	@Override
	public void render(Graphics g) {
		player.render(g);
	}

}
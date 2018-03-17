package map;

import java.awt.Graphics;

import Gfx.Assets;
import state.State;

public class TestingRoom extends State{

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.stone, 0, 0, null);
		
	}

}
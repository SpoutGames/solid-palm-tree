package state;

import java.awt.Graphics;

import Gfx.Assets;

public class MainMenu extends State{

	@Override
	public void tick() {
		
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.dirt, 0, 0, null);
		
	}

}

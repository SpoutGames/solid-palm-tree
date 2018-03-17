package state;

import java.awt.Graphics;

import Gfx.Assets;

public class MainMenu extends State{

	public MainMenu(Main game) {
		super(game);
		
	}

	@Override
	public void tick() {
		
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.dirt, 0, 0, null);
		
	}

}

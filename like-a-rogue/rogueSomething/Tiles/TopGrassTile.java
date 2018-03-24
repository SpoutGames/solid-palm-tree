package Tiles;

import Gfx.Assets;

public class TopGrassTile extends Tiles{

	public TopGrassTile(int newId) {
		super(Assets.topGrass, newId);
	}
	
	@Override
	public boolean isSolid() {
		return true;
	}
}

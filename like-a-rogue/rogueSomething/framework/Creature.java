package framework;

public abstract class Creature extends Entity{

	protected int health;
	
	public Creature(int x, int y) {
		super(x, y);
		health = 10;
	}

}

package framework;

public abstract class Creature extends Entity{
	
	//defaults
		public static final int DEFAULT_HEALTH = 30;
		public static final float DEFAULT_HORIZONTAL_SPEED = 2;
		public static final float DEFAULT_JUMP_SPEED = 2;

	protected int health;
	protected float horizontalSpeed, verticalSpeed, jumpSpeed;
	
	public float xMove, yMove;
	
	public Creature(int x, int y) {
		super(x, y);
		health = DEFAULT_HEALTH;
		horizontalSpeed = DEFAULT_HORIZONTAL_SPEED;
		jumpSpeed = DEFAULT_JUMP_SPEED;
	}
	
	public void move() {
		x += xMove;
		y += yMove;
	}

	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

}

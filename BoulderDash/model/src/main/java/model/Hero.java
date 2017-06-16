package model;

public class Hero implements IExplosion{

	private static String SPRITE;
	private static Hero hero;
	
	private int timeout;
	private int diamonds;
	private int score;
	private Direction direction;
	
	private Hero(){
		
	}
	
	public void startTimeOut(){
		
	}

	public Hero getInstance(){
		return new Hero();
	}
	
	public static String getSPRITE() {
		return SPRITE;
	}

	public static void setSPRITE(String sprite) {
		SPRITE = sprite;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getDiamonds() {
		return diamonds;
	}

	public void setDiamonds(int diamonds) {
		this.diamonds = diamonds;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}


	@Override
	public void IExplosion() {

	}
}

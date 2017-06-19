package model;

/**
 * <h1>The Class Element</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */

public class Hero implements IExplosion{

	private static String SPRITE;
	private static Hero hero;
	
	private int timeout;
	private int diamonds;
	private int score;
	private Direction direction;


    /**
     * Instantiates the hero
     */
    private Hero(){
		
	}

    /**
     * Create the stopwatch and decrease the time
     */
	public void startTimeOut(){
		
	}

	/**
	 * method use for create an instance of hero
	 * @return return a new hero
	 */
	public Hero getInstance(){
		return new Hero();
	}

    /**
     * method use for return the selected SPRITE for the hero
     * @return the SPRITE of a hero
     */
	public static String getSPRITE() {
		return SPRITE;
	}

    /**
     * method use for set a SPRITE for the hero
     * @param sprite
     */
	public static void setSPRITE(String sprite) {
		SPRITE = sprite;
	}

    /**
     * method use for get the score
     * @return score
     */
	public int getScore() {
		return score;
	}

    /**
     * set the score default and change according to the game
     * @param score
     */
	public void setScore(int score) {
		this.score = score;
	}

    /**
     * return diamonds if collision
     * @return diamonds
     */
	public int getDiamonds() {
		return diamonds;
	}

    /**
     * setDiamond on the map
     * @param diamonds
     */
	public void setDiamonds(int diamonds) {
		this.diamonds = diamonds;
	}


    /**
     * return the time for test if it is not at 0
     * @return timeout
     */
	public int getTimeout() {
		return timeout;
	}

    /**
     * define the time as we want
     * @param timeout
     */
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

    /**
     * get the direction who come from the action of the player
     * @return direction
     */
	public Direction getDirection() {
		return direction;
	}


    /**
     * with the direction get before, set the direction of the hero
     * @param direction
     */
	public void setDirection(Direction direction) {
		this.direction = direction;
	}


    /**
     * @see IExplosion
     */
	@Override
	public void IExplosion() {

	}
}

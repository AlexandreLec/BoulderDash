package model;

/**
 * <h1>The Class Element</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.1
 */
public class Hero extends Element implements IExplosion{

	/** The sprite of the hero */
	private static String SPRITE = "up";
	/** The hero */
	private static Hero hero;
	/** The timeout of the hero */
	private int timeout;
	/** The number of diamonds of the hero */
	private int diamonds;
	/** The hero's direction */
	private Direction direction;
	
	/**
	 * Instantiate a new Hero
	 * @param position
	 * @param mine
	 */
    private Hero(Position position, Mine mine){
		super(position, SPRITE,mine);
		behaviour = new Controlled(this);
	}

    /**
     * Create the chess-clock and decrease the time
     */
	public void startTimeOut(){
		
	}

	/**
	 * method use for create an instance of hero
	 * @param position
	 * 		The position to set
	 * @param mine
	 * 		The mine to set
	 * @return return a new hero
	 */
	static public Hero getInstance(Position position, Mine mine){
		
		if(hero == null){
			hero = new Hero(position, mine);
		}
		return hero;
	}
	
	/**
	 * Get the instance of the hero
	 * @return the hero
	 */
	static public Hero getInstance(){
		return hero;
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
     * 		the sprite name
     */
	public static void setSPRITE(String sprite) {
		SPRITE = sprite;
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
     * 		The number of diamond to set
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
     * 		set the timeout of the hero
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
     * 		The direction to set
     */
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

    /**
     * @throws Exception 
     * 		The exception
     * @see IExplosion
     */
	@Override
	synchronized public void explosion() throws Exception {
		this.getMine().destroyElement(Hero.hero);
		this.getMine().getModel().setGame(false);
		Hero.hero = null;
	}
}

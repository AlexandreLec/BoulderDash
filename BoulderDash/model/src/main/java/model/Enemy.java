package model;

/**
 * <h1>The Enemy Element</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */
public class Enemy extends Element implements IExplosion, IKill {

    /** Variable who will use for seek sprite **/
    private static String spriteName = "";
	
    /**
     * create constructor
     */
    public Enemy(Position position){
    	super(position, spriteName);
    }

    /**
     * set a sprite for one enemy. This sprite is choose randomly
     */
    private String setSpriteNameAlea(){
		return spriteName;

    }

    /**
     * Come from IExplosion
     */
    @Override
    public void explosion() {
    	
    }

    /**
     * Come from IKill
     * @param element
     */
    @Override
    public void kill(Element element) {

    }

    /**
     * Get the name of the enemy's sprite
     * @return The sprite's name
     */
	public String getSpriteName() {
		return spriteName;
	}

	/**
	 * Set the name of the enemy's sprite
	 * @param spriteName
	 */
	public void setSpriteName(String spriteName) {
		this.spriteName = spriteName;
	}
}

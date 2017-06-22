package model;

/**
 * <h1>The Enemy Element</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.1
 */
public class Enemy extends Element implements IExplosion {

    /** Variable who will use for seek sprite **/
    private static String spriteName = "enemy";
    
    static Mine mine;
	
    /**
     * create constructor
     */
    public Enemy(Position position, Mine mine){
    	super(position, setSpriteNameAlea(), mine);
    	Enemy.mine = mine;
    	behaviour = new Automatic(this);
    	direction = Direction.LEFT;
    }

    /**
     * set a sprite for one enemy. This sprite is choose randomly
     */
    private static String setSpriteNameAlea(){
    	
    	int alea = (int) (Math.random()*4);
		
		switch(alea){
			case 0:
				return "enemy";
			case 1:
				return "enemy";
			case 2:
				return "enemy";
			case 3:
				return "enemy";
			default:
				return "enemy";
		}
    }

    /**
     * Come from IExplosion
     * @throws Exception 
     */
    @Override
    synchronized public void explosion() throws Exception {
    	
    	int x = this.getPosition().getX();
    	int y = this.getPosition().getY();
    	int xMax = this.getPosition().getMaxX();
    	int yMax = this.getPosition().getMaxY();

    	IElement diamond = new Diamond(new Position(x,y,xMax,yMax),Enemy.mine);

    	Enemy.mine.setElement(x, y, diamond);

    	Enemy.mine.addGravity(diamond);
		this.mine.setElement(x+1, y, new Diamond(new Position(x+1,y,xMax,yMax),this.mine));
		this.mine.setElement(x-1, y, new Diamond(new Position(x-1,y,xMax,yMax),this.mine));
		this.mine.setElement(x, y+1, new Diamond(new Position(x,y+1,xMax,yMax),this.mine));
		this.mine.setElement(x, y-1, new Diamond(new Position(x,y-1,xMax,yMax),this.mine));
		System.out.println("kill");
		//this.getMine().getModel().effectiveChanged();
		
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
		Enemy.spriteName = spriteName;
	}
}

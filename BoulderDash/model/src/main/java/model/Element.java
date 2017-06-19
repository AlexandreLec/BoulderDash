package model;

import java.awt.Image;

/**
 * <h1>The Element Class </h1>
 *
 * @author LECOMPTE Alexandre
 * @version 1.0
 */
public class Element implements IElement {
	
	/** The position of the element */
	private Position position;
	/** The sprite of the element  */
	private Image Sprite;
	/** The move behaviour of the element */
	protected BehaviourMove behaviour;

	/**
	 * Instantiates a new Element
	 * @param position
	 * 		Position of the Element
	 */
    public Element(Position position, String sprite){

    }
    
    /**
     * Get the sprite in the database
     * @param sprite
     * 		The sprit's name to load
     * @return the sprite's image
     */
    private Image loadSprite(String sprite){
		return Sprite;
    }

    /**
     * Gets the Position.
     * @return the position
     */
    @Override
    public Position getPosition(){
        return position;
    }

    /**
     * Sets the position
     * @param position
     * 		Position of the element to set
     */
    @Override
    public void setPosition(Position position){
    	
    }
    
    /**
     * Place the elements in the mine
     */
    @Override
    public void placeInMine(){

    }

    /**
     * Gets the sprite of the element
     * @return the sprite
     */
    @Override
    public Image getSprite(){
        return Sprite;
    }

    /**
     * Sets the sprite of the element
     * @param the sprite
     */
    @Override
    public void setSprite(String sprite){

    }

    /**
     * Gets the movement behavior of the element
     * @return the behavior of move
     */
    public BehaviourMove getBehaviour(){
        return new Gravity();
    }

    /**
     * Sets the movement behavior of the element
     * @param behaviour
     * 		The movement behavior to set
     */
    public void setBehaviour(BehaviourMove behaviour){

    }
}

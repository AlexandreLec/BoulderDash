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

	/**
	 * Instantiates a new Element
	 * @param position
	 * 		Position of the Element
	 */
    public Element(Position position, String sprite){

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
     * Gets the model
     * @return the BoulderDashModel
     */
    public BoulderDashModel getBoulderDashModel(){
        return new BoulderDashModel();
    }

    /**
     * Sets the model
     * @param boulderdashmodel
     * 		the model to set
     */
    public void setBoulderDashModel(BoulderDashModel boulderdashmodel){

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

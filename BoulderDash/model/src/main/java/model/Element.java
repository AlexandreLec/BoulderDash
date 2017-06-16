package model;

import java.awt.Image;

/**
 * <h1>The Class Element</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */
public class Element {
	
	/** The position of the element */
	private Position position;
	/** The sprite of the element  */
	private Image Sprite;

	/**
	 * Instantiates a new Element
	 * @param position
	 * 		Position of the Element
	 */
    public Element(Position position){

    }

    /**
     * Gets the Position.
     * @return the position
     */
    public Position getPosition(){
        return position;
    }

    /**
     * Sets the position
     * @param position
     * 		Position of the element to set
     */
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
    public void placeInMine(){

    }

    /**
     * Gets the sprite of the element
     * @return the sprite
     */
    public Image getSprite(){
        return Sprite;
    }

    /**
     * Sets the sprite of the element
     * @param the sprite
     */
    public void setSprite(String sprite){

    }

    /**
     * Gets the movement behavior of the element
     * @return the behavior of move
     */
    public BehaviourMove getBehaviour(){
        return new BehaviourMove();
    }

    /**
     * Sets the movement behavior of the element
     * @param behaviour
     * 		The movement behavior to set
     */
    public void setBehaviour(BehaviourMove behaviour){

    }
}

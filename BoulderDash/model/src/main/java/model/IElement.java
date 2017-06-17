package model;

import java.awt.Image;

public interface IElement {

    /**
     * Gets the Position.
     * @return the position
     */
	public Position getPosition();

    /**
     * Sets the position
     * @param position
     * 		Position of the element to set
     */
    public void setPosition(Position position);

    /**
     * Gets the model
     * @return the BoulderDashModel
     */
    public BoulderDashModel getBoulderDashModel();

    /**
     * Sets the model
     * @param boulderdashmodel
     * 		the model to set
     */
    public void setBoulderDashModel(BoulderDashModel boulderdashmodel);
    
    /**
     * Place the elements in the mine
     */
    public void placeInMine();

    /**
     * Gets the sprite of the element
     * @return the sprite
     */
    public Image getSprite();

    /**
     * Sets the sprite of the element
     * @param the sprite
     */
    public void setSprite(String sprite);

    /**
     * Gets the movement behavior of the element
     * @return the behavior of move
     */
    public BehaviourMove getBehaviour();

    /**
     * Sets the movement behavior of the element
     * @param behaviour
     * 		The movement behavior to set
     */
    public void setBehaviour(BehaviourMove behaviour);
}

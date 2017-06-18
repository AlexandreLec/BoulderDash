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
}


package model;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Iterator;

/**
 * <h1>The Element Class </h1>
 *
 * @author LECOMTE
 * @version 1.1
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
    	this.position = position;
    	this.Sprite = loadSprite(sprite);
    }
    
    /**
     * Get the sprite in the database
     * @param sprite
     * 		The sprit's name to load
     * @return the sprite's image
     */
    private Image loadSprite(String sprite){

        //ImageIcon ele = new ImageIcon("")

    	String path = "ressources/img/"+sprite+".png";
    	
    	Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		Image result = toolkit.getImage(path);


		if(result == null){
			System.out.println("eereur");
		}
		
		return result;

    }

    /**
     * Gets the Position.
     * @return the position
     */
    @Override
    public Position getPosition(){
        return this.position;
    }

    /**
     * Sets the position
     * @param position
     * 		Position of the element to set
     */
    @Override
    public void setPosition(Position position){
    	this.position = position;
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
        return this.Sprite;
    }

    /**
     * Sets the sprite of the element
     * @param the sprite
     */
    @Override
    public void setSprite(String sprite){
    	this.Sprite = loadSprite(sprite);
    }

    /**
     * Gets the movement behavior of the element
     * @return the behavior of move
     */
    public BehaviourMove getBehaviour(){
        return this.behaviour;
    }

    /**
     * Sets the movement behavior of the element
     * @param behaviour
     * 		The movement behavior to set
     */
    public void setBehaviour(BehaviourMove behaviour){
    	this.behaviour = behaviour;
    }

	public static Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
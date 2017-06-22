package model;

import java.util.Iterator;

//import java.util.Iterator;

/**
 * <h1>The Class Element</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */

public class Gravity extends BehaviourMove {
	
	
	public Gravity(Element element) {
			super(element);
	}
	
	
	public void Gravit() throws Exception{
		Iterator<IElement> iterator = this.element.getMine().getGravity().iterator();
		while (iterator.hasNext()) {
			iterator.next().getBehaviour().move();
		}
	
	/**
     * Instantiates the Gravity
     */
   
	
		
		
	}

    /**
     *  @see BehaviourMove
     */
	@Override
	public void move() throws Exception{
		IElement down = element.getMine().getElements()[element.getPosition().getX()][element.getPosition().getY()+1];
		IElement right = element.getMine().getElements()[element.getPosition().getX()+1][element.getPosition().getY()];
		IElement left = element.getMine().getElements()[element.getPosition().getX()-1][element.getPosition().getY()];
	if(down == null){
		this.element.getBehaviour().moveDown();
	}
	if(left == null && down == null){
		this.element.getBehaviour().moveLeft();
		this.element.getBehaviour().moveDown();
	}
	
	if(right == null && down == null){
		this.element.getBehaviour().moveRight();
		this.element.getBehaviour().moveDown();
	}
	}
	
}

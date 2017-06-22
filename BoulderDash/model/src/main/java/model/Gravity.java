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
	
	/**
     * Instantiates the Gravity
     */
	public Gravity(Element element) {
			super(element);
	}
	
	
	public void Gravit() throws Exception{
		Iterator<IElement> iterator = this.element.getMine().getGravity().iterator();
		while (iterator.hasNext()) {
			iterator.next().getBehaviour().move();
		}
	}

    /**
     *  @see BehaviourMove
     */
	@Override
	public void move() throws Exception{

		IElement down = element.getMine().getElements()[element.getPosition().getX()][element.getPosition().getY()+1];
		IElement downr = element.getMine().getElements()[element.getPosition().getX()+1][element.getPosition().getY()+1];
		IElement right = element.getMine().getElements()[element.getPosition().getX()+1][element.getPosition().getY()];
		IElement downl = element.getMine().getElements()[element.getPosition().getX()-1][element.getPosition().getY()+1];
		IElement left = element.getMine().getElements()[element.getPosition().getX()-1][element.getPosition().getY()];
	
		if(down == null){
			this.element.getBehaviour().moveDown();
		}
		if(left == null && down != null && downl == null){
			this.element.getBehaviour().moveLeft();
			this.element.getBehaviour().moveDown();
		}
		
		if(right == null && down != null && downr == null){
			this.element.getBehaviour().moveRight();
			this.element.getBehaviour().moveDown();
		}
		if(down != null && down.getClass() == model.Enemy.class) {
			IElement enemy = element.getMine().getElements()[element.getPosition().getX()][element.getPosition().getY()+1];
			
			int x = enemy.getPosition().getX();
	    	int y = enemy.getPosition().getY();
	    	int xMax = enemy.getPosition().getMaxX();
	    	int yMax = enemy.getPosition().getMaxY();
	    	
	    	this.element.getMine().destroyElement(enemy);
	    	
	    	IElement diamond = new Diamond(new Position(x,y,xMax,yMax),Enemy.mine);

	    	Enemy.mine.setElement(x, y, diamond);

	    	Enemy.mine.addGravity(diamond);
		}
	}
	
}

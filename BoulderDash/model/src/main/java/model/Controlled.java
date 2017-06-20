package model;

/**
 * <h1>The Class Controlled</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */

public class Controlled extends BehaviourMove {

	/**
	 * @see BehaviourMove
	 */
	@Override
	public void move() {
		

	}

	/**
	 * method use for move element right
	 * @param position
	 * @return position
	 * @throws Exception 
	 */
	
	public Position moveRight(Position position) throws Exception{
		
		position.setX(position.getX()+1);
		return position;
		
	}

	/**
	 * method use for move element Left
	 * @param position
	 * @return position
	 * @throws Exception 
	 */
	
	public Position moveLeft(Position position) throws Exception{
		
		position.setX(position.getX()-1);
		return position;
		
	}

	/**
	 * method use for move element Up
	 * @param position
	 * @return position
	 * @throws Exception 
	 */

	public Position moveUp(Position position) throws Exception{
		
		position.setY(position.getY()-1);
		return position;
		
	}

	/**
	 * method use for move element Down
	 * @param position
	 * @return position
	 * @throws Exception 
	 */
	
	public Position moveDown(Position position) throws Exception{
		position.setY(position.getY()+1);
		return position;
		
	}

}

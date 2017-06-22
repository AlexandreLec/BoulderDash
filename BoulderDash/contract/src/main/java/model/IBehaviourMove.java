package model;

/**
 * <h1>The Class BehaviourMove</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public interface IBehaviourMove {

	/**
	 * All method of movement call in mobile elements
	 * @throws Exception
	 */
	
	void move() throws Exception;
	void moveRight() throws Exception;
	void moveLeft() throws Exception;
	void moveUp() throws Exception;
	void moveDown() throws Exception;

	/**
	 * Method use for move all ennemy in the same time
	 * @throws Exception
	 */
	void moveAll() throws Exception;

	/**
	 * Movement method for stones and diamonds gravitation
	 * @throws Exception
	 */
	void Gravit() throws Exception;
}

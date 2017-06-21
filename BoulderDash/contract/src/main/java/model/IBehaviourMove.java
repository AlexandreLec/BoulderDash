package model;

/**
 * <h1>The Class BehaviourMove</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public interface IBehaviourMove {
	
	public void move() throws Exception;
	public void moveRight() throws Exception;
	public void moveLeft() throws Exception;
	public void moveUp() throws Exception;
	public void moveDown() throws Exception;
}

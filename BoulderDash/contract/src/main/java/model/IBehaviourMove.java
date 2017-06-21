package model;

/**
 * <h1>The Class BehaviourMove</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public interface IBehaviourMove {
	
	public void move();
	public Position moveRight(Position position) throws Exception;
	public Position moveLeft(Position position) throws Exception;
	public Position moveUp(Position position) throws Exception;
	public Position moveDown(Position position) throws Exception;
}

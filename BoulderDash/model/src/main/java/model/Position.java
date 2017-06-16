package model;

/**
 * <h1>The Class Position</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public class Position {

	/** The x coordinate of the position */
	private int x;
	/** The y coordinate of the position */
	private int y;
	/** The maximum x coordinate of the position */
	private int maxX;
	/** The maximum x coordinate of the position */
	private int maxY;
	
	/**
	 * Instantiate a new Position
	 * @param x
	 * 		The position along x axis
	 * @param y
	 * 		The position along y axis
	 */
	public Position(int x, int y){
		
	}
	
	/**
	 * Instantiate a new Position
	 * @param position
	 * 		The position
	 */
	public Position(Position position){
		
	}

	/**
	 * Gets the x coordinate
	 * @return the x coordinate
	 */
	public int getX() {
		return x;
	}

	/**
	 * Sets the x coordinate
	 * @param x
	 * 		The x coordinate to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Gets the y coordinate
	 * @return the y coordinate
	 */
	public int getY() {
		return y;
	}

	/**
	 * Sets the y coordinate
	 * @param y
	 * 		The y coordinate to set
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Gets the max x coordinate
	 * @return the max x coordinate
	 */
	public int getMaxX() {
		return maxX;
	}

	/**
	 * Sets the max x coordinate
	 * @param maxX
	 * 		The max x coordinate to set
	 */
	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}

	/**
	 * Gets the max y coordinate
	 * @return the max y coordinate
	 */
	public int getMaxY() {
		return maxY;
	}

	/**
	 * Sets the max y coordinate
	 * @param maxY
	 * 		The max y coordinate to set
	 */
	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}
}
package model;

/**
 * <h1>The Class Element</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */

public class Mine {

	/** The height of the mine */ 
	static int HEIGHT = 30;
	/** The width of the mine */ 
	static int WIDTH = 50;
	/** The tab of the different elements */
	private IElement[][] elements;


	/**
	 * Instantiates the constructor
	 * @throws Exception 
	 */
	public Mine(){
		this.elements = new IElement[Mine.WIDTH][Mine.HEIGHT];
	}
	
	public IElement[][] getElements() {
		
		return elements;
	}
	
	public void setElement(int x, int y, IElement add) {
		
		this.elements[x][y] = add;
	}

}

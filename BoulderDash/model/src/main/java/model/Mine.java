package model;

import java.util.ArrayList;

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
	/** The list of the different elements */
	private ArrayList<IElement> elements;

	/**
	 * Instantiates the constructor
	 */
	public Mine(){
		
	}

	public ArrayList<IElement> getElements() {
		return elements;
	}

	public void setElements(ArrayList<IElement> elements) {
		this.elements = elements;
	}
}

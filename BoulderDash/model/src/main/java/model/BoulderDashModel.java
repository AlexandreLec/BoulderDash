package model;

import java.util.ArrayList;
import java.util.Observable;

/**
 * <h1>The Class BoulderDashModel</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public class BoulderDashModel extends Observable {

	/** The list of the different elements */
	private ArrayList<Element> elements;
	/** The  mine who contains the elements */
	private Mine mine;
	
	/**
	 * Instantiates the BoulderDashModel.
	 */
	public BoulderDashModel(){
		
	}

	/**
	 * Gets the list of the elements 
	 * @return a list of the elements
	 */
	public ArrayList<Element> getElements() {
		return elements;
	}
	
	/**
	 * Adds an object to the list of the elements
	 * @param element
	 * 		element to add in the list
	 */
	public void addElement(IElement element){
		
	}
	
	/**
	 * Removes an object of the list of elements
	 * @param element
	 * 		element to remove of the list
	 */
	public void removeElement(IElement element){
		
	}
	
	/**
	 * Builds the mine
	 */
	public void buildMine(){
		
	}

	/**
	 * Gets the mine
	 * @return the mine of the model
	 */
	public Mine getMine() {
		return mine;
	}

	/**
	 * Sets the mine of the model
	 * @param mine
	 * 		The mine to set
	 */
	public void setMine(Mine mine) {
		this.mine = mine;
	}
}

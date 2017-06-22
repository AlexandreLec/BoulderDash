package model;

import java.util.Observer;

/**
 * <h1>The Interface IBoulderDashModel.</h1>
 *
 * @author Alexandre LECOMTE
 * @version 1.0
 */
public interface IBoulderDashModel {

	/**
	 * Gets the list of the elements 
	 * @return a list of the elements
	 */
	IElement[][] getElements();
	
	/**
	 * Adds an object to the list of the elements
	 * @param element
	 * 		element to add in the list
	 */
	void addElement(IElement element);
	
	/**
	 * Removes an object of the list of elements
	 * @param element
	 * 		element to remove of the list
	 */
	void removeElement(IElement element);
    
	/**
	 * Add an observer to the model
	 * @param o
	 * 		the observer to add
	 */
	void observerAdd(Observer o);
	
	/**
	 * Gets an element by it position
	 * @param x
	 * 		The x position of the element to get
	 * @param y
	 * 		The y position of the element to get
	 * @return an Element
	 */
	IElement getElementByPosition(int x, int y);

	/**
	 * Add a diamond to the hero
	 */
	void getDiamond();

	/**
	 * Get the number of diamond get by the hero
	 * @return the number of diamonds collected
	 */
	int diamondCounter();
}

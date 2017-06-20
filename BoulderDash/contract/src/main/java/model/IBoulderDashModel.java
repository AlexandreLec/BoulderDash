package model;

import java.util.ArrayList;

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
	public IElement getElements(Position position);
	
	/**
	 * Adds an object to the list of the elements
	 * @param element
	 * 		element to add in the list
	 */
	public void addElement(IElement element);
	
	/**
	 * Removes an object of the list of elements
	 * @param element
	 * 		element to remove of the list
	 */
	public void removeElement(IElement element);
	
	/**
	 * Builds the mine
	 * @throws Exception 
	 */
	public void buildMine() throws Exception;
    
}

package model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * <h1>The Class BoulderDashModel</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.1
 */
public class BoulderDashModel extends Observable implements IBoulderDashModel {

	/** The  mine who contains the elements */
	private Mine mine;
	/** The list of the different elements */
	private ArrayList<IElement> elements;
	
	/**
	 * Instantiates the BoulderDashModel.
	 * @throws Exception 
	 */
	public BoulderDashModel() throws Exception{
		this.elements = new ArrayList<IElement>();
	}

	/**
	 * Gets the list of the elements 
	 * @return a list of the elements
	 */
	@Override
	public ArrayList<IElement> getElements() {
		
		return elements;
	}
	
	/**
	 * Adds an object to the list of the elements
	 * @param element
	 * 		element to add in the list
	 */
	@Override
	public void addElement(IElement element){
		this.elements.add(element);
	}
	
	/**
	 * Removes an object of the list of elements
	 * @param element
	 * 		element to remove of the list
	 */
	@Override
	public void removeElement(IElement element){
		
	}
	
	/**
	 * Builds the mine
	 * @throws Exception 
	 */
	@Override
	public void buildMine() throws Exception{
		/*try {
			String level = test.getLevel("level2");
			System.out.println(level);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		this.elements.add(new Dirt(new Position(1,1,10,10)));
	
		
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

	@Override
	public void addObserver(Observer o) {
		addObserver(o);
	}
}

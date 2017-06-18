package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import model.dao.test;

/**
 * <h1>The Class BoulderDashModel</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public class BoulderDashModel extends Observable implements IBoulderDashModel {

	/** The list of the different elements */
	private ArrayList<IElement> elements;
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
	 */
	@Override
	public void buildMine(){
		try {
			String level = test.getLevel("level2");
			System.out.println(level);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

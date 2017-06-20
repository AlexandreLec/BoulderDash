package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Observable;

import model.dao.test;

/**
 * <h1>The Class BoulderDashModel</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.1
 */
public class BoulderDashModel extends Observable implements IBoulderDashModel {

	/** The  mine who contains the elements */
	private Mine mine;
	
	/**
	 * Instantiates the BoulderDashModel.
	 */
	public BoulderDashModel(){
		this.mine = new Mine();
	}

	/**
	 * Gets the list of the elements 
	 * @return a list of the elements
	 */
	@Override
	public IElement getElements(Position position) {
		
		return this.mine.getElements().get(position.getX()+position.getY());
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
		this.mine.getElements().add(new Dirt(new Position(0,0,10,10)));
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

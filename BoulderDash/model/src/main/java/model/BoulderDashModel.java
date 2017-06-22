package model;

import java.util.Observable;
import java.util.Observer;

<<<<<<< HEAD

import model.dao.level;

/**
 * <h1>The Class BoulderDashModel</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.3
 */
public class BoulderDashModel extends Observable implements IBoulderDashModel {

	/** The  mine who contains the elements */
	private Mine mine;
	
	/**
	 * Instantiates the BoulderDashModel.
	 * @throws Exception 
	 */
	public BoulderDashModel() throws Exception{
		this.mine = new Mine(this);
	}

	/**
	 * Gets the list of the elements 
	 * @return a list of the elements
	 */
	@Override
	public IElement[][] getElements() {
		return this.mine.getElements();
	}
	
	/**
	 * Get the element that is to the x and y coordinates
	 * @param x
	 * 		The x coordinate
	 * @param y
	 * 		The y coordinate
	 * @return an Element
	 */
	@Override
	public IElement getElementByPosition(int x, int y) {
		return this.mine.getElements()[x][y];
	}
	
	/**
	 * Adds an object to the list of the elements
	 * @param element
	 * 		element to add in the list
	 */
	@Override
	public void addElement(IElement element){
		this.mine.setElement(element.getPosition().getX(), element.getPosition().getY(), element);
	}
	
	/**
	 * Removes an object of the list of elements
	 * @param element
	 * 		element to remove of the list
	 */
	@Override
	public void removeElement(IElement element){
		this.mine.setElement(element.getPosition().getX(), element.getPosition().getY(), null);
	}
		
	/**
	 * Notify the model's observer (the view) that it changed values
	 */
	public void effectiveChanged(){
		this.setChanged();
		this.notifyObservers();
	}
	
	/**
	 * Add a diamond for the hero
	 */
	@Override
	public void getDiamond(){
		Hero hero = Hero.getInstance();
		hero.setDiamonds(hero.getDiamonds()+1);
		System.out.println(hero.getDiamonds());
		this.effectiveChanged();
		
	}
	
	/**
	 * Get the number of diamond get by the hero
	 */
	@Override
	public int diamondCounter(){
		Hero hero = Hero.getInstance();
		return hero.getDiamonds();

		
	}

	/**
	 * Load the level, get it from the database
	 * @param levelToLoad
	 * 		The level to load 
	 * @return a String that contain the level template
	 */
	private String loadLevel(String levelToLoad){
		
		String result = "";
		
		try {
			result = level.getLevel(levelToLoad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;

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
	public void observerAdd(Observer o) {
		addObserver(o);
	}
}

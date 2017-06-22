package model;

import java.awt.Image;
import java.util.Observable;
import java.util.Observer;

import java.util.concurrent.CopyOnWriteArrayList;


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
	/** The game over image*/
	private Image gameOver;
	
	/**
	 * Instantiates the BoulderDashModel.
	 * @throws Exception 
	 */
	public BoulderDashModel() throws Exception{
		this.mine = new Mine(this);
		this.gameOver = Element.loadSprite("gameover");
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
	 * @throws Exception 
	 */
	@Override
	synchronized public void getDiamond(IElement element) throws Exception{
		Hero hero = Hero.getInstance();
		this.mine.destroyElement(element);
		hero.setDiamonds(hero.getDiamonds()+1);
		System.out.println(hero.getDiamonds());
		this.effectiveChanged();
		
	}
	
	/**
	 * Get the number of diamond get by the hero
	 * @throws Exception 
	 */
	@Override
	public int diamondCounter() throws Exception{
		Hero hero = Hero.getInstance();
			
		if(hero == null)
			throw new Exception("Hero is dead");
		
		return hero.getDiamonds();

		
	}
	
	@Override
	public IElement getHero(){
		return this.getMine().getHero();
	}
	
	@Override
	public CopyOnWriteArrayList<IElement> getEnemy(){
		return this.getMine().getEnemy();
	}
	
	@Override
	public CopyOnWriteArrayList<IElement> getGravity(){
		return this.getMine().getGravity();
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

	@Override
	public Image getGameOver() {
		return gameOver;
	}

}

package model;

import java.util.Observable;
import java.util.Observer;

import model.dao.level;

/**
 * <h1>The Class BoulderDashModel</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.2
 */
public class BoulderDashModel extends Observable implements IBoulderDashModel {

	/** The  mine who contains the elements */
	private Mine mine;
	
	/**
	 * Instantiates the BoulderDashModel.
	 * @throws Exception 
	 */
	public BoulderDashModel() throws Exception{
		this.mine = new Mine();
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
		
		String currentLevel = loadLevel("level1");
		int i = 0;
		for(int y = 0 ;y<Mine.HEIGHT; y++){
			for (int x = 0; x<Mine.WIDTH;x++){
					
				char element = currentLevel.charAt(i);
					
				i++; 
				System.out.print(element);
				
				switch(element){
					case 'o':
						this.mine.setElement(x,y,new Stone(new Position(x,y,Mine.WIDTH,Mine.HEIGHT),this.mine));
						break;
					case 'x':
						this.mine.setElement(x,y,new Wall(new Position(x,y,Mine.WIDTH,Mine.HEIGHT),this.mine));
						break;
					case 'v':
						this.mine.setElement(x,y,new Diamond(new Position(x,y,Mine.WIDTH,Mine.HEIGHT),this.mine));
						break;
					case '.':
						this.mine.setElement(x,y,new Dirt(new Position(x,y,Mine.WIDTH,Mine.HEIGHT),this.mine));
						break;
					case 'u':
						this.mine.setElement(x,y,ExitGate.getInstance(new Position(x,y,Mine.WIDTH,Mine.HEIGHT),this.mine));
						break;
					case 'y':
						this.mine.setElement(x,y,Hero.getInstance(new Position(x,y,Mine.WIDTH,Mine.HEIGHT),this.mine));
						break;
					case ' ':
						this.mine.setElement(x,y,null);
						break;
					case 'm':
						this.mine.setElement(x,y,new Enemy(new Position(x,y,Mine.WIDTH,Mine.HEIGHT),this.mine));
						break;
					}
			}
		}
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
	public void addObserver(Observer o) {
		addObserver(o);
	}
}

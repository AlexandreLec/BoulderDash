package model;

import java.util.ArrayList;
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
		
		String currentLevel = loadLevel("level1");
		int i = 0;
		int x = 0;
		
		for(int y = 0 ;y<Mine.HEIGHT; y++){
			for (; x<Mine.WIDTH;x++){
					
				char element = currentLevel.charAt(i);
						
				System.out.print(element);
				
				i++;
				switch(element){
					case 'o':
						elements.add(new Stone(new Position(x,y,Mine.WIDTH,Mine.HEIGHT)));
						break;
					case 'x':
						elements.add(new Wall(new Position(x,y,Mine.WIDTH,Mine.HEIGHT)));
						break;
					case 'v':
						elements.add(new Diamond(new Position(x,y,Mine.WIDTH,Mine.HEIGHT)));
						break;
					case '.':
						elements.add(new Dirt(new Position(x,y,Mine.WIDTH,Mine.HEIGHT)));
						break;
					case 'u':
						elements.add(ExitGate.getInstance(new Position(x,y,Mine.WIDTH,Mine.HEIGHT)));
						break;
					case ' ':
						break;
					case 'm':
						elements.add(new Enemy(new Position(x,y,Mine.WIDTH,Mine.HEIGHT)));
						break;
					}
			}
			x = 0;
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

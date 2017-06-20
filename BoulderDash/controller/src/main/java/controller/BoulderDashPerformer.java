package controller;

import model.IBoulderDashModel;


/**
 *  <h1>The class BoulderDashPerformer</h1>

 * 
 * @author Charles LELEUX
 * @version 1.0
 * 
 */
import view.IView;

public class BoulderDashPerformer implements IOrderPerformer{
	
	
	
	/**
	 * create constructor
	 * @param BoulderDashModel
	 */
	public BoulderDashPerformer(IBoulderDashModel BoulderDashModel, IView view) {}
	

	/**
	 * method in order to play
	 */
	public void play() {}

	/**
	 * create a loop
	 */
	private void gameLoop() {}


	/**
	 * Sets the ViewSystem
	 * 
	 * @param viewSystem
	 */
	public void setViewSystem(IView viewSystem) {}
	


	
	/**
	 * implement OderPerformer
	 * @param userOrder
	 */
	@Override
	public void OderPerform(IUserOrder userOrder) {
		
	}
}

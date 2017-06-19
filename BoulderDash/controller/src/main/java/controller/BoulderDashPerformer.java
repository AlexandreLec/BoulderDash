package controller;

import model.IBoulderDashModel;

/**
 *  <h1>The class BoulderDashPerformer</h1>
 * 
 * @author charl
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
	 * Sets the ViewSystem
	 * 
	 * @param viewSystem
	 */
	public void setViewSystem(IView viewSystem) {}
	
	/**
	 * create a loop
	 */
	private void gameLoop() {}

	
	/**
	 * implement OderPerformer
	 * @param userOrder
	 */
	@Override
	public void OderPerform(IUserOrder userOrder) {
		
	}
}

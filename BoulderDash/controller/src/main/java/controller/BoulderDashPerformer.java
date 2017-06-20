package controller;

import model.IBoulderDashModel;
import view.IView;


/**
 *  <h1>The class BoulderDashPerformer</h1>

 * 
 * @author Charles LELEUX
 * @version 1.0
 * 
 */
import view.IView;

public class BoulderDashPerformer implements IOrderPerformer{

    public IBoulderDashModel ActualModel;
    public IView ActualView;

    /**
     * Create constructor
      * @param BoulderDashModel
     * @param view
     */
	public BoulderDashPerformer(IBoulderDashModel BoulderDashModel, IView view) {

        ActualModel = BoulderDashModel;
        ActualView = view;
    }
	

	/**
	 * method in order to play
	 */
	public void play() throws Exception {
       ActualModel.buildMine();
       ActualView.start(this.ActualModel);
	}

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

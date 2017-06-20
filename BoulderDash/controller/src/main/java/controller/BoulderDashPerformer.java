package controller;

import model.IBoulderDashModel;
import view.IView;

public class BoulderDashPerformer implements IOrderPerformer{

    public IBoulderDashModel ActualModel;
    public IView ActualView;
    
    private Order order;

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
	 * @param order
	 */
	@Override
	public void OrderPerform(Order order) {
		// TODO Auto-generated method stub
		
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}
}

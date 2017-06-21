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
       ActualView.start(this.ActualModel, this);

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
	 * @see IOrderPerformer
	 */
	@Override
	public void OrderPerform(Order order) {

        if (order == Order.DOWN){
            try {
                this.ActualModel.getElementByPosition(1,1).getBehaviour().moveDown();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        if (order == Order.UP){
            try {
                this.ActualModel.getElementByPosition(1,1).getBehaviour().moveUp();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (order == Order.RIGHT){
            try {
                this.ActualModel.getElementByPosition(1,1).getBehaviour().moveRight();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (order == Order.DOWN){
            try {
                this.ActualModel.getElementByPosition(1,1).getBehaviour().moveDown();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}
}

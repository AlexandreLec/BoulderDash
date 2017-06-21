package view;

import controller.IOrderPerformer;
import model.IBoulderDashModel;

public class BoulderDashView implements Runnable, IView {
	
	private IEventPerformer eventPerformer;
	private IElementBuilder elementBuilder;
	private IOrderPerformer OrderPerformer;
	private IBoulderDashModel model;
	
	public BoulderDashView(){
		
	}
    
	public void start(IBoulderDashModel model, IOrderPerformer order) {
        this.OrderPerformer = order;
		this.model = model;
		this.run();
	}

	@Override
	public void displayMessage(String message) {
		
	}


    @Override
	public void run() {
    	this.eventPerformer = new EventPerformer(OrderPerformer);
    	this.elementBuilder = new ElementBuilder(this.model);
    	new GameFrame("BoulderDash", this.eventPerformer, elementBuilder, model);
	}

}
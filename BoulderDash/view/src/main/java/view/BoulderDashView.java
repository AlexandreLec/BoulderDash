package view;

import controller.IOrderPerformer;
import model.IBoulderDashModel;

public class BoulderDashView implements Runnable, IView {
	
	private IEventPerformer eventPerformer;
	private IElementBuilder elementBuilder;
	private IOrderPerformer OrderPerformer;
	
	public BoulderDashView(){
		
	}
    
	public void start(IBoulderDashModel model, IOrderPerformer order) {
        this.OrderPerformer = order;
		this.eventPerformer = new EventPerformer(OrderPerformer);
		this.elementBuilder = new ElementBuilder(model);
		new GameFrame("BoulderDash", this.eventPerformer, elementBuilder);
	}

	@Override
	public void displayMessage(String message) {
		
	}


    @Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
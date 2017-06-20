package view;

import model.IBoulderDashModel;

public class BoulderDashView implements Runnable, IView {
	
	private IEventPerformer eventPerformer;
	private IElementBuilder elementBuilder;
	
	public BoulderDashView(){
		
	}
    
	public void start(IBoulderDashModel model) {
		this.elementBuilder = new ElementBuilder(model);
		new GameFrame("BoulderDash", eventPerformer, elementBuilder);
	}

	@Override
	public void displayMessage(String message) {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
package view;

import model.IBoulderDashModel;

public class BoulderDashView implements Runnable, IView {
	
	private IEventPerformer eventPerformer;
	private GameFrame gameFrame;
	private ElementBuilder elementBuilder;
	
	public BoulderDashView(){
		
	}
    
	public void start(IBoulderDashModel model) {
		//this.elementBuilder = new ElementBuilder(model);
		this.gameFrame = new GameFrame("BoulderDash", eventPerformer, model);
	}

	@Override
	public void displayMessage(String message) {
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
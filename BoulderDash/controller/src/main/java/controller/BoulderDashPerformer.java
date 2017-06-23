package controller;

import model.Direction;
import model.IBoulderDashModel;
import model.IElement;
import view.IView;

/**
 * <h1>The class BoulderDashPerformer</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */

public class BoulderDashPerformer implements IOrderPerformer{

    public IBoulderDashModel ActualModel;
    public IView ActualView;
    
    private IElement hero;
    private IElement enemy;
    private IElement gravity;
    private Order order;

    /**
     * Create constructor
      * @param BoulderDashModel
     *      Use for set the actual model
     * @param view
     *      Use for set the actual view
     */
	public BoulderDashPerformer(IBoulderDashModel BoulderDashModel, IView view) {

        ActualModel = BoulderDashModel;
        ActualView = view;
    }

    public BoulderDashPerformer() {}

	/**
     * Principal method use for get back initial position of some element
      * @throws Exception
     *      Game loop exception
     */
	public void play() throws Exception {
       ActualView.start(this.ActualModel, this);
       this.hero = this.ActualModel.getHero();
       this.enemy = this.ActualModel.getEnemy().get(1);
       this.gravity = this.ActualModel.getGravity().get(1);
       this.gameLoop();
	}

	/**
	 * create a loop and a thread for enemy and gravity
	 * @throws Exception
     *      thread exception
	 */
	private void gameLoop() throws Exception {
		while(this.hero != null){
			this.enemy.getBehaviour().moveAll();
			this.gravity.getBehaviour().Gravit();
			Thread.sleep(100);
		}
	}
	
	/**
	 * @throws Exception
	 * 		Thread Exception
	 * @see IOrderPerformer
	 */
	@Override
	public void OrderPerform(Order order) throws Exception {

		if (order == Order.DOWN){
			this.hero.setDirection(Direction.DOWN);
	    }
	    if (order == Order.UP){
	      	this.hero.setDirection(Direction.UP);
	    }
	    if (order == Order.RIGHT){
	        this.hero.setDirection(Direction.RIGHT);
	    }
	    if (order == Order.LEFT){
	       	this.hero.setDirection(Direction.LEFT);
	    }
	       
	    this.hero.getBehaviour().move();

    }

    /**
     * Sets the ViewSystem
     * @param viewSystem
	 * 		the actual view
     */
    public void setViewSystem(IView viewSystem) {}

    /**
     * Method use when we want end the game
     * @throws Exception
	 * 		Exception not enough diamond
     */
	public void EndGame(int diamond) throws Exception{

            if (diamond < 10)
                throw new Exception("Not enought diamond");
            else
                this.ActualModel.setGame(false);
    }
}

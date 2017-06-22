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
     * @param view
     */
	public BoulderDashPerformer(IBoulderDashModel BoulderDashModel, IView view) {

        ActualModel = BoulderDashModel;
        ActualView = view;
    }

    /**
     * Principal method use for get back initial position of some element
      * @throws Exception
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
	 */
	private void gameLoop() throws Exception {
		while(this.hero != null){
			this.enemy.getBehaviour().moveAll();
			this.gravity.getBehaviour().Gravit();
			Thread.sleep(100);
		}
		System.exit(0);
	}
	
	/**
	 * @throws Exception 
	 * @see IOrderPerformer
	 */
	@Override
	public void OrderPerform(Order order) throws Exception {
		
		if(this.hero == null){
			Thread.sleep(10000);
			System.out.println("END");
			System.exit(0);
		}
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
     */
    public void setViewSystem(IView viewSystem) {}

    /**
     * get actual order
     * @return
     */
	public Order getOrder() {
		return order;
	}

    /**
     * set the new order
     * @param order
     */
	public void setOrder(Order order) {
		this.order = order;
	}

    /**
     * Metho use when we want end the game
     * @throws Exception
     */
	public void EndGame() throws Exception{

            if (this.ActualModel.diamondCounter() < 10)
                throw new Exception("Not enought diamond");
            else
                System.exit(0);
    }
}

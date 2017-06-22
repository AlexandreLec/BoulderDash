package controller;

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
    private IBoulderDashModel mine;
    
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
       this.hero = this.ActualModel.getElementByPosition(1, 1);
       this.enemy = this.ActualModel.getElementByPosition(12, 6);
       this.gravity = this.ActualModel.getElementByPosition(2,28);
       this.gameLoop();

	}


	/**
	 * create a loop and a thread for enemy and gravity
	 * @throws Exception 
	 */
	private void gameLoop() throws Exception {
		while(true){
			this.enemy.getBehaviour().moveAll();
			this.gravity.getBehaviour().Gravit();
			Thread.sleep(400);
			
		}
	}

	
	/**
	 * @throws Exception 
	 * @see IOrderPerformer
	 */
	@Override
	public void OrderPerform(Order order) throws Exception {
		
		if ((order == Order.DOWN)){
			
			String next = Colision.getDownElement(ActualModel, hero);
			
			if(next == "door"){
                System.exit(0);
			}
			else if(next == "diamond"){
				this.ActualModel.getDiamond();
				this.hero.getBehaviour().moveDown();
			}
			else if(next == "wall" || next == "stone"){}
			else {
				this.hero.getBehaviour().moveDown();
			}
        }


        if (order == Order.UP){
    		
        	String next = Colision.getUpElement(ActualModel, hero);
			
			if(next == "stone"){
			}
			else if(next == "door"){
                EndGame();
			}
			else if(next == "diamond"){
				this.ActualModel.getDiamond();
				this.hero.getBehaviour().moveUp();
			}
			else if(next == "wall"){}
			else {
				this.hero.getBehaviour().moveUp();
			}
        }

        if (order == Order.RIGHT){
        	
        	String next = Colision.getRightElement(ActualModel, hero);
        	System.out.println(next);
			if(next == "stone"){
				IElement stone = this.ActualModel.getElementByPosition(this.hero.getPosition().getX()+1, this.hero.getPosition().getY());
				next = Colision.getRightElement(this.ActualModel, stone);
				if(next == null){
					stone.getBehaviour().moveRight();
					this.hero.getBehaviour().moveRight();
				}
			}
			else if(next == "door"){
                EndGame();
			}
			else if(next == "diamond"){
				this.ActualModel.getDiamond();
				this.hero.getBehaviour().moveRight();
			}
			else if(next == "wall"){}
			else {
				this.hero.getBehaviour().moveRight();
			}
        }

        if (order == Order.LEFT){
        	
        	String next = Colision.getLeftElement(ActualModel, hero);
			
			if(next == "stone"){
				IElement stone = this.ActualModel.getElementByPosition(this.hero.getPosition().getX()-1, this.hero.getPosition().getY());
				next = Colision.getLeftElement(this.ActualModel, stone);
				if(next == null){
					stone.getBehaviour().moveLeft();
					this.hero.getBehaviour().moveLeft();
				}
			}
			else if(next == "door"){
                EndGame();
			}
			else if(next == "diamond"){
				this.ActualModel.getDiamond();
				this.hero.getBehaviour().moveLeft();
			}
			else if(next == "wall"){}
			else {
				this.hero.getBehaviour().moveLeft();
			}
        }
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

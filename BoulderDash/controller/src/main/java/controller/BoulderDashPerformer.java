package controller;

import model.IBoulderDashModel;
import model.IElement;
import view.IView;

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
	 * method in order to play
	 */
	public void play() throws Exception {
       ActualView.start(this.ActualModel, this);
       this.hero = this.ActualModel.getHero();
       this.enemy = this.ActualModel.getEnemy().get(1);
       this.gravity = this.ActualModel.getGravity().get(1);
       this.gameLoop();
	}

	/**
	 * create a loop
	 * @throws Exception 
	 */
	private void gameLoop() throws Exception {
		while(true){
			this.enemy.getBehaviour().moveAll();
			this.gravity.getBehaviour().Gravit();
			Thread.sleep(200);
			
		}
	}


	/**
	 * Sets the ViewSystem
	 * 
	 * @param viewSystem
	 */
	public void setViewSystem(IView viewSystem) {}
	
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


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}

	public void EndGame() throws Exception{

        if (this.ActualModel.diamondCounter() >= 10)
        System.exit(0);
    }
}

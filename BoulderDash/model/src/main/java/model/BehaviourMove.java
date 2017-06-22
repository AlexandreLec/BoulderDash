package model;

/**
 * <h1>The Class Behaviour Move</h1>
 * @author Alexandre LECOMTE
 * @version 1.1
 */
public class BehaviourMove implements IBehaviourMove {

	/** The element */
	protected Element element;
	
	/** Instantiate a new move's behaviour*/
	public BehaviourMove(Element element){
		this.element = element;
	}
	
	@Override
	public void move() throws Exception {
		// TODO Auto-generated method stub
		
	}

	/**
	 * method use for move element right
	 * @param position
	 * @return position
	 * @throws Exception 
	 */
	@Override
	public void moveRight() throws Exception{
		
		int x = this.element.getPosition().getX();
		int y = this.element.getPosition().getY();
		
		this.element.getPosition().setX(x+1);
		
		this.element.getMine().getElements()[x+1][y] = this.element;
		this.element.getMine().getElements()[x][y] = null;
		
		this.element.getMine().getModel().effectiveChanged();
	}

	/**
	 * method use for move element Left
	 * @param position
	 * @return position
	 * @throws Exception 
	 */
	@Override
	public void moveLeft() throws Exception{
		
		int x = this.element.getPosition().getX();
		int y = this.element.getPosition().getY();
		
		this.element.getPosition().setX(x-1);
		this.element.getMine().getElements()[x-1][y] = this.element;
		this.element.getMine().getElements()[x][y] = null;
		
		
		this.element.getMine().getModel().effectiveChanged();
	}

	/**
	 * method use for move element Up
	 * @param position
	 * @return position
	 * @throws Exception 
	 */
	@Override
	public void moveUp() throws Exception{
		
		int x = this.element.getPosition().getX();
		int y = this.element.getPosition().getY();
		
		this.element.getPosition().setY(y-1);
		this.element.getMine().getElements()[x][y-1] = this.element;
		this.element.getMine().getElements()[x][y] = null;
		
		
		this.element.getMine().getModel().effectiveChanged();
	}

	/**
	 * method use for move element Down
	 * @param position
	 * @return position
	 * @throws Exception 
	 */
	@Override
	public void moveDown() throws Exception{
		
		int x = this.element.getPosition().getX();
		int y = this.element.getPosition().getY();
		
		this.element.getPosition().setY(y+1);
		this.element.getMine().getElements()[x][y+1] = this.element;
		this.element.getMine().getElements()[x][y] = null;
		
		
		this.element.getMine().getModel().effectiveChanged();
	}

	@Override
	public void moveAll() throws Exception {
		
	}
	@Override
	public void Gravit() throws Exception{
		
	}

}

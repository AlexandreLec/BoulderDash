package model;

import java.util.Iterator;

/**
 * <h1>The Class Automatic Move Behaviour</h1>
 * @author Alexandre LECOMTE
 * @version 1.1
 */
public class Automatic extends BehaviourMove {

	public Automatic(Element element){
		super(element);
	}
	
	@Override
	public void moveAll() throws Exception{
		Iterator<IElement> iterator = this.element.getMine().getEnemy().iterator();
		while (iterator.hasNext()) {
			iterator.next().getBehaviour().move();
		}
	}
	
	@Override
	public void move() throws Exception {
		
		IElement down = element.getMine().getElements()[element.getPosition().getX()][element.getPosition().getY()+1];
		IElement up = element.getMine().getElements()[element.getPosition().getX()][element.getPosition().getY()-1];
		IElement right = element.getMine().getElements()[element.getPosition().getX()+1][element.getPosition().getY()];
		IElement left = element.getMine().getElements()[element.getPosition().getX()-1][element.getPosition().getY()];
		
		Direction dir = this.element.getDirection();
		
		switch(dir){
			case LEFT :
				if(left == null){
					this.element.getBehaviour().moveLeft();
				}
				else if(left.equals(Hero.getInstance())){
					this.element.getBehaviour().moveLeft();
					Hero.getInstance().explosion();
				}
				else{
					this.element.setDirection(Direction.DOWN);
				}
				break;
			case RIGHT :
				if(right == null){
					this.element.getBehaviour().moveRight();
				}
				else if(right.equals(Hero.getInstance())){
					this.element.getBehaviour().moveRight();
					Hero.getInstance().explosion();
				}
				else{
					this.element.setDirection(Direction.UP);
				}
				break;
			case UP :
				if(up == null){
					this.element.getBehaviour().moveUp();
				}
				else if(up.equals(Hero.getInstance())){
					this.element.getBehaviour().moveUp();
					Hero.getInstance().explosion();
				}
				else{
					this.element.setDirection(Direction.LEFT);
				}
				break;
			case DOWN :
				if(down == null){
					this.element.getBehaviour().moveDown();
				}
				else if(down.equals(Hero.getInstance())){
					this.element.getBehaviour().moveDown();
					Hero.getInstance().explosion();
				}
				else{
					this.element.setDirection(Direction.RIGHT);
				}
				break;
		}
		
	}

}

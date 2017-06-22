package model;

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
	public void move() throws Exception {
		
		IElement down = element.getMine().getElements()[element.getPosition().getX()][element.getPosition().getY()+1];
		IElement up = element.getMine().getElements()[element.getPosition().getX()][element.getPosition().getY()-1];
		IElement right = element.getMine().getElements()[element.getPosition().getX()+1][element.getPosition().getY()];
		IElement left = element.getMine().getElements()[element.getPosition().getX()-1][element.getPosition().getY()];
		
		if(up == null && right == null){
			
			int alea = (int) (Math.random()*2);
	
			switch(alea){
				case 0:
					this.element.getBehaviour().moveRight();
					break;
				case 1:
					this.element.getBehaviour().moveUp();
					break;
			}
		}
		else if(up == null){
			this.element.getBehaviour().moveUp();
		}
		else if(left == null && down == null){
			int alea = (int) (Math.random()*2);
			
			switch(alea){
				case 0:
					this.element.getBehaviour().moveLeft();
					break;
				case 1:
					this.element.getBehaviour().moveDown();
					break;
			}
		}
		else if(right == null && down == null){
			int alea = (int) (Math.random()*2);
			
			switch(alea){
				case 0:
					this.element.getBehaviour().moveRight();
					break;
				case 1:
					this.element.getBehaviour().moveDown();
					break;
			}
		}
		else if(left == null){
			this.element.getBehaviour().moveLeft();
		}
		else{}
		

		/*int alea = (int) (Math.random()*4);
		
		switch(alea){
			case 0:
				this.element.getBehaviour().moveDown();
			case 1:
				this.element.getBehaviour().moveUp();
			case 2:
				this.element.getBehaviour().moveRight();
			case 3:
				this.element.getBehaviour().moveLeft();
			default:
				this.element.getBehaviour().moveUp();
		}*/
	}

}

package model;

public class BehaviourMove implements IBehaviourMove {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * method use for move element right
	 * @param position
	 * @return position
	 * @throws Exception 
	 */
	@Override
	public Position moveRight(Position position) throws Exception{
		
		position.setX(position.getX()+1);
		return position;
		
	}

	/**
	 * method use for move element Left
	 * @param position
	 * @return position
	 * @throws Exception 
	 */
	@Override
	public Position moveLeft(Position position) throws Exception{
		
		position.setX(position.getX()-1);
		return position;
		
	}

	/**
	 * method use for move element Up
	 * @param position
	 * @return position
	 * @throws Exception 
	 */
	@Override
	public Position moveUp(Position position) throws Exception{
		
		position.setY(position.getY()-1);
		return position;
		
	}

	/**
	 * method use for move element Down
	 * @param position
	 * @return position
	 * @throws Exception 
	 */
	@Override
	public Position moveDown(Position position) throws Exception{
		position.setY(position.getY()+1);
		return position;
		
	}

}

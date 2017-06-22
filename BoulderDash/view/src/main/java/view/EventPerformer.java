package view;

import java.awt.event.KeyEvent;
import controller.IOrderPerformer;
import controller.Order;

/**
 * <h1>The class EventPerformer</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.1
 */

public class EventPerformer implements IEventPerformer {
	
	IOrderPerformer orderPerformer;


	/**
	 * Instantiate EventPerformer
	 * @param orderPerformer
	 */
	public EventPerformer(IOrderPerformer orderPerformer){
		this.orderPerformer = orderPerformer;
	}


	/**
	 * do a action in function of what command type by the player
	 * @param keycode
	 * @throws Exception
	 */
	public void keyCodeToUserOrder(int keycode) throws Exception{
		switch(keycode){
			case KeyEvent.VK_DOWN :
				this.orderPerformer.OrderPerform(Order.DOWN);
				//System.out.println("DOWN");
				break;
			case KeyEvent.VK_UP :
				this.orderPerformer.OrderPerform(Order.UP);
				//System.out.println("UP");
				break;
			case KeyEvent.VK_RIGHT :
				this.orderPerformer.OrderPerform(Order.RIGHT);
				//System.out.println("RIGHT");
				break;
			case KeyEvent.VK_LEFT :
				this.orderPerformer.OrderPerform(Order.LEFT);
				//System.out.println("LEFT");
				break;
		}
	}


	/**
	 * @see IEventPerformer
	 * @param keyCode
	 * @throws Exception
	 */
	@Override
	public void eventPerform(KeyEvent keyCode) throws Exception {
		
		this.keyCodeToUserOrder(keyCode.getKeyCode());
	}

}

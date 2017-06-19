package controller;

/**
 *  <h1>The class UserOrder</h1>
 * 
 * @author Charles LELEUX
 * @version 1.0
 * 
 */

public class UserOrder implements IUserOrder{
	
	/**
	 * constructor UserOrder
	 * @param order
	 */
	public UserOrder(Order order) {}
	
	/**
	 * Call the enum Order for the direction
	 * 			the direction for the player
	 */
	@Override
	public Order getOrder() {
		return Order.LEFT;
	}

	/**
	 * return the direction of the player
	 */
	@Override
	public void setOrder(Order order) {
		
		
	}
}

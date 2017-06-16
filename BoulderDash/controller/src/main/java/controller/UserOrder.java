package controller;

/**
 * 
 * @author charl
 *
 */

public class UserOrder implements IUserOrder{
	
	/**
	 * constructor UserOrder
	 * @param order
	 */
	public UserOrder(Order order) {}
	
	
	/**
	 * 
	 */
	public Order getOrder() {
		return Order.LEFT;
	}
}

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
	 * @see IUserOrder
	 */
	@Override
	public Order getOrder() {
		return Order.LEFT;
	}

	/**
	 * @see IUserOrder
	 */
	@Override
	public void setOrder(Order order) {
		
		
	}
}

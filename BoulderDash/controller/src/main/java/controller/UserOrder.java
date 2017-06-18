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
	@Override
	public Order getOrder() {
		return Order.LEFT;
	}


	@Override
	public void setOrder(Order order) {
		
		
	}
}

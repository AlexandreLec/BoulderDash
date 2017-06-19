package controller;

/**
 *  <h1>The interface IUserOrder</h1>
 * 
 * @author charl
 * @version 1.0
 * 
 */

public interface IUserOrder {

	/**
	 * get the direction
	 */
	public Order getOrder();
	
	
	/**
	 * Set the direction
	 * @param order
	 */
	public void setOrder(Order order);
	
}

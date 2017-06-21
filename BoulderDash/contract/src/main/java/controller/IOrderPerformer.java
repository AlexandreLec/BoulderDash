package controller;

/**
 *  <h1>The Interface IOrderPerformer</h1>
 * 
 * @author Charles LELEUX
 * @version 1.0
 * 
 */

public interface IOrderPerformer {


	/**
	 * method use for understand what order is doing by the player
     * @param order
	 * @throws Exception 
     */
	public void OrderPerform(Order order) throws Exception;
}

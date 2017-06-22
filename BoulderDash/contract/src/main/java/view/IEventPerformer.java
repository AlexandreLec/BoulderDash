package view;


/**
 * <h1>The interface IEventProformer</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */

import java.awt.event.KeyEvent;

public interface IEventPerformer {

	/**
	 * method use for transform and send the command set by the player
	 * @param keyCode
	 * @throws Exception
	 */

	void eventPerform(KeyEvent keyCode) throws Exception;
	
}


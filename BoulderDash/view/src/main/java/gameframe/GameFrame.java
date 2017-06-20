package gameframe;
import javax.swing.*;
import java.awt.event.*;
import java.util.Observable;

/**
 * <h1>The Class GameFrame provides the method to use the different keyboard interactions</h1>
 *
 * @author Jean-Francois LHOMME
 * @version 1.0
 */
public class GameFrame extends JFrame implements KeyListener {

	/**
	 * 	Generated Serialized ID
	 */
	private static final long serialVersionUID = 3792052992605473420L;
	private IEventPerformer eventPerformer;


	/**
	 * Create the constructor of GamFrame
	 * @param title
	 * @param performer
	 * @param observable
	 */
	public GameFrame(String title, IEventPerformer performer, Observable observable){

	}

	/**
	 * Use for research the key who is typed
	 * @param e
	 */
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Use for research the key who is pressed
	 * @param e
	 */
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Use for research the key who is released
	 * @param e
	 */
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

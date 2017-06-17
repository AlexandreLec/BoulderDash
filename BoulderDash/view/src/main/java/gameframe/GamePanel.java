package gameframe;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

/**
 * <h1>The Class GamePanel</h1>
 *
 * @author Jean-Francois LHOMME
 * @version 1.0
 */
public class GamePanel extends JPanel implements Observer {
	
	/**
	 * Generated Serialized ID
	 */
	private static final long serialVersionUID = 2451228009089487119L;

	private IElementBuilder graphicsBuilder;
	
	public GamePanel(){
		
	}

	@Override
	public void update(Observable o, Object arg) {
		
	}
}

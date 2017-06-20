package view;

import java.awt.Graphics;
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

	private IElementBuilder elementBuilder;
	
	public GamePanel(IElementBuilder builder){
		this.elementBuilder = builder;
	}

	/**
	 * the methode create from Observable
	 * @param o
	 * @param arg
	 */
	@Override
	public void update(Observable o, Object arg) {
		repaint();
	}
	
	public void paintComponent(Graphics g){
		this.elementBuilder.applyModelToGraphic(g, this);;
	}
	
}

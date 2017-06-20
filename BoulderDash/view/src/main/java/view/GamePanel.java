package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import model.IBoulderDashModel;
import model.IElement;

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

	private ElementBuilder elementBuilder;
	
	private IBoulderDashModel model;
	
	public GamePanel(IBoulderDashModel model){
		this.model = model;
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
		this.drawMine(g);
	}
	
	public void drawMine( Graphics graphics){
		
		Iterator<IElement> it = model.getElements().iterator();
		 
		while (it.hasNext()) {
		       drawElement(it.next(),graphics);
		       System.out.println("list");
		}
	}
	
	private void drawElement(IElement element, Graphics graphics){
		Graphics2D g2d = (Graphics2D) graphics ;
		g2d.drawImage(element.getSprite(),element.getPosition().getX(),element.getPosition().getY(),this);
		 System.out.println("drawelement");
	}
}

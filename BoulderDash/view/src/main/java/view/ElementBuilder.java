package view;

import java.awt.*;

import java.awt.image.ImageObserver;

import model.IBoulderDashModel;
import model.IElement;

/**
 * <h1>The class ElementBuilder</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */

public class ElementBuilder implements IElementBuilder {
	
	 private IBoulderDashModel model;

    /**
     * instantiate BoulderDashModel
     * @param BoulderDashModel
     */
	public ElementBuilder(IBoulderDashModel BoulderDashModel){

		this.model = BoulderDashModel;
	}


    /**
     * method use for draw the visual of our mine. Set in a double enter tab all element.
     * If an element "null" exist, replace it by a black rectangle who sizes is 32*32.
     * @param graphics
     * @param obs
     * @throws Exception
     */
	private void drawMine(Graphics graphics, ImageObserver obs){

		System.out.println("Refresh");
		
		IElement[][] actual = model.getElements();
		 
		for (int x = 0; x < 50; x++) {
			for (int y = 0; y < 30; y++) {
					
				drawElement(actual[x][y],graphics, obs);
					
			}
		}
	}

    /**
     * place in a graphics who name's g2d, all element
     * After add some features in our program. In particulary the number of diamond get by the hero
     * @param element
     * @param graphics
     * @param obs
     * @throws Exception
     */
	private void drawElement(IElement element, Graphics graphics, ImageObserver obs) {
		
		Graphics2D g2d = (Graphics2D) graphics ;
		g2d.drawImage(element.getSprite(),element.getPosition().getX()*32,element.getPosition().getY()*32,32,32,obs);


		Font fonte = new Font("TimeRoman", Font.BOLD, 32);
		g2d.setFont(fonte);
		g2d.setColor(Color.BLACK);

		try {
			g2d.drawString("Diamond : "+String.valueOf(this.model.diamondCounter()), 32, 956);
		} catch (Exception e) {
			g2d.drawString("Diamond :", 32, 956);
		}

	} 
		
    /**
     * @see IElementBuilder
     * @param graphics
     * @param obs
     * @throws Exception
     */
	@Override
	public void applyModelToGraphic(Graphics graphics, ImageObserver obs) {
		drawMine(graphics, obs);
	}

	public void gameOver(){
		
	}

    /**
     * @return model
     */
	public IBoulderDashModel getModel() {
		return model;
	}
}
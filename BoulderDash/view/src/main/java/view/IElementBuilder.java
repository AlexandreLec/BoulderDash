package view;

import model.IBoulderDashModel;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

/**
 * 
 * @author Charles LELEUX
 * @version 1.0
 */
interface IElementBuilder {

	/**
	 * Translate The Model into Graphic 
	 * @param graphics
	 * 		Name of the graphic
	 * @param obs
	 * 		Name of observer
	 * @throws Exception
	 * 		The exception
	 */
	void applyModelToGraphic(Graphics graphics, ImageObserver obs) throws Exception;

	/**
	 * Get the model
	 * @return the model
	 */
	IBoulderDashModel getModel();
	
}

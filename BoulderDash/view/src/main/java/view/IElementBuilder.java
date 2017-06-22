package view;

import model.IBoulderDashModel;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

		/**
		 * 
		 * @author Charles LELEUX
		 * @version 1.0
		 */
public interface IElementBuilder {

<<<<<<< HEAD
		/**
		 * Translate The Model into Graphic 
		 * @param graphics
		 * @param obs
		 */
	void applyModelToGraphic(Graphics graphics, ImageObserver obs);
=======
	void applyModelToGraphic(Graphics graphics, ImageObserver obs) throws Exception;
>>>>>>> branch 'master' of https://github.com/AlexandreLec/BoulderDash
	IBoulderDashModel getModel();
	
}

package view;

import model.IBoulderDashModel;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IElementBuilder {

	void applyModelToGraphic(Graphics graphics, ImageObserver obs) throws Exception;
	IBoulderDashModel getModel();
	
}

package view;

import model.IBoulderDashModel;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IElementBuilder {

	public void applyModelToGraphic(Graphics graphics, ImageObserver obs);
	public IBoulderDashModel getModel();
	
}

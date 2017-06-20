package view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IElementBuilder {

	public void applyModelToGraphic(Graphics graphics, ImageObserver obs);
	
}

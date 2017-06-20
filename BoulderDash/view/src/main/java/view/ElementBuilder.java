package view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Iterator;
import java.util.Observer;

import model.IBoulderDashModel;
import model.IElement;

public class ElementBuilder implements IElementBuilder {
	
	 private IBoulderDashModel model;

	public ElementBuilder(IBoulderDashModel BoulderDashModel){

		this.model = BoulderDashModel;
	}
	
	public void drawMine( Graphics graphics){
		
		Iterator<IElement> it = model.getElements().iterator();
		 
		while (it.hasNext()) {
		       drawElement(it.next(),graphics);
		}
	}
	
	private void drawElement(IElement element, Graphics graphics){
		graphics.drawImage(element.getSprite(),element.getPosition().getX(),element.getPosition().getY(),null);
	}

	@Override
	public void applyModelToGraphic(Graphics graphics, Observer ImageObserver) {
		drawMine(graphics);
	}
	
	public IBoulderDashModel getModel() {
		return model;
	}

	public void setModel(IBoulderDashModel model) {
		this.model = model;
	}
}
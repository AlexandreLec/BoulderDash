package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;
import java.util.Iterator;
import model.IBoulderDashModel;
import model.IElement;

public class ElementBuilder implements IElementBuilder {
	
	 private IBoulderDashModel model;

	public ElementBuilder(IBoulderDashModel BoulderDashModel){

		this.model = BoulderDashModel;
	}
	
	private void drawMine(Graphics graphics, ImageObserver obs){
		
		Iterator<IElement> it = model.getElements().iterator();
		 
		while (it.hasNext()) {
		       drawElement(it.next(),graphics, obs);
		}
	}
	
	private void drawElement(IElement element, Graphics graphics, ImageObserver obs){
		Graphics2D g2d = (Graphics2D) graphics ;
		g2d.drawImage(element.getSprite(),element.getPosition().getX()*16,element.getPosition().getY()*16,obs);
	}

	@Override
	public void applyModelToGraphic(Graphics graphics, ImageObserver obs) {
		drawMine(graphics, obs);
	}
}
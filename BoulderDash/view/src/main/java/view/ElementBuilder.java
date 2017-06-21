package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;
import model.IBoulderDashModel;
import model.IElement;

public class ElementBuilder implements IElementBuilder {
	
	 private IBoulderDashModel model;

	public ElementBuilder(IBoulderDashModel BoulderDashModel){

		this.model = BoulderDashModel;
	}
	
	private void drawMine(Graphics graphics, ImageObserver obs){
		
		int cpt = 0;
		IElement[][] elements = model.getElements();
		 
		for (int x = 0; x < 50; x++) {
			for (int y = 0; y < 30; y++) {
					
					if(elements[x][y] == null){}
					else{
						drawElement(elements[x][y],graphics, obs);
					}
					
					cpt++;
					System.out.println(cpt);
			       
			}
		}
	}
	
	private void drawElement(IElement element, Graphics graphics, ImageObserver obs){
		Graphics2D g2d = (Graphics2D) graphics ;
		g2d.drawImage(element.getSprite(),element.getPosition().getX()*32,element.getPosition().getY()*32,32,32,obs);
	}

	@Override
	public void applyModelToGraphic(Graphics graphics, ImageObserver obs) {
		drawMine(graphics, obs);
	}
}
package view;

import java.awt.*;

import java.awt.image.ImageObserver;

import model.IBoulderDashModel;
import model.IElement;

public class ElementBuilder implements IElementBuilder {
	
	 private IBoulderDashModel model;

	public ElementBuilder(IBoulderDashModel BoulderDashModel){

		this.model = BoulderDashModel;
	}

	private void drawMine(Graphics graphics, ImageObserver obs){
		
		System.out.println("Refresh");
		
		IElement[][] elements = model.getElements();
		 
		for (int x = 0; x < 50; x++) {
			for (int y = 0; y < 30; y++) {
					
					if(elements[x][y] == null){
						graphics.fillRect(x*32, y*32, 32, 32);;
					}
					else{
						drawElement(elements[x][y],graphics, obs);
					}
					
			       
			}
		}
	}
	
	private void drawElement(IElement element, Graphics graphics, ImageObserver obs){
		
		Graphics2D g2d = (Graphics2D) graphics ;
		g2d.drawImage(element.getSprite(),element.getPosition().getX()*32,element.getPosition().getY()*32,32,32,obs);


		Font fonte = new Font("TimeRoman", Font.BOLD, 32);
		g2d.setFont(fonte);
		g2d.setColor(Color.BLACK);
		g2d.drawString("Diamond"+String.valueOf(this.model.diamondCounter()), 32, 956);
		
	}

	@Override
	public void applyModelToGraphic(Graphics graphics, ImageObserver obs) {
		drawMine(graphics, obs);
		
	}

	public IBoulderDashModel getModel() {
		return model;
	}
}
package view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Observer;

import gameframe.IElementBuilder;
import model.IBoulderDashModel;
import model.IElement;

public class ElementBuilder implements IElementBuilder {
	
	 private IBoulderDashModel model;
	
	public ElementBuilder(IBoulderDashModel BoulderDashModel){

		this.model = BoulderDashModel;
	}
	
	private void buildMine(){
	}
	
	private void drawElement(IElement element, ImageObserver imageObserver, Graphics graphics){
		
	}

	@Override
	public void applyModelToGraphic(Graphics Graphics, Observer ImageObserver) {
		
	}
}
package controller;

import model.IBoulderDashModel;
import model.IElement;

public abstract class Colision {
	
	public static String getUpElement(IBoulderDashModel model, IElement element){
		String nextBlock;
		try{
			nextBlock = model.getElementByPosition(element.getPosition().getX(),element.getPosition().getY()-1).getSpriteName();
			return nextBlock;
		}catch(Exception e){
			return null;
		}
	}
	
	public static String getDownElement(IBoulderDashModel model, IElement element){
		String nextBlock;
		try{
			nextBlock = model.getElementByPosition(element.getPosition().getX(),element.getPosition().getY()+1).getSpriteName();
			return nextBlock;
		}catch(Exception e){
			return null;
		}
	}
	
	public static String getRightElement(IBoulderDashModel model, IElement element){
		String nextBlock;
		try{
			nextBlock = model.getElementByPosition(element.getPosition().getX()+1,element.getPosition().getY()).getSpriteName();
			return nextBlock;
		}catch(Exception e){
			return null;
		}
	}
	
	public static String getLeftElement(IBoulderDashModel model, IElement element){
		String nextBlock;
		try{
			nextBlock = model.getElementByPosition(element.getPosition().getX()-1,element.getPosition().getY()).getSpriteName();
			return nextBlock;
		}catch(Exception e){
			return null;
		}
	}

}

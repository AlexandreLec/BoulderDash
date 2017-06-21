package controller;

import model.IBoulderDashModel;
import model.IElement;

public abstract class Colision {
	
	public static String getUpElement(IBoulderDashModel model, IElement hero){
		String nextBlock;
		try{
			nextBlock = model.getElementByPosition(hero.getPosition().getX(),hero.getPosition().getY()-1).getSpriteName();
			return nextBlock;
		}catch(Exception e){
			return null;
		}
	}
	
	public static String getDownElement(IBoulderDashModel model, IElement hero){
		String nextBlock;
		try{
			nextBlock = model.getElementByPosition(hero.getPosition().getX(),hero.getPosition().getY()+1).getSpriteName();
			return nextBlock;
		}catch(Exception e){
			return null;
		}
	}
	
	public static String getRightElement(IBoulderDashModel model, IElement hero){
		String nextBlock;
		try{
			nextBlock = model.getElementByPosition(hero.getPosition().getX()+1,hero.getPosition().getY()).getSpriteName();
			return nextBlock;
		}catch(Exception e){
			return null;
		}
	}
	
	public static String getLeftElement(IBoulderDashModel model, IElement hero){
		String nextBlock;
		try{
			nextBlock = model.getElementByPosition(hero.getPosition().getX()-1,hero.getPosition().getY()).getSpriteName();
			return nextBlock;
		}catch(Exception e){
			return null;
		}
	}

}

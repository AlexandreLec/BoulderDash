package controller;

import model.IBoulderDashModel;
import model.IElement;

/**
 * <h1>The class Colision</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */


public abstract class Colision {


    /**
     * The four following method are same based. They will recover and return the next block in a chosen direction. This will use for compare.
     * @param model
     * @param element
     * @return nextBlock
     */
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

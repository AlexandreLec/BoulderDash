package model;

import java.util.ArrayList;
import java.util.Observable;

public class BoulderDashModel extends Observable {

	private ArrayList<Element> elements;
	private Mine mine;
	
	public BoulderDashModel(){
		
	}

	public ArrayList<Element> getElements() {
		return elements;
	}
	
	public void addElement(IElement element){
		
	}
	
	public void removeElement(IElement element){
		
	}
	
	public void buildMine(){
		
	}

	public Mine getMine() {
		return mine;
	}

	public void setMine(Mine mine) {
		this.mine = mine;
	}
}

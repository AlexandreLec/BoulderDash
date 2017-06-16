package model;

import java.awt.Image;

/**
 * Created by tapafe on 16/06/2017.
 */
public class Element {
	
	private Position position;
	private Image Sprite;

    public Element(Position position){

    }

    public Position getPosition(){
        return new Position(1,1);
    }

    public void setPosition(Position position){

    }

    public BoulderDashModel getBoulderDashModel(){
        return new BoulderDashModel();
    }

    public void setBoulderDashModel(BoulderDashModel boulderdashmodel){

    }

    public void placeInMine(){

    }

    public Image getSprite(){
        return Sprite;
    }

    public void setSprite(String sprite){

    }

    public getBeheviour(){
        return BehaviourMove;
    }

    public void setBehaviour(BehaviourMove behaviour){

    }
}

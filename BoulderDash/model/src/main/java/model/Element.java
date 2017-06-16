package model;

/**
 * Created by tapafe on 16/06/2017.
 */
public class Element {


    /** constructor of ExitGate */
    public Element(Position position){

    }

    /** method use for get position of one element */
    public getPosition(){
        return Position;
    }


    /** method use for set position of one element */
    public void setPosition(Position position){

    }


    /** method use for */
    public getBoulderDashModel(){
        return BoulderDashModel;
    }

    public void setBoulderDashModel(BoulderDashModel boulderdashmodel){

    }

    public placeIMine(){

    }
    /** method use for recover the sprite of one element*/
    public getSprite(){
        return Image;
    }


    /** method use for apply the sprite to a element */
    public void setSprite(String sprite){

    }


    /** method use for recover the type of movement of one element*/
    public getBeheviour(){
        return BehaviourMove;
    }

    /** method use for apply the correct movement of a element */
    public void setBehaviour(BehaviourMove behaviour){

    }
}

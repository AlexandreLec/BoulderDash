package model;


/**
 * <h1> Diamond Class</h1>
 * @author RIGAUT Arnaud
 * @version 1.0
 */

public class Dirt extends Element implements IGet{

    /** Varible who will use for seek sprite **/
    private final static String STRING = "dirt";

    /** constructor of dirt */
    public Dirt(Position positon, Mine mine){
        super(positon, STRING, mine);
        behaviour = new Fixe(this);
    }

	@Override
	public void get(Hero hero) {
		// TODO Auto-generated method stub
		
	}
		
}

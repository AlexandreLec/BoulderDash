package model;

/**
 * <h1> Diamond Class</h1>
 * @author RIGAUT Arnaud
 * @version 1.0
 */

public class Dirt extends Element{

    /** Varible who will use for seek sprite **/
    private final static String STRING = "Dirt";

    /** constructor of ExitGate */
    public Dirt(Position positon, String sprite){
        super(positon, STRING);
    }
}

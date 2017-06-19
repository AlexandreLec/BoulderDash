package model;

/**
 * <h1>The Class Element</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public class Stone extends Element{

    /** Varible who will use for seek sprite **/
    private final static String STRING = "Stone";


    /** instantiates of ExitGate */
    public Stone(Position positon, String sprite){
        super(positon, STRING);
    }
}

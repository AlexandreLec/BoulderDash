package model;

/**
 * <h1>The Class Element</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public class Stone extends Element{

    /** Variable who will use for seek sprite **/
    private final static String STRING = "Stone";

    /** constructor of Stone */
    public Stone(Position positon){
        super(positon, STRING);
        behaviour = new Gravity();
    }
}

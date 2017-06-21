package model;

/**
 * <h1>The Class Element</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.1
 */
public class Stone extends Element{

    /** Variable who will use for seek sprite **/
    private final static String STRING = "stone";

    /** constructor of Stone */
    public Stone(Position positon, Mine mine){
        super(positon, STRING, mine);
        behaviour = new Gravity(this);
    }
}

package model;

 /**
 * <h1>The Class Element</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */

public class Wall extends Element{

    /** Variable who will use for seek sprite **/
    private final static String STRING = "wall";

    /** constructor of ExitGatee */
    public Wall(Position positon, Mine mine){
        super(positon, STRING, mine);
        behaviour = new Fixe(this);
    }
}

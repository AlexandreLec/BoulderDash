package model;

 /**
 * <h1>The Class Element</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */

 class Wall extends Element{

    /** Variable who will use for seek sprite **/
    private final static String STRING = "wall";

    /** constructor of ExitGate */
    public Wall(Position position, Mine mine){
        super(position, STRING, mine);
        behaviour = new Fixe(this);
    }
}

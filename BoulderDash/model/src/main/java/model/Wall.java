package model;

 /**
 * <h1>The Class Element</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */

public class Wall extends Element{

    /** Variable who will use for seek sprite **/
    private final static String STRING = "Wall";


    /** constructor of ExitGatee */
    public Wall(Position positon, String sprite){
        super(positon, STRING);
    }
}

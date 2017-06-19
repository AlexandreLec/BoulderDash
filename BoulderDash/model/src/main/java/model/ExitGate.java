package model;

/**
 * <h1>The ExitClass Element</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */

public class ExitGate extends Element{

    /** Varible who will use for seek sprite **/
    private final String STRING = "ExitGate";

    /** crete DP singleton */
    private ExitGate EXITGATE;

    /** constructor of ExitGate */
    public ExitGate(Position positon){
        super(positon);
    }
}

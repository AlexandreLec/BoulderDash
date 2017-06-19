package model;

/**
 * <h1>The Class ExitGate</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public class ExitGate extends Element{

    /** Variable who will use for seek sprite **/
    private final static String STRING = "ExitGate";

    /** create DP singleton */
    private static ExitGate EXITGATE;

    /** constructor of ExitGate */
    private ExitGate(Position positon){
        super(positon, STRING);
    }
    
    static public ExitGate getInstance(Position position){
		return EXITGATE;
    }
}

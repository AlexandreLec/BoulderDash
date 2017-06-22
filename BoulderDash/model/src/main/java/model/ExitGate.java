package model;

/**
 * <h1>The Class ExitGate</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public class ExitGate extends Element{

    /** Variable who will use for seek sprite **/
    private final static String STRING = "door";

    /** create DP singleton */
    private static ExitGate EXITGATE;

    /** constructor of ExitGate */
    private ExitGate(Position positon, Mine mine){
        super(positon, STRING, mine);
        behaviour = new Fixe(this);
    }


    /**
     *
     * @param position
     * @param mine
     * @return
     */
    public static ExitGate getInstance(Position position, Mine mine){
		if(EXITGATE == null){
			EXITGATE = new ExitGate(position, mine);
		}
		return EXITGATE;
    }
}

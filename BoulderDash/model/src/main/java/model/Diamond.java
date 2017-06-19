package model;

/**
 * <h1> Diamond Class</h1>
 * @author RIGAUT Arnaud
 * @version 1.0
 */
public class Diamond extends Element implements IGet, IKill {

    /** Variable who will use for seek sprite **/
    private final String STRING = "Diamond";

    /**
     * Constructor of Diamond
      * @param positon
     */
    public Diamond(Position positon){
        super(positon);
    }


    /**
     * method come from Iget
     * @param hero
     */
    @Override
    public void get(Hero hero) {

    }

    /**
     * method come from IKill
     * @param element
     */
    @Override
    public void kill(Element element) {

    }
}

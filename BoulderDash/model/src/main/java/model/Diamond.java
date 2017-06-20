package model;

/**
 * <h1> Diamond Class</h1>
 * @author RIGAUT Arnaud
 * @version 1.1
 */
public class Diamond extends Element implements IGet, IKill {

    /** Variable who will use for seek sprite **/
    private final static String STRING = "diamond";

    /**
     * Constructor of Diamond
      * @param positon
     */
    public Diamond(Position positon){
        super(positon, STRING);
        behaviour = new Gravity();
    }


    /**
     * @see IGet
     * @param hero
     */
    @Override
    public void get(Hero hero) {
    	hero.setDiamonds(hero.getDiamonds()+1);
    }

    /**
     * @see IKill
     * @param element
     */
    @Override
    public void kill(Element element) {
    	element = null;
    }
}

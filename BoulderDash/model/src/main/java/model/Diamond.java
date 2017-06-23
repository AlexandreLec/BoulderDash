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
     *      Find diamond position
     *  @param mine
     *      Get the actual mine
     */
    public Diamond(Position positon, Mine mine){
        super(positon, STRING, mine);
        behaviour = new Gravity(this);
    }

    /**
     * @see IGet
     * @param hero
     *      Get the hero element
     * @throws Exception
     *      Destroy element execption
     */
    @Override
    public void get(Hero hero) throws Exception {
    	hero.setDiamonds(hero.getDiamonds()+1);
    	this.getMine().destroyElement(this);
    }

    /**
     * @see IKill
     * @param element
     *      Get element able to be kill
     */
    @Override
    public void kill(Element element) {
    	element = null;
    }
}

package model;

/**
 * Created by tapafe on 16/06/2017.
 */
public class Diamond extends Element implements IGet, IKill {
    /** Varible who will use for seek sprite **/
    private final String STRING = "Diamond";

    /** constructor of ExitGate */
    public Diamond(Position positon){
        super(positon);
    }

    @Override
    public void get(Hero hero) {

    }

    @Override
    public void kill() {

    }
}

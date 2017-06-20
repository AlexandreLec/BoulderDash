package main;

import controller.BoulderDashPerformer;
import model.BoulderDashModel;
import model.Element;
import model.IElement;
import model.Position;
import view.BoulderDashView;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Alexandre LECOMTE
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws Exception 
     */
    public static void main(final String[] args) throws Exception {
        final BoulderDashPerformer controller = new BoulderDashPerformer(new BoulderDashModel(), new BoulderDashView());

        try {
            controller.play();
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
<<<<<<< HEAD
        
        BoulderDashModel model = new BoulderDashModel();
        model.buildMine();
        IElement test = model.getElements(new Position(0,0,10,10));
        
        System.out.println(test.getSprite());
        
=======
>>>>>>> branch 'master' of https://github.com/AlexandreLec/BoulderDash
    }

}

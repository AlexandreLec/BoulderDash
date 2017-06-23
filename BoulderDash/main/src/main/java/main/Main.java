package main;

import controller.BoulderDashPerformer;
import model.BoulderDashModel;
import view.BoulderDashView;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Alexandre LECOMTE
 * @version 1.0
 */
abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *      the arguments
     * @throws Exception
     *      print the stack of exception
     */
    public static void main(final String[] args) throws Exception {
    	
    	final BoulderDashPerformer controller = new BoulderDashPerformer(new BoulderDashModel(), new BoulderDashView());

        try {
            controller.play();
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
    }

}

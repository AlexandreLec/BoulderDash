package controller;

import org.junit.Before;
import org.junit.Test;

import model.Direction;
import model.IElement;

import static org.junit.Assert.*;

/**
 * <h1>The class test of BoulderDashPerformer</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */


public class BoulderDashPerformerTest {

	/** The controller to test */
	private BoulderDashPerformer controller;
	/**  */
	private IElement hero;
	
    @Before
    public void setUp() throws Exception {
    	this.controller = new BoulderDashPerformer();
    }

    /**
     * Test if we can't end the game in case of diamondCounter is <10
     * @throws Exception
     * 		Exception in case of not enough diamond to exit
     */
    @Test
    public void testEndGameNoDiamond() throws Exception {
        try {
        	this.controller.EndGame(8);
        }catch (final Exception e){
            final String excepted = "Not enought diamond";
            assertEquals(excepted, e.getMessage());
        }
    }
    
    /**
     * 
     */
    @Test
    public void testOrderPerformRight(){
    	
    	//Direction expected = Direction.RIGHT;
    	//assertEquals(expected,);
    }

}
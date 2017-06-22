package controller;

import model.Position;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * <h1>The class test of BoulderDashPerformer</h1>
 *
 * @author Arnaud Rigaut
 * @version 1.0
 */


public class BoulderDashPerformerTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @Before
    public void setUp() throws Exception {

    }

    /**
     * Test if we can't end the game in case of diamondCounter is <10
     * @throws Exception
     */
    @Test
    public void endGame() throws Exception {
        try {

            fail("Should throw exception when diamondCounter < 10");
        }catch (final Exception e){
            final String excepted = "Not enought diamond";
            assertEquals(excepted, e.getMessage());
        }
    }

}
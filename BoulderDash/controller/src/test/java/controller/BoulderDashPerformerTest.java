package controller;

import model.Position;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tapafe on 19/06/2017.
 */
public class BoulderDashPerformerTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void play() throws Exception {

    }

    @Test
    public void setViewSystem() throws Exception {

    }

    @Test
    public void orderPerform() throws Exception {

    }

    @Test
    public void getOrder() throws Exception {

    }

    @Test
    public void setOrder() throws Exception {

    }


    @Test
    public void endGame() throws Exception {
        try {

            fail("Should throw exception when diamondCounter < 10");
        }catch (final Exception e){
            final String excepted = "Not enought diamond";
            assertEquals(excepted, e.getMessage());
        }
    }

    @Test
    public void TestPlay() throws Exception {
        Runnable runnable1 = new Runnable(){
            @Override
            public void run() {
                Assert.fail();
            }
        };

        Runnable runnable2 = new Runnable(){
            @Override
            public void run() {
                Assert.assertTrue(true);
            }
        };
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

}
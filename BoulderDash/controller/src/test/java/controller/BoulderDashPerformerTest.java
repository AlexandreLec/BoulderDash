package controller;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tapafe on 19/06/2017.
 */
public class BoulderDashPerformerTest {
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
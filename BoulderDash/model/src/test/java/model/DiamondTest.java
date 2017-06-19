package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * <h1>The Test Diamond Class</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public class DiamondTest extends ElementTest {

	/** The tested diamond */
	private Diamond diamond;
	
	/**
	 * Instantiate a new Diamond
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		this.actual = new Diamond(new Position(1,1,10,10));
		this.behaviour = new Gravity();
	}

	 /**
     * Check if the enemy can kill an element
     * @param element
     * 		The element to kill
	 * @throws Exception 
     */
    @Test
    public void testKill() throws Exception {
    	Element expected = Hero.getInstance(new Position(1,1,10,10));
    	this.diamond.kill(expected);
    	assertNull(expected);
    }

}

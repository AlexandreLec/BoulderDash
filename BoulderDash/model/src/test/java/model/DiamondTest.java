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

	/**
	 * Instantiate a new Diamond
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		this.actual = new Diamond(new Position(1,1,10,10));
	}

	/**
	 * Check if the diamond has the good behaviour
	 */
	@Override
	@Test
	public void getBehaviour() {
		
		BehaviourMove expected = new Gravity();
		
		assertEquals(expected,this.actual.getBehaviour());
	}

}

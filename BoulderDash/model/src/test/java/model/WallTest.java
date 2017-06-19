package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * <h1>The Test Wall Class</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public class WallTest extends ElementTest {

	/**
	 * Instantiate a new Dirt
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		this.actual = new Wall(new Position(1,1,10,10));
	}

	/**
	 * Check if the diamond has the good behaviour
	 */
	@Override
	@Test
	public void getBehaviour() {
		
		BehaviourMove expected = new Fixe();
		
		assertEquals(expected,this.actual.getBehaviour());
	}

}

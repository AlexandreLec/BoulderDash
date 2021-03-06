package model;

import org.junit.Before;

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
		this.actual = new Diamond(new Position(1,1,10,10), this.mine);
		this.behaviour = new Gravity(actual);
	}

}

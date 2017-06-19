package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * <h1>The Test Hero Class</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public class HeroTest extends ElementTest {

	/**
	 * Instantiate the Hero
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		this.actual = Hero.getInstance(new Position(1,1,10,10));
	}

	/**
	 * Check if the hero has the good behaviour
	 */
	@Override
	@Test
	public void getBehaviour() {
		
		BehaviourMove expected = new Controlled();
		
		assertEquals(expected,this.actual.getBehaviour());
	}
	
	/**
	 * Check the single instantiation of the hero
	 */
	@Test
	public void getInstance(Position position) {
		
		Element expected = Hero.getInstance(new Position(3,1,10,10));
		
		assertSame(expected,this.actual);
	}

}

package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * <h1>The Test Element Class</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public class ElementTest {
	
	/** The tested Element */
	protected Element actual;

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Check if the element has a move behaviour 
	 */
	@Test
	public void getBehaviour() {
		assertNotNull(this.actual.getBehaviour());
	}
	
	/**
	 * Check if the element has a position
	 */
	@Test
	public void getPosition() {
		assertNotNull(this.actual.getPosition());
		
		Position expected = new Position(1,1,10,10);
		assertEquals(expected, this.actual.getPosition());
	}
	
	/**
	 * Check if the element has a sprite
	 */
	@Test
	public void getSprite() {
		assertNotNull(this.actual.getSprite());
	}
	
	/**
	 * Check if the setter position work correctly
	 */
	@Test
	public void setPosition() {
		
		Position expected = new Position(2,3,10,10);
		
		this.actual.setPosition(new Position(2,3,10,10));
		
		assertEquals(expected, this.actual.getPosition());
	}

	

}

package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * <h1>The Test Controlled Class</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.0
 */
public class ControlledTest {
	
	/** The tested move behaviour */
	private Controlled test;

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test the move to the right
	 */
	@Test
	public void testMoveRight() {
		Position expected = new Position(2,1,10,10);
		assertEquals(expected, this.test.moveRight(new Position(1,1,10,10)));
	}

	@Test
	public void testMoveLeft() {
		Position expected = new Position(1,1,10,10);
		assertEquals(expected, this.test.moveLeft(new Position(2,1,10,10)));
	}

	@Test
	public void testMoveUp() {
		Position expected = new Position(1,1,10,10);
		assertEquals(expected, this.test.moveUp(new Position(1,2,10,10)));
	}

	@Test
	public void testMoveDown() {
		Position expected = new Position(1,2,10,10);
		assertEquals(expected, this.test.moveDown(new Position(1,1,10,10)));
	}

}

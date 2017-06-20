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
	 * @throws Exception 
	 */
	@Test
	public void testMoveRight() throws Exception {
		Position expected = new Position(2,1,10,10);
		assertEquals(expected.getX(), this.test.moveRight());
	}

	@Test
	public void testMoveLeft() throws Exception {
		Position expected = new Position(1,1,10,10);
		assertEquals(expected, this.test.moveLeft(new Position(2,1,10,10)));
	}

	@Test
	public void testMoveUp() throws Exception {
		Position expected = new Position(1,1,10,10);
		assertEquals(expected, this.test.moveUp(new Position(1,2,10,10)));
	}

	@Test
	public void testMoveDown() throws Exception {
		Position expected = new Position(1,2,10,10);
		assertEquals(expected, this.test.moveDown(new Position(1,1,10,10)));
	}

}

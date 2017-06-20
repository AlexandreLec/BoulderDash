package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * <h1>The Test Controlled Class</h1>
 *
 * @author Alexandre Lecomte
 * @version 1.1
 */
public class ControlledTest {
	
	/** The tested move behaviour */
	private Controlled behaviour;
	private Position test;

	@Before
	public void setUp() throws Exception {
		this.test = new Position(5,5,10,10);
	}

	/**
	 * Test the move to the right
	 * @throws Exception 
	 */
	@Test
	public void testMoveRight() throws Exception {
		Position expected = new Position(6,5,10,10);
		assertEquals(expected.getX(), this.behaviour.moveRight(test).getX());
	}

	@Test
	public void testMoveLeft() throws Exception {
		Position expected = new Position(4,5,10,10);
		assertEquals(expected.getX(), this.behaviour.moveLeft(test).getX());
	}

	@Test
	public void testMoveUp() throws Exception {
		Position expected = new Position(5,4,10,10);
		assertEquals(expected.getY(), this.behaviour.moveUp(test).getY());
	}

	@Test
	public void testMoveDown() throws Exception {
		Position expected = new Position(5,6,10,10);
		assertEquals(expected.getY(), this.behaviour.moveDown(test).getY());
	}
}

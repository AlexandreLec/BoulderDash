package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ControlledTest {
	
	private Controlled test;

	@Before
	public void setUp() throws Exception {
	}

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

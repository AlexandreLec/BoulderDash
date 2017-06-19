package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExitGateTest extends ElementTest {

	/**
	 * Instantiate the ExitGate
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		this.actual = ExitGate.getInstance(new Position(9,9,10,10));
	}

	/**
	 * Check if the exit gate has the good behaviour
	 */
	@Override
	@Test
	public void getBehaviour() {
		
		BehaviourMove expected = new Fixe();
		
		assertEquals(expected,this.actual.getBehaviour());
	}

}

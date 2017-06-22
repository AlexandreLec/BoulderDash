package model;

import org.junit.Before;

public class ExitGateTest extends ElementTest {

	/**
	 * Instantiate the ExitGate
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		this.actual = ExitGate.getInstance(new Position(1,1,10,10),this.mine);
		this.behaviour = new Fixe(actual);
	}

}

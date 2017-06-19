package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GravityTest {

	private Gravity test;
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void test() {
		Position stone = new Position(2,a,10,10);
		Position dirt = new Position(2,b,10,10);
		if(a-1 != b){
			a = a-1;
			Position stone = new Position(2,a,10,10);	
		}
	}
		

}

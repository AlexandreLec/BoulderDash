package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GravityTest {

	private Gravity test;
	private Position dirt;
	private Position stone;
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void test() throws Exception {
		int a = 8;
		int b = 3;
		stone = new Position(2,a,10,10);
		dirt = new Position(2,b,10,10);
		if(a-1 != b){
			a = a-1;
		stone = new Position(2,a,10,10);	
		}
	}
		

}

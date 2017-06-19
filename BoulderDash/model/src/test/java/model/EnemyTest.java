package model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EnemyTest extends ElementTest {

	/** The tested enemy */
	private Enemy enemy;
	
	/**
	 * Instantiate a new Dirt
	 */
	@Override
	@Before
	public void setUp() throws Exception {
		this.actual = new Enemy(new Position(1,1,10,10));
		this.enemy = new Enemy(new Position(2,1,10,10));
	}

	/**
	 * Check if the diamond has the good behaviour
	 */
	@Override
	@Test
	public void getBehaviour() {
		
		BehaviourMove expected = new Automatic();
		
		assertEquals(expected,this.actual.getBehaviour());

	}
	
	/**
	 * Check if the explosion of an enemy destroy the elements around 
	 */
    @Test
    public void testExplosion() {
    	Element expected = new Dirt(new Position(3,1,10,10));
    	this.enemy.explosion();
    	
    	assertNull(this.enemy);
    	assertNull(expected);
    }

    /**
     * Check if the enemy can kill an element
     * @param element
     * 		The element to kill
     */
    @Test
    public void testKill(Element element) {
    	this.enemy.kill(element);
    	assertNull(element);
    }

}

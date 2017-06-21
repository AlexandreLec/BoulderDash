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
		//this.actual = new Enemy(new Position(1,1,10,10));
		//this.behaviour = new Automatic();
		
		//this.enemy = new Enemy(new Position(2,1,10,10));
	}
	
	/**
	 * Check if the explosion of an enemy destroy the elements around 
	 * @throws Exception 
	 */
    @Test
    public void testExplosion() throws Exception {
    	//Element expected = new Dirt(new Position(3,1,10,10));
    	this.enemy.explosion();
    	
    	assertNull(this.enemy);
    	//assertNull(expected);
    }

    /**
     * Check if the enemy can kill an element
     * @param element
     * 		The element to kill
     * @throws Exception 
     */
    @Test
    public void testKill() throws Exception {
    	/*Element expected = Hero.getInstance(new Position(1,1,10,10));
    	this.enemy.kill(expected);
    	assertNull(expected);*/
    }

}

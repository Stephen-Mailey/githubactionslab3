import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ie.lyit.lab2.Snack;


/**
 * Test class for Cinema Snack class
 * <p>
 * This is a long test and I've copied format
 * from the lecture
 * <p>
 * More information here please.
 */

/**
 * @author Stephen.Mailey
 * 
 * @version 1.0
 *
 */
public class SnackTest {
	Snack snack1;
	Snack snack2;

	/**
	 * @throws java.lang.Exception  Because it needs explanation why it failed!
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception  Because it needs explanation why it failed!
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception  Because it needs explanation why it failed!
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Test script here! - Set up Snack reference!!");
		snack1 = new Snack("Nachos", 005, 2.50, "Tortilla chips");
		snack2 = new Snack("Popcorn", 007, 3.00, "Salted");
	}

	/**
	 * @throws java.lang.Exception  Because it needs explanation why it failed!
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("Test script here! - Delete Snack reference!");
	}

	/**
	 * Test method for {@link ie.lyit.lab2.Snack#Snack(java.lang.String, int, java.lang.Double, java.lang.String)}.
	 */
	
	@Test
	public void testSnack() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link ie.lyit.lab2.Snack#getSnackName()}.
	 */
	@Test
	public void testGetSnackName() {
		String name = snack1.getSnackName();
		assertEquals(name, "Nachos");
	}

	/**
	 * Test method for {@link ie.lyit.lab2.Snack#setSnackName(java.lang.String)}.
	 */
	@Test
	public void testSetSnackName() {
		snack1.setSnackName("Doritos");
		assertEquals("Doritos", snack1.getSnackName());
	}

	/**
	 * Test method for {@link ie.lyit.lab2.Snack#getSnackId()}.
	 */
	@Test
	public void testGetSnackId() {
		int id = snack1.getSnackId();
		assertEquals(id, 005);
	}

	/**
	 * Test method for {@link ie.lyit.lab2.Snack#setSnackId(int)}.
	 */
	@Test
	public void testSetSnackId() {
		snack2.setSnackId(19);
		assertEquals(19, snack2.getSnackId());
	}

	/**
	 * Test method for {@link ie.lyit.lab2.Snack#getPrice()}.
	 */
	@Test
	public void testGetPrice() {
		double price = snack1.getPrice();
		assertEquals(price, 2.5, 0.0);
	}

	/**
	 * Test method for {@link ie.lyit.lab2.Snack#setPrice(java.lang.Double)}.
	 */
	@Test
	public void testSetPrice() {
		snack1.setPrice(2.00);
		assertEquals(2.00, snack1.getPrice(), 0.0);
	}

	/**
	 * Test method for {@link ie.lyit.lab2.Snack#getSnackType()}.
	 */
	@Test
	public void testGetSnackType() {
		String type = snack1.getSnackType();
		assertEquals(type, "Tortilla chips");
	}

	/**
	 * Test method for {@link ie.lyit.lab2.Snack#setSnackType(java.lang.String)}.
	 */
	@Test
	public void testSetSnackType() {
		snack2.setSnackType("Sweet");
		assertEquals("Sweet", snack2.getSnackType());
	}

}

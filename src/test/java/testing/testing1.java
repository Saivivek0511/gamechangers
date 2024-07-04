package testing;

import static org.junit.Assert.assertEquals; import static org.junit.Assert.fail;
import org.junit.Test;
import mypack1.mycalc1;
 


public class testing1 {



	@Test
	public void testadd() {

		mycalc1 calculator = new mycalc1(); 
		assertEquals(15, calculator.add(10, 5));
		assertEquals(-5, calculator.add(-10, 5));
		assertEquals(0, calculator.add(0, 0));

	}

	@Test
	public void testsubtract() {

		mycalc1 calculator = new mycalc1(); 
		assertEquals(5, calculator.subtract(10, 5));
		assertEquals(-15, calculator.subtract(-10, 5));
		assertEquals(0, calculator.subtract(0, 0));

	}



	@Test

	public void testDivide() {

		mycalc1 calculator = new mycalc1(); 
		assertEquals(2, calculator.divide(10, 5));
		assertEquals(-2, calculator.divide(-10, 5));
 
		try {

			calculator.divide(10, 0);

			fail("Should have thrown an IllegalArgumentException");

		} catch (IllegalArgumentException e) {



			// Expected exception

		}

	}



	@Test

	public void testModulus() {

		mycalc1 calculator = new mycalc1(); 
		assertEquals(0, calculator.modulus(10, 5));
		assertEquals(1, calculator.modulus(10, 3));
		try {
			calculator.modulus(10, 0);

			fail("Should have thrown an IllegalArgumentsException");

		} catch (IllegalArgumentException e ) {

			// Expected exception

		}



	}
 
	@Test

	public void testpower() {

		mycalc1 calculator = new mycalc1(); 
		assertEquals(8.0, calculator.power(2,3), 0.0001);
		assertEquals(1.0, calculator.power(2,0), 0.0001);

		assertEquals(0.25, calculator.power(2,-2), 0.0001);



	}



}

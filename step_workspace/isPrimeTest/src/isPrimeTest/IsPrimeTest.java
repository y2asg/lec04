package isPrimeTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsPrimeTest {

	@Test
	public void test() {
		assertFalse(IsPrime.isPrime(1)); //edge case
		assertTrue(IsPrime.isPrime(2));
		assertTrue(IsPrime.isPrime(7));
		assertFalse(IsPrime.isPrime(8));
		assertTrue(IsPrime.isPrime(65537));
	}

}

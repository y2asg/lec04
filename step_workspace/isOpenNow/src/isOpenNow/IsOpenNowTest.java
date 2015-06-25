package isOpenNow;

import static org.junit.Assert.*;

import org.junit.Test;

public class IsOpenNowTest {

	@Test
	public void test() {
		assertFalse(IsOpenNow.isOpenNow("A"));
		assertTrue(IsOpenNow.isOpenNow("B"));
	}

}

package matrixTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTest {

	@Test
	public void test() {
		assertFalse(Matrix.matrix(3,100));
		assertTrue(Matrix.matrix(3, 450));
		assertFalse(Matrix.matrix(4, 2680));
		assertTrue(Matrix.matrix(4, 3680));
	}

}

package Question3_124;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	 @Test
	    public void testGenerateFibonacci() {
	        int[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
	        assertArrayEquals(expected, FibonacciSeries.generateFibonacci(10));
	    }

	    @Test
	    public void testGenerateFibonacciWithNegativeTerms() {
	        assertThrows(IllegalArgumentException.class, () -> FibonacciSeries.generateFibonacci(-5));
	    }

}

package Question4_124;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountDigitTest {

	@Test
    public void testCountDigitsPositive() {
        assertEquals(4, CountDigits.countDigits(1234));
    }

    @Test
    public void testCountDigitsZero() {
        assertEquals(1, CountDigits.countDigits(0));
    }

}

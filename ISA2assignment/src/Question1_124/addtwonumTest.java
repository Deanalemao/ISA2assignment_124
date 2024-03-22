package Question1_124;

import static org.junit.Assert.*;

import org.junit.Test;

public class addtwonumTest {

	 @Test
	    public void testAddPositiveNumbers() {
	        assertEquals(12, addtwonum.add(5, 7));
	    }

	    @Test
	    public void testAddNegativeNumbers() {
	        assertEquals(-2, addtwonum.add(-5, 3));
	    }
	

}

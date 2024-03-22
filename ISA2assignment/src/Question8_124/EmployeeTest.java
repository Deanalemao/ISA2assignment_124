package Question8_124;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	 @Test
	    public void testCalculateDA() {
	        Employee employee = new Employee("John Doe", "Software Engineer", 50000);
	        double da=employee.calculateDA();
	        assertEquals(5000.0,da,0.01);
	    }

}

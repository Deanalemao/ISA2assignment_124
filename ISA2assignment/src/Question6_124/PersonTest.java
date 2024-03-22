package Question6_124;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
    public void testSetNameAndGetAge() {
        Person person = new Person("John", 30);
        person.setName("Alice");
        assertEquals("Alice", person.getName());
        assertEquals(30, person.getAge());
    }

}

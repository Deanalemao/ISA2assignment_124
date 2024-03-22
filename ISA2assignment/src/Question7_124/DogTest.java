package Question7_124;

import static org.junit.Assert.*;

import org.junit.Test;

public class DogTest {

	 @Test
	    public void testSetNameAndGetBreed() {
	        Dog dog = new Dog("Buddy", "Labrador");
	        dog.setName("Charlie");
	        dog.setBreed("Golden Retriever");
	        assertEquals("Charlie", dog.getName());
	        assertEquals("Golden Retriever", dog.getBreed());
	    }

}

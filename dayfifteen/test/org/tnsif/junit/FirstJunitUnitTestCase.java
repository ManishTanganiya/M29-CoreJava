package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class FirstJunitUnitTestCase {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	@DisplayName("Simple Testing")
	void display() {
		System.out.println("First Junit Test case");
	}

	
	

}

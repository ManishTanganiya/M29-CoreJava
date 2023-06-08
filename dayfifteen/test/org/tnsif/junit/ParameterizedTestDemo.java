package org.tnsif.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
class ParameterizedTestDemo {
	@ParameterizedTest
	@ValueSource(strings= {"Manish","Abhinav","amit"})
	void test() {
		System.out.println("Demonstration on Parameterized"+"Test");
	}
	
	@ParameterizedTest
	@ValueSource(strings= {"Amol","Dishant"})
	void accept(String str) {
		assertNotNull(str);
	}
	



}

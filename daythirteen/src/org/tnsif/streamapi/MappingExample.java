package org.tnsif.streamapi;
import java.util.List;
import java.util.Arrays;
public class MappingExample {

	public static void main(String[] args) {
		// Using Collections
		List<String>obj=Arrays.asList("Manish","Abhinav","Amit");
		obj.stream().map(i->i.length()).forEach((i)-> System.out.println(i+" "));

	}

}

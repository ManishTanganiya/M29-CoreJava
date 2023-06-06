package org.tnsif.streamapi;
import java.util.List;
import java.util.Arrays;
public class FilteringExample {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList("Manish","Abhinav","Amit");
		obj.stream().filter(i->i.length()>5).forEach((i)-> 
		System.out.println(i+" "));
		System.out.println();
		
		obj.stream().distinct().forEach((i)-> 
		System.out.println(i+" "));
		System.out.println();
		
		obj.stream().limit(2).forEach((i)-> 
		System.out.println(i+" "));
		System.out.println();
		
		obj.stream().skip(3).forEach((i)-> 
		System.out.println(i+" "));
		System.out.println();


	}

}

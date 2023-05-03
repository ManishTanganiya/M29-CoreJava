//program to demonstrate array class
package org.tnsif.arrays;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
		//array initialization
		int array[]= {12,67,54,90,87};
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		//sorting the array
		System.out.println(Arrays.toString(array));

	}

}

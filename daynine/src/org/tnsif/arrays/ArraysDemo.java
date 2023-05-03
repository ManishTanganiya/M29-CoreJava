//program to demonstrate on simple arrays
package org.tnsif.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		//compile time
		int arr[]= {12,16,50,76};
		/*if we access 4th index, we will get an exception
		 * as "ArrayOut ofBoundExecption" as we are accessing 4th
		 * index and that is not present in the array*/
		//System.out.println(arr[4]);
		System.out.println("Array of 2nd index is: "+arr[2]);
		//for printing all array elements
		for(int i:arr) {
			System.out.println(i+" ");
		}

	}

}

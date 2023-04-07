//Program to demonstrate on for loop
package org.tnsif.looping;
import java.util.Scanner;
public class ForLoopProgram {

	public static void main(String[] args) {
		//Print 1 to n number
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int N=s.nextInt();
		for(int i=1;i<N;i++)
		{
			System.out.print(i+" ");
			
		}
		
		
	}

}

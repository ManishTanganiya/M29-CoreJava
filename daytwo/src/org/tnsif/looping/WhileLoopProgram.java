package org.tnsif.looping;
import java.util.Scanner;
public class WhileLoopProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of N: ");
		int N=s.nextInt();
		int i =1;
		while(i<=N)
		{
		System.out.print(i + " ");	
		i++;
		}

	}

}

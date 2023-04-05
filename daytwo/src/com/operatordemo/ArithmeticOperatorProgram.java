package com.operatordemo;
import java.util.Scanner;
public class ArithmeticOperatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter value of x and y:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("The addition of two numbers: "+(x+y));
		System.out.println("The subtraction of two numbers: "+(x-y));
		System.out.println("The multiplication of two numbers: "+(x*y));
		System.out.println("The division of two numbers: "+(x/y));
		System.out.println("The modulo of two numbers: "+(x%y));
		sc.close();

	}

}

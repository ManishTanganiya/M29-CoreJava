package com.company;
import java.util.Scanner;
public class UserInputProgram {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your salary: ");
		float salary=s.nextFloat();
		System.out.println("Enter your name: ");
		String name=s.next();
		s.nextLine();
		System.out.println("Enter your name1: ");
		String name1=s.nextLine();
		System.out.println("Enter the character: ");
		char ch=s.next().charAt(1);
		System.out.println("Salary is: "+salary);
		System.out.println("Name is: "+name);
		System.out.println("Name1 is: "+name1);
		System.out.println("Character is:"+ch);
		s.close();

	}
}

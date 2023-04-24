package org.tnsif.methodoverloading;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		MethodOveloadingExample m1=new MethodOveloadingExample();
		System.out.println(m1.multiplication(12.5f,3.0f));
		System.out.println(m1.multiplication(5f,1f));
		System.out.println(m1.multiplication(7f,6f));
		System.out.println(m1.print("Welcome to C2Tc"));
		System.out.println(m1.print("Manish","Tanganiya"));

	}

}

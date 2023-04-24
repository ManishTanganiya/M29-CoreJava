package org.tnsif.constructoroverloading;

public class ConstructorOverladingExample {
	private int x;
	private int y;
	public ConstructorOverladingExample() {
		System.out.println("Default Constructor");
	}
	public ConstructorOverladingExample(int x) {
		System.out.println("parameterized constructor"+x);
	}
	
	public ConstructorOverladingExample(int x, int y) {
		System.out.println("parameterized constructor"+x+y);
		
	}
	
	
	

}

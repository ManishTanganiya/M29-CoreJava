package org.tnsif.annotations;

public class DeprecatedAnnotationExample {
	//it allows any elements no longer in used
	@Deprecated
	public void print() {
		System.out.println("Welcome to java annnotations");
	}

	public static void main(String[] args) {
		DeprecatedAnnotationExample d=new DeprecatedAnnotationExample();
		d.print();
		

	}

}

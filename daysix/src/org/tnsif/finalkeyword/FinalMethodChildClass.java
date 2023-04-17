package org.tnsif.finalkeyword;

public class FinalMethodChildClass extends FinalMethod{
	//final variable
		final int num=275;
		//method overriding
		final void show(int num) {
			System.out.println("The num is: "+num);
		}
		//final Method
		/*final method cannot be override will
		get compile time error*/
		/*
		final void show() {
			System.out.println("Salary is:"+salary);
		}
		*/

}

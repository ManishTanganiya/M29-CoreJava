package org.tnsif.stringsprogram;

public class StringSimpleProgram {

	public static void main(String[] args) {
		String str1="Manish";
		System.out.println("Using String Literal: "+str1);
		String str2=new String("Manish");
		System.out.println("Using new keyword: "+str2);
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));

	}

}

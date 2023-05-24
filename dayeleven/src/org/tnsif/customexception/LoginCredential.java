//Program to demonstrate on custom exception
package org.tnsif.customexception;

//to create exception we need to extend exception class
public class LoginCredential extends Exception {
	//private data member
	private String str1;

	//parameterized constructor
	public LoginCredential(String str1) {
		super();
		this.str1 = str1;
	}

	@Override
	public String toString() {
		return "LoginCredential [str1=" + str1 + "]";
	}
	

	
	
	

}

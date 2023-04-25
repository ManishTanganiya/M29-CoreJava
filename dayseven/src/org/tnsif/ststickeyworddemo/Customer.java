package org.tnsif.ststickeyworddemo;

public class Customer {
	private int custId;
	private static String companyName;
	
	static {
		
		companyName = "Myntra";
	}
	public Customer() {
		System.out.println("Default constructor");
		custId++;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + "]";
	}
	static void display() {
		System.out.println("Company Name: "+companyName);
	}
	

}

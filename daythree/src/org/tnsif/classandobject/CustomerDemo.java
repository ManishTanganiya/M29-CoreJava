package org.tnsif.classandobject;
import java.util.Scanner;
public class CustomerDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id;
		String city,name;
		System.out.println("Enter the Customer ID: ");
		id=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Customer name: ");
		name=s.nextLine();
		System.out.println("Enter the Customer city: ");
		city=s.nextLine();
		
		Customer c=new Customer();
		c.setCustomerId(id);
		c.setCustomerName(name);
		c.setCity(city);
		System.out.println(c);
		System.out.println("Enter the Customer ID: ");
		id=s.nextInt();
		s.nextLine();
		System.out.println("Enter the Customer name: ");
		name=s.nextLine();
		System.out.println("Enter the Customer city: ");
		city=s.nextLine();
		Customer c1=new Customer(id,name,city);
		System.out.println(c1);		
				
	}

}

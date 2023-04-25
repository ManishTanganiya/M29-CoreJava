package org.tnsif.ststickeyworddemo;

public class StaticKeywordExecutor {

	public static void main(String[] args) {
		System.out.println(Employee.companyName);
		Employee e=new Employee(101,"Manishsingh T");
		System.out.println(e);
		Employee e1=new Employee(102,"Abhinav R");
		System.out.println(e1);
		
		Customer.display();
		Customer c = new Customer();
		System.out.println(c);
	}

}

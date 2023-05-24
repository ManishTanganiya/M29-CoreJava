package org.tnsif.customexception;
import java.util.Scanner;
public class CustionEceptionExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);;	
		String id=s.nextLine();
		String password=s.nextLine();
		try {
		if(id.equals("manishtanganiya@gmail.com")&&
				password.equals("Pass@123"))
		{
			System.out.println("Credentials matched");
			
		}
		else
		{
			throw new LoginCredential("Invalid credential");
		}

	}
	catch(LoginCredential e)
	{
		System.out.println("Exception Handled "+e);
	}

}
}

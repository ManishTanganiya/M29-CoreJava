package dayelevenorg.tnsif.exceptiondemo;
import java.util.Scanner;
public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Value for X and Y: ");
		int x=s.nextInt();
		int y=s.nextInt();
		try {
			System.out.println(x/y);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception handled "+e);
		}
		finally
		{
			System.out.println("Finally blocked is always executed");
		}
						

	}

}

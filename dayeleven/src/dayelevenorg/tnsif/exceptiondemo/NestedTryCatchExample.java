package dayelevenorg.tnsif.exceptiondemo;
import java.util.Scanner;
public class NestedTryCatchExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x and y:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int arr[]=new int[] {101,33,78};
		try {
			try {
				System.out.println(arr[3]);
				}
			catch(ArrayIndexOutOfBoundsException|ArithmeticException e)
			{
				System.out.println("Exception handled "+e);
			}
			try {
				System.out.println(x/y);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception handled "+e);
			}

	}
		finally {
			System.out.println("Finally block");
		}

}
}

package org.tnsif.stringsprogram;
import java.util.Scanner;
public class StringMethodProgram {

	public static void main(String[] args) {
		String str1="Dhoni";
		Scanner s=new Scanner(System.in);
		String str2=new String(s.nextLine());
		if(str1.equals(str2))
			System.out.println("Both are equal");
		else
			System.out.println("not equal");
			

	}

}

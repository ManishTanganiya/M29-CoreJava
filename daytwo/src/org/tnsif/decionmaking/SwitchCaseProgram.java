package org.tnsif.decionmaking;
import java.util.Scanner;
public class SwitchCaseProgram {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the song input");
		int songInput=s.nextInt();
		switch(songInput)
		{
		case 1:
			System.out.println("calm down");
			break;
		case 2:
			System.out.println("Perfect");
			break;
		case 3:
			System.out.println("Despacito");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
		

	}

}

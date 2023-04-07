package org.tnsif.looping;

public class NestedForLoop {

	public static void main(String[] args) {
		// Print star pattern
		int rows=4,columns=4;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

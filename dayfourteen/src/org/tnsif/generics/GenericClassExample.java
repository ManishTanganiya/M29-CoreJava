//Program to demonstrate on generic class
package org.tnsif.generics;
//Generic class
class GenericClass<T>{
	T x;
	void print(T x)
	{
		this.x=x;
		
	}
	T accept()
	
	{
		return x;
	}
}

public class GenericClassExample {
	

	public static void main(String[] args) {
		GenericClass<String> obj=new GenericClass<>();
		obj.print("Manish");
		System.out.println(obj.accept());
		

	}

}

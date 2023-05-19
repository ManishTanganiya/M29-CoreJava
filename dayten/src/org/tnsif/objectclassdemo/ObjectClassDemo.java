package org.tnsif.objectclassdemo;
class Sample
{
	
}
class Demo
{
	//constructor
	Demo()
	{
		//resource allocate
	System.out.println("Inside constructor");
	}
	protected void finalize()
	{
		System.out.println("In finalize method");
	}
}
public class ObjectClassDemo {

	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		
		Demo d=new Demo();
		System.out.println(d.getClass());
		System.out.println(d.hashCode());
		/*object class is used when you want to refer any object
		 * whose data-type you don't know*/
		Object obj=new Object();
		System.out.println(obj.getClass());
		


	}

}

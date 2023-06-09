package org.tnsif.annotations;
class Car{
	public void speed(int speed) 
	{
		System.out.println("Speed is: "+speed+"km/hr");
	}
	
}

//child class
//child class is inheriting the properties of the parent class
class Lamborghini extends Car
{
	/*Below annotation ensures that child class method
	 * is inheriting the properties of parent class method*/
	@Override
	//it should be speed(int speed)
	//if we do Speed(int speed), then we will get an error
	public void speed(int speed) {
		System.out.println("Speed is: "+speed+"km/hr");
		
	}
}
public class OverrideAnnotationExample {

	public static void main(String[] args) {
		Lamborghini l=new Lamborghini();
		l.speed(90);

	}

}

package abstraction;

public abstract class Vehicle {

	void start() //Concrete method
	{
		System.out.println("Vehicle has started");
	}
	
	abstract void stop(); //Abstract method
	
}

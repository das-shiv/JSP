package relationship;

public class Car {

	String brand;
	String model;
	double cost;
	Engine e;
	Car(String brand, String model, double cost, Engine e)
	{
		this.brand=brand;
		this.model=model;
		this.cost=cost;
		this.e=e;
	}
	
	
	public void carDetails()
	{
		System.out.println("Brand of the car is: " +brand);
		System.out.println("Model of the car is: "+model);
		System.out.println("Cost of the car is: "+cost);
		System.out.println("The engine cc is: "+e.cc);
		System.out.println("The engine no is: "+e.engineno);
	}
	
	
	
}

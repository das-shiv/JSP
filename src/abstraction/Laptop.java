package abstraction;

public abstract class Laptop {
	
	String brand;
	double cost;
	int ram;
	
	Laptop()
	{}
	
	Laptop(String brand, double cost, int ram)
	{
		this.brand = brand;
		this.cost = cost;
		this.ram = ram;
	}
	
	abstract void laptopDetails();

}

package ojectclass;

public class Mobile {

	String brand;
	double cost;

	public Mobile(String brand, double cost)
	{
		this.brand = brand;
		this.cost = cost;
	}
	
	@Override
	public String toString()
	{
		return brand+" "+cost;
	}
}

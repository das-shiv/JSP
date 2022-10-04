package abstraction;

public class LDriver extends Laptop {
	
	
	LDriver(String brand, double cost, int ram)
	{
	super(brand, cost, ram);
	}
	@Override
	
	void laptopDetails()
	{
		System.out.println(brand);
		System.out.println(cost);
		System.out.println(ram);
	}
	
	public static void main(String[] args) {
		LDriver l = new LDriver("Dell", 79999.99, 16);
		l.laptopDetails();
	}

}

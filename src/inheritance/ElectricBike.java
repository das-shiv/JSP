package inheritance;

public class ElectricBike extends Bike {

	void run()
	{
		System.out.println("ElectricBikes runs on electricity");

	}
	
	
	
	public static void main(String[] args) {
		
		ElectricBike e = new ElectricBike();
		e.use();
		e.type();
		e.run();
	}
}


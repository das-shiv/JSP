package relationship;

public class CarDriver {

	public static void main(String[] args) {
	

		Car c1 = new Car("bmw", "x7", 9999.99, new Engine(3999,12345));
		Car c2 = new Car("audi", "q7", 29999.99, new Engine(1999,42345));
		c1.carDetails();
		System.out.println("------------------");
		c2.carDetails();
	}
	
}

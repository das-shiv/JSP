package polymorphism;

public class Driver {

	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.start();
		
		Vehicle v2 = new Bike();
		v2.start();
		
	}
}

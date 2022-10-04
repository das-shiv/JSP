package polymorphism;

public class EDriver {

	public static void main(String[] args) {
		
		Employee e1 = new Developer();
		e1.work();
		
		Employee e2 = new Tester();
		e2.work();
	}
}

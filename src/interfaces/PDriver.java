package interfaces;

public class PDriver implements Person {
	
	@Override
	public void eat()

	{
		System.out.println("Eats pasta");
	}
	
	public static void main(String[] args) {
		
		System.out.println(Person.id);
		PDriver p = new PDriver();
		p.eat();
		
	}
}

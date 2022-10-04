package abstraction;

public class User extends Car {

	@Override 
	void stop()
	{
		System.out.println("Vehicle stopped");
	}
	
	@Override
	void type()
	{
		System.out.println("Sports type");
	}
	
	public static void main(String[] args) {
		
		User u = new User();
		u.start();
		u.stop();
		u.type();
	}
}

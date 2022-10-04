package accessmodifier;

public class Program1 {

	private int a = 10;
	
	private Program1()
	{
		System.out.println("Private Constructor");
	}
	
	private void m1()
	{
		System.out.println("Private method");
	}
	
	public static void main(String[] args) {
		
	}
}

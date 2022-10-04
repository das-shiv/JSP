package relationship;

public class Swiggy {

	String food;
	double amount;
	int billno;
	Hotel h;
	
	Swiggy(String food, double amount, int billno, Hotel h)
	{
		this.food=food;
		this.amount=amount;
		this.billno=billno;
		this.h=h;
	}
	
	
	public void swiggyDetails()
	{
		System.out.println(food);
		System.out.println(amount);
		System.out.println(billno);
		System.out.println(h.gstno);
		System.out.println(h.name);
		System.out.println(h.location);
	}
	
	public static void main(String[] args)
	{
		Swiggy s = new Swiggy("Pizz", 388, 123, new Hotel("Pizzahut","Delhi", 12345));
		s.swiggyDetails();
	}
	
}

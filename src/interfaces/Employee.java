package interfaces;

public class Employee extends Alphabet implements Google,Gpay,Youtube {
	@Override
	public void videos()

	{
		System.out.println("Create videos");
	}
	
	@Override
	public void search()
	{
		
		System.out.println("Search information");
	}
	
	@Override
	public void payment()
	{
		System.out.println("Make payments");
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		
		e.videos();
		e.search();
		e.payment();
		e.work();
	}

}

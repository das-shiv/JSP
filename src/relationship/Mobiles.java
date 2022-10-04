package relationship;

public class Mobiles {

	String brand;
	double price;
	String color;
	Earphones e;
	
	Mobiles()
	{
		
	}
	
	
	Mobiles(String brand, double price, String color)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	
	public void insertEarphones(Earphones e)
	{
		if(this.e==null)
		{
			this.e=e;
			System.out.println("Earphone is inserted");
		}
		else
		{
			System.out.println("Earphone already exist");
		}
	}
	
	
	
	public void removeEarphones()
	{
		
		if(this.e==null)
		{
			System.out.println("Earphone don't exist");
		}
		
		else
		{
			this.e=null;
			System.out.println("Earphone is removed");
		}
		
		
	}
	
	
	
	public void earphoneDetails()
	{
		
		
		if(this.e==null)
		{
			System.out.println("Earphone do not exist in earPhone Details");
		}
		
		else
		{
			System.out.println(e.brand);
			System.out.println(e.price);
			System.out.println(e.color);
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

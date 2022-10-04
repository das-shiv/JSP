package polymorphism;

public class Flipkart {
	
	void purchase(String product)
	{
		System.out.println(product);
		
	}
	
	void purchase(String product, double cost)
	{
		System.out.println(product+ " "+cost);
	}
	
	void purchase(double cost, String product)
	{
		System.out.println(product+ " " +cost);
	}
	
	
	void purchase(double cost)
	{
		System.out.println(cost);
	}
	
	
	
	
	
	
	
	
}

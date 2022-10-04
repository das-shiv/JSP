package polymorphism;

public class FDriver {

	public static void main(String[] args) {
		
		Flipkart f = new Flipkart();
		f.purchase(7999.99);
		f.purchase("mobile");
		f.purchase(1234.5, "iphone 14");
		f.purchase("onepluse nord", 39999.99);
		
	}
}

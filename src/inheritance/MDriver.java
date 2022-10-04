package inheritance;

public class MDriver {

	
	public static void main(String[] args) {
		Samsung s = new Samsung();
		s.use();
		s.android();
		System.out.println("-----------");
		
		
		Apple a = new Apple();
		a.use();
		a.ios();
	}
}

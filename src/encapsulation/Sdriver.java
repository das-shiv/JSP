package encapsulation;

public class Sdriver {

	public static void main(String[] args) {
		Sim s = new Sim("Airtel", 99887765, 49.98);		
	
		System.out.println(s.getSprovider());
		
		System.out.println(s.getBalance());
		
		System.out.println(s.getSimno());
	
	System.out.println("-------------");
	
	s.setBalance(80.78);
	s.setSprovider("Jio");
	s.setSimno(986353);
	
	s.simDetails();
	}
}

package classCastException;

public class FDriver {
	public static void main(String[] args) {
		Father f = new Son();
		Daughter d = (Daughter)f;
	
		
	}

	 
}

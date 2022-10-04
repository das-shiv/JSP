package inheritance;

public class ZDriver  {

	
	public static void main(String[] args) {
		
		Mcd m= new Mcd();
		
		System.out.println(m.type);
		System.out.println(m.type1);
		m.online();
		m.addons();
		
		System.out.println("--------");
		
		Kfc k = new Kfc();
		System.out.println(k.type);
		System.out.println(k.type2);
		k.online();
		k.addons();
		
		
		
	}
}

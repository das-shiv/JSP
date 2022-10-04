package inheritance;

public class Son extends Father {
	
	String name = "Teddy";
	public static void main(String[] args) {
		Son s= new Son();
		System.out.println(s.age);
		System.out.println(s.name);
	}

}

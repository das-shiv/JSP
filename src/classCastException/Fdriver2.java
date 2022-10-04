package classCastException;

public class Fdriver2 {

	public static void main(String[] args) {
		
		Father f = new Daughter();
		
		
		if(f instanceof Son)
		{
			System.out.println("Downcast too soon");
			Son s= (Son) f;
			System.out.println(s.x+ " "+s.y);
		}
		
		else if(f instanceof Daughter)
		{
			System.out.println("Downcast too soon");
			Daughter d = (Daughter)f;
			System.out.println(d.x+" "+d.z);
		}
	}
}

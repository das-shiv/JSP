package encapsulation;

public class WappDriver {

	
	public static void main(String[] args) {
		Whatsapp w = new Whatsapp();
		
		w.setMobileno(123456);
		w.setPwd("qewrtq25");
		
		System.out.println(w.getMobileno());
		System.out.println(w.getPwd());
		
		
		System.out.println("-----------");
		
		w.setMobileno(78788787);
		w.setPwd("yud63527gd");

		
		w.whaappDetails();
	}
}

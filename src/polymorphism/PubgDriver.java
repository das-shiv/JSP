package polymorphism;

public class PubgDriver {

	public static void main(String[] args) {
		
		Pubg p = new Pubg();
		
		System.out.println(p.game);
		p.play();
		
		System.out.println("-----------");
		
		p.addMembers(9);
		p.addMembers("Lackers");
		p.addMembers(50, "Chelsea");
		p.addMembers("Arsenal", 45);
		
		
	}
}

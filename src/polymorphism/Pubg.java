package polymorphism;

public class Pubg extends Game {
	
	void addMembers(int members)
	{
		System.out.println(members);
	}
	
	
	void addMembers(int members, String teamName)
	{
		System.out.println(members+" "+teamName);
	}
	
	
	void addMembers(String teamName)
	{
		System.out.println(teamName);
	}
	
	void addMembers(String teamName, int members)
	{
		System.out.println(teamName+" "+members);
	}
	
	
	

}

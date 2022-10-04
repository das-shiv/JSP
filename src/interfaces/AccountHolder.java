package interfaces;

public class AccountHolder implements SBIBank {
 
	@Override
	
	public void print()
	{
		System.out.println("Print currency");
	}
	
	@Override
	public void deposit()
	{
		System.out.println("Deposit Money");
	}
	
	public static void main(String[] args) {
		AccountHolder a = new AccountHolder();
		
		a.print();
		a.deposit();
		
	}
}

package relationship;

import java.util.Scanner;

public class MobileDriver {

	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		Mobiles m = new Mobiles();
		
		boolean exit =true;
		while(exit)
		{
		
		System.out.println("Enetr choice \n1. Insert earphone \n2. Remover earphones \n3. Get earphone details \n4. exit");

		int choice = s.nextInt();
		
		
		switch(choice)
		{
		case 1:{
			System.out.println("Enter the earphone brand");
			String brand = s.next();
			System.out.println("Enter the price");
			double price = s.nextDouble();
			System.out.println("Enter the color");
			String color = s.next();
			m.insertEarphones(new Earphones(brand,price,color));
			
		}
		break;
		
		case 2:
		{
			m.removeEarphones();
			}
		break;
		
		case 3:
		{
			m.earphoneDetails();
		}
		break;
		
		case 4:
			exit = false;
			break;
			
			default:
			{
				System.out.println("Invalid Option");
			}
		
	
		}
		}
	}
}
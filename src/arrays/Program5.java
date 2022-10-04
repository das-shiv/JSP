package arrays;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size =s.nextInt();
		
		String [] name= new String[size];
		System.out.println("Enter the int type data");
		
		for(int i=0; i<name.length; i++)
		{
			name[i]=s.next();
		}
		
		System.out.println("Enter data are:");
		
		for(int i=0; i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
	}
}

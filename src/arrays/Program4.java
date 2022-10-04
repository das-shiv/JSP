package arrays;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size =s.nextInt();
		
		int [] a= new int[size];
		System.out.println("Enter the int type data");
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter data are:");
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}

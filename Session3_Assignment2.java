//Write a simple Java program to check whether a given number is a prime number or not.

package aatika;
import java.util.*;
public class Session3_Assignment2 {

	public static void main(String[] args) {
		
		int temp;
		boolean prime=true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value to check whether the number is prime or not");
		int n = sc.nextInt();
		
		for(int i=2;i<=n/2;i++)
		{
		
			temp = n%i;
			if(temp==0)
			{
				prime = false;
				break;
				
			}
			
		}
		if(prime)
		{
			
			System.out.println(n+" is a prime number");
		}
		else
		{
		System.out.println(n+" is not a prime number");	
		}
	}

}
